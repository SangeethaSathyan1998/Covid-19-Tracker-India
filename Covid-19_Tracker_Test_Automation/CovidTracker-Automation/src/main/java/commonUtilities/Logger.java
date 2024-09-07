package commonUtilities;

import org.apache.log4j.PropertyConfigurator;

public class Logger {

    public static boolean root=false;

    public static org.apache.log4j.Logger getLogger(Class cls){
        if(root){
            return org.apache.log4j.Logger.getLogger(cls);
        }
        PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\main\\resources\\log4j.properties");
        root = true;
        return org.apache.log4j.Logger.getLogger(cls);
    }

    public static void main(String[] args) {
        org.apache.log4j.Logger log = Logger.getLogger(Logger.class);
        log.info("test");


    }
}