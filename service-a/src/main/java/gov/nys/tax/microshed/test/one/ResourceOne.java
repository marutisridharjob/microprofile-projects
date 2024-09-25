import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greet")
public class ResourceOne {

    @Inject
    MyService myService;

    @GET
    @Path("{name}")
    public String greet(@PathParam("name") String name) {
        return myService.greet(name);
    }
}