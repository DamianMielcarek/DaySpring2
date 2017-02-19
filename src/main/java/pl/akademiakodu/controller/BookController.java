package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.model.BookRepository;

@Controller
public class BookController {

    @GetMapping("/bookadd")
    public String add() {
        return "books/add";
    }

    @GetMapping("/loop")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("books", BookRepository.getExampleBooks());
        return "books/index";
    }
}
