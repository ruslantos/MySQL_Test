import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {


    Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
    DriverManager.registerDriver(driver);
    StringBuilder url = new StringBuilder();
    url.
            append("jdbc:mysql://").
            append("localhost:").
            append("3306/").
            append("new_schema?").
            append("user=root&").
            append("password=363911");
    Connection connection = DriverManager.getConnection(url.toString() );
    }
}