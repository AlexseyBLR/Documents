package by.gov.dha.service;

import by.gov.dha.document.Attr;
import by.gov.dha.document.Doc;
import by.gov.dha.document.DocAttr;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSQLAttribute {


    @Autowired
    private DocService docService;

    private void test(){
        docAttrTest(docService.getDoc().getDocAttr());
    }


    public static void main(String[] args) {
        new FindSQLAttribute().test();
    }

    private void docAttrTest(DocAttr docAttr){
        for (Attr attr : docAttr.getAttr()) {
            if(attr.getAttr() == null){
                System.out.println(attr.getSql());
            }
            if(attr.getAttr() != null){

            }
        }
    }

    private void attrTest(Attr attr){
        for (Attr attrAttr : attr.getAttr()) {
            if(attrAttr == null){
                System.out.println(attrAttr.getSql());
            }
            if(attrAttr != null){
                attrTest(attrAttr);
            }
        }
    }


}
