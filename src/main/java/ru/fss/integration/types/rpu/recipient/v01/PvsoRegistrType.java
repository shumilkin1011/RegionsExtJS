
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о выплате пособия по данным ПВСО
 * 
 * <p>Java class for PvsoRegistrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PvsoRegistrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insurerRegNum" type="{http://www.fss.ru/integration/types/organization/v01}regNum"/&gt;
 *         &lt;element name="insurerName" type="{http://www.fss.ru/integration/types/organization/v01}fullName"/&gt;
 *         &lt;element name="insurerOgrn" type="{http://www.fss.ru/integration/types/organization/v01}OgrnMixType" minOccurs="0"/&gt;
 *         &lt;element name="insurerInn" type="{http://www.fss.ru/integration/types/organization/v01}inn"/&gt;
 *         &lt;element name="insurerKpp" type="{http://www.fss.ru/integration/types/organization/v01}kpp" minOccurs="0"/&gt;
 *         &lt;element name="firstYearAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="secondYearAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PvsoRegistrType", propOrder = {
    "insurerRegNum",
    "insurerName",
    "insurerOgrn",
    "insurerInn",
    "insurerKpp",
    "firstYearAmount",
    "secondYearAmount",
    "createDate"
})
public class PvsoRegistrType {

    @XmlElement(required = true)
    protected String insurerRegNum;
    @XmlElement(required = true)
    protected String insurerName;
    protected String insurerOgrn;
    @XmlElement(required = true)
    protected String insurerInn;
    protected String insurerKpp;
    protected Double firstYearAmount;
    protected Double secondYearAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;

    /**
     * Gets the value of the insurerRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerRegNum() {
        return insurerRegNum;
    }

    /**
     * Sets the value of the insurerRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerRegNum(String value) {
        this.insurerRegNum = value;
    }

    /**
     * Gets the value of the insurerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerName() {
        return insurerName;
    }

    /**
     * Sets the value of the insurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerName(String value) {
        this.insurerName = value;
    }

    /**
     * Gets the value of the insurerOgrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerOgrn() {
        return insurerOgrn;
    }

    /**
     * Sets the value of the insurerOgrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerOgrn(String value) {
        this.insurerOgrn = value;
    }

    /**
     * Gets the value of the insurerInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerInn() {
        return insurerInn;
    }

    /**
     * Sets the value of the insurerInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerInn(String value) {
        this.insurerInn = value;
    }

    /**
     * Gets the value of the insurerKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerKpp() {
        return insurerKpp;
    }

    /**
     * Sets the value of the insurerKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerKpp(String value) {
        this.insurerKpp = value;
    }

    /**
     * Gets the value of the firstYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFirstYearAmount() {
        return firstYearAmount;
    }

    /**
     * Sets the value of the firstYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFirstYearAmount(Double value) {
        this.firstYearAmount = value;
    }

    /**
     * Gets the value of the secondYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSecondYearAmount() {
        return secondYearAmount;
    }

    /**
     * Sets the value of the secondYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSecondYearAmount(Double value) {
        this.secondYearAmount = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

}
