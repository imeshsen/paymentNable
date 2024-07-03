
package lk.sampath.oc.Transfers.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositedChequeRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositedChequeRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepositBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChequeNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CurrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TranDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserDefineAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserDefineDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositedChequeRecord", propOrder = {
    "accountNo",
    "depositBranch",
    "depositDate",
    "chequeNo",
    "depositAmount",
    "currCode",
    "tranDate",
    "userDefineAmount",
    "bankCode",
    "bankName",
    "branchCode",
    "branchName",
    "userDefineDate",
    "statusFlag"
})
public class DepositedChequeRecord {

    @XmlElement(name = "AccountNo", required = true)
    protected String accountNo;
    @XmlElement(name = "DepositBranch", required = true)
    protected String depositBranch;
    @XmlElement(name = "DepositDate", required = true)
    protected String depositDate;
    @XmlElement(name = "ChequeNo", required = true)
    protected String chequeNo;
    @XmlElement(name = "DepositAmount")
    protected double depositAmount;
    @XmlElement(name = "CurrCode", required = true)
    protected String currCode;
    @XmlElement(name = "TranDate", required = true)
    protected String tranDate;
    @XmlElement(name = "UserDefineAmount")
    protected double userDefineAmount;
    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;
    @XmlElement(name = "BankName", required = true)
    protected String bankName;
    @XmlElement(name = "BranchCode", required = true)
    protected String branchCode;
    @XmlElement(name = "BranchName", required = true)
    protected String branchName;
    @XmlElement(name = "UserDefineDate", required = true)
    protected String userDefineDate;
    @XmlElement(name = "StatusFlag", required = true)
    protected String statusFlag;

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
     * Gets the value of the depositBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositBranch() {
        return depositBranch;
    }

    /**
     * Sets the value of the depositBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositBranch(String value) {
        this.depositBranch = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositDate(String value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the chequeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeNo() {
        return chequeNo;
    }

    /**
     * Sets the value of the chequeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeNo(String value) {
        this.chequeNo = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     */
    public double getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     */
    public void setDepositAmount(double value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrCode(String value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDate(String value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the userDefineAmount property.
     * 
     */
    public double getUserDefineAmount() {
        return userDefineAmount;
    }

    /**
     * Sets the value of the userDefineAmount property.
     * 
     */
    public void setUserDefineAmount(double value) {
        this.userDefineAmount = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the userDefineDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefineDate() {
        return userDefineDate;
    }

    /**
     * Sets the value of the userDefineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefineDate(String value) {
        this.userDefineDate = value;
    }

    /**
     * Gets the value of the statusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the value of the statusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFlag(String value) {
        this.statusFlag = value;
    }

}
