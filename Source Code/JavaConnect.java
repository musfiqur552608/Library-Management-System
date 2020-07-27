import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {

   
    Connection conn;
    
    public static Connection ConncerDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library?zeroDateTimeBehavior=convertToNull","root","");
            return conn;        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
    }
}
