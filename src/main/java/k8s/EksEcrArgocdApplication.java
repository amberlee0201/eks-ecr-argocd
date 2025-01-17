package k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EksEcrArgocdApplication {

    public static void main(String[] args) {
        SpringApplication.run(EksEcrArgocdApplication.class, args);
    }

}
