package model.service;

import javax.servlet.http.HttpSession;

import model.service.common.AppModule;

import model.view.CurrentSectionCapacityVOImpl;
import model.view.WpSectionCapacityVOImpl;

import oracle.jbo.server.ApplicationModuleImpl;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 26 10:22:40 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    public void setSessionValues(String orgId, String userId, String respId,
                                 String respApplId) {
       
//    orgId = "343";
//    userId = "5219";
    
       
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);

        if (orgId != null) {
            userSession.setAttribute("orgId", orgId);
        }

        if (userId != null) {
            userSession.setAttribute("userId", userId);
        }

        if (respId != null) {
            userSession.setAttribute("respId", respId);
        }

        if (respApplId != null) {
            userSession.setAttribute("respApplId", respApplId);
        }         
         
      }


    /**
     * Container's getter for OrgVO1.
     * @return OrgVO1
     */
    public ViewObjectImpl getOrgVO1() {
        return (ViewObjectImpl)findViewObject("OrgVO1");
    }

    /**
     * Container's getter for CurrentSectionCapacityVO1.
     * @return CurrentSectionCapacityVO1
     */
    public ViewObjectImpl getCurrentSectionCapacityVO1() {
        return (ViewObjectImpl)findViewObject("CurrentSectionCapacityVO1");
    }

    /**
     * Container's getter for OrgVO_Vs_CurrentSectionCapacityVO_VL1.
     * @return OrgVO_Vs_CurrentSectionCapacityVO_VL1
     */
    public ViewLinkImpl getOrgVO_Vs_CurrentSectionCapacityVO_VL1() {
        return (ViewLinkImpl)findViewLink("OrgVO_Vs_CurrentSectionCapacityVO_VL1");
    }

    /**
     * Container's getter for WpSectionCapacityVO1.
     * @return WpSectionCapacityVO1
     */
    public ViewObjectImpl getWpSectionCapacityVO1() {
        return (ViewObjectImpl)findViewObject("WpSectionCapacityVO1");
    }

    /**
     * Container's getter for CurrentSectionCapapcity_vs_WpSectionCapacity_VL1.
     * @return CurrentSectionCapapcity_vs_WpSectionCapacity_VL1
     */
    public ViewLinkImpl getCurrentSectionCapapcity_vs_WpSectionCapacity_VL1() {
        return (ViewLinkImpl)findViewLink("CurrentSectionCapapcity_vs_WpSectionCapacity_VL1");
    }




    /**
     * Container's getter for MonthlyCapacityVO1.
     * @return MonthlyCapacityVO1
     */
    public ViewObjectImpl getMonthlyCapacityVO1() {
        return (ViewObjectImpl)findViewObject("MonthlyCapacityVO1");
    }

    /**
     * Container's getter for MonthYearSearchVO_vs_MonthlyCapacityVO_VL1.
     * @return MonthYearSearchVO_vs_MonthlyCapacityVO_VL1
     */
    public ViewLinkImpl getMonthYearSearchVO_vs_MonthlyCapacityVO_VL1() {
        return (ViewLinkImpl)findViewLink("MonthYearSearchVO_vs_MonthlyCapacityVO_VL1");
    }
}
