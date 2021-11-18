
package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kata4.model.Mail;


public class MailListReader {
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException{
        List<Mail> mails = new ArrayList<Mail>();
        
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
           
            String line ;
            while (true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                if(line.contains("@")){
                    Mail mail = new Mail(line);
                    mails.add(mail);
                }
                
                
            }
            
        
        
       
       
        
        return mails;
    
    
    
    }

    
    
    
}
