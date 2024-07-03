
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createDataInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createDataInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyLimits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendSndrMsgE2M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trWithdrawType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="txnMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTranPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDataInt", propOrder = {
    "account",
    "applyLimits",
    "beneAddr",
    "beneID",
    "beneMessage",
    "beneName",
    "beneTel",
    "beneTel2",
    "beneTitle",
    "companyID",
    "companyName",
    "createdBy",
    "createdDate",
    "currCode",
    "deductCommission",
    "sendMessage",
    "sendSndrMsgE2M",
    "senderAddr",
    "senderID",
    "senderName",
    "senderTel",
    "senderTel2",
    "senderTitle",
    "trWithdrawType",
    "txnAmount",
    "txnMode",
    "txnPin",
    "txnStatus",
    "txnType",
    "userTranPart"
})
public class CreateDataInt {

    protected String account;
    protected String applyLimits;
    protected String beneAddr;
    protected String beneID;
    protected String beneMessage;
    protected String beneName;
    protected String beneTel;
    protected String beneTel2;
    protected String beneTitle;
    protected long companyID;
    protected String companyName;
    protected int createdBy;
    protected String createdDate;
    protected String currCode;
    protected String deductCommission;
    protected String sendMessage;
    protected String sendSndrMsgE2M;
    protected String senderAddr;
    protected String senderID;
    protected String senderName;
    protected String senderTel;
    protected String senderTel2;
    protected String senderTitle;
    protected String trWithdrawType;
    protected double txnAmount;
    protected String txnMode;
    protected String txnPin;
    protected String txnStatus;
    protected String txnType;
    protected String userTranPart;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the applyLimits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyLimits() {
        return applyLimits;
    }

    /**
     * Sets the value of the applyLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyLimits(String value) {
        this.applyLimits = value;
    }

    /**
     * Gets the value of the beneAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneAddr() {
        return beneAddr;
    }

    /**
     * Sets the value of the beneAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneAddr(String value) {
        this.beneAddr = value;
    }

    /**
     * Gets the value of the beneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneID() {
        return beneID;
    }

    /**
     * Sets the value of the beneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneID(String value) {
        this.beneID = value;
    }

    /**
     * Gets the value of the beneMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneMessage() {
        return beneMessage;
    }

    /**
     * Sets the value of the beneMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneMessage(String value) {
        this.beneMessage = value;
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
     * Gets the value of the beneTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneTel2() {
        return beneTel2;
    }

    /**
     * Sets the value of the beneTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneTel2(String value) {
        this.beneTel2 = value;
    }

    /**
     * Gets the value of the beneTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneTitle() {
        return beneTitle;
    }

    /**
     * Sets the value of the beneTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneTitle(String value) {
        this.beneTitle = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     */
    public long getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     */
    public void setCompanyID(long value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrCode(String value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the deductCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductCommission() {
        return deductCommission;
    }

    /**
     * Sets the value of the deductCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductCommission(String value) {
        this.deductCommission = value;
    }

    /**
     * Gets the value of the sendMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMessage() {
        return sendMessage;
    }

    /**
     * Sets the value of the sendMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMessage(String value) {
        this.sendMessage = value;
    }

    /**
     * Gets the value of the sendSndrMsgE2M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSndrMsgE2M() {
        return sendSndrMsgE2M;
    }

    /**
     * Sets the value of the sendSndrMsgE2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSndrMsgE2M(String value) {
        this.sendSndrMsgE2M = value;
    }

    /**
     * Gets the value of the senderAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddr() {
        return senderAddr;
    }

    /**
     * Sets the value of the senderAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddr(String value) {
        this.senderAddr = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
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
     * Gets the value of the senderTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTel2() {
        return senderTel2;
    }

    /**
     * Sets the value of the senderTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTel2(String value) {
        this.senderTel2 = value;
    }

    /**
     * Gets the value of the senderTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderTitle() {
        return senderTitle;
    }

    /**
     * Sets the value of the senderTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderTitle(String value) {
        this.senderTitle = value;
    }

    /**
     * Gets the value of the trWithdrawType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrWithdrawType() {
        return trWithdrawType;
    }

    /**
     * Sets the value of the trWithdrawType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrWithdrawType(String value) {
        this.trWithdrawType = value;
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
     * Gets the value of the txnMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnMode() {
        return txnMode;
    }

    /**
     * Sets the value of the txnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnMode(String value) {
        this.txnMode = value;
    }

    /**
     * Gets the value of the txnPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPin() {
        return txnPin;
    }

    /**
     * Sets the value of the txnPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPin(String value) {
        this.txnPin = value;
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

    /**
     * Gets the value of the userTranPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTranPart() {
        return userTranPart;
    }

    /**
     * Sets the value of the userTranPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTranPart(String value) {
        this.userTranPart = value;
    }

}
