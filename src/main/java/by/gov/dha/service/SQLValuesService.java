package by.gov.dha.service;

import by.gov.dha.document.Doc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface SQLValuesService {

    Map<String, List<String>> getSqlQueryFromDoc(Doc doc);

}
