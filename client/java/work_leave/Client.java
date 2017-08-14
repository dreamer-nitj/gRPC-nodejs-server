package work_leave;

import io.grpc.ManagedChannel;
import io.grpc.okhttp.OkHttpChannelBuilder;

public class Client {
	private final String host = "localhost";
    private final int port = 50050;
    private ManagedChannel channel;
    private EmployeeLeaveDaysServiceGrpc.EmployeeLeaveDaysServiceBlockingStub blockingStub;
    
    public Client() {
    	channel = OkHttpChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();
    	blockingStub = EmployeeLeaveDaysServiceGrpc.newBlockingStub(channel);
    }
    
    public LeaveEligibility checkEligibility(Employee employee) {
    	return blockingStub.eligibleForLeave(employee);
    }
		
	public static void main(String[] args) {
		Employee employee = Employee.newBuilder()
				.setEmployeeId(1)
				.setName("Ankit Kumar")
				.setRequestedLeaveDays(5)
				.setAccruedLeaveDays(10)
				.build();
		
		Client client = new Client();
		LeaveEligibility leaveEligibility;
		
		try {
			System.out.println("here");
			leaveEligibility = client.checkEligibility(employee);
			System.out.println(leaveEligibility.getEligible() ? "yes eligible": "not eligible");
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}
}