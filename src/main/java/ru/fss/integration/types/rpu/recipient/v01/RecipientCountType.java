
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientCountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecipientCountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ONE"/&gt;
 *     &lt;enumeration value="SEVERAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecipientCountType")
@XmlEnum
public enum RecipientCountType {


    /**
     * Не найдено ни одного
     * 
     */
    NONE,

    /**
     * Найден единственный получатель
     * 
     */
    ONE,

    /**
     * Найдено более одного получателя
     * 
     */
    SEVERAL;

    public String value() {
        return name();
    }

    public static RecipientCountType fromValue(String v) {
        return valueOf(v);
    }

}
