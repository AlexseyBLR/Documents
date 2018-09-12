package by.gov.dha.dao;


import by.gov.dha.document.Doc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface SqlValues {

//    List<String> getArgumentList(String sqlQuery) throws SQLException;
//
//    Connection getDBConnection();

    Map<String, List<String>> getSqlQueryFromDoc(Doc doc);

}
