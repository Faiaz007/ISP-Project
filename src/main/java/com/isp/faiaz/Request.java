package com.isp.faiaz;

public class Request {
    private String token;
    private String status;

    // Constructor to initialize a request with a token and status
    public Request(String token, String status) {
        this.token = token;
        this.status = status;
    }

    // Static method to simulate fetching a request by token
    public static Request getInstance(String token) {
        // Simulated data for requests
        if (token.equals("12345")) {
            return new Request(token, "In Progress");
        } else if (token.equals("67890")) {
            return new Request(token, "Resolved");
        } else {
            return null;  // Return null if the token is invalid
        }
    }

    // Getters and setters for token and status
    public String getToken() {
        return token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
