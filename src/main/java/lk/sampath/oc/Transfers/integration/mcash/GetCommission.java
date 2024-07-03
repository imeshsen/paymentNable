
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://services.web.mcash.sampath.lk/}user" minOccurs="0"/>
 *         &lt;element name="commData" type="{http://services.web.mcash.sampath.lk/}commissionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommission", propOrder = {
    "user",
    "commData"
})
public class GetCommission {

    protected User user;
    protected CommissionData commData;

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
     * Gets the value of the commData property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionData }
     *     
     */
    public CommissionData getCommData() {
        return commData;
    }

    /**
     * Sets the value of the commData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionData }
     *     
     */
    public void setCommData(CommissionData value) {
        this.commData = value;
    }

}
