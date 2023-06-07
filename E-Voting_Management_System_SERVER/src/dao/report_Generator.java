package dao;

import com.itextpdf.layout.element.Table;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.events_coordinator;
import model.guild_president;
import model.infoSec_officer;
import model.interStudent_officer;
import model.report;
import model.vice_president;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.io.image.ImageDataFactory;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.util.List;
import model.report;
import com.itextpdf.layout.Document;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.util.List;
import model.report;

public class report_Generator {
    
    public report_Generator() {
        super();
        generateReports();
    }    

    private List<report> retrieveWinners() {
        
        
        List<report> reports = new ArrayList<>();

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // Retrieve the winners with equal votes for each position
            List<guild_president> guildPresidentWinners = session.createQuery(
                    "SELECT gp FROM guild_president gp WHERE gp.candidate_votes = (SELECT MAX(gp2.candidate_votes) FROM guild_president gp2)")
                    .list();

            List<vice_president> vicePresidentWinners = session.createQuery(
                    "SELECT vp FROM vice_president vp WHERE vp.candidate_votes = (SELECT MAX(vp2.candidate_votes) FROM vice_president vp2)")
                    .list();

            List<events_coordinator> eventsCoordinatorWinners = session.createQuery(
                    "SELECT ec FROM events_coordinator ec WHERE ec.candidate_votes = (SELECT MAX(ec2.candidate_votes) FROM events_coordinator ec2)")
                    .list();

            List<infoSec_officer> infoSecOfficerWinners = session.createQuery(
                    "SELECT io FROM infoSec_officer io WHERE io.candidate_votes = (SELECT MAX(io2.candidate_votes) FROM infoSec_officer io2)")
                    .list();

            List<interStudent_officer> interStudentOfficerWinners = session.createQuery(
                    "SELECT iso FROM interStudent_officer iso WHERE iso.candidate_votes = (SELECT MAX(iso2.candidate_votes) FROM interStudent_officer iso2)")
                    .list();

            // Create a report for each winner and add it to the reports list
            for (guild_president winner : guildPresidentWinners) {
                report report = new report();
                report.setCandidate_id(winner.getCandidate_id());
                report.setPosition(winner.getPosition());
                report.setCandidate_votes(winner.getCandidate_votes());
                report.setDescription(winner.getDescription());
                report.setFull_name(winner.getFull_name());
                report.setImage(winner.getImage());
                reports.add(report);
            }

            for (vice_president winner : vicePresidentWinners) {
                report report = new report();
                report.setCandidate_id(winner.getCandidate_id());
                report.setPosition(winner.getPosition());
                report.setCandidate_votes(winner.getCandidate_votes());
                report.setDescription(winner.getDescription());
                report.setFull_name(winner.getFull_name());
                report.setImage(winner.getImage());
                reports.add(report);
            }

            for (events_coordinator winner : eventsCoordinatorWinners) {
                report report = new report();
                report.setCandidate_id(winner.getCandidate_id());
                report.setPosition(winner.getPosition());
                report.setCandidate_votes(winner.getCandidate_votes());
                report.setDescription(winner.getDescription());
                report.setFull_name(winner.getFull_name());
                report.setImage(winner.getImage());
                reports.add(report);
            }

            for (infoSec_officer winner : infoSecOfficerWinners) {
                report report = new report();
                report.setCandidate_id(winner.getCandidate_id());
                report.setPosition(winner.getPosition());
                report.setCandidate_votes(winner.getCandidate_votes());
                report.setDescription(winner.getDescription());
                report.setFull_name(winner.getFull_name());
                report.setImage(winner.getImage());
                reports.add(report);
            }

            for (interStudent_officer winner :interStudentOfficerWinners) {
                report report = new report();
                report.setCandidate_id(winner.getCandidate_id());
                report.setPosition(winner.getPosition());
                report.setCandidate_votes(winner.getCandidate_votes());
                report.setDescription(winner.getDescription());
                report.setFull_name(winner.getFull_name());
                report.setImage(winner.getImage());
                reports.add(report);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reports;
    }



private void generatePDF(List<report> reports) {
    
    
    // Generate the PDF file using the reports data

    // Dummy code to demonstrate PDF generation
    try {
        PdfDocument pdfDocument = new PdfDocument(new PdfWriter("report.pdf"));
        Document document = new Document(pdfDocument);


        // Create the table
        Table table = new Table(6);
        table.addCell("Candidate ID");
        table.addCell("Position");
        table.addCell("Candidate Votes");
        table.addCell("Description");
        table.addCell("Full Name");
        table.addCell("Image");

            // Add the data rows
            for (report report : reports) {
                table.addCell(String.valueOf(report.getCandidate_id()));
                table.addCell(report.getPosition());
                table.addCell(String.valueOf(report.getCandidate_votes()));
                table.addCell(report.getDescription());
                table.addCell(report.getFull_name());

                // Handle the image data
                byte[] imageData = report.getImage();
                    if (imageData != null) {
                        Image image = new Image(ImageDataFactory.create(imageData));
                        table.addCell(image);
                    } else {
                        table.addCell(""); // Placeholder cell if no image available
                    }
            }

        document.add(table);
        document.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public List<report> generateReports() {
        List<report> winners = retrieveWinners();
        generatePDF(winners);
        return winners;
    }
}
