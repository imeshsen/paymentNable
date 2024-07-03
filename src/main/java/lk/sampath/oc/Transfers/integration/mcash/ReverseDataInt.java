
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reverseDataInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reverseDataInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspendBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspendSol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reverseDataInt", propOrder = {
    "beneMessage",
    "companyName",
    "sendMessage",
    "senderId",
    "senderPin",
    "suspendBy",
    "suspendSol"
})
public class ReverseDataInt {

    protected String beneMessage;
    protected String companyName;
    protected String sendMessage;
    protected String senderId;
    protected String senderPin;
    protected String suspendBy;
    protected String suspendSol;

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
     * Gets the value of the senderPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPin() {
        return senderPin;
    }

    /**
     * Sets the value of the senderPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPin(String value) {
        this.senderPin = value;
    }

    /**
     * Gets the value of the suspendBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendBy() {
        return suspendBy;
    }

    /**
     * Sets the value of the suspendBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendBy(String value) {
        this.suspendBy = value;
    }

    /**
     * Gets the value of the suspendSol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendSol() {
        return suspendSol;
    }

    /**
     * Sets the value of the suspendSol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendSol(String value) {
        this.suspendSol = value;
    }

}
