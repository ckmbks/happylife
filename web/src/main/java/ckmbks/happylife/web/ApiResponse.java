package ckmbks.happylife.web;

import lombok.Data;

@Data
public class ApiResponse {

    public ApiResponse() {
    }

    public ApiResponse(Exception e) {
        setIsSuccess(false);
        setErrorMessage(e.getMessage());
    }

    private String ErrorMessage;

    private Object Data;

    private boolean IsSuccess = true;

}
