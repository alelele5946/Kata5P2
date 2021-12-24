
package kata5P2.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;
import kata5P2.view.MailListReaderBD;


public class Kata5P2 {


    public static void main(String[] args) throws IOException {
        List<Mail> listMail = MailListReaderBD.read();
        Histogram histogram = MailHistogramBuilder.build(listMail);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
    }
    
}
