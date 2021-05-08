package priv.yzwbblan.pms.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"priv.yzwbblan.pms"})
public class PmsRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsRestApplication.class, args);
    }
}
