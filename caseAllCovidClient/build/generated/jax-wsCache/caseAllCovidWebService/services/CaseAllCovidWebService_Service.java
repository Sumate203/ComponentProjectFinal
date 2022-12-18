
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "caseAllCovidWebService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/CaseAllCovidWeb/caseAllCovidWebService?WSDL")
public class CaseAllCovidWebService_Service
    extends Service
{

    private final static URL CASEALLCOVIDWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CASEALLCOVIDWEBSERVICE_EXCEPTION;
    private final static QName CASEALLCOVIDWEBSERVICE_QNAME = new QName("http://services/", "caseAllCovidWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CaseAllCovidWeb/caseAllCovidWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CASEALLCOVIDWEBSERVICE_WSDL_LOCATION = url;
        CASEALLCOVIDWEBSERVICE_EXCEPTION = e;
    }

    public CaseAllCovidWebService_Service() {
        super(__getWsdlLocation(), CASEALLCOVIDWEBSERVICE_QNAME);
    }

    public CaseAllCovidWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CASEALLCOVIDWEBSERVICE_QNAME, features);
    }

    public CaseAllCovidWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CASEALLCOVIDWEBSERVICE_QNAME);
    }

    public CaseAllCovidWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CASEALLCOVIDWEBSERVICE_QNAME, features);
    }

    public CaseAllCovidWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CaseAllCovidWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CaseAllCovidWebService
     */
    @WebEndpoint(name = "caseAllCovidWebServicePort")
    public CaseAllCovidWebService getCaseAllCovidWebServicePort() {
        return super.getPort(new QName("http://services/", "caseAllCovidWebServicePort"), CaseAllCovidWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CaseAllCovidWebService
     */
    @WebEndpoint(name = "caseAllCovidWebServicePort")
    public CaseAllCovidWebService getCaseAllCovidWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "caseAllCovidWebServicePort"), CaseAllCovidWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CASEALLCOVIDWEBSERVICE_EXCEPTION!= null) {
            throw CASEALLCOVIDWEBSERVICE_EXCEPTION;
        }
        return CASEALLCOVIDWEBSERVICE_WSDL_LOCATION;
    }

}