
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.fss.integration.types.person.v01.GenderType;


/**
 * Сведения о получателе услуг
 * 
 * <p>Java class for RecipientInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snils" type="{http://www.fss.ru/integration/types/person/v01}snils"/&gt;
 *         &lt;element name="lastName" type="{http://www.fss.ru/integration/types/common/v01}StringMaxLen256"/&gt;
 *         &lt;element name="firstName" type="{http://www.fss.ru/integration/types/common/v01}StringMaxLen256"/&gt;
 *         &lt;element name="middleName" type="{http://www.fss.ru/integration/types/common/v01}StringMaxLen256" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.fss.ru/integration/types/person/v01}GenderType"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="oms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inn" type="{http://www.fss.ru/integration/types/person/v01}inn" minOccurs="0"/&gt;
 *         &lt;element name="serviceRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="hasTsr" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasSkl" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasBirthcert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasNspz" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasPvso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasAppeal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasEln" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasBreadwinnerLossPayments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasOtherPayments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="email" type="{http://www.fss.ru/integration/types/common/v01}emailAddress" minOccurs="0"/&gt;
 *         &lt;element name="emailESIA" type="{http://www.fss.ru/integration/types/common/v01}emailAddress" minOccurs="0"/&gt;
 *         &lt;element name="recipientDocList" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}RecipientDocListType" minOccurs="0"/&gt;
 *         &lt;element name="addressList" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}AddressListType" minOccurs="0"/&gt;
 *         &lt;element name="phoneList" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}PhoneListType" minOccurs="0"/&gt;
 *         &lt;element name="getPaymentsList" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}GetPaymentsListType" minOccurs="0"/&gt;
 *         &lt;element name="pvsoRegistr" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}PvsoRegistrType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientInfoType", propOrder = {
    "snils",
    "lastName",
    "firstName",
    "middleName",
    "gender",
    "birthDate",
    "deathDate",
    "oms",
    "inn",
    "serviceRegion",
    "citizenship",
    "changeDate",
    "hasTsr",
    "hasSkl",
    "hasBirthcert",
    "hasNspz",
    "hasPvso",
    "hasAppeal",
    "hasEln",
    "hasBreadwinnerLossPayments",
    "hasOtherPayments",
    "email",
    "emailESIA",
    "recipientDocList",
    "addressList",
    "phoneList",
    "getPaymentsList",
    "pvsoRegistr"
})
public class RecipientInfoType {

    @XmlElement(required = true)
    protected String snils;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String firstName;
    protected String middleName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deathDate;
    protected String oms;
    protected String inn;
    protected String serviceRegion;
    protected String citizenship;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    protected boolean hasTsr;
    protected boolean hasSkl;
    protected boolean hasBirthcert;
    protected boolean hasNspz;
    protected boolean hasPvso;
    protected boolean hasAppeal;
    protected boolean hasEln;
    protected boolean hasBreadwinnerLossPayments;
    protected boolean hasOtherPayments;
    protected String email;
    protected String emailESIA;
    protected RecipientDocListType recipientDocList;
    protected AddressListType addressList;
    protected PhoneListType phoneList;
    protected GetPaymentsListType getPaymentsList;
    protected PvsoRegistrType pvsoRegistr;

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDate(XMLGregorianCalendar value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the oms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOms() {
        return oms;
    }

    /**
     * Sets the value of the oms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOms(String value) {
        this.oms = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the serviceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRegion() {
        return serviceRegion;
    }

    /**
     * Sets the value of the serviceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRegion(String value) {
        this.serviceRegion = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the hasTsr property.
     * 
     */
    public boolean isHasTsr() {
        return hasTsr;
    }

    /**
     * Sets the value of the hasTsr property.
     * 
     */
    public void setHasTsr(boolean value) {
        this.hasTsr = value;
    }

    /**
     * Gets the value of the hasSkl property.
     * 
     */
    public boolean isHasSkl() {
        return hasSkl;
    }

    /**
     * Sets the value of the hasSkl property.
     * 
     */
    public void setHasSkl(boolean value) {
        this.hasSkl = value;
    }

    /**
     * Gets the value of the hasBirthcert property.
     * 
     */
    public boolean isHasBirthcert() {
        return hasBirthcert;
    }

    /**
     * Sets the value of the hasBirthcert property.
     * 
     */
    public void setHasBirthcert(boolean value) {
        this.hasBirthcert = value;
    }

    /**
     * Gets the value of the hasNspz property.
     * 
     */
    public boolean isHasNspz() {
        return hasNspz;
    }

    /**
     * Sets the value of the hasNspz property.
     * 
     */
    public void setHasNspz(boolean value) {
        this.hasNspz = value;
    }

    /**
     * Gets the value of the hasPvso property.
     * 
     */
    public boolean isHasPvso() {
        return hasPvso;
    }

    /**
     * Sets the value of the hasPvso property.
     * 
     */
    public void setHasPvso(boolean value) {
        this.hasPvso = value;
    }

    /**
     * Gets the value of the hasAppeal property.
     * 
     */
    public boolean isHasAppeal() {
        return hasAppeal;
    }

    /**
     * Sets the value of the hasAppeal property.
     * 
     */
    public void setHasAppeal(boolean value) {
        this.hasAppeal = value;
    }

    /**
     * Gets the value of the hasEln property.
     * 
     */
    public boolean isHasEln() {
        return hasEln;
    }

    /**
     * Sets the value of the hasEln property.
     * 
     */
    public void setHasEln(boolean value) {
        this.hasEln = value;
    }

    /**
     * Gets the value of the hasBreadwinnerLossPayments property.
     * 
     */
    public boolean isHasBreadwinnerLossPayments() {
        return hasBreadwinnerLossPayments;
    }

    /**
     * Sets the value of the hasBreadwinnerLossPayments property.
     * 
     */
    public void setHasBreadwinnerLossPayments(boolean value) {
        this.hasBreadwinnerLossPayments = value;
    }

    /**
     * Gets the value of the hasOtherPayments property.
     * 
     */
    public boolean isHasOtherPayments() {
        return hasOtherPayments;
    }

    /**
     * Sets the value of the hasOtherPayments property.
     * 
     */
    public void setHasOtherPayments(boolean value) {
        this.hasOtherPayments = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailESIA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailESIA() {
        return emailESIA;
    }

    /**
     * Sets the value of the emailESIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailESIA(String value) {
        this.emailESIA = value;
    }

    /**
     * Gets the value of the recipientDocList property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientDocListType }
     *     
     */
    public RecipientDocListType getRecipientDocList() {
        return recipientDocList;
    }

    /**
     * Sets the value of the recipientDocList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientDocListType }
     *     
     */
    public void setRecipientDocList(RecipientDocListType value) {
        this.recipientDocList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    public AddressListType getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    public void setAddressList(AddressListType value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the phoneList property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneListType }
     *     
     */
    public PhoneListType getPhoneList() {
        return phoneList;
    }

    /**
     * Sets the value of the phoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneListType }
     *     
     */
    public void setPhoneList(PhoneListType value) {
        this.phoneList = value;
    }

    /**
     * Gets the value of the getPaymentsList property.
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentsListType }
     *     
     */
    public GetPaymentsListType getGetPaymentsList() {
        return getPaymentsList;
    }

    /**
     * Sets the value of the getPaymentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentsListType }
     *     
     */
    public void setGetPaymentsList(GetPaymentsListType value) {
        this.getPaymentsList = value;
    }

    /**
     * Gets the value of the pvsoRegistr property.
     * 
     * @return
     *     possible object is
     *     {@link PvsoRegistrType }
     *     
     */
    public PvsoRegistrType getPvsoRegistr() {
        return pvsoRegistr;
    }

    /**
     * Sets the value of the pvsoRegistr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PvsoRegistrType }
     *     
     */
    public void setPvsoRegistr(PvsoRegistrType value) {
        this.pvsoRegistr = value;
    }

}
