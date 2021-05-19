
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Способы получения выплат
 * 
 * <p>Java class for GetPaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPaymentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getPaymentsTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreignBankId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiasObjPostAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiasHouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bPaycard" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="paycardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="accountTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPaymentsType", propOrder = {
    "getPaymentsTypeCode",
    "account",
    "bankBic",
    "bankName",
    "foreignBankId",
    "postalCode",
    "fiasObjPostAddressId",
    "fiasHouseId",
    "floor",
    "address",
    "bPaycard",
    "paycardNum",
    "accountFrom",
    "accountTo"
})
public class GetPaymentsType {

    protected String getPaymentsTypeCode;
    protected String account;
    protected String bankBic;
    protected String bankName;
    protected Long foreignBankId;
    protected String postalCode;
    protected String fiasObjPostAddressId;
    protected String fiasHouseId;
    protected String floor;
    protected String address;
    protected Integer bPaycard;
    protected String paycardNum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountTo;

    /**
     * Gets the value of the getPaymentsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPaymentsTypeCode() {
        return getPaymentsTypeCode;
    }

    /**
     * Sets the value of the getPaymentsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPaymentsTypeCode(String value) {
        this.getPaymentsTypeCode = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the bankBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBic() {
        return bankBic;
    }

    /**
     * Sets the value of the bankBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBic(String value) {
        this.bankBic = value;
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
     * Gets the value of the foreignBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignBankId() {
        return foreignBankId;
    }

    /**
     * Sets the value of the foreignBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignBankId(Long value) {
        this.foreignBankId = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the fiasObjPostAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasObjPostAddressId() {
        return fiasObjPostAddressId;
    }

    /**
     * Sets the value of the fiasObjPostAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasObjPostAddressId(String value) {
        this.fiasObjPostAddressId = value;
    }

    /**
     * Gets the value of the fiasHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasHouseId() {
        return fiasHouseId;
    }

    /**
     * Sets the value of the fiasHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasHouseId(String value) {
        this.fiasHouseId = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bPaycard property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBPaycard() {
        return bPaycard;
    }

    /**
     * Sets the value of the bPaycard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBPaycard(Integer value) {
        this.bPaycard = value;
    }

    /**
     * Gets the value of the paycardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaycardNum() {
        return paycardNum;
    }

    /**
     * Sets the value of the paycardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaycardNum(String value) {
        this.paycardNum = value;
    }

    /**
     * Gets the value of the accountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountFrom() {
        return accountFrom;
    }

    /**
     * Sets the value of the accountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountFrom(XMLGregorianCalendar value) {
        this.accountFrom = value;
    }

    /**
     * Gets the value of the accountTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountTo() {
        return accountTo;
    }

    /**
     * Sets the value of the accountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountTo(XMLGregorianCalendar value) {
        this.accountTo = value;
    }

}
