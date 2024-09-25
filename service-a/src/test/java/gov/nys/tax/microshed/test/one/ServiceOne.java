
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceOne {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
