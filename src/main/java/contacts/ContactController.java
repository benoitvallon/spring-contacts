package contacts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
    @RequestMapping(method= RequestMethod.GET)
    public String home(Map<String, Object> model) {
        return "home";
    }

    }
}
