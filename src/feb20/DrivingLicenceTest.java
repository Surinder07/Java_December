package feb20;

public class DrivingLicenceTest {
    public static void main(String[] args) {
        int age = 10;

        if(age < 18 ){
            throw new InvalidAgeException("Age criteria does not meet");
        }

    }
}
