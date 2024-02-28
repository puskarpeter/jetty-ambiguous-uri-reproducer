package jetty12mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jetty12MVCController {

    private static final Logger LOG = LoggerFactory.getLogger(Jetty12MVCController.class);

    @GetMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE)
    public String demo(HttpServletRequest request) {
        // Extract the raw URI since MVC performs decoding by default
        String rawUri = request.getRequestURI();

        LOG.info(rawUri);

        return rawUri.substring(rawUri.indexOf('/') + 1);
    }
}
