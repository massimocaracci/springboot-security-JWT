package com.pantasoft.springsecurityjwt.models;

public class AuthenticationResponse {

    String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
