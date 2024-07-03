
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullStmtRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullStmtRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxnDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartTxnSrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DrCr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TxnParticular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnPostedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullStmtRecord", propOrder = {
    "txnDate",
    "txnId",
    "partTxnSrl",
    "txnType",
    "txnSubType",
    "drCr",
    "valueDate",
    "txnAmt",
    "txnParticular",
    "txnPostedDate",
    "instNo",
    "acBalance"
})
public class FullStmtRecord {

    @XmlElement(name = "TxnDate", required = true)
    protected String txnDate;
    @XmlElement(name = "TxnId", required = true)
    protected String txnId;
    @XmlElement(name = "PartTxnSrl", required = true)
    protected String partTxnSrl;
    @XmlElement(name = "TxnType", required = true)
    protected String txnType;
    @XmlElement(name = "TxnSubType", required = true)
    protected String txnSubType;
    @XmlElement(name = "DrCr", required = true)
    protected String drCr;
    @XmlElement(name = "ValueDate", required = true)
    protected String valueDate;
    @XmlElement(name = "TxnAmt")
    protected double txnAmt;
    @XmlElement(name = "TxnParticular", required = true)
    protected String txnParticular;
    @XmlElement(name = "TxnPostedDate", required = true)
    protected String txnPostedDate;
    @XmlElement(name = "InstNo", required = true)
    protected String instNo;
    @XmlElement(name = "AcBalance")
    protected double acBalance;

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnId(String value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the partTxnSrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartTxnSrl() {
        return partTxnSrl;
    }

    /**
     * Sets the value of the partTxnSrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartTxnSrl(String value) {
        this.partTxnSrl = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the txnSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnSubType() {
        return txnSubType;
    }

    /**
     * Sets the value of the txnSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnSubType(String value) {
        this.txnSubType = value;
    }

    /**
     * Gets the value of the drCr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrCr() {
        return drCr;
    }

    /**
     * Sets the value of the drCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrCr(String value) {
        this.drCr = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDate(String value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the txnAmt property.
     * 
     */
    public double getTxnAmt() {
        return txnAmt;
    }

    /**
     * Sets the value of the txnAmt property.
     * 
     */
    public void setTxnAmt(double value) {
        this.txnAmt = value;
    }

    /**
     * Gets the value of the txnParticular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnParticular() {
        return txnParticular;
    }

    /**
     * Sets the value of the txnParticular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnParticular(String value) {
        this.txnParticular = value;
    }

    /**
     * Gets the value of the txnPostedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPostedDate() {
        return txnPostedDate;
    }

    /**
     * Sets the value of the txnPostedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPostedDate(String value) {
        this.txnPostedDate = value;
    }

    /**
     * Gets the value of the instNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstNo() {
        return instNo;
    }

    /**
     * Sets the value of the instNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstNo(String value) {
        this.instNo = value;
    }

    /**
     * Gets the value of the acBalance property.
     * 
     */
    public double getAcBalance() {
        return acBalance;
    }

    /**
     * Sets the value of the acBalance property.
     * 
     */
    public void setAcBalance(double value) {
        this.acBalance = value;
    }

}
