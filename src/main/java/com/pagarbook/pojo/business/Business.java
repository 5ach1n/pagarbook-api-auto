package com.pagarbook.pojo.business;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Business{
    @JsonProperty("id")
    public int getId() {
		 return this.id; }
    public void setId(int id) {
		 this.id = id; }
    int id;
    @JsonProperty("createdAt")
    public Date getCreatedAt() {
		 return this.createdAt; }
    public void setCreatedAt(Date createdAt) {
		 this.createdAt = createdAt; }
    Date createdAt;
    @JsonProperty("updatedAt")
    public Date getUpdatedAt() {
		 return this.updatedAt; }
    public void setUpdatedAt(Date updatedAt) {
		 this.updatedAt = updatedAt; }
    Date updatedAt;
    @JsonProperty("businessName")
    public String getBusinessName() {
		 return this.businessName; }
    public void setBusinessName(String businessName) {
		 this.businessName = businessName; }
    String businessName;
    @JsonProperty("authUserId")
    public int getAuthUserId() {
		 return this.authUserId; }
    public void setAuthUserId(int authUserId) {
		 this.authUserId = authUserId; }
    int authUserId;
    @JsonProperty("workHours")
    public int getWorkHours() {
		 return this.workHours; }
    public void setWorkHours(int workHours) {
		 this.workHours = workHours; }
    int workHours;
    @JsonProperty("shiftMinutes")
    public int getShiftMinutes() {
		 return this.shiftMinutes; }
    public void setShiftMinutes(int shiftMinutes) {
		 this.shiftMinutes = shiftMinutes; }
    int shiftMinutes;
    @JsonProperty("monthSize")
    public String getMonthSize() {
		 return this.monthSize; }
    public void setMonthSize(String monthSize) {
		 this.monthSize = monthSize; }
    String monthSize;
    @JsonProperty("weeklyHolidays")
    public Object getWeeklyHolidays() {
		 return this.weeklyHolidays; }
    public void setWeeklyHolidays(Object weeklyHolidays) {
		 this.weeklyHolidays = weeklyHolidays; }
    Object weeklyHolidays;
    @JsonProperty("employeeCount")
    public int getEmployeeCount() {
		 return this.employeeCount; }
    public void setEmployeeCount(int employeeCount) {
		 this.employeeCount = employeeCount; }
    int employeeCount;
}
