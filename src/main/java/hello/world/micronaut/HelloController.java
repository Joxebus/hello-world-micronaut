package hello.world.micronaut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Get(produces = "text/plain")
    public String sayHello(){
        logger.info("Calling sayHello action");
        return "Hello World from micronaut.";
    }
}
