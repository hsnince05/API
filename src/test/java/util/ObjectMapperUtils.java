package util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {

    //<T> T --> Herhangi bir data tipidir.
    //ObjectMapper().readValue(json, cls) ->metodu birinci parametrede aldigi String formatindaki Json data'yi ikinci
    //                                      parametrede belirtilen Java objesine cevirir.
    public static <T> T convertJsonToJava(String json, Class<T> cls){//Generic Method


        try {
            return new ObjectMapper().readValue(json,cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}