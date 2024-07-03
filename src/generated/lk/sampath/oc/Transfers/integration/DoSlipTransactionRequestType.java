
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoSlipTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoSlipTransactionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DCommAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RegBankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegBranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegAcctName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TranIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SlipsCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoSlipTransactionRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "fromAccountNo",
    "dTxnAmount",
    "dCommAmount",
    "regBankCode",
    "regBranchCode",
    "regAcctNo",
    "regAcctName",
    "tranIndex",
    "valueDate",
    "slipsCode"
})
public class DoSlipTransactionRequestType {

    @XmlElement(name = "APPCode", required = true)
    protected String appCode;
    @XmlElement(name = "Controller", required = true)
    protected String controller;
    @XmlElement(name = "CDCICode", required = true)
    protected String cdciCode;
    @XmlElement(name = "FromAccountNo", required = true)
    protected String fromAccountNo;
    @XmlElement(name = "DTxnAmount")
    protected double dTxnAmount;
    @XmlElement(name = "DCommAmount")
    protected double dCommAmount;
    @XmlElement(name = "RegBankCode", required = true)
    protected String regBankCode;
    @XmlElement(name = "RegBranchCode", required = true)
    protected String regBranchCode;
    @XmlElement(name = "RegAcctNo", required = true)
    protected String regAcctNo;
    @XmlElement(name = "RegAcctName", required = true)
    protected String regAcctName;
    @XmlElement(name = "TranIndex", required = true)
    protected String tranIndex;
    @XmlElement(name = "ValueDate", required = true)
    protected String valueDate;
    @XmlElement(name = "SlipsCode", required = true)
    protected String slipsCode;

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
     * Gets the value of the fromAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAccountNo() {
        return fromAccountNo;
    }

    /**
     * Sets the value of the fromAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAccountNo(String value) {
        this.fromAccountNo = value;
    }

    /**
     * Gets the value of the dTxnAmount property.
     * 
     */
    public double getDTxnAmount() {
        return dTxnAmount;
    }

    /**
     * Sets the value of the dTxnAmount property.
     * 
     */
    public void setDTxnAmount(double value) {
        this.dTxnAmount = value;
    }

    /**
     * Gets the value of the dCommAmount property.
     * 
     */
    public double getDCommAmount() {
        return dCommAmount;
    }

    /**
     * Sets the value of the dCommAmount property.
     * 
     */
    public void setDCommAmount(double value) {
        this.dCommAmount = value;
    }

    /**
     * Gets the value of the regBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegBankCode() {
        return regBankCode;
    }

    /**
     * Sets the value of the regBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegBankCode(String value) {
        this.regBankCode = value;
    }

    /**
     * Gets the value of the regBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegBranchCode() {
        return regBranchCode;
    }

    /**
     * Sets the value of the regBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegBranchCode(String value) {
        this.regBranchCode = value;
    }

    /**
     * Gets the value of the regAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAcctNo() {
        return regAcctNo;
    }

    /**
     * Sets the value of the regAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAcctNo(String value) {
        this.regAcctNo = value;
    }

    /**
     * Gets the value of the regAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAcctName() {
        return regAcctName;
    }

    /**
     * Sets the value of the regAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAcctName(String value) {
        this.regAcctName = value;
    }

    /**
     * Gets the value of the tranIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranIndex() {
        return tranIndex;
    }

    /**
     * Sets the value of the tranIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranIndex(String value) {
        this.tranIndex = value;
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
     * Gets the value of the slipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipsCode() {
        return slipsCode;
    }

    /**
     * Sets the value of the slipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipsCode(String value) {
        this.slipsCode = value;
    }

}
