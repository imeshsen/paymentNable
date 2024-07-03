
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for withdrawDataInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="withdrawDataInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benePin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="txnPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "withdrawDataInt", propOrder = {
    "account",
    "beneID",
    "beneMessage",
    "benePin",
    "companyName",
    "paidBy",
    "paidDate",
    "sendMessage",
    "txnAmount",
    "txnPin"
})
public class WithdrawDataInt {

    protected String account;
    protected String beneID;
    protected String beneMessage;
    protected String benePin;
    protected String companyName;
    protected int paidBy;
    protected String paidDate;
    protected String sendMessage;
    protected double txnAmount;
    protected String txnPin;

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
     * Gets the value of the benePin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenePin() {
        return benePin;
    }

    /**
     * Sets the value of the benePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenePin(String value) {
        this.benePin = value;
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
     * Gets the value of the paidBy property.
     * 
     */
    public int getPaidBy() {
        return paidBy;
    }

    /**
     * Sets the value of the paidBy property.
     * 
     */
    public void setPaidBy(int value) {
        this.paidBy = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDate(String value) {
        this.paidDate = value;
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

}
