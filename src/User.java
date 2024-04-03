public class User {
    private String surname;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public User(String[] userData) {
        this.surname = userData[0];
        this.firstName = userData[1];
        this.lastName = userData[2];
        this.dateOfBirth = userData[3];
        this.phoneNumber = userData[4];
        this.gender = userData[5];
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",surname, firstName, lastName, dateOfBirth, phoneNumber, gender);
    }
}
