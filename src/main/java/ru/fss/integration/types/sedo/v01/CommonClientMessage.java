
package ru.fss.integration.types.sedo.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonClientMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonClientMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interactionType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonClientMessage", propOrder = {
    "interactionType"
})
@XmlSeeAlso({
    PutMessageRequestProcessor.class
})
public class CommonClientMessage {

    protected int interactionType;

    /**
     * Gets the value of the interactionType property.
     * 
     */
    public int getInteractionType() {
        return interactionType;
    }

    /**
     * Sets the value of the interactionType property.
     * 
     */
    public void setInteractionType(int value) {
        this.interactionType = value;
    }

}
