package action.business;

import action.BaseApiAction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pagarbook.pojo.business.Business;
import com.pagarbook.pojo.business.BusinessPojo;
import com.pagarbook.utils.ApiUrlMapper;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class BusinessApiAction extends BaseApiAction {
    Response response;

    public void createBusiness(String body) {
        response = given().log().all()
                .header("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwaG9uZSI6Ijc0ODM3MTQwNTkiLCJhdXRodXNlcmlkIjo3NTAzMjI5LCJzb3VyY2UiOiJ3ZWJhcHAiLCJpYXQiOjE2MDgzOTEzMzAsImV4cCI6MTYzOTkyNzMzMCwiaXNzIjoiaHR0cHM6Ly9wYWdhcmJvb2suY29tIn0.mcT8APR5ZZBOKA6sz48Xaz5-w2pP8mjTEF3e0KD2Xn8")
                .contentType("application/json;charset=UTF-8")
                .body(body)
                .when().log().all().post(ApiUrlMapper.CREATE_BUSINESS.getURLPath());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void getAllBusiness() {
        response = given().log().all()
                .header("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwaG9uZSI6Ijc0ODM3MTQwNTkiLCJhdXRodXNlcmlkIjo3NTAzMjI5LCJzb3VyY2UiOiJ3ZWJhcHAiLCJpYXQiOjE2MDgzOTEzMzAsImV4cCI6MTYzOTkyNzMzMCwiaXNzIjoiaHR0cHM6Ly9wYWdhcmJvb2suY29tIn0.mcT8APR5ZZBOKA6sz48Xaz5-w2pP8mjTEF3e0KD2Xn8")
                .when().log().all().get(ApiUrlMapper.GET_ALL_BUSINESS.getURLPath());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void verifyBusinessCreation(String businessName) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        getAllBusiness();
        BusinessPojo businessPojo = mapper.readValue(response.getBody().asString(), BusinessPojo.class);
        List<Business> allBusinesses = businessPojo.getData().getBusinesses();
        List<String> allBusinessNames = new ArrayList<>();
        allBusinesses.stream().forEach(business -> {
            allBusinessNames.add(business.getBusinessName());
        });
        Assert.assertTrue(allBusinessNames.contains(businessName), "Business is not created, please check!!!!");
    }
}
