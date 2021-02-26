package evk.itmo.fprj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SalutController {

    @GetMapping({"/", "/salut/{name}"})
    public String salut(Model model, @PathVariable String name) {
        model.addAttribute("name", name);
        return "salut";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    public String translate(@RequestParam String textForm, Model model) {
        model.addAttribute("textForm", textForm);
        return "success";
    }

}