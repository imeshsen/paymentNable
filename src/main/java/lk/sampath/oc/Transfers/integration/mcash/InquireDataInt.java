
package lk.sampath.oc.Transfers.integration.mcash;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inquireDataInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inquireDataInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tranStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inquireDataInt", propOrder = {
    "beneId",
    "benePhone",
    "fromDate",
    "searchBy",
    "searchValue",
    "sendId",
    "sendPhone",
    "toDate",
    "tranStatus"
})
public class InquireDataInt {

    protected String beneId;
    protected String benePhone;
    protected String fromDate;
    protected int searchBy;
    protected String searchValue;
    protected String sendId;
    protected String sendPhone;
    protected String toDate;
    protected String tranStatus;

    /**
     * Gets the value of the beneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneId() {
        return beneId;
    }

    /**
     * Sets the value of the beneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneId(String value) {
        this.beneId = value;
    }

    /**
     * Gets the value of the benePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenePhone() {
        return benePhone;
    }

    /**
     * Sets the value of the benePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenePhone(String value) {
        this.benePhone = value;
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
     * Gets the value of the searchBy property.
     * 
     */
    public int getSearchBy() {
        return searchBy;
    }

    /**
     * Sets the value of the searchBy property.
     * 
     */
    public void setSearchBy(int value) {
        this.searchBy = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the sendId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * Sets the value of the sendId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendId(String value) {
        this.sendId = value;
    }

    /**
     * Gets the value of the sendPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendPhone() {
        return sendPhone;
    }

    /**
     * Sets the value of the sendPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendPhone(String value) {
        this.sendPhone = value;
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
     * Gets the value of the tranStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranStatus() {
        return tranStatus;
    }

    /**
     * Sets the value of the tranStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranStatus(String value) {
        this.tranStatus = value;
    }

}
