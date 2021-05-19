
package ru.fss.integration.types.common.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DictionaryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DictionaryTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSURERS"/&gt;
 *     &lt;enumeration value="SEDO_MESSAGES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DictionaryTypeType")
@XmlEnum
public enum DictionaryTypeType {

    INSURERS,
    SEDO_MESSAGES;

    public String value() {
        return name();
    }

    public static DictionaryTypeType fromValue(String v) {
        return valueOf(v);
    }

}
