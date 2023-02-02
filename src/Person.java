import java.time.Year;

public class Person {

    private String firstName;
    private String lastName;
    private String title;
    private String ID;
    private int yearOfBirth;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Person(String firstName, String lastName, String title, String ID, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.ID = ID;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public String toString()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + yearOfBirth;
    }



    public String getFullName ()
    {
        return firstName + " " + lastName;
    }
    public String getFormalName ()
    {
        return title + " " + firstName + " " + lastName;
    }
    public int getAge ()
    {
        return Integer.parseInt(Year.now().toString()) - yearOfBirth;
    }
    public int getAge (int year)
    {
        return year - yearOfBirth;
    }


}

