
package ru.fss.integration.types.person.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *     &lt;enumeration value="FEMALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenderType")
@XmlEnum
public enum GenderType {


    /**
     * Пол: мужской
     * 
     */
    MALE,

    /**
     * Пол: женский
     * 
     */
    FEMALE;

    public String value() {
        return name();
    }

    public static GenderType fromValue(String v) {
        return valueOf(v);
    }

}
