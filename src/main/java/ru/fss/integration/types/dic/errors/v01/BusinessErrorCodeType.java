
package ru.fss.integration.types.dic.errors.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessErrorCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E_0010"/&gt;
 *     &lt;enumeration value="E_PVSO_0010"/&gt;
 *     &lt;enumeration value="E_TSR_0010"/&gt;
 *     &lt;enumeration value="E_TSR_0020"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessErrorCodeType", namespace = "http://www.fss.ru/integration/types/dic/errors/v01")
@XmlEnum
public enum BusinessErrorCodeType {

    E_0010,
    E_PVSO_0010,

    /**
     * Спецификация контракта по заданным параметрам не найдена
     * 
     */
    E_TSR_0010,

    /**
     * Не найден регион
     * 
     */
    E_TSR_0020;

    public String value() {
        return name();
    }

    public static BusinessErrorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
