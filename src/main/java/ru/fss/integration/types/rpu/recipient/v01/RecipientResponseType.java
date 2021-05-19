
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fss.integration.types.common.v01.Errors;


/**
 * <p>Java class for RecipientResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fss.ru/integration/types/common/v01}errors"/&gt;
 *         &lt;element name="recipientInfo" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}RecipientInfoResponseType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientResponseType", propOrder = {
    "errors",
    "recipientInfo"
})
public class RecipientResponseType {

    @XmlElement(namespace = "http://www.fss.ru/integration/types/common/v01")
    protected Errors errors;
    protected RecipientInfoResponseType recipientInfo;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the recipientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientInfoResponseType }
     *     
     */
    public RecipientInfoResponseType getRecipientInfo() {
        return recipientInfo;
    }

    /**
     * Sets the value of the recipientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientInfoResponseType }
     *     
     */
    public void setRecipientInfo(RecipientInfoResponseType value) {
        this.recipientInfo = value;
    }

}
