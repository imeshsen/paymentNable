
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lk.sampath.oc.Transfers.integration.mcash package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InquireResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "inquireResponse");
    private final static QName _GetTransactionLimitsResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "getTransactionLimitsResponse");
    private final static QName _MCashSystemException_QNAME = new QName("http://services.web.mcash.sampath.lk/", "MCashSystemException");
    private final static QName _SendSMS_QNAME = new QName("http://services.web.mcash.sampath.lk/", "sendSMS");
    private final static QName _GetCommission_QNAME = new QName("http://services.web.mcash.sampath.lk/", "getCommission");
    private final static QName _SendSMSResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "sendSMSResponse");
    private final static QName _ReverseResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "reverseResponse");
    private final static QName _GetCommissionResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "getCommissionResponse");
    private final static QName _Create_QNAME = new QName("http://services.web.mcash.sampath.lk/", "create");
    private final static QName _MCashValidationException_QNAME = new QName("http://services.web.mcash.sampath.lk/", "MCashValidationException");
    private final static QName _WithdrawResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "withdrawResponse");
    private final static QName _Withdraw_QNAME = new QName("http://services.web.mcash.sampath.lk/", "withdraw");
    private final static QName _Inquire_QNAME = new QName("http://services.web.mcash.sampath.lk/", "inquire");
    private final static QName _GetTransactionLimits_QNAME = new QName("http://services.web.mcash.sampath.lk/", "getTransactionLimits");
    private final static QName _MCashAuthenticationException_QNAME = new QName("http://services.web.mcash.sampath.lk/", "MCashAuthenticationException");
    private final static QName _CreateResponse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "createResponse");
    private final static QName _MCashException_QNAME = new QName("http://services.web.mcash.sampath.lk/", "MCashException");
    private final static QName _Reverse_QNAME = new QName("http://services.web.mcash.sampath.lk/", "reverse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lk.sampath.oc.Transfers.integration.mcash
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inquire }
     * 
     */
    public Inquire createInquire() {
        return new Inquire();
    }

    /**
     * Create an instance of {@link GetTransactionLimits }
     * 
     */
    public GetTransactionLimits createGetTransactionLimits() {
        return new GetTransactionLimits();
    }

    /**
     * Create an instance of {@link MCashAuthenticationException }
     * 
     */
    public MCashAuthenticationException createMCashAuthenticationException() {
        return new MCashAuthenticationException();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link MCashException }
     * 
     */
    public MCashException createMCashException() {
        return new MCashException();
    }

    /**
     * Create an instance of {@link Reverse }
     * 
     */
    public Reverse createReverse() {
        return new Reverse();
    }

    /**
     * Create an instance of {@link InquireResponse }
     * 
     */
    public InquireResponse createInquireResponse() {
        return new InquireResponse();
    }

    /**
     * Create an instance of {@link GetTransactionLimitsResponse }
     * 
     */
    public GetTransactionLimitsResponse createGetTransactionLimitsResponse() {
        return new GetTransactionLimitsResponse();
    }

    /**
     * Create an instance of {@link MCashSystemException }
     * 
     */
    public MCashSystemException createMCashSystemException() {
        return new MCashSystemException();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link GetCommission }
     * 
     */
    public GetCommission createGetCommission() {
        return new GetCommission();
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link ReverseResponse }
     * 
     */
    public ReverseResponse createReverseResponse() {
        return new ReverseResponse();
    }

    /**
     * Create an instance of {@link GetCommissionResponse }
     * 
     */
    public GetCommissionResponse createGetCommissionResponse() {
        return new GetCommissionResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link MCashValidationException }
     * 
     */
    public MCashValidationException createMCashValidationException() {
        return new MCashValidationException();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link ResultData }
     * 
     */
    public ResultData createResultData() {
        return new ResultData();
    }

    /**
     * Create an instance of {@link SmsMessage }
     * 
     */
    public SmsMessage createSmsMessage() {
        return new SmsMessage();
    }

    /**
     * Create an instance of {@link TranLimits }
     * 
     */
    public TranLimits createTranLimits() {
        return new TranLimits();
    }

    /**
     * Create an instance of {@link InquireDataInt }
     * 
     */
    public InquireDataInt createInquireDataInt() {
        return new InquireDataInt();
    }

    /**
     * Create an instance of {@link CommissionData }
     * 
     */
    public CommissionData createCommissionData() {
        return new CommissionData();
    }

    /**
     * Create an instance of {@link WithdrawDataInt }
     * 
     */
    public WithdrawDataInt createWithdrawDataInt() {
        return new WithdrawDataInt();
    }

    /**
     * Create an instance of {@link SearchResultInt }
     * 
     */
    public SearchResultInt createSearchResultInt() {
        return new SearchResultInt();
    }

    /**
     * Create an instance of {@link CreateDataInt }
     * 
     */
    public CreateDataInt createCreateDataInt() {
        return new CreateDataInt();
    }

    /**
     * Create an instance of {@link ReverseDataInt }
     * 
     */
    public ReverseDataInt createReverseDataInt() {
        return new ReverseDataInt();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "inquireResponse")
    public JAXBElement<InquireResponse> createInquireResponse(InquireResponse value) {
        return new JAXBElement<InquireResponse>(_InquireResponse_QNAME, InquireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionLimitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "getTransactionLimitsResponse")
    public JAXBElement<GetTransactionLimitsResponse> createGetTransactionLimitsResponse(GetTransactionLimitsResponse value) {
        return new JAXBElement<GetTransactionLimitsResponse>(_GetTransactionLimitsResponse_QNAME, GetTransactionLimitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCashSystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "MCashSystemException")
    public JAXBElement<MCashSystemException> createMCashSystemException(MCashSystemException value) {
        return new JAXBElement<MCashSystemException>(_MCashSystemException_QNAME, MCashSystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "sendSMS")
    public JAXBElement<SendSMS> createSendSMS(SendSMS value) {
        return new JAXBElement<SendSMS>(_SendSMS_QNAME, SendSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "getCommission")
    public JAXBElement<GetCommission> createGetCommission(GetCommission value) {
        return new JAXBElement<GetCommission>(_GetCommission_QNAME, GetCommission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "sendSMSResponse")
    public JAXBElement<SendSMSResponse> createSendSMSResponse(SendSMSResponse value) {
        return new JAXBElement<SendSMSResponse>(_SendSMSResponse_QNAME, SendSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "reverseResponse")
    public JAXBElement<ReverseResponse> createReverseResponse(ReverseResponse value) {
        return new JAXBElement<ReverseResponse>(_ReverseResponse_QNAME, ReverseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommissionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "getCommissionResponse")
    public JAXBElement<GetCommissionResponse> createGetCommissionResponse(GetCommissionResponse value) {
        return new JAXBElement<GetCommissionResponse>(_GetCommissionResponse_QNAME, GetCommissionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCashValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "MCashValidationException")
    public JAXBElement<MCashValidationException> createMCashValidationException(MCashValidationException value) {
        return new JAXBElement<MCashValidationException>(_MCashValidationException_QNAME, MCashValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inquire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "inquire")
    public JAXBElement<Inquire> createInquire(Inquire value) {
        return new JAXBElement<Inquire>(_Inquire_QNAME, Inquire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionLimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "getTransactionLimits")
    public JAXBElement<GetTransactionLimits> createGetTransactionLimits(GetTransactionLimits value) {
        return new JAXBElement<GetTransactionLimits>(_GetTransactionLimits_QNAME, GetTransactionLimits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCashAuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "MCashAuthenticationException")
    public JAXBElement<MCashAuthenticationException> createMCashAuthenticationException(MCashAuthenticationException value) {
        return new JAXBElement<MCashAuthenticationException>(_MCashAuthenticationException_QNAME, MCashAuthenticationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCashException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "MCashException")
    public JAXBElement<MCashException> createMCashException(MCashException value) {
        return new JAXBElement<MCashException>(_MCashException_QNAME, MCashException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reverse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.mcash.sampath.lk/", name = "reverse")
    public JAXBElement<Reverse> createReverse(Reverse value) {
        return new JAXBElement<Reverse>(_Reverse_QNAME, Reverse.class, null, value);
    }

}
