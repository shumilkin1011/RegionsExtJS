
package ru.fss.integration.types.dic.fault.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E_0000"/&gt;
 *     &lt;enumeration value="E_0100"/&gt;
 *     &lt;enumeration value="E_0200"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultCodeType", namespace = "http://www.fss.ru/integration/types/dic/fault/v01")
@XmlEnum
public enum FaultCodeType {

    E_0000,
    E_0100,
    E_0200;

    public String value() {
        return name();
    }

    public static FaultCodeType fromValue(String v) {
        return valueOf(v);
    }

}
