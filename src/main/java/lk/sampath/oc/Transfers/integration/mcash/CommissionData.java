
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commissionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commissionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benePin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commissionData", propOrder = {
    "account",
    "action",
    "beneID",
    "benePin",
    "senderID",
    "txnAmount"
})
public class CommissionData {

    protected String account;
    protected int action;
    protected String beneID;
    protected String benePin;
    protected String senderID;
    protected double txnAmount;

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
     * Gets the value of the action property.
     * 
     */
    public int getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setAction(int value) {
        this.action = value;
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

}
