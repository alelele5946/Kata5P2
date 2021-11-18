
package kata4.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {


    public static void main(String[] args) throws IOException {
        List<Mail> listMail = MailListReader.read("C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata4\\email.txt");
        Histogram histogram = MailHistogramBuilder.build(listMail);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
    }
    
}
