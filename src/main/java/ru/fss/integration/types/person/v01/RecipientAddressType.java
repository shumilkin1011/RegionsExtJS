
package ru.fss.integration.types.person.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientAddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecipientAddressType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIVEPLACE"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="WORK"/&gt;
 *     &lt;enumeration value="REGLK"/&gt;
 *     &lt;enumeration value="FACTLK"/&gt;
 *     &lt;enumeration value="REG_PFR"/&gt;
 *     &lt;enumeration value="FACT_PFR"/&gt;
 *     &lt;enumeration value="LEGAL"/&gt;
 *     &lt;enumeration value="FACT"/&gt;
 *     &lt;enumeration value="HOST"/&gt;
 *     &lt;enumeration value="FACTLIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecipientAddressType")
@XmlEnum
public enum RecipientAddressType {


    /**
     * Местожительства
     * 
     */
    LIVEPLACE,

    /**
     * Регистрации
     * 
     */
    REG,

    /**
     * Рабочий
     * 
     */
    WORK,

    /**
     * Регистрации адрес ЛК
     * 
     */
    REGLK,

    /**
     * Фактический адрес ЛК
     * 
     */
    FACTLK,

    /**
     * Регистрации ГЛК ПФР
     * 
     */
    REG_PFR,

    /**
     * Фактический ГЛК ПФР
     * 
     */
    FACT_PFR,

    /**
     * Юридический
     * 
     */
    LEGAL,

    /**
     * Фактический
     * 
     */
    FACT,

    /**
     * Пребывания
     * 
     */
    HOST,

    /**
     * Фактического проживания
     * 
     */
    FACTLIVE;

    public String value() {
        return name();
    }

    public static RecipientAddressType fromValue(String v) {
        return valueOf(v);
    }

}
