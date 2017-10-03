package Java_04_01_Hibernate_DBAppsIntro;

/**
 * Java DB Apps Intro Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{

    public static void main(String[] args)
    {
        /*
         * JDBC - Java Database Connection
         *
         *
         * JDBC is a standard Java API for database-independent
         * connectivity between the Java programming language and a wide range of
         * databases.
         *
         * The JDBC library includes APIs for each of the tasks mentioned below
         * that are commonly associated with database usage:
         *  - Making a connection to a database
         *  - Creating and executing SQL queries in the database
         *  - Viewing and modifying the resulting records.
         *
         *  JDBC Architecture
         *
         *  APP -> [JAVA.SQL.* DRIVER(JDBC)] -> RDBMS
         *
         *
         *  Driver specifics
         *
         *  JDBC Connection String
         *      - jdbc:<driver protocol>:<connection details>
         *  JDBC URL
         *      - MySQL -> jdbc:mysql://localhost
         *      - Oracle -> jdbc:oracle:thin:@localhost
         *      - SQL Server -> jdbc:sqlserver://localhost
         *      - PostgreSQL -> jdbc:postgresql://localhost
         */

        /*
         * The JDBC API provides the following interfaces and classes:
         *
         * DriverManager - This class manages a list of database drivers.
         * Driver - This interface handles the communications with the database server
         * Connection - The connection object represents communication context
         * Statement - Objects used to submit the SQL statements to the database
         * ResultSet - These objects hold data retrieved from a database
         * SQLException - This class handles any errors that occur in a database application.
         */

        /*
         * java.sql.*
         *
         * DriverManager -> Connection -> Statement -> ResultSet
         *
         *
         * Statements
         *
         * - Statement - Used for genral-purpose access to the database. The Statement inteface cannot accept
         * parameters.
         * - PreparedStatement - Used when SQL statements are used many times. The PreparedStatement interface
         * accepts input parameters at runtime.
         * - CallableStatement - Uses when database stored procedures are called. The CallableStatement interface
         * can also accept runtime input parameters.
         */

        /*
         * ResultSet
         *
         *
         * The SQL statements (SELECT) that read data from a database query, return the data in a reuslt set.
         * The java.sql.ResultSet interface represents the result set of a database query.
         * A ResultSet object maintains a cursor that points to the current row in the result set.
         */
    }

}



