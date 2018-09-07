package by.gov.dha.service;

import by.gov.dha.dao.SqlValues;
import by.gov.dha.document.Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SQLValuesServiceImpl implements SQLValuesService {

    @Autowired
    private SqlValues sqlValues;


    @Override
    public Map<String, List<String>> getSqlQueryFromDoc(Doc doc) {
        return sqlValues.getSqlQueryFromDoc(doc);
    }
}
