package Student;


import Data.StudentData;
import School.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {
    private String username;
    private String password;
    private LinkedHashMap<String, Integer> classNameAndScore = new LinkedHashMap<>();

    /*
     This class is child of the SchoolLocation

     Create 3 private instance variables

     String username and password

     Linked hash map key is String value is Integer name is classNameAndScore

      */
    public StudentClass(String username, String password,String location) {
        super(location);
        setUsernameAndPassword(username,password);
    }
     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation

        Call the setUsernameAndPassword method in the constructor

     */

    void setUsernameAndPassword(String username, String password) {
        StudentData data = new StudentData();
        LinkedHashMap<String, String> dataSet = new LinkedHashMap<>(data.AddUserNameAndPassword());

        if (dataSet.containsKey(username) && dataSet.containsValue(password)){
            this.username=username;
            this.password=password;
        } else {
            throw new RuntimeException("Not able to find a username and password. Please sign up to website");
        }
    }
    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type

    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it
    (create a new LinkedHashMap and make it equal to AddUserNameAndPassword from the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password
    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"
     */

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

/*
        create a set method for the classNameAndScore
     */

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }
/*
        create a get method for the classNameAndScore
     */

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Price='" + getPrice() + '\'' +
                ", schoolLocation='" + getLocation() + '\'' +
                ", classNameAndScore=" + classNameAndScore +
                '}';
    }

/*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */


}
