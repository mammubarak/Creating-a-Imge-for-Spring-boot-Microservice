package gov.ugsp.healthdepartmentservice.Service;

import gov.ugsp.healthdepartmentservice.Model.Doctor;


import java.util.List;


public interface DoctorsService {

     Doctor addDoctor(Doctor doctor);

     Doctor getDoctorById(long id);

     List<Doctor> getDoctor();

     void deleteDoctor(long id);

     Doctor updateDoctor(long id, Doctor doctor);


}
