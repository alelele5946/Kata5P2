
package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;


public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> listMail){
        Histogram<String> histogram = new Histogram<String>();
        for (Mail mail : listMail) {
            String domain = mail.getDomain();
            histogram.increment(domain);
            
            
        }
        return histogram;

        
    }
    
}
