
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Документы, удостоверяющие личность
 * 
 * <p>Java class for RecipientDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientDocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="docTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="whoIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientDocType", propOrder = {
    "docTypeCode",
    "serDoc",
    "numDoc",
    "whoIssued",
    "dateIssued"
})
public class RecipientDocType {

    protected String docTypeCode;
    protected String serDoc;
    protected String numDoc;
    protected String whoIssued;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateIssued;

    /**
     * Gets the value of the docTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeCode() {
        return docTypeCode;
    }

    /**
     * Sets the value of the docTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeCode(String value) {
        this.docTypeCode = value;
    }

    /**
     * Gets the value of the serDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerDoc() {
        return serDoc;
    }

    /**
     * Sets the value of the serDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerDoc(String value) {
        this.serDoc = value;
    }

    /**
     * Gets the value of the numDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Sets the value of the numDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDoc(String value) {
        this.numDoc = value;
    }

    /**
     * Gets the value of the whoIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoIssued() {
        return whoIssued;
    }

    /**
     * Sets the value of the whoIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoIssued(String value) {
        this.whoIssued = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIssued(XMLGregorianCalendar value) {
        this.dateIssued = value;
    }

}
