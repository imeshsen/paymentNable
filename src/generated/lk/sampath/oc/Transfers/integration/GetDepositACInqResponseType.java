
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDepositACInqResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDepositACInqResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PeriodDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AcctMaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctSchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHolderName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHolderName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointHolderName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaturityAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "GetDepositACInqResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "accountNo",
    "customerID",
    "customerName",
    "acctOpenDate",
    "periodMonths",
    "periodDays",
    "acctMaturityDate",
    "acctType",
    "acctSchemeCode",
    "jointHolderName1",
    "jointHolderName2",
    "jointHolderName3",
    "interestRate",
    "depositAmount",
    "maturityAmount",
    "currencyCode",
    "ledgerBalance",
    "systemNickname"
})
public class GetDepositACInqResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "AcctOpenDate")
    protected String acctOpenDate;
    @XmlElement(name = "PeriodMonths")
    protected Integer periodMonths;
    @XmlElement(name = "PeriodDays")
    protected Integer periodDays;
    @XmlElement(name = "AcctMaturityDate")
    protected String acctMaturityDate;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctSchemeCode")
    protected String acctSchemeCode;
    @XmlElement(name = "JointHolderName1")
    protected String jointHolderName1;
    @XmlElement(name = "JointHolderName2")
    protected String jointHolderName2;
    @XmlElement(name = "JointHolderName3")
    protected String jointHolderName3;
    @XmlElement(name = "InterestRate")
    protected Double interestRate;
    @XmlElement(name = "DepositAmount")
    protected Double depositAmount;
    @XmlElement(name = "MaturityAmount")
    protected Double maturityAmount;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "LedgerBalance")
    protected Double ledgerBalance;
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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the periodMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodMonths() {
        return periodMonths;
    }

    /**
     * Sets the value of the periodMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodMonths(Integer value) {
        this.periodMonths = value;
    }

    /**
     * Gets the value of the periodDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodDays() {
        return periodDays;
    }

    /**
     * Sets the value of the periodDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodDays(Integer value) {
        this.periodDays = value;
    }

    /**
     * Gets the value of the acctMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMaturityDate() {
        return acctMaturityDate;
    }

    /**
     * Sets the value of the acctMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMaturityDate(String value) {
        this.acctMaturityDate = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSchemeCode() {
        return acctSchemeCode;
    }

    /**
     * Sets the value of the acctSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSchemeCode(String value) {
        this.acctSchemeCode = value;
    }

    /**
     * Gets the value of the jointHolderName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHolderName1() {
        return jointHolderName1;
    }

    /**
     * Sets the value of the jointHolderName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHolderName1(String value) {
        this.jointHolderName1 = value;
    }

    /**
     * Gets the value of the jointHolderName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHolderName2() {
        return jointHolderName2;
    }

    /**
     * Sets the value of the jointHolderName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHolderName2(String value) {
        this.jointHolderName2 = value;
    }

    /**
     * Gets the value of the jointHolderName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointHolderName3() {
        return jointHolderName3;
    }

    /**
     * Sets the value of the jointHolderName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointHolderName3(String value) {
        this.jointHolderName3 = value;
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
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositAmount(Double value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the maturityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaturityAmount() {
        return maturityAmount;
    }

    /**
     * Sets the value of the maturityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaturityAmount(Double value) {
        this.maturityAmount = value;
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
