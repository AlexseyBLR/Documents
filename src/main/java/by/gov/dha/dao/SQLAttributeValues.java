package by.gov.dha.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface SQLAttributeValues {

    List<String> getArgumentList(String sqlQuery) throws SQLException;

    Connection getDBConnection();

}
