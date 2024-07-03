
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoTransferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoTransferRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DCommAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TransMemo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromCurrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoTransferRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "fromAccountNo",
    "toAccountNo",
    "dTxnAmount",
    "dCommAmount",
    "transMemo",
    "valueDate",
    "fromCurrCode"
})
public class DoTransferRequestType {

    @XmlElement(name = "APPCode", required = true)
    protected String appCode;
    @XmlElement(name = "Controller", required = true)
    protected String controller;
    @XmlElement(name = "CDCICode", required = true)
    protected String cdciCode;
    @XmlElement(name = "FromAccountNo", required = true)
    protected String fromAccountNo;
    @XmlElement(name = "ToAccountNo", required = true)
    protected String toAccountNo;
    @XmlElement(name = "DTxnAmount")
    protected double dTxnAmount;
    @XmlElement(name = "DCommAmount")
    protected double dCommAmount;
    @XmlElement(name = "TransMemo", required = true)
    protected String transMemo;
    @XmlElement(name = "ValueDate", required = true)
    protected String valueDate;
    @XmlElement(name = "FromCurrCode", required = true)
    protected String fromCurrCode;

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
     * Gets the value of the toAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAccountNo() {
        return toAccountNo;
    }

    /**
     * Sets the value of the toAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAccountNo(String value) {
        this.toAccountNo = value;
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
     * Gets the value of the transMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransMemo() {
        return transMemo;
    }

    /**
     * Sets the value of the transMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransMemo(String value) {
        this.transMemo = value;
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
     * Gets the value of the fromCurrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrCode() {
        return fromCurrCode;
    }

    /**
     * Sets the value of the fromCurrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrCode(String value) {
        this.fromCurrCode = value;
    }

}
