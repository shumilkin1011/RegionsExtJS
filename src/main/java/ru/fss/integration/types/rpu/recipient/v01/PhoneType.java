
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fss.integration.types.common.v01.PhoneNumType;


/**
 * Телефон получателя услуг
 * 
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phoneNumType" type="{http://www.fss.ru/integration/types/common/v01}PhoneNumType" minOccurs="0"/&gt;
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {
    "phoneNumType",
    "phoneNum"
})
public class PhoneType {

    @XmlSchemaType(name = "string")
    protected PhoneNumType phoneNumType;
    protected String phoneNum;

    /**
     * Gets the value of the phoneNumType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getPhoneNumType() {
        return phoneNumType;
    }

    /**
     * Sets the value of the phoneNumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setPhoneNumType(PhoneNumType value) {
        this.phoneNumType = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

}
