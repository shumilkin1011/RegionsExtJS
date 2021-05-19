
package ru.fss.integration.types.common.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneNumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneNumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LANDLINE"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumType")
@XmlEnum
public enum PhoneNumType {


    /**
     * Стационарный
     * 
     */
    LANDLINE,

    /**
     * Мобильный
     * 
     */
    MOBILE;

    public String value() {
        return name();
    }

    public static PhoneNumType fromValue(String v) {
        return valueOf(v);
    }

}
