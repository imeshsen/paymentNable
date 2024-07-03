
package lk.sampath.oc.Transfers.integration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetChequeInquiryDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetChequeInquiryDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChequeInquiryRecordDataRecord" type="{http://www.sampath.lk/SD/IIBFinacleIntegration/}ChequeInquiryDataRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetChequeInquiryDataResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "chequeInquiryRecordDataRecord"
})
public class GetChequeInquiryDataResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "ChequeInquiryRecordDataRecord")
    protected List<ChequeInquiryDataRecord> chequeInquiryRecordDataRecord;

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
     * Gets the value of the chequeInquiryRecordDataRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chequeInquiryRecordDataRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChequeInquiryRecordDataRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChequeInquiryDataRecord }
     * 
     * 
     */
    public List<ChequeInquiryDataRecord> getChequeInquiryRecordDataRecord() {
        if (chequeInquiryRecordDataRecord == null) {
            chequeInquiryRecordDataRecord = new ArrayList<ChequeInquiryDataRecord>();
        }
        return this.chequeInquiryRecordDataRecord;
    }

}
