package stepdefinitions.jdbcStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

public class US_005_StepDefinitions {

    /**
     * name = Medunna
     * host = medunna.com
     * Database = medunna_db
     * username = medunna_user
     * password = medunna_pass_987
     */

    @Given("kullanici medunna DataBase kismina baglanir")
    public void kullaniciMedunnaDataBaseKisminaBaglanir() {

        DatabaseUtility.createConnection();

        String query = "select * from patient";
        System.out.println(DatabaseUtility.getColumnNames(query) + "\n");

        String query1 = "select * from patient where id = 309193";
        System.out.println("309193 id'li data : " +DatabaseUtility.getRowList(query1) + "\n");
    }

    @When("kullanici DataBase kismindan kaydedilen hastanin bilgilerini alir ve DataBase ile dogrular")
    public void kullaniciDataBaseKismindanKaydedilenHastaninBilgileriniAlirVeDataBaseIleDogrular() {

        Map<String, Object> expectedData = new HashMap<String, Object>();

        expectedData.put("first_name", "Adem");
        expectedData.put("last_name", "Bakırcı");
        expectedData.put("email", "adembakirci124@gmail.com");
        expectedData.put("phone", "1249847820");

        System.out.println("Expected Data : " +expectedData);

        String query2 = "select * from patient where id = 309193";
        Map<String, Object> actualData = new HashMap<String, Object>(DatabaseUtility.getRowMap(query2));

        System.out.println("Actual Data : " +actualData);

        Assert.assertEquals(expectedData.get("first_name"), actualData.get("first_name"));
        Assert.assertEquals(expectedData.get("last_name"), actualData.get("last_name"));
        Assert.assertEquals(expectedData.get("email"), actualData.get("email"));
        Assert.assertEquals(expectedData.get("phone"), actualData.get("phone"));

        DatabaseUtility.closeConnection();
    }
}
