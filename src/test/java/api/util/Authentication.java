package api.util;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {

        String guncelToken = generateToken();

        System.out.println("Guncel Token : " +guncelToken);
    }

    public static String generateToken() {

        String username = "Batch81";
        String password = "Batch81+";

        Map <String, Object> postBody = new HashMap<>();
        postBody.put("username", username);
        postBody.put("password", password);
        postBody.put("rememberme", "true");

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response1 = given().contentType(ContentType.JSON).body(postBody).when().post(endPoint);

        JsonPath token = response1.jsonPath();

        return token.getString("id_token");
    }
}