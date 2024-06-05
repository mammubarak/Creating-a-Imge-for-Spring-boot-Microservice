package gov.ugsp.healthdepartmentservice.Util.Validation;

import gov.ugsp.healthdepartmentservice.Util.Constants.Constants;
import gov.ugsp.healthdepartmentservice.Util.Exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component

//This annotation marks the class as a Spring component, allowing it to be automatically discovered and instantiated by the Spring container.
    public class RequestValidationUtil {
    public void validateId(long id) throws CustomException {
        if (id <= 0) {
            throw new CustomException(HttpStatus.BAD_REQUEST, Constants.REQUEST_ID_VALIDATION_MESSAGE);
        }
    }

}