
package ru.fss.integration.types.sedo.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос для отправки входящих сообщений
 * 
 * <p>Java class for PutMessageRequestProcessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutMessageRequestProcessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fss.ru/integration/types/sedo/v01}CommonClientMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientId" type="{http://www.fss.ru/integration/types/sedo/v01}RecipientId"/&gt;
 *         &lt;element name="msgType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutMessageRequestProcessor", propOrder = {
    "recipientId",
    "msgType",
    "msgGuid",
    "message"
})
public class PutMessageRequestProcessor
    extends CommonClientMessage
{

    @XmlElement(required = true)
    protected String recipientId;
    @XmlElement(required = true)
    protected String msgType;
    @XmlElement(required = true)
    protected String msgGuid;
    @XmlElement(required = true)
    protected byte[] message;

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
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the msgGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgGuid() {
        return msgGuid;
    }

    /**
     * Sets the value of the msgGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgGuid(String value) {
        this.msgGuid = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessage(byte[] value) {
        this.message = value;
    }

}
