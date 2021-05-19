
package ru.fss.integration.types.rpu.recipient.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPaymentsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPaymentsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getPayments" type="{http://www.fss.ru/integration/types/rpu/Recipient/v01}GetPaymentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPaymentsListType", propOrder = {
    "getPayments"
})
public class GetPaymentsListType {

    protected List<GetPaymentsType> getPayments;

    /**
     * Gets the value of the getPayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getPayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetPaymentsType }
     * 
     * 
     */
    public List<GetPaymentsType> getGetPayments() {
        if (getPayments == null) {
            getPayments = new ArrayList<GetPaymentsType>();
        }
        return this.getPayments;
    }

}