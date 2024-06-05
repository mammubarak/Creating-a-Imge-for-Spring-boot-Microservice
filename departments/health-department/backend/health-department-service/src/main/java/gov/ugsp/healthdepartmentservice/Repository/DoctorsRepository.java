package gov.ugsp.healthdepartmentservice.Repository;

import gov.ugsp.healthdepartmentservice.Model.Doctor;
import org.springframework.data.repository.CrudRepository;


public interface DoctorsRepository extends CrudRepository <Doctor, Long> {

}
