
package ru.fss.integration.types.dic.errors.v01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SedoErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SedoErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E_SEDO_0000"/&gt;
 *     &lt;enumeration value="E_SEDO_1000"/&gt;
 *     &lt;enumeration value="E_SEDO_1010"/&gt;
 *     &lt;enumeration value="E_SEDO_1011"/&gt;
 *     &lt;enumeration value="E_SEDO_1020"/&gt;
 *     &lt;enumeration value="E_SEDO_1030"/&gt;
 *     &lt;enumeration value="E_SEDO_1040"/&gt;
 *     &lt;enumeration value="E_SEDO_1070"/&gt;
 *     &lt;enumeration value="E_SEDO_1080"/&gt;
 *     &lt;enumeration value="E_SEDO_1090"/&gt;
 *     &lt;enumeration value="E_SEDO_2000"/&gt;
 *     &lt;enumeration value="E_SEDO_3000"/&gt;
 *     &lt;enumeration value="E_SEDO_3010"/&gt;
 *     &lt;enumeration value="E_SEDO_3020"/&gt;
 *     &lt;enumeration value="E_SEDO_3110"/&gt;
 *     &lt;enumeration value="E_SEDO_3120"/&gt;
 *     &lt;enumeration value="E_SEDO_3130"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SedoErrorType", namespace = "http://www.fss.ru/integration/types/dic/errors/v01")
@XmlEnum
public enum SedoErrorType {


    /**
     * Внутренняя ошибка
     * 
     */
    E_SEDO_0000,

    /**
     * Шлюз СЭДО. Внутренняя ошибка
     * 
     */
    E_SEDO_1000,

    /**
     * Ошибка при попытке расшифровать сообщение
     * 
     */
    E_SEDO_1010,

    /**
     * Не указан сертификат пользователя для шифрования ответного сообщения
     * 
     */
    E_SEDO_1011,

    /**
     * Ошибка при проверке подписи
     * 
     */
    E_SEDO_1020,

    /**
     * Содержимое тега message не является строкой в формате base64
     * 
     */
    E_SEDO_1030,

    /**
     * Ошибка при сохранении входящего сообщения в транспортную таблицу
     * 
     */
    E_SEDO_1040,

    /**
     * Ошибка при сохранении исходящего сообщения в транспортную таблицу
     * 
     */
    E_SEDO_1070,

    /**
     * Ошибка подписи исходящего сообщения
     * 
     */
    E_SEDO_1080,

    /**
     * Ошибка при попытке зашифровать исходящее сообщение
     * 
     */
    E_SEDO_1090,

    /**
     * Ядро СЭДО. Внутренняя ошибка
     * 
     */
    E_SEDO_2000,

    /**
     * ФК СЭДО. Внутренняя ошибка
     * 
     */
    E_SEDO_3000,

    /**
     * Указанное сообщение не найдено
     * 
     */
    E_SEDO_3010,

    /**
     * Неверный формат сообщения. Проверьте на соответствие XSD схеме
     * 
     */
    E_SEDO_3020,

    /**
     * Указанный абонент уже подписан на данного оператора
     * 
     */
    E_SEDO_3110,

    /**
     * Указанный абонент уже откреплен от оператора
     * 
     */
    E_SEDO_3120,

    /**
     * Указанный абонент не был подписан на оператора
     * 
     */
    E_SEDO_3130;

    public String value() {
        return name();
    }

    public static SedoErrorType fromValue(String v) {
        return valueOf(v);
    }

}
