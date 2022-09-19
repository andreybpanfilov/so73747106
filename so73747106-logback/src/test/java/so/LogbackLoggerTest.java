package so;

public class LogbackLoggerTest {

    public void testLogger() throws Exception {
        assert Class.forName("ch.qos.logback.classic.Logger") != null;
    }

}
