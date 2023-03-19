import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    NamesChecker namesChecker = new NamesChecker();

    @AfterEach
    void afterEach() {
        namesChecker = new NamesChecker();
    }

    @Test
    void maxNameChecker() {
        String name1 = "Anna";
        String name2 = "Alexandra";
        String name3 = "Vasiliy";
        String maxName = namesChecker.maxName(name2);
        maxName = namesChecker.maxName(name3);
        maxName = namesChecker.maxName(name1);
        Assertions.assertTrue(maxName == name2);
    }

    @Test
    void isUpperCase() {
        String name = "olga";
        String maxName = namesChecker.maxName(name);
        Assertions.assertNull(maxName);
    }

    @Test
    void oneName() {
        String name = "Petrov Vladimir Sergeevich";
        String maxName = namesChecker.maxName(name);
        Assertions.assertNull(maxName);
    }
}