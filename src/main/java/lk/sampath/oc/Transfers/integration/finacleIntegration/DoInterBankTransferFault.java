
package lk.sampath.oc.Transfers.integration.finacleIntegration;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-10-24T09:06:24.722+05:30
 * Generated source version: 3.0.2
 */

@WebFault(name = "ExecutionException", targetNamespace = "http://www.sampath.lk/SD/IIBFinacleIntegration/")
public class DoInterBankTransferFault extends Exception {
    
    private lk.sampath.oc.Transfers.integration.finacleIntegration.ExecutionExceptionType executionException;

    public DoInterBankTransferFault() {
        super();
    }
    
    public DoInterBankTransferFault(String message) {
        super(message);
    }
    
    public DoInterBankTransferFault(String message, Throwable cause) {
        super(message, cause);
    }

    public DoInterBankTransferFault(String message, lk.sampath.oc.Transfers.integration.finacleIntegration.ExecutionExceptionType executionException) {
        super(message);
        this.executionException = executionException;
    }

    public DoInterBankTransferFault(String message, lk.sampath.oc.Transfers.integration.finacleIntegration.ExecutionExceptionType executionException, Throwable cause) {
        super(message, cause);
        this.executionException = executionException;
    }

    public lk.sampath.oc.Transfers.integration.finacleIntegration.ExecutionExceptionType getFaultInfo() {
        return this.executionException;
    }
}
