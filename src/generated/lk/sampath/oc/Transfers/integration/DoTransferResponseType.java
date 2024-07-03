
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoTransferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoTransferResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrLedgerBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrFloatBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrFFDBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrUserDefinedBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrLedgerBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CrAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CrFloatBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CrFFDBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CrUserDefinedBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CrCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoTransferResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "drLedgerBalance",
    "drAvailableBalance",
    "drFloatBalance",
    "drFFDBalance",
    "drUserDefinedBalance",
    "drCurrencyCode",
    "crLedgerBalance",
    "crAvailableBalance",
    "crFloatBalance",
    "crFFDBalance",
    "crUserDefinedBalance",
    "crCurrencyCode"
})
public class DoTransferResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "DrLedgerBalance")
    protected Double drLedgerBalance;
    @XmlElement(name = "DrAvailableBalance")
    protected Double drAvailableBalance;
    @XmlElement(name = "DrFloatBalance")
    protected Double drFloatBalance;
    @XmlElement(name = "DrFFDBalance")
    protected Double drFFDBalance;
    @XmlElement(name = "DrUserDefinedBalance")
    protected Double drUserDefinedBalance;
    @XmlElement(name = "DrCurrencyCode")
    protected String drCurrencyCode;
    @XmlElement(name = "CrLedgerBalance")
    protected Double crLedgerBalance;
    @XmlElement(name = "CrAvailableBalance")
    protected Double crAvailableBalance;
    @XmlElement(name = "CrFloatBalance")
    protected Double crFloatBalance;
    @XmlElement(name = "CrFFDBalance")
    protected Double crFFDBalance;
    @XmlElement(name = "CrUserDefinedBalance")
    protected Double crUserDefinedBalance;
    @XmlElement(name = "CrCurrencyCode")
    protected String crCurrencyCode;

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
     * Gets the value of the drLedgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrLedgerBalance() {
        return drLedgerBalance;
    }

    /**
     * Sets the value of the drLedgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrLedgerBalance(Double value) {
        this.drLedgerBalance = value;
    }

    /**
     * Gets the value of the drAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrAvailableBalance() {
        return drAvailableBalance;
    }

    /**
     * Sets the value of the drAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrAvailableBalance(Double value) {
        this.drAvailableBalance = value;
    }

    /**
     * Gets the value of the drFloatBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrFloatBalance() {
        return drFloatBalance;
    }

    /**
     * Sets the value of the drFloatBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrFloatBalance(Double value) {
        this.drFloatBalance = value;
    }

    /**
     * Gets the value of the drFFDBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrFFDBalance() {
        return drFFDBalance;
    }

    /**
     * Sets the value of the drFFDBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrFFDBalance(Double value) {
        this.drFFDBalance = value;
    }

    /**
     * Gets the value of the drUserDefinedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrUserDefinedBalance() {
        return drUserDefinedBalance;
    }

    /**
     * Sets the value of the drUserDefinedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrUserDefinedBalance(Double value) {
        this.drUserDefinedBalance = value;
    }

    /**
     * Gets the value of the drCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrCurrencyCode() {
        return drCurrencyCode;
    }

    /**
     * Sets the value of the drCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrCurrencyCode(String value) {
        this.drCurrencyCode = value;
    }

    /**
     * Gets the value of the crLedgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrLedgerBalance() {
        return crLedgerBalance;
    }

    /**
     * Sets the value of the crLedgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrLedgerBalance(Double value) {
        this.crLedgerBalance = value;
    }

    /**
     * Gets the value of the crAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrAvailableBalance() {
        return crAvailableBalance;
    }

    /**
     * Sets the value of the crAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrAvailableBalance(Double value) {
        this.crAvailableBalance = value;
    }

    /**
     * Gets the value of the crFloatBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrFloatBalance() {
        return crFloatBalance;
    }

    /**
     * Sets the value of the crFloatBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrFloatBalance(Double value) {
        this.crFloatBalance = value;
    }

    /**
     * Gets the value of the crFFDBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrFFDBalance() {
        return crFFDBalance;
    }

    /**
     * Sets the value of the crFFDBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrFFDBalance(Double value) {
        this.crFFDBalance = value;
    }

    /**
     * Gets the value of the crUserDefinedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrUserDefinedBalance() {
        return crUserDefinedBalance;
    }

    /**
     * Sets the value of the crUserDefinedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrUserDefinedBalance(Double value) {
        this.crUserDefinedBalance = value;
    }

    /**
     * Gets the value of the crCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrCurrencyCode() {
        return crCurrencyCode;
    }

    /**
     * Sets the value of the crCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrCurrencyCode(String value) {
        this.crCurrencyCode = value;
    }

}
