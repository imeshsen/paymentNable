
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanStmtRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanStmtRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DemandIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DemandType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DemandEffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DemandAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CollectionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastAdjustDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanStmtRecord", propOrder = {
    "demandIndicator",
    "demandType",
    "demandEffDate",
    "demandAmount",
    "collectionAmount",
    "lastAdjustDate"
})
public class LoanStmtRecord {

    @XmlElement(name = "DemandIndicator", required = true)
    protected String demandIndicator;
    @XmlElement(name = "DemandType", required = true)
    protected String demandType;
    @XmlElement(name = "DemandEffDate", required = true)
    protected String demandEffDate;
    @XmlElement(name = "DemandAmount")
    protected double demandAmount;
    @XmlElement(name = "CollectionAmount")
    protected double collectionAmount;
    @XmlElement(name = "LastAdjustDate", required = true)
    protected String lastAdjustDate;

    /**
     * Gets the value of the demandIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandIndicator() {
        return demandIndicator;
    }

    /**
     * Sets the value of the demandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandIndicator(String value) {
        this.demandIndicator = value;
    }

    /**
     * Gets the value of the demandType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandType() {
        return demandType;
    }

    /**
     * Sets the value of the demandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandType(String value) {
        this.demandType = value;
    }

    /**
     * Gets the value of the demandEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandEffDate() {
        return demandEffDate;
    }

    /**
     * Sets the value of the demandEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandEffDate(String value) {
        this.demandEffDate = value;
    }

    /**
     * Gets the value of the demandAmount property.
     * 
     */
    public double getDemandAmount() {
        return demandAmount;
    }

    /**
     * Sets the value of the demandAmount property.
     * 
     */
    public void setDemandAmount(double value) {
        this.demandAmount = value;
    }

    /**
     * Gets the value of the collectionAmount property.
     * 
     */
    public double getCollectionAmount() {
        return collectionAmount;
    }

    /**
     * Sets the value of the collectionAmount property.
     * 
     */
    public void setCollectionAmount(double value) {
        this.collectionAmount = value;
    }

    /**
     * Gets the value of the lastAdjustDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAdjustDate() {
        return lastAdjustDate;
    }

    /**
     * Sets the value of the lastAdjustDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAdjustDate(String value) {
        this.lastAdjustDate = value;
    }

}
