
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for withdraw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="withdraw">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://services.web.mcash.sampath.lk/}user" minOccurs="0"/>
 *         &lt;element name="withdrawData" type="{http://services.web.mcash.sampath.lk/}withdrawDataInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "withdraw", propOrder = {
    "user",
    "withdrawData"
})
public class Withdraw {

    protected User user;
    protected WithdrawDataInt withdrawData;

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
     * Gets the value of the withdrawData property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawDataInt }
     *     
     */
    public WithdrawDataInt getWithdrawData() {
        return withdrawData;
    }

    /**
     * Sets the value of the withdrawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawDataInt }
     *     
     */
    public void setWithdrawData(WithdrawDataInt value) {
        this.withdrawData = value;
    }

}
