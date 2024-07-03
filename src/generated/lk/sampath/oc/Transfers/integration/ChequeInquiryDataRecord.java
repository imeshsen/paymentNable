
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeInquiryDataRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeInquiryDataRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChqAlpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartChequeNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoofLeaves" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeInquiryDataRecord", propOrder = {
    "acctNo",
    "chqAlpha",
    "startChequeNo",
    "issueDate",
    "noofLeaves"
})
public class ChequeInquiryDataRecord {

    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "ChqAlpha", required = true)
    protected String chqAlpha;
    @XmlElement(name = "StartChequeNo")
    protected long startChequeNo;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "NoofLeaves")
    protected int noofLeaves;

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
     * Gets the value of the chqAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqAlpha() {
        return chqAlpha;
    }

    /**
     * Sets the value of the chqAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqAlpha(String value) {
        this.chqAlpha = value;
    }

    /**
     * Gets the value of the startChequeNo property.
     * 
     */
    public long getStartChequeNo() {
        return startChequeNo;
    }

    /**
     * Sets the value of the startChequeNo property.
     * 
     */
    public void setStartChequeNo(long value) {
        this.startChequeNo = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the noofLeaves property.
     * 
     */
    public int getNoofLeaves() {
        return noofLeaves;
    }

    /**
     * Sets the value of the noofLeaves property.
     * 
     */
    public void setNoofLeaves(int value) {
        this.noofLeaves = value;
    }

}
