package by.gov.dha.dao;

import by.gov.dha.document.*;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Repository
public class DocDAOImpl implements DocDAO {
    public Doc getDoc() {
        Doc doc = new Doc();
        DocAttr docAttr = new DocAttr();
        DocDocs docDocs = new DocDocs();
        DocOrgs docOrgs = new DocOrgs();
        DocSign docSign = new DocSign();
        SimpleTable docWaste = new SimpleTable();
        SimpleTable docAssets = new SimpleTable();
        SimpleTable docServices = new SimpleTable();
        DocBankDetails docBankDetails = new DocBankDetails();
        Attr a = new Attr();
        docAttr.setAlignment("left");
        docAttr.setCode("code");
        docAttr.setEditable(1);
        docAttr.setFooter("footer");
        docAttr.setHeader("header");
        docAttr.setNum(1);
        docAttr.setPostfix("postfix");
        docAttr.setPrefix("prefix");
        docAttr.setRequired(1);
        docAttr.setTableRef("DOC");
        docAttr.setType("VBlock");
        docAttr.setVisible(1);
        docAttr.getAttr().add(a);
        doc.setDocAttr(docAttr);
        doc.setDocAssets(docAssets);
        doc.setDocDocs(docDocs);
        doc.setDocOrgs(docOrgs);
        doc.setDocSign(docSign);
        doc.setDocWaste(docWaste);
        doc.setDocAssets(docAssets);
        doc.setDocServices(docServices);
        doc.setDocBankDetails(docBankDetails);

        File xml = new File("D:\\AlexeyMeleschenya\\DocumentLoader\\src\\main\\resources\\test.xml");
        try {
            JAXBContext jaxbctx = JAXBContext.newInstance("by.gov.dha.document");
            Unmarshaller unm = jaxbctx.createUnmarshaller();
            doc = (Doc) unm.unmarshal(xml);
            return doc;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
