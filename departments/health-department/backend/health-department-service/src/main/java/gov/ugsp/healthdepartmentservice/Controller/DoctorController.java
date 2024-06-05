package gov.ugsp.healthdepartmentservice.Controller;

import gov.ugsp.healthdepartmentservice.Model.Doctor;
//import gov.ugsp.healthdepartmentservice.Model.HealthRecord;
import gov.ugsp.healthdepartmentservice.Service.DoctorsService;
import gov.ugsp.healthdepartmentservice.Util.Constants.Constants;
import gov.ugsp.healthdepartmentservice.Util.Exception.CustomException;
import gov.ugsp.healthdepartmentservice.Util.Validation.CustomResponse;
import gov.ugsp.healthdepartmentservice.Util.Validation.RequestValidationUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
@CrossOrigin
public class DoctorController {
    //Lanka DocVault service

    @Autowired
    private DoctorsService doctorsService;

    @Autowired
    private CustomResponse customResponse;

    @Autowired
    private RequestValidationUtil validationUtil;
    //add doctors to the service

    @PostMapping("/doctor")
    public ResponseEntity<CustomResponse> addDoctor(@Valid @RequestBody Doctor doctor) {

        Doctor savedDoctor = doctorsService.addDoctor(doctor);
        customResponse = new CustomResponse(HttpStatus.CREATED.value(), Constants.RECORD_CREATED_SUCCESSFULLY, savedDoctor);
        return new ResponseEntity<>(customResponse, HttpStatus.CREATED);
    }

    // get doctors id

    @GetMapping("/doctor/{id}")
    public ResponseEntity<CustomResponse> getDoctorById(@PathVariable("id") long id) throws CustomException {


        validationUtil.validateId(id);
        Doctor doctor = doctorsService.getDoctorById(id);
        if (doctor != null) {
            customResponse = new CustomResponse(HttpStatus.OK.value(), Constants.RECORD_RETRIEVED_SUCCESSFULLY, doctor);
            return new ResponseEntity<>(customResponse, HttpStatus.OK);
        } else {
            customResponse = new CustomResponse(HttpStatus.NOT_FOUND.value(), Constants.RECORD_DOES_NOT_EXIST);
            return new ResponseEntity<>(customResponse, HttpStatus.NOT_FOUND);
        }

    }

    // get doctors
    @GetMapping("/doctors")
    public ResponseEntity<CustomResponse> getDoctor() {
        List<Doctor> doctorProfile = doctorsService.getDoctor();
        if (!doctorProfile.isEmpty()) {
            customResponse = new CustomResponse(HttpStatus.OK.value(), Constants.RECORD_RETRIEVED_SUCCESSFULLY, doctorProfile);
        } else {
            customResponse = new CustomResponse(HttpStatus.OK.value(), Constants.NO_RECORDS_IN_THE_DATABASE);
        }
        return new ResponseEntity<>(customResponse, HttpStatus.OK);
    }


    // update doctor details
    @PutMapping("/doctor/{id}")
    public ResponseEntity<CustomResponse> updateDoctor(@PathVariable long id, @Valid @RequestBody Doctor doctor) throws CustomException {
        validationUtil.validateId(id);
        Doctor updateDoctor = doctorsService.updateDoctor(id, doctor);
        if (updateDoctor != null) {
            customResponse = new CustomResponse(HttpStatus.OK.value(), Constants.RECORD_UPDATED_SUCCESSFULLY, updateDoctor);
            return new ResponseEntity<>(customResponse, HttpStatus.OK);
        } else {
            customResponse = new CustomResponse(HttpStatus.NOT_FOUND.value(), Constants.RECORD_DOES_NOT_EXIST);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    // delete doctor profiles from the system
    @DeleteMapping("/doctor/{id}")
    public ResponseEntity<CustomResponse> deleteDoctor(@PathVariable("id") long id) throws CustomException {
        validationUtil.validateId(id);
        Doctor existingDoctor = doctorsService.getDoctorById(id);
        if (existingDoctor != null) {
            doctorsService.deleteDoctor(id);
            customResponse = new CustomResponse(HttpStatus.OK.value(), Constants.RECORD_DELETED_SUCCESSFULLY);
            return new ResponseEntity<>(customResponse, HttpStatus.OK);
        } else {
            customResponse = new CustomResponse(HttpStatus.NOT_FOUND.value(), Constants.RECORD_DOES_NOT_EXIST);
            return new ResponseEntity<>(customResponse, HttpStatus.NOT_FOUND);
        }

    }



}
