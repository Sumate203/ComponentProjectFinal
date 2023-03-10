
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "caseAllCovidWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CaseAllCovidWebService {


    /**
     * 
     * @param weeknum
     * @return
     *     returns java.util.List<services.Covidcaseall>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCaseByWeeknum", targetNamespace = "http://services/", className = "services.FindCaseByWeeknum")
    @ResponseWrapper(localName = "findCaseByWeeknumResponse", targetNamespace = "http://services/", className = "services.FindCaseByWeeknumResponse")
    @Action(input = "http://services/caseAllCovidWebService/findCaseByWeeknumRequest", output = "http://services/caseAllCovidWebService/findCaseByWeeknumResponse")
    public List<Covidcaseall> findCaseByWeeknum(
        @WebParam(name = "weeknum", targetNamespace = "")
        int weeknum);

    /**
     * 
     * @param id
     * @return
     *     returns services.Covidcaseall
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCaseById", targetNamespace = "http://services/", className = "services.FindCaseById")
    @ResponseWrapper(localName = "findCaseByIdResponse", targetNamespace = "http://services/", className = "services.FindCaseByIdResponse")
    @Action(input = "http://services/caseAllCovidWebService/findCaseByIdRequest", output = "http://services/caseAllCovidWebService/findCaseByIdResponse")
    public Covidcaseall findCaseById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<services.Covidcaseall>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllCase", targetNamespace = "http://services/", className = "services.FindAllCase")
    @ResponseWrapper(localName = "findAllCaseResponse", targetNamespace = "http://services/", className = "services.FindAllCaseResponse")
    @Action(input = "http://services/caseAllCovidWebService/findAllCaseRequest", output = "http://services/caseAllCovidWebService/findAllCaseResponse")
    public List<Covidcaseall> findAllCase();

}
