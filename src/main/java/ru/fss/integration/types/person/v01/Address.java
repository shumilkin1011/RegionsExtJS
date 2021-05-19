
package ru.fss.integration.types.person.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="residence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isFixPlaceResidence " type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="placeRegistration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isHomeless" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "residence",
    "isFixPlaceResidence0020",
    "placeRegistration",
    "isHomeless"
})
public class Address {

    @XmlElement(required = true)
    protected String residence;
    @XmlElement(name = "isFixPlaceResidence ")
    protected boolean isFixPlaceResidence0020;
    @XmlElement(required = true)
    protected String placeRegistration;
    protected boolean isHomeless;

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidence(String value) {
        this.residence = value;
    }

    /**
     * Gets the value of the isFixPlaceResidence0020 property.
     * 
     */
    public boolean isIsFixPlaceResidence_0020() {
        return isFixPlaceResidence0020;
    }

    /**
     * Sets the value of the isFixPlaceResidence0020 property.
     * 
     */
    public void setIsFixPlaceResidence_0020(boolean value) {
        this.isFixPlaceResidence0020 = value;
    }

    /**
     * Gets the value of the placeRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceRegistration() {
        return placeRegistration;
    }

    /**
     * Sets the value of the placeRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceRegistration(String value) {
        this.placeRegistration = value;
    }

    /**
     * Gets the value of the isHomeless property.
     * 
     */
    public boolean isIsHomeless() {
        return isHomeless;
    }

    /**
     * Sets the value of the isHomeless property.
     * 
     */
    public void setIsHomeless(boolean value) {
        this.isHomeless = value;
    }

}
