package ie.atu.JDBC;

public class Passenger {
    private String title;
    private String FirstName;
    private String LastName;

    public Passenger(String title, String FirstName, String LastName) {
        if(!title.equals("Mr") && !title.equals("Ms") && !title.equals("Mrs"))
        {
            throw new IllegalArgumentException("Invalid Passenger Title");
        }
        if(FirstName == null || FirstName.length() <3){
            throw new IllegalArgumentException("Invalid Passenger First Name length");
        }
        if(LastName == null || LastName.length() <3){
            throw new IllegalArgumentException("Invalid Passenger Last Name length");
        }
        this.title = title;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
