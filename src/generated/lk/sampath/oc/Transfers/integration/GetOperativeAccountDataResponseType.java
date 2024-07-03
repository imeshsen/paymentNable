
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOperativeAccountDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOperativeAccountDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessedDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FloatBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FfdBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UserDefinedBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SanctionLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UtilisedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SecuredAdhocLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SecuredRunningLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SecuredSingleTrLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DACCLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LienAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OverdueLiability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemRsrvdAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FundsInClearing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrawingPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CleanAdhocLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CleanRunningLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CleanSingleTrLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AvailAmtInFFD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EffectiveAvailAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchemeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOperativeAccountDataResponseType", propOrder = {
    "processedCode",
    "processedDesc",
    "actionCode",
    "txnStatus",
    "ledgerBalance",
    "availableBalance",
    "floatBalance",
    "ffdBalance",
    "userDefinedBalance",
    "sanctionLimit",
    "utilisedAmount",
    "securedAdhocLimit",
    "securedRunningLimit",
    "securedSingleTrLimit",
    "daccLimit",
    "lienAmount",
    "overdueLiability",
    "systemRsrvdAmount",
    "fundsInClearing",
    "drawingPower",
    "cleanAdhocLimit",
    "cleanRunningLimit",
    "cleanSingleTrLimit",
    "availAmtInFFD",
    "effectiveAvailAmt",
    "currencyCode",
    "acctNo",
    "acctName",
    "acctOpenDate",
    "schemeCode",
    "acctType",
    "acctStatus",
    "acctMsg",
    "systemNickname"
})
public class GetOperativeAccountDataResponseType {

    @XmlElement(name = "ProcessedCode", required = true)
    protected String processedCode;
    @XmlElement(name = "ProcessedDesc", required = true)
    protected String processedDesc;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "TxnStatus")
    protected String txnStatus;
    @XmlElement(name = "LedgerBalance")
    protected Double ledgerBalance;
    @XmlElement(name = "AvailableBalance")
    protected Double availableBalance;
    @XmlElement(name = "FloatBalance")
    protected Double floatBalance;
    @XmlElement(name = "FfdBalance")
    protected Double ffdBalance;
    @XmlElement(name = "UserDefinedBalance")
    protected Double userDefinedBalance;
    @XmlElement(name = "SanctionLimit")
    protected Double sanctionLimit;
    @XmlElement(name = "UtilisedAmount")
    protected Double utilisedAmount;
    @XmlElement(name = "SecuredAdhocLimit")
    protected Double securedAdhocLimit;
    @XmlElement(name = "SecuredRunningLimit")
    protected Double securedRunningLimit;
    @XmlElement(name = "SecuredSingleTrLimit")
    protected Double securedSingleTrLimit;
    @XmlElement(name = "DACCLimit")
    protected Double daccLimit;
    @XmlElement(name = "LienAmount")
    protected Double lienAmount;
    @XmlElement(name = "OverdueLiability")
    protected Double overdueLiability;
    @XmlElement(name = "SystemRsrvdAmount")
    protected Double systemRsrvdAmount;
    @XmlElement(name = "FundsInClearing")
    protected Double fundsInClearing;
    @XmlElement(name = "DrawingPower")
    protected Double drawingPower;
    @XmlElement(name = "CleanAdhocLimit")
    protected Double cleanAdhocLimit;
    @XmlElement(name = "CleanRunningLimit")
    protected Double cleanRunningLimit;
    @XmlElement(name = "CleanSingleTrLimit")
    protected Double cleanSingleTrLimit;
    @XmlElement(name = "AvailAmtInFFD")
    protected Double availAmtInFFD;
    @XmlElement(name = "EffectiveAvailAmt")
    protected Double effectiveAvailAmt;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "AcctNo")
    protected String acctNo;
    @XmlElement(name = "AcctName")
    protected String acctName;
    @XmlElement(name = "AcctOpenDate")
    protected String acctOpenDate;
    @XmlElement(name = "SchemeCode")
    protected String schemeCode;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctStatus")
    protected String acctStatus;
    @XmlElement(name = "AcctMsg")
    protected String acctMsg;
    @XmlElement(name = "SystemNickname")
    protected String systemNickname;

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
     * Gets the value of the txnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnStatus() {
        return txnStatus;
    }

    /**
     * Sets the value of the txnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnStatus(String value) {
        this.txnStatus = value;
    }

    /**
     * Gets the value of the ledgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets the value of the ledgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLedgerBalance(Double value) {
        this.ledgerBalance = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailableBalance(Double value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the floatBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloatBalance() {
        return floatBalance;
    }

    /**
     * Sets the value of the floatBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloatBalance(Double value) {
        this.floatBalance = value;
    }

    /**
     * Gets the value of the ffdBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFfdBalance() {
        return ffdBalance;
    }

    /**
     * Sets the value of the ffdBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFfdBalance(Double value) {
        this.ffdBalance = value;
    }

    /**
     * Gets the value of the userDefinedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserDefinedBalance() {
        return userDefinedBalance;
    }

    /**
     * Sets the value of the userDefinedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserDefinedBalance(Double value) {
        this.userDefinedBalance = value;
    }

    /**
     * Gets the value of the sanctionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSanctionLimit() {
        return sanctionLimit;
    }

    /**
     * Sets the value of the sanctionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSanctionLimit(Double value) {
        this.sanctionLimit = value;
    }

    /**
     * Gets the value of the utilisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUtilisedAmount() {
        return utilisedAmount;
    }

    /**
     * Sets the value of the utilisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUtilisedAmount(Double value) {
        this.utilisedAmount = value;
    }

    /**
     * Gets the value of the securedAdhocLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSecuredAdhocLimit() {
        return securedAdhocLimit;
    }

    /**
     * Sets the value of the securedAdhocLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSecuredAdhocLimit(Double value) {
        this.securedAdhocLimit = value;
    }

    /**
     * Gets the value of the securedRunningLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSecuredRunningLimit() {
        return securedRunningLimit;
    }

    /**
     * Sets the value of the securedRunningLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSecuredRunningLimit(Double value) {
        this.securedRunningLimit = value;
    }

    /**
     * Gets the value of the securedSingleTrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSecuredSingleTrLimit() {
        return securedSingleTrLimit;
    }

    /**
     * Sets the value of the securedSingleTrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSecuredSingleTrLimit(Double value) {
        this.securedSingleTrLimit = value;
    }

    /**
     * Gets the value of the daccLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDACCLimit() {
        return daccLimit;
    }

    /**
     * Sets the value of the daccLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDACCLimit(Double value) {
        this.daccLimit = value;
    }

    /**
     * Gets the value of the lienAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLienAmount() {
        return lienAmount;
    }

    /**
     * Sets the value of the lienAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLienAmount(Double value) {
        this.lienAmount = value;
    }

    /**
     * Gets the value of the overdueLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueLiability() {
        return overdueLiability;
    }

    /**
     * Sets the value of the overdueLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueLiability(Double value) {
        this.overdueLiability = value;
    }

    /**
     * Gets the value of the systemRsrvdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSystemRsrvdAmount() {
        return systemRsrvdAmount;
    }

    /**
     * Sets the value of the systemRsrvdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSystemRsrvdAmount(Double value) {
        this.systemRsrvdAmount = value;
    }

    /**
     * Gets the value of the fundsInClearing property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFundsInClearing() {
        return fundsInClearing;
    }

    /**
     * Sets the value of the fundsInClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFundsInClearing(Double value) {
        this.fundsInClearing = value;
    }

    /**
     * Gets the value of the drawingPower property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDrawingPower() {
        return drawingPower;
    }

    /**
     * Sets the value of the drawingPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDrawingPower(Double value) {
        this.drawingPower = value;
    }

    /**
     * Gets the value of the cleanAdhocLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCleanAdhocLimit() {
        return cleanAdhocLimit;
    }

    /**
     * Sets the value of the cleanAdhocLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCleanAdhocLimit(Double value) {
        this.cleanAdhocLimit = value;
    }

    /**
     * Gets the value of the cleanRunningLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCleanRunningLimit() {
        return cleanRunningLimit;
    }

    /**
     * Sets the value of the cleanRunningLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCleanRunningLimit(Double value) {
        this.cleanRunningLimit = value;
    }

    /**
     * Gets the value of the cleanSingleTrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCleanSingleTrLimit() {
        return cleanSingleTrLimit;
    }

    /**
     * Sets the value of the cleanSingleTrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCleanSingleTrLimit(Double value) {
        this.cleanSingleTrLimit = value;
    }

    /**
     * Gets the value of the availAmtInFFD property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailAmtInFFD() {
        return availAmtInFFD;
    }

    /**
     * Sets the value of the availAmtInFFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailAmtInFFD(Double value) {
        this.availAmtInFFD = value;
    }

    /**
     * Gets the value of the effectiveAvailAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEffectiveAvailAmt() {
        return effectiveAvailAmt;
    }

    /**
     * Sets the value of the effectiveAvailAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEffectiveAvailAmt(Double value) {
        this.effectiveAvailAmt = value;
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
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Gets the value of the acctOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOpenDate() {
        return acctOpenDate;
    }

    /**
     * Sets the value of the acctOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOpenDate(String value) {
        this.acctOpenDate = value;
    }

    /**
     * Gets the value of the schemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * Sets the value of the schemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCode(String value) {
        this.schemeCode = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatus(String value) {
        this.acctStatus = value;
    }

    /**
     * Gets the value of the acctMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMsg() {
        return acctMsg;
    }

    /**
     * Sets the value of the acctMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMsg(String value) {
        this.acctMsg = value;
    }

    /**
     * Gets the value of the systemNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNickname() {
        return systemNickname;
    }

    /**
     * Sets the value of the systemNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNickname(String value) {
        this.systemNickname = value;
    }

}
