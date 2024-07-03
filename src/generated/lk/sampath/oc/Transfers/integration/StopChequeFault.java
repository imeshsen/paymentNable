
package lk.sampath.oc.Transfers.integration;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-05-06T11:41:02.079+05:30
 * Generated source version: 3.0.2
 */

@WebFault(name = "ExecutionException", targetNamespace = "http://www.sampath.lk/SD/IIBFinacleIntegration/")
public class StopChequeFault extends Exception {
    
    private lk.sampath.oc.Transfers.integration.ExecutionExceptionType executionException;

    public StopChequeFault() {
        super();
    }
    
    public StopChequeFault(String message) {
        super(message);
    }
    
    public StopChequeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public StopChequeFault(String message, lk.sampath.oc.Transfers.integration.ExecutionExceptionType executionException) {
        super(message);
        this.executionException = executionException;
    }

    public StopChequeFault(String message, lk.sampath.oc.Transfers.integration.ExecutionExceptionType executionException, Throwable cause) {
        super(message, cause);
        this.executionException = executionException;
    }

    public lk.sampath.oc.Transfers.integration.ExecutionExceptionType getFaultInfo() {
        return this.executionException;
    }
}
