package com.chinafree.auth.model.enumeration;


public enum Column {


    LOGIN_MAIL("LOGIN_MAIL"),
    LOGIN_MOBILE("LOGIN_MOBILE");


    private String column;


    private Column(final String column){
        this.column=column;
    }


    public String getColumn() {
        return column;
    }

}
