package by.gov.dha.dao;

import by.gov.dha.dao.properties.JDBCProperties;
import by.gov.dha.document.Doc;
import by.gov.dha.document.SqlQuery;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.*;

@Repository
public class SqlValuesImpl implements SqlValues {


    private final static String PROPERTY_NAME = "DataBaseProperties";
    private final static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(PROPERTY_NAME);

    private static final String DB_URL = RESOURCE_BUNDLE.getString(JDBCProperties.DB_CONNECTION.name());
    private static final String DB_DRIVER = RESOURCE_BUNDLE.getString(JDBCProperties.DB_DRIVER.name());
    private static final String DB_USER = RESOURCE_BUNDLE.getString(JDBCProperties.DB_USER.name());
    private static final String DB_PASSWORD = RESOURCE_BUNDLE.getString(JDBCProperties.DB_PASSWORD.name());

    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_DETAIL = "NAME";


    public Map<String, List<String>> getSqlQueryFromDoc(Doc doc) {
        Map<String, List<String>> sqlValuesMap = new HashMap<>();
        for (SqlQuery sqlQuery : doc.getDocSql().getSqlQuery()) {
            try {
                sqlValuesMap.put(sqlQuery.getSqlKey(), getArgumentList(sqlQuery.getSqlQuery()));
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getErrorCode());
            }
        }
        return sqlValuesMap;
    }

    private List<String> getArgumentList(String sqlQuery) throws SQLException {

        List<String> resultList = new ArrayList<>();

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        try {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(sqlQuery);

            ResultSet set = preparedStatement.executeQuery();
            while (set.next()) {
                resultList.add(set.getString(COLUMN_DETAIL));
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

    private Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;

    }

}
