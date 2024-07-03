
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reverse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reverse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://services.web.mcash.sampath.lk/}user" minOccurs="0"/>
 *         &lt;element name="reverseData" type="{http://services.web.mcash.sampath.lk/}reverseDataInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reverse", propOrder = {
    "user",
    "reverseData"
})
public class Reverse {

    protected User user;
    protected ReverseDataInt reverseData;

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
     * Gets the value of the reverseData property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseDataInt }
     *     
     */
    public ReverseDataInt getReverseData() {
        return reverseData;
    }

    /**
     * Sets the value of the reverseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseDataInt }
     *     
     */
    public void setReverseData(ReverseDataInt value) {
        this.reverseData = value;
    }

}
