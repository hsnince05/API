package test_data;

import java.util.HashMap;
import java.util.Map;

public class SwaggerPetstoreTestData {

    public Map<String, Object> expectedDataMethod(Integer id, String username,String firstname,String  lastname,String email,String password,String phone, Integer userStatus){
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("id",id);
        expectedData.put("username",username);
        expectedData.put("firstname",firstname);
        expectedData.put("lastname",lastname);
        expectedData.put("password",password);
        expectedData.put("phone",phone);
        expectedData.put("userStatus",userStatus);

        return expectedData;
    }


}
