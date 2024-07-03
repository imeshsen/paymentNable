
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoInterBankTransferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoInterBankTransferRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAccNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAccBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAccBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToAccNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToAccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToAccType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToAccBankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToAccBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TranRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlipsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEFTFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromAccName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoInterBankTransferRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "terminalID",
    "cardNo",
    "fromAccNo",
    "fromAccType",
    "fromAccBankCode",
    "fromAccBranchCode",
    "toAccNo",
    "toAccName",
    "toAccType",
    "toAccBankCode",
    "toAccBranchCode",
    "txnAmount",
    "commAmount",
    "commAccount",
    "tranRemarks",
    "valueDate",
    "slipsCode",
    "drCurrencyCode",
    "channelType",
    "ceftFlag",
    "fromAccName",
    "reference"
})
public class DoInterBankTransferRequestType {

    @XmlElement(name = "APPCode")
    protected String appCode;
    @XmlElement(name = "Controller")
    protected String controller;
    @XmlElement(name = "CDCICode")
    protected String cdciCode;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "FromAccNo", required = true)
    protected String fromAccNo;
    @XmlElement(name = "FromAccType")
    protected String fromAccType;
    @XmlElement(name = "FromAccBankCode")
    protected String fromAccBankCode;
    @XmlElement(name = "FromAccBranchCode")
    protected String fromAccBranchCode;
    @XmlElement(name = "ToAccNo", required = true)
    protected String toAccNo;
    @XmlElement(name = "ToAccName")
    protected String toAccName;
    @XmlElement(name = "ToAccType")
    protected String toAccType;
    @XmlElement(name = "ToAccBankCode", required = true)
    protected String toAccBankCode;
    @XmlElement(name = "ToAccBranchCode")
    protected String toAccBranchCode;
    @XmlElement(name = "TxnAmount")
    protected double txnAmount;
    @XmlElement(name = "CommAmount")
    protected double commAmount;
    @XmlElement(name = "CommAccount")
    protected String commAccount;
    @XmlElement(name = "TranRemarks")
    protected String tranRemarks;
    @XmlElement(name = "ValueDate")
    protected String valueDate;
    @XmlElement(name = "SlipsCode")
    protected String slipsCode;
    @XmlElement(name = "DrCurrencyCode")
    protected String drCurrencyCode;
    @XmlElement(name = "ChannelType")
    protected String channelType;
    @XmlElement(name = "CEFTFlag", required = true)
    protected String ceftFlag;
    @XmlElement(name = "FromAccName", required = true)
    protected String fromAccName;
    @XmlElement(name = "Reference")
    protected String reference;

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setController(String value) {
        this.controller = value;
    }

    /**
     * Gets the value of the cdciCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCICode() {
        return cdciCode;
    }

    /**
     * Sets the value of the cdciCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCICode(String value) {
        this.cdciCode = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the fromAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccNo() {
        return fromAccNo;
    }

    /**
     * Sets the value of the fromAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccNo(String value) {
        this.fromAccNo = value;
    }

    /**
     * Gets the value of the fromAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccType() {
        return fromAccType;
    }

    /**
     * Sets the value of the fromAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccType(String value) {
        this.fromAccType = value;
    }

    /**
     * Gets the value of the fromAccBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccBankCode() {
        return fromAccBankCode;
    }

    /**
     * Sets the value of the fromAccBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccBankCode(String value) {
        this.fromAccBankCode = value;
    }

    /**
     * Gets the value of the fromAccBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccBranchCode() {
        return fromAccBranchCode;
    }

    /**
     * Sets the value of the fromAccBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccBranchCode(String value) {
        this.fromAccBranchCode = value;
    }

    /**
     * Gets the value of the toAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccNo() {
        return toAccNo;
    }

    /**
     * Sets the value of the toAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccNo(String value) {
        this.toAccNo = value;
    }

    /**
     * Gets the value of the toAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccName() {
        return toAccName;
    }

    /**
     * Sets the value of the toAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccName(String value) {
        this.toAccName = value;
    }

    /**
     * Gets the value of the toAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccType() {
        return toAccType;
    }

    /**
     * Sets the value of the toAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccType(String value) {
        this.toAccType = value;
    }

    /**
     * Gets the value of the toAccBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccBankCode() {
        return toAccBankCode;
    }

    /**
     * Sets the value of the toAccBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccBankCode(String value) {
        this.toAccBankCode = value;
    }

    /**
     * Gets the value of the toAccBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccBranchCode() {
        return toAccBranchCode;
    }

    /**
     * Sets the value of the toAccBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccBranchCode(String value) {
        this.toAccBranchCode = value;
    }

    /**
     * Gets the value of the txnAmount property.
     * 
     */
    public double getTxnAmount() {
        return txnAmount;
    }

    /**
     * Sets the value of the txnAmount property.
     * 
     */
    public void setTxnAmount(double value) {
        this.txnAmount = value;
    }

    /**
     * Gets the value of the commAmount property.
     * 
     */
    public double getCommAmount() {
        return commAmount;
    }

    /**
     * Sets the value of the commAmount property.
     * 
     */
    public void setCommAmount(double value) {
        this.commAmount = value;
    }

    /**
     * Gets the value of the commAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommAccount() {
        return commAccount;
    }

    /**
     * Sets the value of the commAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommAccount(String value) {
        this.commAccount = value;
    }

    /**
     * Gets the value of the tranRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranRemarks() {
        return tranRemarks;
    }

    /**
     * Sets the value of the tranRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranRemarks(String value) {
        this.tranRemarks = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDate(String value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the slipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipsCode() {
        return slipsCode;
    }

    /**
     * Sets the value of the slipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipsCode(String value) {
        this.slipsCode = value;
    }

    /**
     * Gets the value of the drCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrCurrencyCode() {
        return drCurrencyCode;
    }

    /**
     * Sets the value of the drCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrCurrencyCode(String value) {
        this.drCurrencyCode = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the ceftFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEFTFlag() {
        return ceftFlag;
    }

    /**
     * Sets the value of the ceftFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEFTFlag(String value) {
        this.ceftFlag = value;
    }

    /**
     * Gets the value of the fromAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccName() {
        return fromAccName;
    }

    /**
     * Sets the value of the fromAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccName(String value) {
        this.fromAccName = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
