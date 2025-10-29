package com.telcomate.TelcoMate.Model.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ResponseDTO {

    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTimestamp;

    public ResponseDTO(String apiPath, HttpStatus errorCode, String errorMessage,LocalDateTime errorTimestamp) {
        this.apiPath = apiPath;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTimestamp=errorTimestamp;
    }
}
