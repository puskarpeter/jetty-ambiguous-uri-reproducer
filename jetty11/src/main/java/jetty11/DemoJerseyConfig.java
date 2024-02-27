package jetty11;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class DemoJerseyConfig extends ResourceConfig {

    public DemoJerseyConfig() {
        register(Jetty11Controller.class);
    }
}
