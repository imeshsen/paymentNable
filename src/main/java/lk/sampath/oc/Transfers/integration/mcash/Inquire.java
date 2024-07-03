
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inquire complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inquire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://services.web.mcash.sampath.lk/}user" minOccurs="0"/>
 *         &lt;element name="inquireDataInt" type="{http://services.web.mcash.sampath.lk/}inquireDataInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inquire", propOrder = {
    "user",
    "inquireDataInt"
})
public class Inquire {

    protected User user;
    protected InquireDataInt inquireDataInt;

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
     * Gets the value of the inquireDataInt property.
     * 
     * @return
     *     possible object is
     *     {@link InquireDataInt }
     *     
     */
    public InquireDataInt getInquireDataInt() {
        return inquireDataInt;
    }

    /**
     * Sets the value of the inquireDataInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquireDataInt }
     *     
     */
    public void setInquireDataInt(InquireDataInt value) {
        this.inquireDataInt = value;
    }

}
