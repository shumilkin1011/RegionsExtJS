package com.bft.shumilkin.RegionsExtJS.Recipient;

import lombok.Data;
import ru.fss.integration.types.person.v01.GenderType;
import ru.fss.integration.types.rpu.recipient.v01.*;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
public class RecipientDTO {

    protected String snils;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected GenderType gender;
    protected XMLGregorianCalendar birthDate;
    protected XMLGregorianCalendar deathDate;
    protected String oms;
    protected String inn;
    protected String serviceRegion;
    protected String citizenship;
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

    public RecipientDTO() {
    }




}
