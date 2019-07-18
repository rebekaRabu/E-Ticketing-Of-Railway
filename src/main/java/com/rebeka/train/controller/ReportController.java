package com.rebeka.train.controller;

import com.rebeka.train.daoimpl.JasperReportDAO;
import com.rebeka.train.reportmodel.CompartmentReport;
import com.rebeka.train.reportmodel.FareChartReport;
import com.rebeka.train.reportmodel.ReservationReport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author User
 */
@Controller
public class ReportController {
    
    @RequestMapping(value = "/reportView", method = RequestMethod.GET)
    public String loadSurveyPg(
            @ModelAttribute("reportInputForm") FareChartReport reportInputForm, Model model) {
        model.addAttribute("reportInputForm", reportInputForm);
        return "report";
    }
    
    @RequestMapping(value = "/reportView", method = RequestMethod.POST)
    public String generateReport(@ModelAttribute("reportInputForm") FareChartReport reportInputForm,HttpServletRequest request,HttpServletResponse response) throws JRException, IOException, SQLException, NamingException {
        String reportFileName = "farechart";
        JasperReportDAO jrdao = new JasperReportDAO();
        Connection conn = null;
        try {
            conn = jrdao.getConnection();
            String farechartid = reportInputForm.getFarechartid();
            HashMap<String, Object> hmParams = new HashMap<String, Object>();
            hmParams.put("farechartid", farechartid);
            JasperReport jasperReport = jrdao.getCompiledFile(reportFileName,request);

            jrdao.generateReportPDF(response, hmParams, jasperReport, conn); 

        } catch (SQLException sqlExp) {
            System.out.println("Exception::" + sqlExp.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        }

        return null;
    }
    
    
    
    
    //=====================***************========================
    
    
    @RequestMapping(value = "/compartmentreportView", method = RequestMethod.GET)
    public String loadSurveyPg(
            @ModelAttribute("reportInputForm") CompartmentReport reportInputForm, Model model) {
        model.addAttribute("reportInputForm", reportInputForm);
        return "compartmenttypereport";
    }
    
    @RequestMapping(value = "/compartmentreportView", method = RequestMethod.POST)
    public String generateReport(@ModelAttribute("reportInputForm") CompartmentReport reportInputForm,HttpServletRequest request,HttpServletResponse response) throws JRException, IOException, SQLException, NamingException {
        String reportFileName = "comptype";
        JasperReportDAO jrdao = new JasperReportDAO();
        Connection conn = null;
        try {
            conn = jrdao.getConnection();
            String comptypeid = reportInputForm.getComptypeid();
            HashMap<String, Object> hmParams = new HashMap<String, Object>();
            hmParams.put("comptypeid", comptypeid);
            JasperReport jasperReport = jrdao.getCompiledFile(reportFileName,request);

            jrdao.generateReportPDF(response, hmParams, jasperReport, conn); 

        } catch (SQLException sqlExp) {
            System.out.println("Exception::" + sqlExp.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        }

        return null;
    }
    
    
    
    
     //=====================***************========================
    
    
    @RequestMapping(value = "/reservationreportView", method = RequestMethod.GET)
    public String loadSurveyPg(
            @ModelAttribute("reportInputForm") ReservationReport reportInputForm, Model model) {
        model.addAttribute("reportInputForm", reportInputForm);
        return "reservationreport";
    }
    
    @RequestMapping(value = "/reservationreportView", method = RequestMethod.POST)
    public String generateReport(@ModelAttribute("reportInputForm") ReservationReport reportInputForm,HttpServletRequest request,HttpServletResponse response) throws JRException, IOException, SQLException, NamingException {
        String reportFileName = "reservation";
        JasperReportDAO jrdao = new JasperReportDAO();
        Connection conn = null;
        try {
            conn = jrdao.getConnection();
            String reservid = reportInputForm.getReservid();
            HashMap<String, Object> hmParams = new HashMap<String, Object>();
            hmParams.put("reservid", reservid);
            JasperReport jasperReport = jrdao.getCompiledFile(reportFileName,request);

            jrdao.generateReportPDF(response, hmParams, jasperReport, conn); 

        } catch (SQLException sqlExp) {
            System.out.println("Exception::" + sqlExp.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        }

        return null;
    }
}
