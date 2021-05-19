
package ru.fss.integration.types.fault.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Ошибки при обработке входящего сообщения
 *             
 * 
 * <p>Java class for InvalidDataFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidDataFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuidInbound" type="{http://www.fss.ru/integration/types/sedo/v01}Uuid"/&gt;
 *         &lt;element name="faultList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fault" type="{http://www.fss.ru/integration/types/fault/v01}CommonFault" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDataFault", propOrder = {
    "uuidInbound",
    "faultList"
})
public class InvalidDataFault {

    @XmlElement(required = true)
    protected String uuidInbound;
    @XmlElement(required = true)
    protected FaultList faultList;

    /**
     * Gets the value of the uuidInbound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidInbound() {
        return uuidInbound;
    }

    /**
     * Sets the value of the uuidInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidInbound(String value) {
        this.uuidInbound = value;
    }

    /**
     * Gets the value of the faultList property.
     * 
     * @return
     *     possible object is
     *     {@link FaultList }
     *     
     */
    public FaultList getFaultList() {
        return faultList;
    }

    /**
     * Sets the value of the faultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultList }
     *     
     */
    public void setFaultList(FaultList value) {
        this.faultList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fault" type="{http://www.fss.ru/integration/types/fault/v01}CommonFault" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fault"
    })
    public static class FaultList {

        @XmlElement(required = true)
        protected List<CommonFault> fault;

        /**
         * Gets the value of the fault property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fault property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFault().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonFault }
         * 
         * 
         */
        public List<CommonFault> getFault() {
            if (fault == null) {
                fault = new ArrayList<CommonFault>();
            }
            return this.fault;
        }

    }

}
