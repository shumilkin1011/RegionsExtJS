
package ru.fss.integration.types.sedo.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BroadcastMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BroadcastMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageUuid" type="{http://www.fss.ru/integration/types/sedo/v01}Uuid"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfRelevance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadcastMessageType", propOrder = {
    "messageUuid",
    "message",
    "dateOfRelevance"
})
public class BroadcastMessageType {

    @XmlElement(required = true)
    protected String messageUuid;
    @XmlElement(required = true)
    protected String message;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfRelevance;

    /**
     * Gets the value of the messageUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageUuid() {
        return messageUuid;
    }

    /**
     * Sets the value of the messageUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageUuid(String value) {
        this.messageUuid = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the dateOfRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfRelevance() {
        return dateOfRelevance;
    }

    /**
     * Sets the value of the dateOfRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfRelevance(XMLGregorianCalendar value) {
        this.dateOfRelevance = value;
    }

}
