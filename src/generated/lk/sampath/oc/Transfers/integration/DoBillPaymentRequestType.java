
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoBillPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoBillPaymentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Opt125Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TranIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoBillPaymentRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "fromAccountNo",
    "toAccountNo",
    "amount",
    "commAmount",
    "opt125Data",
    "tranIndex",
    "valueDate"
})
public class DoBillPaymentRequestType {

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
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "CommAmount")
    protected double commAmount;
    @XmlElement(name = "Opt125Data", required = true)
    protected String opt125Data;
    @XmlElement(name = "TranIndex", required = true)
    protected String tranIndex;
    @XmlElement(name = "ValueDate", required = true)
    protected String valueDate;

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
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the commAmount property.
     * 
     */
    public double getCommAmount() {
        return commAmount;
    }

    /**
     * Sets the value of the commAmount property.
     * 
     */
    public void setCommAmount(double value) {
        this.commAmount = value;
    }

    /**
     * Gets the value of the opt125Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpt125Data() {
        return opt125Data;
    }

    /**
     * Sets the value of the opt125Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpt125Data(String value) {
        this.opt125Data = value;
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

}
