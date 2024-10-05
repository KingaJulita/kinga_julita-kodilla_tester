import static org.junit.jupiter.api.Assertions.*;
import com.kodilla.ApplicationUserTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ApplicationTest {

    @Test
    public void runTests() {
        ApplicationUserTest userTest = new ApplicationUserTest();

        userTest.testUserIsOlderAndTaller();
        userTest.testUserIsYoungerOrShorter();
        userTest.testUserIsOlderButShorter();
        userTest.testUserIsYoungerButTaller();
    }
}
