/**
 * GREETING CONTROLLER CLASS:
 * Controller to handle HTTP requests
 * and responses for "/greeting" and
 * returns the name of a "View", in
 * this case, "greeting".
 */

package hello;

// Class dependencies.
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * @RestController Annotation:
 * Types that carry this annotation are 
 * treated as controllers where @RequestMapping 
 * methods assume @ResponseBody semantics 
 * by default.
 */
@RestController
public class GreetingController {

    /**
     * @RequestMapping Annotation:
     * Annotation for mapping web requests onto 
     * methods in request-handling classes with 
     * flexible method signatures
     */
    @RequestMapping("/greeting")

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