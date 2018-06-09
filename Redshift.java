import java.sql.Connection;
import java.sql.DriverManager;

public class Redshift {
	   public static void main(String args[]) {
	      Connection c = null;
	      try {
	         Class.forName("com.amazon.redshift.jdbc4.Driver");
	         c = DriverManager
	            .getConnection("jdbc:redshift://immersion-project.cziozxqpyojq.us-west-2.redshift.amazonaws.com:5439/immersion",
	            "immersion", "Immersion!2016");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
}