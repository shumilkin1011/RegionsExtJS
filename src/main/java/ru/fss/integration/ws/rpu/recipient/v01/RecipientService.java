package ru.fss.integration.ws.rpu.recipient.v01;

import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2021-05-18T14:58:21.481+03:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://www.fss.ru/integration/ws/rpu/Recipient/v01", name = "RecipientService")
@XmlSeeAlso({ru.fss.integration.types.identitydocument.v01.ObjectFactory.class, ru.fss.integration.types.tms.v01.ObjectFactory.class, ru.fss.integration.types.fault.v01.ObjectFactory.class, ru.fss.integration.types.sedo.v01.ObjectFactory.class, ru.fss.integration.types.person.v01.ObjectFactory.class, ru.fss.integration.types.common.v01.ObjectFactory.class, ru.fss.integration.types.dic.fault.v01.ObjectFactory.class, ru.fss.integration.types.dic.errors.v01.ObjectFactory.class, ru.fss.integration.types.rpu.recipient.v01.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RecipientService {

    @WebMethod(action = "http://www.fss.ru/integration/ws/rpu/getRecipient/v01")
    @WebResult(name = "recipientResponse", targetNamespace = "http://www.fss.ru/integration/types/rpu/Recipient/v01", partName = "RecipientResponse")
    public ru.fss.integration.types.rpu.recipient.v01.RecipientResponseType getRecipient(
        @WebParam(partName = "RecipientRequest", name = "recipientRequest", targetNamespace = "http://www.fss.ru/integration/types/rpu/Recipient/v01")
        ru.fss.integration.types.rpu.recipient.v01.RecipientRequestType recipientRequest
    ) throws ru.fss.integration.ws.fault.v01.InternalException;
}
