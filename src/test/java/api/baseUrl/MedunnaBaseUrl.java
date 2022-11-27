package api.baseUrl;

import api.util.Authentication;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl extends Authentication {

    protected RequestSpecification spec;

    @Before
    public void setUp() {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
    }
}
