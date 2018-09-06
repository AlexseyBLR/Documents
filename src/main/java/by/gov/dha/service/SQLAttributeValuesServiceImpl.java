package by.gov.dha.service;

import by.gov.dha.dao.SQLAttributeValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SQLAttributeValuesServiceImpl implements SQLAttributeValuesService {

    @Autowired
    private SQLAttributeValues SQLAttributeValues;

    @Override
    public List<String> getAttributeValues(String sqlQuery) throws SQLException {
        return SQLAttributeValues.getArgumentList(sqlQuery);
    }
}
