package stepDefs;

import action.business.BusinessApiAction;

public class AbstractStepDefs {
    public static BusinessApiAction businessApiAction;

    static {
        businessApiAction = new BusinessApiAction();
    }
}
