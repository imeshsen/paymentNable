
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tranLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tranLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tranLimits", propOrder = {
    "maxLimit",
    "minLimit"
})
public class TranLimits {

    protected double maxLimit;
    protected double minLimit;

    /**
     * Gets the value of the maxLimit property.
     * 
     */
    public double getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     */
    public void setMaxLimit(double value) {
        this.maxLimit = value;
    }

    /**
     * Gets the value of the minLimit property.
     * 
     */
    public double getMinLimit() {
        return minLimit;
    }

    /**
     * Sets the value of the minLimit property.
     * 
     */
    public void setMinLimit(double value) {
        this.minLimit = value;
    }

}
