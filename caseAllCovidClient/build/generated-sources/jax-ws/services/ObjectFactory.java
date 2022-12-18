
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindAllCaseResponse_QNAME = new QName("http://services/", "findAllCaseResponse");
    private final static QName _FindCaseByWeeknum_QNAME = new QName("http://services/", "findCaseByWeeknum");
    private final static QName _FindCaseByWeeknumResponse_QNAME = new QName("http://services/", "findCaseByWeeknumResponse");
    private final static QName _Covidcaseall_QNAME = new QName("http://services/", "covidcaseall");
    private final static QName _FindCaseById_QNAME = new QName("http://services/", "findCaseById");
    private final static QName _FindCaseByIdResponse_QNAME = new QName("http://services/", "findCaseByIdResponse");
    private final static QName _FindAllCase_QNAME = new QName("http://services/", "findAllCase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCaseByIdResponse }
     * 
     */
    public FindCaseByIdResponse createFindCaseByIdResponse() {
        return new FindCaseByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllCase }
     * 
     */
    public FindAllCase createFindAllCase() {
        return new FindAllCase();
    }

    /**
     * Create an instance of {@link FindAllCaseResponse }
     * 
     */
    public FindAllCaseResponse createFindAllCaseResponse() {
        return new FindAllCaseResponse();
    }

    /**
     * Create an instance of {@link FindCaseByWeeknum }
     * 
     */
    public FindCaseByWeeknum createFindCaseByWeeknum() {
        return new FindCaseByWeeknum();
    }

    /**
     * Create an instance of {@link Covidcaseall }
     * 
     */
    public Covidcaseall createCovidcaseall() {
        return new Covidcaseall();
    }

    /**
     * Create an instance of {@link FindCaseById }
     * 
     */
    public FindCaseById createFindCaseById() {
        return new FindCaseById();
    }

    /**
     * Create an instance of {@link FindCaseByWeeknumResponse }
     * 
     */
    public FindCaseByWeeknumResponse createFindCaseByWeeknumResponse() {
        return new FindCaseByWeeknumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCaseResponse")
    public JAXBElement<FindAllCaseResponse> createFindAllCaseResponse(FindAllCaseResponse value) {
        return new JAXBElement<FindAllCaseResponse>(_FindAllCaseResponse_QNAME, FindAllCaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCaseByWeeknum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCaseByWeeknum")
    public JAXBElement<FindCaseByWeeknum> createFindCaseByWeeknum(FindCaseByWeeknum value) {
        return new JAXBElement<FindCaseByWeeknum>(_FindCaseByWeeknum_QNAME, FindCaseByWeeknum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCaseByWeeknumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCaseByWeeknumResponse")
    public JAXBElement<FindCaseByWeeknumResponse> createFindCaseByWeeknumResponse(FindCaseByWeeknumResponse value) {
        return new JAXBElement<FindCaseByWeeknumResponse>(_FindCaseByWeeknumResponse_QNAME, FindCaseByWeeknumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidcaseall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidcaseall")
    public JAXBElement<Covidcaseall> createCovidcaseall(Covidcaseall value) {
        return new JAXBElement<Covidcaseall>(_Covidcaseall_QNAME, Covidcaseall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCaseById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCaseById")
    public JAXBElement<FindCaseById> createFindCaseById(FindCaseById value) {
        return new JAXBElement<FindCaseById>(_FindCaseById_QNAME, FindCaseById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCaseByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCaseByIdResponse")
    public JAXBElement<FindCaseByIdResponse> createFindCaseByIdResponse(FindCaseByIdResponse value) {
        return new JAXBElement<FindCaseByIdResponse>(_FindCaseByIdResponse_QNAME, FindCaseByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCase")
    public JAXBElement<FindAllCase> createFindAllCase(FindAllCase value) {
        return new JAXBElement<FindAllCase>(_FindAllCase_QNAME, FindAllCase.class, null, value);
    }

}
