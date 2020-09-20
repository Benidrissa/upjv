
package org.emiage.bitraore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.emiage.bitraore package. 
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

    private final static QName _Decomposer_QNAME = new QName("http://bitraore.emiage.org/", "decomposer");
    private final static QName _DecomposerResponse_QNAME = new QName("http://bitraore.emiage.org/", "decomposerResponse");
    private final static QName _PremierResponse_QNAME = new QName("http://bitraore.emiage.org/", "premierResponse");
    private final static QName _Additionner_QNAME = new QName("http://bitraore.emiage.org/", "additionner");
    private final static QName _AdditionnerResponse_QNAME = new QName("http://bitraore.emiage.org/", "additionnerResponse");
    private final static QName _Premier_QNAME = new QName("http://bitraore.emiage.org/", "premier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.emiage.bitraore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Additionner }
     * 
     */
    public Additionner createAdditionner() {
        return new Additionner();
    }

    /**
     * Create an instance of {@link DecomposerResponse }
     * 
     */
    public DecomposerResponse createDecomposerResponse() {
        return new DecomposerResponse();
    }

    /**
     * Create an instance of {@link PremierResponse }
     * 
     */
    public PremierResponse createPremierResponse() {
        return new PremierResponse();
    }

    /**
     * Create an instance of {@link Decomposer }
     * 
     */
    public Decomposer createDecomposer() {
        return new Decomposer();
    }

    /**
     * Create an instance of {@link Premier }
     * 
     */
    public Premier createPremier() {
        return new Premier();
    }

    /**
     * Create an instance of {@link AdditionnerResponse }
     * 
     */
    public AdditionnerResponse createAdditionnerResponse() {
        return new AdditionnerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decomposer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "decomposer")
    public JAXBElement<Decomposer> createDecomposer(Decomposer value) {
        return new JAXBElement<Decomposer>(_Decomposer_QNAME, Decomposer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "decomposerResponse")
    public JAXBElement<DecomposerResponse> createDecomposerResponse(DecomposerResponse value) {
        return new JAXBElement<DecomposerResponse>(_DecomposerResponse_QNAME, DecomposerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "premierResponse")
    public JAXBElement<PremierResponse> createPremierResponse(PremierResponse value) {
        return new JAXBElement<PremierResponse>(_PremierResponse_QNAME, PremierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Additionner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "additionner")
    public JAXBElement<Additionner> createAdditionner(Additionner value) {
        return new JAXBElement<Additionner>(_Additionner_QNAME, Additionner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "additionnerResponse")
    public JAXBElement<AdditionnerResponse> createAdditionnerResponse(AdditionnerResponse value) {
        return new JAXBElement<AdditionnerResponse>(_AdditionnerResponse_QNAME, AdditionnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Premier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bitraore.emiage.org/", name = "premier")
    public JAXBElement<Premier> createPremier(Premier value) {
        return new JAXBElement<Premier>(_Premier_QNAME, Premier.class, null, value);
    }

}
