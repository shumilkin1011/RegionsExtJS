
package ru.fss.integration.types.tms.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumRequestStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REGISTERED"/&gt;
 *     &lt;enumeration value="READY_TO_PROCESS"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="PROCESSED"/&gt;
 *     &lt;enumeration value="PROCESSING_ERROR"/&gt;
 *     &lt;enumeration value="NOTFOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumRequestStatus", namespace = "http://www.fss.ru/integration/types/tms/v01")
@XmlEnum
public enum EnumRequestStatus {


    /**
     * REGISTERED - Сообщение зарегистрировано
     * 
     */
    REGISTERED,

    /**
     * READY_TO_PROCESS - Сообщение готово к обработке
     *                     
     * 
     */
    READY_TO_PROCESS,

    /**
     * PROCESSING - Обрабатывается
     *                     
     * 
     */
    PROCESSING,

    /**
     * PROCESSED - Сообщение успешно обработано
     *                     
     * 
     */
    PROCESSED,

    /**
     * PROCESSING_ERROR - Ошибка обработки сообщения
     *                     
     * 
     */
    PROCESSING_ERROR,

    /**
     * NOTFOUND - Сообщение не найдено
     *                     
     * 
     */
    NOTFOUND;

    public String value() {
        return name();
    }

    public static EnumRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}
