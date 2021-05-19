
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fss.integration.types.person.v01.RecipientAddressType;


/**
 * Адрес получателя услуг
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientAddressType" type="{http://www.fss.ru/integration/types/person/v01}RecipientAddressType" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiasObjPostAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiasHouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "recipientAddressType",
    "postalCode",
    "regionCode",
    "fiasObjPostAddressId",
    "fiasHouseId",
    "floor",
    "address"
})
public class AddressType {

    @XmlSchemaType(name = "string")
    protected RecipientAddressType recipientAddressType;
    protected String postalCode;
    protected String regionCode;
    protected String fiasObjPostAddressId;
    protected String fiasHouseId;
    protected String floor;
    protected String address;

    /**
     * Gets the value of the recipientAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientAddressType }
     *     
     */
    public RecipientAddressType getRecipientAddressType() {
        return recipientAddressType;
    }

    /**
     * Sets the value of the recipientAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientAddressType }
     *     
     */
    public void setRecipientAddressType(RecipientAddressType value) {
        this.recipientAddressType = value;
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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
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

}
