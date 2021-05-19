
package ru.fss.integration.types.rpu.recipient.v01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fss.integration.types.rpu.recipient.v01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecipientRequest_QNAME = new QName("http://www.fss.ru/integration/types/rpu/Recipient/v01", "recipientRequest");
    private final static QName _RecipientResponse_QNAME = new QName("http://www.fss.ru/integration/types/rpu/Recipient/v01", "recipientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fss.integration.types.rpu.recipient.v01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecipientRequestType }
     * 
     */
    public RecipientRequestType createRecipientRequestType() {
        return new RecipientRequestType();
    }

    /**
     * Create an instance of {@link RecipientResponseType }
     * 
     */
    public RecipientResponseType createRecipientResponseType() {
        return new RecipientResponseType();
    }

    /**
     * Create an instance of {@link RecipientPresenceType }
     * 
     */
    public RecipientPresenceType createRecipientPresenceType() {
        return new RecipientPresenceType();
    }

    /**
     * Create an instance of {@link RecipientDocType }
     * 
     */
    public RecipientDocType createRecipientDocType() {
        return new RecipientDocType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link GetPaymentsType }
     * 
     */
    public GetPaymentsType createGetPaymentsType() {
        return new GetPaymentsType();
    }

    /**
     * Create an instance of {@link PvsoRegistrType }
     * 
     */
    public PvsoRegistrType createPvsoRegistrType() {
        return new PvsoRegistrType();
    }

    /**
     * Create an instance of {@link RecipientDocListType }
     * 
     */
    public RecipientDocListType createRecipientDocListType() {
        return new RecipientDocListType();
    }

    /**
     * Create an instance of {@link AddressListType }
     * 
     */
    public AddressListType createAddressListType() {
        return new AddressListType();
    }

    /**
     * Create an instance of {@link PhoneListType }
     * 
     */
    public PhoneListType createPhoneListType() {
        return new PhoneListType();
    }

    /**
     * Create an instance of {@link GetPaymentsListType }
     * 
     */
    public GetPaymentsListType createGetPaymentsListType() {
        return new GetPaymentsListType();
    }

    /**
     * Create an instance of {@link RecipientInfoType }
     * 
     */
    public RecipientInfoType createRecipientInfoType() {
        return new RecipientInfoType();
    }

    /**
     * Create an instance of {@link RecipientInfoListType }
     * 
     */
    public RecipientInfoListType createRecipientInfoListType() {
        return new RecipientInfoListType();
    }

    /**
     * Create an instance of {@link RecipientInfoRequestType }
     * 
     */
    public RecipientInfoRequestType createRecipientInfoRequestType() {
        return new RecipientInfoRequestType();
    }

    /**
     * Create an instance of {@link RecipientInfoResponseType }
     * 
     */
    public RecipientInfoResponseType createRecipientInfoResponseType() {
        return new RecipientInfoResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fss.ru/integration/types/rpu/Recipient/v01", name = "recipientRequest")
    public JAXBElement<RecipientRequestType> createRecipientRequest(RecipientRequestType value) {
        return new JAXBElement<RecipientRequestType>(_RecipientRequest_QNAME, RecipientRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipientResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fss.ru/integration/types/rpu/Recipient/v01", name = "recipientResponse")
    public JAXBElement<RecipientResponseType> createRecipientResponse(RecipientResponseType value) {
        return new JAXBElement<RecipientResponseType>(_RecipientResponse_QNAME, RecipientResponseType.class, null, value);
    }

}
