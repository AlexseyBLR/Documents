package by.gov.dha.document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleTableValues {

    List<Map<Integer, String>> mapList = new ArrayList<>();


    public List<Map<Integer, String>> getSimpleTableData(SimpleTable simpleTable) throws Exception {
        try {
            for (Row row: simpleTable.getTableData().getRow()) {
                Map<Integer, String> valueMap = new HashMap<>();
                for (Field field : row.getField()) {
                    valueMap.put(field.getNum(), field.getValue());
                }
                mapList.add(valueMap);
            }
            return mapList;
        }catch (Exception e){

        }
        return null;
    }

}
