
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChequeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChequeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDCIResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChequeResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "cdciResponse"
})
public class StopChequeResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "CDCIResponse")
    protected String cdciResponse;

    /**
     * Gets the value of the processedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessedCode() {
        return processedCode;
    }

    /**
     * Sets the value of the processedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessedCode(String value) {
        this.processedCode = value;
    }

    /**
     * Gets the value of the processedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessedDesc() {
        return processedDesc;
    }

    /**
     * Sets the value of the processedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessedDesc(String value) {
        this.processedDesc = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the cdciResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCIResponse() {
        return cdciResponse;
    }

    /**
     * Sets the value of the cdciResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCIResponse(String value) {
        this.cdciResponse = value;
    }

}
