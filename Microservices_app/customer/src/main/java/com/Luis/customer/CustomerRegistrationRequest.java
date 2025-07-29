package com.Luis.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
