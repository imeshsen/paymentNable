
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquiryDepositedChequeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryDepositedChequeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CDCICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FilterCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "InquiryDepositedChequeRequestType", propOrder = {
    "appCode",
    "controller",
    "cdciCode",
    "accountNo",
    "fromDate",
    "toDate",
    "filterCode",
    "cdci043"
})
public class InquiryDepositedChequeRequestType {

    @XmlElement(name = "APPCode", required = true)
    protected String appCode;
    @XmlElement(name = "Controller", required = true)
    protected String controller;
    @XmlElement(name = "CDCICode", required = true)
    protected String cdciCode;
    @XmlElement(name = "AccountNo", required = true)
    protected String accountNo;
    @XmlElement(name = "FromDate", required = true)
    protected String fromDate;
    @XmlElement(name = "ToDate", required = true)
    protected String toDate;
    @XmlElement(name = "FilterCode", required = true)
    protected String filterCode;
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
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the filterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterCode() {
        return filterCode;
    }

    /**
     * Sets the value of the filterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterCode(String value) {
        this.filterCode = value;
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
