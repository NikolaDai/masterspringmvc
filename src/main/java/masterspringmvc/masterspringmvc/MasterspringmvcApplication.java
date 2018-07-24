package masterspringmvc.masterspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.springframework.social.twitter.api"})
public class MasterspringmvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(MasterspringmvcApplication.class, args);
    }
}
