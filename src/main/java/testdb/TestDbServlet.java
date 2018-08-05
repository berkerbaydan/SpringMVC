package testdb;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {

    public static void main(String []args) {

        //setup connection variables
        String username="springstudent";
        String pass="springstudent";

        String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String driver="com.mysql.jdbc.Driver";

        //get connection to database
        try {
            System.out.println("Connecting to databse "+jdbcUrl);
            //Class.forName(driver);
            Connection myConn=DriverManager.getConnection(jdbcUrl,username,pass);
            System.out.println("SUCCESS");
            myConn.close();
        }
        catch (Exception exc){
            exc.printStackTrace();

        }


    }

}
