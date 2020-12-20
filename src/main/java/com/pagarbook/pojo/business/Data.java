package com.pagarbook.pojo.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pagarbook.pojo.business.Business;

import java.util.List;

public class Data{
    @JsonProperty("businesses")
    public List<Business> getBusinesses() {
		 return this.businesses; }
    public void setBusinesses(List<Business> businesses) {
		 this.businesses = businesses; }
    List<Business> businesses;
}
