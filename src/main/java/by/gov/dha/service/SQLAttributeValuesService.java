package by.gov.dha.service;

import java.sql.SQLException;
import java.util.List;

public interface SQLAttributeValuesService {

    List<String> getAttributeValues(String sqlQuery) throws SQLException;

}
