package graph.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GraphDisplayController {

    @RequestMapping("/csvload")
    public String csvload() {
        return "csvload";
    }
}
