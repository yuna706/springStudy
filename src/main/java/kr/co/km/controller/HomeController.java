package kr.co.km.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpSession session) {
        if (session.getAttribute("name") == null) {
            return "redirect:/login";
        } else {
            return "redirect:/todoList";
        }
    }
}