package employee.management.system;

import java.sql.*;//conection packaage of sql

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {//( my sql is an external entity so that there is chane for error i.e expection handling)
            Class.forName("com.mysql.cj.jdbc.Driver");//for name  = static method  in bracket mysql driver
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "karanshar");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
