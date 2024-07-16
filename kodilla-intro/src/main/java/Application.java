import com.kodilla.ApplicationUser;

public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        int height = 178;

        ApplicationUser applicationUser = new ApplicationUser(name, age, height);
        System.out.println(applicationUser.check());

    }
}