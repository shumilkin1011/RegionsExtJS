
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cведения, передаваемые в ответе на запрос
 * 
 * <p>Java class for RecipientInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientPresence" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}RecipientPresenceType"/&gt;
 *         &lt;element name="recipientInfoList" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}RecipientInfoListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientInfoResponseType", propOrder = {
    "recipientPresence",
    "recipientInfoList"
})
public class RecipientInfoResponseType {

    @XmlElement(required = true)
    protected RecipientPresenceType recipientPresence;
    protected RecipientInfoListType recipientInfoList;

    /**
     * Gets the value of the recipientPresence property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientPresenceType }
     *     
     */
    public RecipientPresenceType getRecipientPresence() {
        return recipientPresence;
    }

    /**
     * Sets the value of the recipientPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientPresenceType }
     *     
     */
    public void setRecipientPresence(RecipientPresenceType value) {
        this.recipientPresence = value;
    }

    /**
     * Gets the value of the recipientInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientInfoListType }
     *     
     */
    public RecipientInfoListType getRecipientInfoList() {
        return recipientInfoList;
    }

    /**
     * Sets the value of the recipientInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientInfoListType }
     *     
     */
    public void setRecipientInfoList(RecipientInfoListType value) {
        this.recipientInfoList = value;
    }

}
