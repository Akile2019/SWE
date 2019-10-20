package eTalentManagerWebApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Athlete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long athleteId;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "SSN")
	private String ssn;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "FULLNAME")
	private String fullName;
	
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	
	@Column(name = "EMAILADDRESS")
	private String emailAddress;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "DATEOFBIRTH")
	@DateTimeFormat(pattern = "yyyy-MM-dd")// left the nullable false due to error from the sql
	private LocalDate dateOfBirth;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "DATEOFREGISTRATION")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfRegistration;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "TOTALNUMBEROFMEDAL")
	private int totalNumberOfMedal;
	
	@NotNull(message = "Field can not be null")
	@Column(name = "MONTHLYSALARY")
	private double monthlySalary;

	public Athlete() {
		
	}

	public Athlete(String ssn, String fullName, String phoneNumber, String emailAddress, LocalDate dateOfBirth,
			LocalDate dateOfRegistration, int totalNumberOfMedal, double monthlySalary) {
		super();
		this.ssn = ssn;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
		this.dateOfRegistration = dateOfRegistration;
		this.totalNumberOfMedal = totalNumberOfMedal;
		this.monthlySalary = monthlySalary;
	}

	public Long getAthleteId() {
		return athleteId;
	}

	public void setAthleteId(Long athleteId) {
		this.athleteId = athleteId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public int getTotalNumberOfMedal() {
		return totalNumberOfMedal;
	}

	public void setTotalNumberOfMedal(int totalNumberOfMedal) {
		this.totalNumberOfMedal = totalNumberOfMedal;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
		

}
