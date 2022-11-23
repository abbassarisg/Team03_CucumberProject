package api.util;

import java.io.IOException;

public class ObjectMapperUtil {

    private static org.codehaus.jackson.map.ObjectMapper mapper;

    static {

        mapper = new org.codehaus.jackson.map.ObjectMapper();
    }

    public static <T> T convertJsonToJava(String json, Class<T> cls) { //Generic Method

        T javaResult = null;

        try {

            javaResult = mapper.readValue(json, cls);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        return javaResult;
    }
}
