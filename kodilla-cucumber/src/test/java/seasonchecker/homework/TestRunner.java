package seasonchecker.homework;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("seasonchecker/homework/simple_number_game.feature")
public class TestRunner {
}
