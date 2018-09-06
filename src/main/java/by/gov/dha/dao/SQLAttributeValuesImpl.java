package by.gov.dha.dao;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SQLAttributeValuesImpl implements SQLAttributeValues {


    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@//10.0.0.202:1521/conf";
    private static final String DB_USER = "KONF";
    private static final String DB_PASSWORD = "KONF";

    private static final String ID_ROW = "ID_ROW";


    public List<String> getArgumentList(String sqlQuery) throws SQLException {

        List<String> resultList = new ArrayList<>();

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        try {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(sqlQuery);

            ResultSet set = preparedStatement.executeQuery();
            while (set.next()){
                resultList.add(set.getString(ID_ROW));
            }
            return resultList;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
        return null;
    }

    public Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;

    }

}
