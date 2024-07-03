
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFullstmtRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFullstmtRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnDateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnDateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowerAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HigherAmt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BeginChq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndChq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumRec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DebitCredit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCI043" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFullstmtRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "accountNo",
    "txnDateFrom",
    "txnDateTo",
    "lowerAmt",
    "higherAmt",
    "beginChq",
    "endChq",
    "numRec",
    "sortOrder",
    "debitCredit",
    "currencyCode",
    "solId",
    "cdci043"
})
public class GetFullstmtRequestType {

    @XmlElement(name = "APPCode", required = true)
    protected String appCode;
    @XmlElement(name = "Controller", required = true)
    protected String controller;
    @XmlElement(name = "CDCICode", required = true)
    protected String cdciCode;
    @XmlElement(name = "AccountNo", required = true)
    protected String accountNo;
    @XmlElement(name = "TxnDateFrom", required = true)
    protected String txnDateFrom;
    @XmlElement(name = "TxnDateTo", required = true)
    protected String txnDateTo;
    @XmlElement(name = "LowerAmt")
    protected double lowerAmt;
    @XmlElement(name = "HigherAmt")
    protected double higherAmt;
    @XmlElement(name = "BeginChq", required = true)
    protected String beginChq;
    @XmlElement(name = "EndChq", required = true)
    protected String endChq;
    @XmlElement(name = "NumRec")
    protected int numRec;
    @XmlElement(name = "SortOrder", required = true)
    protected String sortOrder;
    @XmlElement(name = "DebitCredit", required = true)
    protected String debitCredit;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "SolId", required = true)
    protected String solId;
    @XmlElement(name = "CDCI043", required = true)
    protected String cdci043;

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setController(String value) {
        this.controller = value;
    }

    /**
     * Gets the value of the cdciCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCICode() {
        return cdciCode;
    }

    /**
     * Sets the value of the cdciCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCICode(String value) {
        this.cdciCode = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the txnDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDateFrom() {
        return txnDateFrom;
    }

    /**
     * Sets the value of the txnDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDateFrom(String value) {
        this.txnDateFrom = value;
    }

    /**
     * Gets the value of the txnDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDateTo() {
        return txnDateTo;
    }

    /**
     * Sets the value of the txnDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDateTo(String value) {
        this.txnDateTo = value;
    }

    /**
     * Gets the value of the lowerAmt property.
     * 
     */
    public double getLowerAmt() {
        return lowerAmt;
    }

    /**
     * Sets the value of the lowerAmt property.
     * 
     */
    public void setLowerAmt(double value) {
        this.lowerAmt = value;
    }

    /**
     * Gets the value of the higherAmt property.
     * 
     */
    public double getHigherAmt() {
        return higherAmt;
    }

    /**
     * Sets the value of the higherAmt property.
     * 
     */
    public void setHigherAmt(double value) {
        this.higherAmt = value;
    }

    /**
     * Gets the value of the beginChq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginChq() {
        return beginChq;
    }

    /**
     * Sets the value of the beginChq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginChq(String value) {
        this.beginChq = value;
    }

    /**
     * Gets the value of the endChq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndChq() {
        return endChq;
    }

    /**
     * Sets the value of the endChq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndChq(String value) {
        this.endChq = value;
    }

    /**
     * Gets the value of the numRec property.
     * 
     */
    public int getNumRec() {
        return numRec;
    }

    /**
     * Sets the value of the numRec property.
     * 
     */
    public void setNumRec(int value) {
        this.numRec = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the debitCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCredit() {
        return debitCredit;
    }

    /**
     * Sets the value of the debitCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCredit(String value) {
        this.debitCredit = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the solId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolId() {
        return solId;
    }

    /**
     * Sets the value of the solId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolId(String value) {
        this.solId = value;
    }

    /**
     * Gets the value of the cdci043 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCI043() {
        return cdci043;
    }

    /**
     * Sets the value of the cdci043 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCI043(String value) {
        this.cdci043 = value;
    }

}
