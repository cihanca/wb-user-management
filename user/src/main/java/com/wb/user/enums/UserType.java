package com.wb.user.enums;

public enum UserType {

    IT_ADMIN("IT_ADMIN", "IT ADMIN"),
    COMPANY_ADMIN("COMPANY_ADMIN", "COMPANY ADMIN"),
    SUPERVISOR("SUPERVISOR", "SUPERVISOR"),
    USER("USER", "USER");

    private String code;
    private String description;

    UserType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
