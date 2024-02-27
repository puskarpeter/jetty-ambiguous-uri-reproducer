package jetty12;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class Jetty12Controller {

    @GET
    @Path("/{id:.+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String demo(@PathParam("id") String id) {
        return id;
    }
}
