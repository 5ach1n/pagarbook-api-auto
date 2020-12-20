package stepDefs.business;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pagarbook.utils.JSONUtilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.joda.time.DateTime;
import org.json.simple.JSONObject;
import stepDefs.AbstractStepDefs;


public class BusinessStepDefs extends AbstractStepDefs {
    String businessName = "New Business" + DateTime.now();

    @Given("^I create a business$")
    public void iCreateABusiness() {
        JSONObject businessObject = JSONUtilities.getJSONFileObject("./staticTestData/businessCreationPayload.json");
        businessObject.put("businessName", businessName);
        businessApiAction.createBusiness(businessObject.toString());
    }

    @Then("^Business should be created successfully$")
    public void businessShouldBeCreatedSuccessfully() throws JsonProcessingException {
        businessApiAction.verifyBusinessCreation(businessName);
    }
}
