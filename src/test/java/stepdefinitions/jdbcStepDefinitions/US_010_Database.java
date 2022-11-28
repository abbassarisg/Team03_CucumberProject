package stepdefinitions.jdbcStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.getColumnData;


public class US_010_Database {
    Map<String,Object> actualData;
    Map<String,Object> expectedData;

    String query;
    @Given("Connect to database")
    public void connectToDatabase() {
        DatabaseUtility.createConnection();

    }

    @And("Get appointment information of all patients from the table")
    public void getAppointmentInformationOfAllPatientsFromTheTable() {
         query="select * from  appointment where id=306003";

         actualData=new HashMap<>(DatabaseUtility.getRowMap(query));
         expectedData=new HashMap<>(DatabaseUtility.getRowMap(query));

        System.out.println(actualData);
        System.out.println(expectedData);

        //System.out.println("id"+ getColumnData(query,"id"));
        //System.out.println("start_date"+ getColumnData(query,"start_date"));
        //System.out.println("end_date"+ getColumnData(query,"end_date"));
        //System.out.println("status"+ getColumnData(query,"status"));

    }

    @Then("The verify query result")
    public void theVerifyQueryResult() {
        assertEquals(expectedData,actualData);
       // assertEquals( (long)306003,getColumnData(query,"id").get(0));
       // assertEquals("2022-11-18 00:00:00",getColumnData(query,"start_date").get(0));
       // assertEquals("2022-11-18 01:00:00",getColumnData(query,"end_date").get(0));
       // assertEquals("PENDING",getColumnData(query,"status").get(0));
       // assertEquals("lokman",getColumnData(query,"last_name").get(0));

    }
}
