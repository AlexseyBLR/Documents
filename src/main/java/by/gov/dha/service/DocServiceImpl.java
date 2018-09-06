package by.gov.dha.service;

import by.gov.dha.dao.DocDAO;
import by.gov.dha.document.Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocServiceImpl implements DocService {

    @Autowired
    private DocDAO docDAO;

    @Override
    public Doc getDoc() {
        return docDAO.getDoc();
    }
}
