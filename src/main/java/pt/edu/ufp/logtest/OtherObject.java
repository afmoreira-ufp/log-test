package pt.edu.ufp.logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherObject {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    public void operation(){
        logger.info("some info");
        logger.debug("some debug");
        logger.error("some error");
    }
}
