/**
 * GREETING CONTROLLER CLASS:
 * Controller to handle HTTP requests
 * and responses for "/greeting" and
 * returns the name of a "View", in
 * this case, "greeting".
 */

package hello;

// Class dependencies.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * @Controller Annotation:
 * Indicates that an annotated class 
 * is a "Controller" (e.g. a web controller). 
 * by default.
 */
@Controller
public class GreetingController {

    /**
     * @GetMapping Annotation:
     * Annotation for mapping HTTP GET 
     * requests onto specific handler methods.
     */
    @GetMapping("/greeting")

    /**
     * @RequestParams Annotation:
     * Annotation which indicates that a method 
     * parameter should be bound to a web 
     * request parameter.
     */
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

        // Add the value of the "name" parameter to the Model object, making it accessable to the view template.
        model.addAttribute("name", name);
        return "greeting";
    }

}