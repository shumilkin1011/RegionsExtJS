
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientInfo" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}RecipientInfoRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientRequestType", propOrder = {
    "recipientInfo"
})
public class RecipientRequestType {

    @XmlElement(required = true)
    protected RecipientInfoRequestType recipientInfo;

    /**
     * Gets the value of the recipientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientInfoRequestType }
     *     
     */
    public RecipientInfoRequestType getRecipientInfo() {
        return recipientInfo;
    }

    /**
     * Sets the value of the recipientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientInfoRequestType }
     *     
     */
    public void setRecipientInfo(RecipientInfoRequestType value) {
        this.recipientInfo = value;
    }

}
