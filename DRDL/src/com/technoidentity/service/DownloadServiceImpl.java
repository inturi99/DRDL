package com.technoidentity.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.lowagie.text.pdf.codec.Base64.InputStream;
@Service
public class DownloadServiceImpl {
	@Autowired
	private ExporterService exporter;
	@Autowired
	private JasperReportService jasperReportService;
	public static final String TEMPLATE = "/employees.jrxml";
	public static final String outPdf ="/employees.pdf";
	
	
	public HttpServletResponse download(HttpServletResponse response,String id)  {
		 
		try {
			// 1. Add report parameters
			HashMap<String, Object> params = new HashMap<String, Object>(); 
			params.put("Title", "Employee Report");
			 
			// 2.  Retrieve template
			//FileInputStream filereportStream = new FileInputStream(new File(TEMPLATE));
		     InputStream reportStream = this.getClass().getResourceAsStream(TEMPLATE); 
			
			
			// 3. Convert template to JasperDesign
			JasperDesign jd = JRXmlLoader.load(reportStream);
			 
			// 4. Compile design to JasperReport
			JasperReport jr = JasperCompileManager.compileReport(jd);
			 
			// 5. Create the JasperPrint object
			// Make sure to pass the JasperReport, report parameters, and data source
			JasperPrint jp = JasperFillManager.fillReport(jr, params,jasperReportService.getEmployeeId(id));
			
			JasperExportManager.exportReportToPdfFile(jp,outPdf );
			 
			// 6. Create an output byte stream where data will be written
			FileInputStream inStream = new FileInputStream(outPdf);
			InputStream outrtStream = inStream;
			// 7. Export report
			response=write(response,outrtStream);
			 
			// 8. Write to reponse stream
			//write(response, baos);
		
		} catch (Exception jre) {
			
			throw new RuntimeException(jre);
		}
		return response;
	}
	
	/**
	* Writes the report to the output stream
	*/
	private HttpServletResponse write(HttpServletResponse response,
			InputStream inputStream) {
		int i;  
		try {
			response.setContentType("text/pdf");
			response.setContentType("APPLICATION/OCTET-STREAM"); 
			response.setHeader("Content-Disposition","attachment; filename= employees.pdf"); 
			PrintWriter out = response.getWriter();
				           
			 while ((i=inputStream.read()) != -1) {  
				 out.write(i);   
			 }   
			inputStream.close();   
			out.close();   
				
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return response;
	}
}
