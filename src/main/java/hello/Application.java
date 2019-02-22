/**
 * APPLICATION CLASS:
 * A standalone class to package everything 
 * in a single, executable JAR file, driven 
 * by a Java main() method.
 */

package hello;

// Class dependencies.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * Indicates a configuration class that 
 * declares one or more @Bean methods 
 * and also triggers auto-configuration 
 * and component scanning.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}