import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;


public User() {
        username = "";
        password = "";

 
    
    }

public User (String firstName, String lastName, String phone, String address, String city, 
        String state, String zipCode, String email ){
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.phone = phone;
    this.state = state;
    this.zipCode = zipCode;
    this.email = email;
    this.username = lastName + this.zipCode;
    this.password = "welcome1";
}
public User(String username, String password) {
    this.username = username;
    this.password = password;
} 


public String getusername() {
    return username;
}

public void setFirstName ( String firstName) {
    this.firstName = firstName;
}

public String getFirstName () {
    return firstName;
}

public void setLastName ( String lastName) {
    this.lastName = lastName;
}

public String getLastName () {
    return lastName;
}

public void setAddress ( String address) {
    this.address = address;
}

public String getAddress () {
    return address;
    
}

public void Phone ( String phone) {
    this.phone = phone;
}

public String getPhone () {
    return phone;
}

public void setCity ( String city) {
    this.city = city;
}

public String getCity () {
    return city;
}

public void setState ( String state) {
    this.firstName = state;
}

public String getState () {
    return state;
}

public void setZipCode ( String zipCode) {
    this.zipCode = zipCode;
}

public String getZipCode () {
    return zipCode;
}

public void setEmail ( String email) {
    this.email = email;
}

public String getEmail () {
    return email;
}
public void setusername(String username) {
    this.username = username;
}

public String getpassword() {
    return password;
}

public void setpassword(String password) {
    this.username = password;
}


}

