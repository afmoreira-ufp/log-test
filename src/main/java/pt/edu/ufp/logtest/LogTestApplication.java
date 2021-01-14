package pt.edu.ufp.logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogTestApplication {
    static Logger logger= LoggerFactory.getLogger(LogTestApplication.class);
    public static void main(String[] args) {
        logger.info("inicializou");

        new SomeObject().operation();
        new OtherObject().operation();

        SpringApplication.run(LogTestApplication.class, args);


    }

}
