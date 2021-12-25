package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

public class MailListReaderBD {
    public static List<Mail> read(){
        List<Mail> mails = new ArrayList<Mail>();
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        String sql = "SELECT Mail FROM EMAIL";
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            String line;
            while (rs.next()) {
                line = rs.getString("Mail");
                if(line == null){
                    break;
                }
                if(line.contains("@")){
                    Mail mail = new Mail(line);
                    mails.add(mail);
                }
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
       


        
    
    return mails;
        
    }
    
}
