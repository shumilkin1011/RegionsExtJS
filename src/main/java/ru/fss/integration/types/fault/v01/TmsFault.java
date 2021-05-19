
package ru.fss.integration.types.fault.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Ошибка в работе транспортного слоя
 *             
 * 
 * <p>Java class for TmsFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmsFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fss.ru/integration/types/fault/v01}CommonFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmsFault")
public class TmsFault
    extends CommonFault
{


}
