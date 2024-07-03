
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanScheduleRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanScheduleRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlowID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstInstDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NoOfInst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NextDemandDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepayCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepayFrequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanScheduleRecord", propOrder = {
    "acctNo",
    "flowID",
    "firstInstDate",
    "instAmount",
    "noOfInst",
    "nextDemandDate",
    "repayCode",
    "repayFrequency"
})
public class LoanScheduleRecord {

    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "FlowID", required = true)
    protected String flowID;
    @XmlElement(name = "FirstInstDate", required = true)
    protected String firstInstDate;
    @XmlElement(name = "InstAmount")
    protected double instAmount;
    @XmlElement(name = "NoOfInst")
    protected int noOfInst;
    @XmlElement(name = "NextDemandDate", required = true)
    protected String nextDemandDate;
    @XmlElement(name = "RepayCode", required = true)
    protected String repayCode;
    @XmlElement(name = "RepayFrequency", required = true)
    protected String repayFrequency;

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the flowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowID() {
        return flowID;
    }

    /**
     * Sets the value of the flowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowID(String value) {
        this.flowID = value;
    }

    /**
     * Gets the value of the firstInstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstInstDate() {
        return firstInstDate;
    }

    /**
     * Sets the value of the firstInstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstInstDate(String value) {
        this.firstInstDate = value;
    }

    /**
     * Gets the value of the instAmount property.
     * 
     */
    public double getInstAmount() {
        return instAmount;
    }

    /**
     * Sets the value of the instAmount property.
     * 
     */
    public void setInstAmount(double value) {
        this.instAmount = value;
    }

    /**
     * Gets the value of the noOfInst property.
     * 
     */
    public int getNoOfInst() {
        return noOfInst;
    }

    /**
     * Sets the value of the noOfInst property.
     * 
     */
    public void setNoOfInst(int value) {
        this.noOfInst = value;
    }

    /**
     * Gets the value of the nextDemandDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDemandDate() {
        return nextDemandDate;
    }

    /**
     * Sets the value of the nextDemandDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDemandDate(String value) {
        this.nextDemandDate = value;
    }

    /**
     * Gets the value of the repayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayCode() {
        return repayCode;
    }

    /**
     * Sets the value of the repayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayCode(String value) {
        this.repayCode = value;
    }

    /**
     * Gets the value of the repayFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayFrequency() {
        return repayFrequency;
    }

    /**
     * Sets the value of the repayFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayFrequency(String value) {
        this.repayFrequency = value;
    }

}
