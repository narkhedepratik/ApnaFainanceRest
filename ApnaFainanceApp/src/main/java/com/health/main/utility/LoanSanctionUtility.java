package com.health.main.utility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
@Component
public class LoanSanctionUtility {
	public static ByteArrayInputStream generatePdf()
	{
		Document doc=new Document();
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		PdfWriter.getInstance(doc, output);
		doc.open();
		String title="Sanction Loan Details...";
		Paragraph titlePara=new Paragraph(title);
		doc.add(titlePara);
		doc.close();
		return new ByteArrayInputStream(output.toByteArray());
	}

}
