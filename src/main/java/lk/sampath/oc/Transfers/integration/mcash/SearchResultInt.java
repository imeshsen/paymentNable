
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchResultInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResultInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="txnCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="txnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResultInt", propOrder = {
    "beneAddress",
    "beneId",
    "beneName",
    "beneTel",
    "createdBy",
    "createdDate",
    "currencyCode",
    "debitAccount",
    "expiryDate",
    "originalPin",
    "receiveDate",
    "senderAddress",
    "senderId",
    "senderName",
    "senderTel",
    "txnAmount",
    "txnCommission",
    "txnStatus",
    "txnType"
})
public class SearchResultInt {

    protected String beneAddress;
    protected String beneId;
    protected String beneName;
    protected String beneTel;
    protected int createdBy;
    protected String createdDate;
    protected String currencyCode;
    protected String debitAccount;
    protected String expiryDate;
    protected String originalPin;
    protected String receiveDate;
    protected String senderAddress;
    protected String senderId;
    protected String senderName;
    protected String senderTel;
    protected double txnAmount;
    protected double txnCommission;
    protected String txnStatus;
    protected String txnType;

    /**
     * Gets the value of the beneAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAddress() {
        return beneAddress;
    }

    /**
     * Sets the value of the beneAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAddress(String value) {
        this.beneAddress = value;
    }

    /**
     * Gets the value of the beneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneId() {
        return beneId;
    }

    /**
     * Sets the value of the beneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneId(String value) {
        this.beneId = value;
    }

    /**
     * Gets the value of the beneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneName() {
        return beneName;
    }

    /**
     * Sets the value of the beneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneName(String value) {
        this.beneName = value;
    }

    /**
     * Gets the value of the beneTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneTel() {
        return beneTel;
    }

    /**
     * Sets the value of the beneTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneTel(String value) {
        this.beneTel = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     */
    public void setCreatedBy(int value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
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
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the originalPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPin() {
        return originalPin;
    }

    /**
     * Sets the value of the originalPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPin(String value) {
        this.originalPin = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * Sets the value of the senderTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTel(String value) {
        this.senderTel = value;
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
     * Gets the value of the txnCommission property.
     * 
     */
    public double getTxnCommission() {
        return txnCommission;
    }

    /**
     * Sets the value of the txnCommission property.
     * 
     */
    public void setTxnCommission(double value) {
        this.txnCommission = value;
    }

    /**
     * Gets the value of the txnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnStatus() {
        return txnStatus;
    }

    /**
     * Sets the value of the txnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnStatus(String value) {
        this.txnStatus = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

}
