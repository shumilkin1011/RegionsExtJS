
package ru.fss.integration.types.common.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processUuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseOn" type="{http://www.fss.ru/integration/types/common/v01}ResponseOnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeLinkType", propOrder = {
    "processUuid",
    "responseOn"
})
public class CompositeLinkType {

    @XmlElement(required = true)
    protected String processUuid;
    @XmlElement(required = true)
    protected ResponseOnType responseOn;

    /**
     * Gets the value of the processUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessUuid() {
        return processUuid;
    }

    /**
     * Sets the value of the processUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessUuid(String value) {
        this.processUuid = value;
    }

    /**
     * Gets the value of the responseOn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOnType }
     *     
     */
    public ResponseOnType getResponseOn() {
        return responseOn;
    }

    /**
     * Sets the value of the responseOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOnType }
     *     
     */
    public void setResponseOn(ResponseOnType value) {
        this.responseOn = value;
    }

}
