package test_data;

import java.util.HashMap;
import java.util.Map;

public class RegresTestData {

    public Map<String, String> expectedDataMethod(String name, String job){
        Map<String, String> regresdataMap = new HashMap<>();
        regresdataMap.put("name",name);
        regresdataMap.put("job",job);
        return regresdataMap;
    }


}
