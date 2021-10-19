package week7;

public class Person {
    String FirstName, LastName;
    int age;

    // instance
    // Method named getFirstName without any parameters, it needs to return the value of the firstName
    //field.
    public String getFirstName() {
        return FirstName;
    }

    //*Method named getLastName without any parameters, it needs to return the value of the lastName
    //field.
    public String getLastName() {
        return LastName;
    }

    //  Method named getAge without any parameters, it needs to return the value of the age field.
    public int getAge() {
        return age;
    }
    // *Method named setFirstName with one parameter of type String, it needs to set the value of the
    //firstName field.

    public void setFirstName(String fName) {
        this.FirstName = fName;
    }

    // Method named setLastName with one parameter of type String, it needs to set the value of the
    //lastName field.
    public void setLastName(String lName) {
        this.LastName = lName;
    }

    // Method named setAge with one parameter of type int, it needs to set the value of the age field. If
    //the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
    public void setAge(int a) {
       // int age = a;
        if ((age < 0)||(age > 100)) {
            age = 0;
        } else {
            age = a;
        }
    }
    // Method named isTeen without any parameters, it needs to return true if the value of the age field is
    //greater than 12 and less than 20, otherwise, return false.

    public boolean isTeen() {
        if (age > 12 && age < 20) {
           return true;
        } else{
            return false;
        }

    }
    /*Method named getFullName without any parameters, it needs to return the full name of the person.
            *In case both firstName and lastName fields are empty, Strings return an empty String.
 *In case firstName is an empty String, return firstName.
 *In case lastName is an empty String, return lastName.*/
      public String getFullName(){
        //  System.out.println("john smith");
          return FirstName+" "+LastName;
      }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}



