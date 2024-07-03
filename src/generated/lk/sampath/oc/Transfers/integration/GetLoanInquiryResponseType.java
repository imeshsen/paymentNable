
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLoanInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLoanInquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FloatBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FfdBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UserDefinedBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanPeriodMnth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoanPeriodDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoanSchmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextInstlDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHldr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHldr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHldr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SanctionedAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DisbursedAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="InstAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OverDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LoanExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLoanInquiryResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "ledgerBalance",
    "availableBalance",
    "floatBalance",
    "ffdBalance",
    "userDefinedBalance",
    "currencyCode",
    "accountNo",
    "custID",
    "nickName",
    "acctOpenDate",
    "loanPeriodMnth",
    "loanPeriodDays",
    "loanSchmCode",
    "interestRate",
    "loanType",
    "nextInstlDueDate",
    "jointHldr1",
    "jointHldr2",
    "jointHldr3",
    "sanctionedAmt",
    "disbursedAmt",
    "instAmt",
    "overDueAmt",
    "loanExpDate",
    "systemNickname"
})
public class GetLoanInquiryResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "LedgerBalance")
    protected Double ledgerBalance;
    @XmlElement(name = "AvailableBalance")
    protected Double availableBalance;
    @XmlElement(name = "FloatBalance")
    protected Double floatBalance;
    @XmlElement(name = "FfdBalance")
    protected Double ffdBalance;
    @XmlElement(name = "UserDefinedBalance")
    protected Double userDefinedBalance;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "CustID")
    protected String custID;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "AcctOpenDate")
    protected String acctOpenDate;
    @XmlElement(name = "LoanPeriodMnth")
    protected Integer loanPeriodMnth;
    @XmlElement(name = "LoanPeriodDays")
    protected Integer loanPeriodDays;
    @XmlElement(name = "LoanSchmCode")
    protected String loanSchmCode;
    @XmlElement(name = "InterestRate")
    protected Double interestRate;
    @XmlElement(name = "LoanType")
    protected String loanType;
    @XmlElement(name = "NextInstlDueDate")
    protected String nextInstlDueDate;
    @XmlElement(name = "JointHldr1")
    protected String jointHldr1;
    @XmlElement(name = "JointHldr2")
    protected String jointHldr2;
    @XmlElement(name = "JointHldr3")
    protected String jointHldr3;
    @XmlElement(name = "SanctionedAmt")
    protected Double sanctionedAmt;
    @XmlElement(name = "DisbursedAmt")
    protected Double disbursedAmt;
    @XmlElement(name = "InstAmt")
    protected Double instAmt;
    @XmlElement(name = "OverDueAmt")
    protected Double overDueAmt;
    @XmlElement(name = "LoanExpDate")
    protected String loanExpDate;
    @XmlElement(name = "SystemNickname")
    protected String systemNickname;

    /**
     * Gets the value of the processedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessedCode() {
        return processedCode;
    }

    /**
     * Sets the value of the processedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessedCode(String value) {
        this.processedCode = value;
    }

    /**
     * Gets the value of the processedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessedDesc() {
        return processedDesc;
    }

    /**
     * Sets the value of the processedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessedDesc(String value) {
        this.processedDesc = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the ledgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets the value of the ledgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLedgerBalance(Double value) {
        this.ledgerBalance = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailableBalance(Double value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the floatBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloatBalance() {
        return floatBalance;
    }

    /**
     * Sets the value of the floatBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloatBalance(Double value) {
        this.floatBalance = value;
    }

    /**
     * Gets the value of the ffdBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFfdBalance() {
        return ffdBalance;
    }

    /**
     * Sets the value of the ffdBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFfdBalance(Double value) {
        this.ffdBalance = value;
    }

    /**
     * Gets the value of the userDefinedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserDefinedBalance() {
        return userDefinedBalance;
    }

    /**
     * Sets the value of the userDefinedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserDefinedBalance(Double value) {
        this.userDefinedBalance = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the acctOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOpenDate() {
        return acctOpenDate;
    }

    /**
     * Sets the value of the acctOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOpenDate(String value) {
        this.acctOpenDate = value;
    }

    /**
     * Gets the value of the loanPeriodMnth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPeriodMnth() {
        return loanPeriodMnth;
    }

    /**
     * Sets the value of the loanPeriodMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPeriodMnth(Integer value) {
        this.loanPeriodMnth = value;
    }

    /**
     * Gets the value of the loanPeriodDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPeriodDays() {
        return loanPeriodDays;
    }

    /**
     * Sets the value of the loanPeriodDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPeriodDays(Integer value) {
        this.loanPeriodDays = value;
    }

    /**
     * Gets the value of the loanSchmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSchmCode() {
        return loanSchmCode;
    }

    /**
     * Sets the value of the loanSchmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSchmCode(String value) {
        this.loanSchmCode = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterestRate(Double value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the nextInstlDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextInstlDueDate() {
        return nextInstlDueDate;
    }

    /**
     * Sets the value of the nextInstlDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextInstlDueDate(String value) {
        this.nextInstlDueDate = value;
    }

    /**
     * Gets the value of the jointHldr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHldr1() {
        return jointHldr1;
    }

    /**
     * Sets the value of the jointHldr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHldr1(String value) {
        this.jointHldr1 = value;
    }

    /**
     * Gets the value of the jointHldr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHldr2() {
        return jointHldr2;
    }

    /**
     * Sets the value of the jointHldr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHldr2(String value) {
        this.jointHldr2 = value;
    }

    /**
     * Gets the value of the jointHldr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHldr3() {
        return jointHldr3;
    }

    /**
     * Sets the value of the jointHldr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHldr3(String value) {
        this.jointHldr3 = value;
    }

    /**
     * Gets the value of the sanctionedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSanctionedAmt() {
        return sanctionedAmt;
    }

    /**
     * Sets the value of the sanctionedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSanctionedAmt(Double value) {
        this.sanctionedAmt = value;
    }

    /**
     * Gets the value of the disbursedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisbursedAmt() {
        return disbursedAmt;
    }

    /**
     * Sets the value of the disbursedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisbursedAmt(Double value) {
        this.disbursedAmt = value;
    }

    /**
     * Gets the value of the instAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInstAmt() {
        return instAmt;
    }

    /**
     * Sets the value of the instAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInstAmt(Double value) {
        this.instAmt = value;
    }

    /**
     * Gets the value of the overDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverDueAmt() {
        return overDueAmt;
    }

    /**
     * Sets the value of the overDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverDueAmt(Double value) {
        this.overDueAmt = value;
    }

    /**
     * Gets the value of the loanExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanExpDate() {
        return loanExpDate;
    }

    /**
     * Sets the value of the loanExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanExpDate(String value) {
        this.loanExpDate = value;
    }

    /**
     * Gets the value of the systemNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNickname() {
        return systemNickname;
    }

    /**
     * Sets the value of the systemNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNickname(String value) {
        this.systemNickname = value;
    }

}
