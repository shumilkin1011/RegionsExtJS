
package ru.fss.integration.types.sedo.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос на получение количества сообщений абонентом
 * 
 * <p>Java class for GetCntMessageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCntMessageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fss.ru/integration/types/sedo/v01}CommonMessageRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientId" type="{http://www.fss.ru/integration/types/sedo/v01}RecipientId"/&gt;
 *         &lt;element name="messageDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCntMessageRequest", propOrder = {
    "recipientId",
    "messageDate"
})
public class GetCntMessageRequest
    extends CommonMessageRequest
{

    @XmlElement(required = true)
    protected String recipientId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar messageDate;

    /**
     * Gets the value of the recipientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the value of the recipientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientId(String value) {
        this.recipientId = value;
    }

    /**
     * Gets the value of the messageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDate() {
        return messageDate;
    }

    /**
     * Sets the value of the messageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDate(XMLGregorianCalendar value) {
        this.messageDate = value;
    }

}
