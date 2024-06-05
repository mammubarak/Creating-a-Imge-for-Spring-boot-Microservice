package gov.ugsp.healthdepartmentservice.Model;

import gov.ugsp.healthdepartmentservice.Util.Constants.Constants;
import jakarta.persistence.*;
import org.yaml.snakeyaml.scanner.Constant;

import java.time.LocalDate;

@Entity
@Table(name = "Doctors_Table")

public class Doctor {


    @Id()
    @GeneratedValue (strategy = GenerationType.IDENTITY) //automated increment id number generation
    @Column(name = Constants.PROFILE_ID, nullable = false, unique = true)
    private long id;

    @Column(name = Constants.REGISTRATION_NUM, nullable = false)
    private String registrationNumber;


    @Column(name = Constants.NIC, nullable = false)
    private String nic;

    @Column(name = Constants.NAME, nullable = false)
    private String name;


    @Column(name = Constants.SPECIALIZATION, nullable = false)
    private String specialization;

    @Column(name = Constants.PHONE_NUMBER, nullable = false)
    private String phoneNumber;

    @Column(name = Constants.REGISTRATION_DATE, nullable = false)
    private LocalDate registrationDate;

    @Column(name = Constants.EXPIRY_DATE, nullable = false)
    private LocalDate expiryDate;

    @Column(name = Constants.EMAIL, nullable = false)
    private String email;

    @Column(name = Constants.PASSWORD, nullable = false)
    private String password;


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String regNum) {
        this.registrationNumber = regNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getpPhoneNumber() {
        return phoneNumber;
    }

    public void setpPhoneNumber(String pNo) {
        this.phoneNumber = pNo;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate regDate) {
        this.registrationDate = regDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expDate) {
        this.expiryDate = expDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
