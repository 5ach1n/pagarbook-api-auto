package com.pagarbook.utils;

public enum ApiUrlMapper {

    CREATE_BUSINESS("https://pagarbook.com/api/v5/business"),
    GET_ALL_BUSINESS("https://pagarbook.com/api/v5/business");

    private final String URLPath;

    ApiUrlMapper(String s) {
        this.URLPath = s;
    }

    public String getURLPath(String... args) {
        String result = String.format(this.URLPath, args);
        return result;
    }
}
