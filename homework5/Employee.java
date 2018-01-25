package homework5;

public  abstract  class Employee {

    public abstract  double earning();

    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee(String fName, String lName, String sNumber){
        firstName = fName;
        lastName = lName;
        socialSecurityNumber = sNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "FirstName:"+firstName+"\n"+"LastName:"+lastName+"\n"+"SocialNumber:"+socialSecurityNumber+"\n";
    }
}
