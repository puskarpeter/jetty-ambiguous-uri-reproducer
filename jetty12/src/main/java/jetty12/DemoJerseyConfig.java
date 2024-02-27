package jetty12;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class DemoJerseyConfig extends ResourceConfig {

    public DemoJerseyConfig() {
        register(Jetty12Controller.class);
    }
}
