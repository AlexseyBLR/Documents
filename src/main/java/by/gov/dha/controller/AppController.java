package by.gov.dha.controller;


import by.gov.dha.document.Doc;
import by.gov.dha.document.SimpleTableValues;
import by.gov.dha.service.DocService;
import by.gov.dha.service.FindSQLAttribute;
import by.gov.dha.service.SQLAttributeValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class AppController {

    @Autowired
    private DocService docService;

    @Autowired
    private SQLAttributeValuesService sqlAttributeValuesService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String goToTest(ModelMap modelMap) throws Exception {
        modelMap.addAttribute("document", docService.getDoc());

        modelMap.addAttribute("docWasteList", new SimpleTableValues().getSimpleTableData(docService.getDoc().getDocWaste()));
        modelMap.addAttribute("docAssetsList", new SimpleTableValues().getSimpleTableData(docService.getDoc().getDocAssets()));
        modelMap.addAttribute("docServicesList", new SimpleTableValues().getSimpleTableData(docService.getDoc().getDocServices()));

        modelMap.addAttribute("emptyDocument", new Doc());

        Map<String, List<String>> values = new HashMap<>();
        List<String> dbdList = sqlAttributeValuesService.getAttributeValues("select * from DOC_BANK_DETAILS");
        values.put("select * from DBD", dbdList);


        modelMap.addAttribute("testMap", values);


        return "MAIN";
    }



}
