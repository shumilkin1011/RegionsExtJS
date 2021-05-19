
package ru.fss.integration.types.fault.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Ошибка при обработке заявления на подтверждение видов экономической деятельности
 *             
 * 
 * <p>Java class for PovdBusinessFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PovdBusinessFaultType"&gt;
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
@XmlType(name = "PovdBusinessFaultType")
public class PovdBusinessFaultType
    extends CommonFault
{


}
