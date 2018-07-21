package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class DBConnection {
//    private static final String SQURL2 = "jdbc:sqlite:magazin.sqlite"; // doesn't work only with full path

//    private static final String SQURL = "jdbc:sqlite:school.sqlite";// doesn't work only with full path

    private static final String USERNAME = "root";
    private static final String PASSWORD = "sveta";

    private static final String URL = "jdbc:mysql://localhost:3306/crud";



    private static final String str = "jdbc:sqlite:D:/HereAllWorkspaces/FromIntelliJ/GitProjects/school/src/magazin.sqlite";



    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("driver Ok ");
            return DriverManager.getConnection(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
