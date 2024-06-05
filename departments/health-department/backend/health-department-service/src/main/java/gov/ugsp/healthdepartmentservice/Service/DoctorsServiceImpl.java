package gov.ugsp.healthdepartmentservice.Service;

import gov.ugsp.healthdepartmentservice.Model.Doctor;
import gov.ugsp.healthdepartmentservice.Repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsServiceImpl implements DoctorsService {

    //repo part

    @Autowired
    private DoctorsRepository doctorsRepository;


    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorsRepository.save(doctor);
    }

    @Override
    public Doctor getDoctorById(long id) {
        return doctorsRepository.findById(id).get();
    }

    @Override
    public List<Doctor> getDoctor() {
        return (List<Doctor>) doctorsRepository.findAll();
    }

    @Override
    public void deleteDoctor(long id) {
        doctorsRepository.deleteById(id);

    }

    @Override
    public Doctor updateDoctor(long id, Doctor doctor) {
        return doctorsRepository.save(doctor);
    }
}
