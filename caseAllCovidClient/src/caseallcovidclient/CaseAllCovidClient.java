/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseallcovidclient;

import java.util.List;
import services.Covidcaseall;

/**
 *
 * @author ASUS
 */
public class CaseAllCovidClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        List<Covidcaseall> all = findAllCase();                                                                                                                           
        System.out.println(all.toString());
        for (Covidcaseall value : all) {
             
            System.out.println("year : " + value.getYears());
            System.out.println("weeknum : " + value.getWeeknum());   
            System.out.println("new_case : " + value.getNewCase());
            System.out.println("total_case : " + value.getTotalCase());   
            System.out.println("new_case_excludeabroad : " + value.getNewCaseExcludeabroad());
            System.out.println("total_case_excludeabroad : " + value.getTotalCaseExcludeabroad());
            System.out.println("get_new_recovered : " + value.getNewRecovered());   
            System.out.println("get_total_recovered : " + value.getTotalRecovered());
            System.out.println("get_new_death : " + value.getNewDeath());
            System.out.println("get_total_death"+value.getTotalDeath());
            System.out.println("get_case_foreign"+value.getCaseForeign());
            System.out.println("get_case_prison : " + value.getCasePrison());   
            System.out.println("get_case_walkin : " + value.getCaseWalkin());
            System.out.println("get_new_prev : " + value.getCaseNewPrev());
            System.out.println("get_new_diff : " + value.getCaseNewDiff());
            System.out.println("get_death_new_prev : " + value.getDeathNewPrev());
            System.out.println("get_death_new_diff : " + value.getDeathNewDiff());
            System.out.println("update_date : " + value.getUpdateDate());
            System.out.println("---------------------------"); 
            }            
         
        Covidcaseall case_id = findCaseById(1);
        System.out.println(case_id.getDeathNewPrev());
        List<Covidcaseall> case_week = findCaseByWeeknum(23);
         System.out.println("-----------week----------------"); 
        for (Covidcaseall value : case_week) {
            
            System.out.println("year : " + value.getYears());
            System.out.println("weeknum : " + value.getWeeknum());   
            System.out.println("new_case : " + value.getNewCase());
            System.out.println("total_case : " + value.getTotalCase());   
            System.out.println("new_case_excludeabroad : " + value.getNewCaseExcludeabroad());
            System.out.println("total_case_excludeabroad : " + value.getTotalCaseExcludeabroad());
            System.out.println("get_new_recovered : " + value.getNewRecovered());   
            System.out.println("get_total_recovered : " + value.getTotalRecovered());
            System.out.println("get_new_death : " + value.getNewDeath());
            System.out.println("get_total_death"+value.getTotalDeath());
            System.out.println("get_case_foreign"+value.getCaseForeign());
            System.out.println("get_case_prison : " + value.getCasePrison());   
            System.out.println("get_case_walkin : " + value.getCaseWalkin());
            System.out.println("get_new_prev : " + value.getCaseNewPrev());
            System.out.println("get_new_diff : " + value.getCaseNewDiff());
            System.out.println("get_death_new_prev : " + value.getDeathNewPrev());
            System.out.println("get_death_new_diff : " + value.getDeathNewDiff());
            System.out.println("update_date : " + value.getUpdateDate());
            System.out.println("---------------------------"); 
            }            

    }

    private static java.util.List<services.Covidcaseall> findAllCase() {
        services.CaseAllCovidWebService_Service service = new services.CaseAllCovidWebService_Service();
        services.CaseAllCovidWebService port = service.getCaseAllCovidWebServicePort();
        return port.findAllCase();
    }

    private static Covidcaseall findCaseById(int id) {
        services.CaseAllCovidWebService_Service service = new services.CaseAllCovidWebService_Service();
        services.CaseAllCovidWebService port = service.getCaseAllCovidWebServicePort();
        return port.findCaseById(id);
    }

    private static java.util.List<services.Covidcaseall> findCaseByWeeknum(int weeknum) {
        services.CaseAllCovidWebService_Service service = new services.CaseAllCovidWebService_Service();
        services.CaseAllCovidWebService port = service.getCaseAllCovidWebServicePort();
        return port.findCaseByWeeknum(weeknum);
    }
    
    
}
