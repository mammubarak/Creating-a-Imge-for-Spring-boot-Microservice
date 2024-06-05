package gov.ugsp.healthdepartmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "gov.ugsp.healthdepartmentservice")
public class HealthDepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthDepartmentServiceApplication.class, args);
    }

}
