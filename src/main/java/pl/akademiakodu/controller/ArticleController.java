package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.model.Article;

/**
 * Created by Lenovo on 2016-12-06.
 */
@Controller
public class ArticleController {

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("article", new Article("Thymeleaf article", "Content", "Sport"));
        return "articles/form";
    }
    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article article, ModelMap modelMap){
        modelMap.addAttribute("article", article);
        return "articles/success";
    }
}
