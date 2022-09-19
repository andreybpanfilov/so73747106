package so;

public class SimpleLoggerTest {

    public void testLogger() throws Exception {
        assert Class.forName("org.slf4j.simple.SimpleLogger") != null;
    }

}
