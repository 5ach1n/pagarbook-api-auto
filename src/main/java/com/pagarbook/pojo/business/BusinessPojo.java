package com.pagarbook.pojo.business;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessPojo {
    @JsonProperty("success")
    public boolean getSuccess() {
		 return this.success; }
    public void setSuccess(boolean success) {
		 this.success = success; }
    boolean success;
    @JsonProperty("refreshToken")
    public Object getRefreshToken() {
		 return this.refreshToken; }
    public void setRefreshToken(Object refreshToken) {
		 this.refreshToken = refreshToken; }
    Object refreshToken;
    @JsonProperty("data")
    public Data getData() {
		 return this.data; }
    public void setData(Data data) {
		 this.data = data; }
    Data data;
}
