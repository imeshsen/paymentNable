
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendSMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://services.web.mcash.sampath.lk/}user" minOccurs="0"/>
 *         &lt;element name="sms" type="{http://services.web.mcash.sampath.lk/}smsMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSMS", propOrder = {
    "user",
    "sms"
})
public class SendSMS {

    protected User user;
    protected SmsMessage sms;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link SmsMessage }
     *     
     */
    public SmsMessage getSms() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsMessage }
     *     
     */
    public void setSms(SmsMessage value) {
        this.sms = value;
    }

}
