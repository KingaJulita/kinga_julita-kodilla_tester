import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testAverageAge() {
        User[] users = {
                new User("Ewelina", 29),
                new User("Michał", 27),
                new User("Barbara", 52),
                new User("Irena", 80),
                new User("Konrad", 28),
                new User("Stefan", 8)
        };

        double averageAge = User.averAge(users);
        assertEquals(37.33, averageAge, 0.01);
    }

    @Test
    public void testCheckUserBelowAverage() {
        User[] users = {
                new User("Ewelina", 29),
                new User("Michał", 27),
                new User("Barbara", 52),
                new User("Irena", 80),
                new User("Konrad", 28),
                new User("Stefan", 8)
        };

        String belowAverageUser = User.checkUser(users);
        assertEquals("Stefan", belowAverageUser);
    }
}
