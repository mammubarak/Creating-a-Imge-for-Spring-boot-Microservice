package gov.ugsp.healthdepartmentservice.Util.Validation;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
//indicating that this annotation provides centralized exception handling for controllers in a Spring MVC application.
public class CustomResponse {
    private int statusCode;
    private String message;
    private Object details;

    public CustomResponse(int statusCode, String message, Object details) {
        this.statusCode = statusCode;
        this.message = message;
        this.details = details;
    }

    public CustomResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public CustomResponse() {

    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }
}