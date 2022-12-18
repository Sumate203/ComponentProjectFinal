/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "caseAllCovidWebService")
public class caseAllCovidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CaseAllCovidWebPU");

    /**
     * This is a sample web service operation
     */
   @WebMethod(operationName = "findCaseById")
    public Covidcaseall findCaseById(@WebParam(name = "id") int id) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("CaseAllCovidWebPU");
           EntityManager em = emf.createEntityManager();
           Covidcaseall cc = em.find(Covidcaseall.class,id);
        return cc;
    }
   
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAllCase")
    public List<Covidcaseall> findAllCase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CaseAllCovidWebPU");
        EntityManager em = emf.createEntityManager();
        List<Covidcaseall> cc = (List<Covidcaseall>) em.createNamedQuery("Covidcaseall.findAll").getResultList();
        em.close();
        return cc;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCaseByWeeknum")
    public  List<Covidcaseall> findCaseByWeeknum(@WebParam(name = "weeknum") int weeknum) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CaseAllCovidWebPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Covidcaseall.findByWeeknum");
        query.setParameter("weeknum", weeknum);
        List<Covidcaseall> cc = (List<Covidcaseall>) query.getResultList();
        em.close();
        return cc;
    }

   
    
}
