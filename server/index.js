const grpc = require('grpc');
const proto = grpc.load('proto/work_leave.proto');

    /**
     * Check if an employee is eligible for leave.
     * True if the requested leave days are greater than 0 and within the number
     * of accrued days.
     */
function  eligibleForLeave(call, callback) {
    if (call.request.requested_leave_days > 0) {
        if (call.request.accrued_leave_days > call.request.requested_leave_days) {
            callback(null, { eligible: true });
        } else {
            callback(null, { eligible: false });
        }
    } else {
        callback(new Error('Invalid requested days'));
    }
}

    /**
     * grant an employee leave days
     */
function  grantLeave(call, callback) {
    let granted_leave_days = call.request.requested_leave_days;
    let accrued_leave_days = call.request.accrued_leave_days - granted_leave_days;

    callback(null, {
        granted: true,
        granted_leave_days,
        accrued_leave_days
    });
}

function main() {
    var server = new grpc.Server();
    server.addService(proto.work_leave.EmployeeLeaveDaysService.service, { eligibleForLeave: eligibleForLeave, grantLeave: grantLeave });
    //Specify the IP and and port to start the grpc Server, no SSL in test environment
    server.bind('0.0.0.0:50050', grpc.ServerCredentials.createInsecure());
    server.start();
    console.log('grpc server running on port:', '0.0.0.0:50050');
}

main();
