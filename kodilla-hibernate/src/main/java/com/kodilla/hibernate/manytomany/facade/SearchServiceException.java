package com.kodilla.hibernate.manytomany.facade;

public class SearchServiceException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "No such employee name found";
    public static String ERR_COMPANY_NOT_FOUND = "No such company name found";

    public SearchServiceException(String message) {
        super(message);
    }
}
