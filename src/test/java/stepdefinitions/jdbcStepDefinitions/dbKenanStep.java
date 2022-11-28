package stepdefinitions.jdbcStepDefinitions;

import api.pojos.Kenan007Pojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import utilities.DatabaseUtility;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertTrue;
import static utilities.DatabaseUtility.getColumnData;


public class dbKenanStep {

    List<Object> actualData;

    @Given(":Veri tabanına baglan")
    public void veriTabanınaBaglan() {

        DatabaseUtility.createConnection();

    }
    @And(": Tum verileri ceker")
    public void tumVerileriCeker(String query,String columnName) {
        actualData=getColumnData(query,columnName);
    }

    @Then(": Hastanın randevuları doğrula")
    public void hastanınRandevularıDoğrula() {

        String query = "select * from patient";
        System.out.println(DatabaseUtility.getColumnNames(query) + "\n");

        System.out.println("=== ID HASTA LIST ===");
        List<Object> idHastaList = getColumnData(query, "id");
        System.out.println(idHastaList + " ");
        String fileHastaList = "src/test/resources/DataList/fileHastaList.txt";
/*
        //WriteToTxt.savePatient(fileHastaList,idHastaList);

        String query1 = "select * from public.appointment where id=310169";
        System.out.println("310169 id li data: " + DatabaseUtility.getRowList(query1) + "\n");


        Map<String, Object> actualMap = new HashMap<String, Object>(DatabaseUtility.getRowMap(query1));
        System.out.println("actualMap = " + actualMap);

        Kenan007Pojo mapObj = new Kenan007Pojo();
        Map<String, Object> expectedData = mapObj.expectedMap(310169, 21.11.2022 00:00:00,
                "21.11.2022 01:00:00", "UNAPPROVED", null, null,
                null, null, null,
                "2022-11-18 14:00:11.403182", null, 302429, "hasan_hasta",
                "hasan_hasta", "2022-11-18 14:00:11.403182");
        System.out.println("expectedData = " + expectedData);
    }
    */

assertTrue(actualData.contains("310169"));

    }


}
