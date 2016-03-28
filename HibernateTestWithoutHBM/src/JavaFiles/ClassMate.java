package JavaFiles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="classMate")
@Table(name="classMates")
public class ClassMate {
	
	@Id 
	private int id;
	
	@Column(name="birth_year")
	private int birthYear;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="mobile")
	private String mobile;
	
	public ClassMate(){};
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public int getBirthYear() {return birthYear;}
	public void setBirthYear(int birthYear) {this.birthYear = birthYear;}

	public String getMobile() {return mobile;}
	public void setMobile(String mobile) {this.mobile = mobile;}

	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}

	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}

	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;}
}
