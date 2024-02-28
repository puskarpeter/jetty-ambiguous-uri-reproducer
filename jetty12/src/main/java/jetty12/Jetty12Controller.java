package jetty12;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class Jetty12Controller {

    private static final Logger LOG = LoggerFactory.getLogger(Jetty12Controller.class);

    @GET
    @Path("/{id:.+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String demo(@PathParam("id") @Encoded String id) {
        LOG.info(id);
        return id;
    }
}
