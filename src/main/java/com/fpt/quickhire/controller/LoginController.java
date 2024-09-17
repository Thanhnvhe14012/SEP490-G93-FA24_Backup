package com.fpt.quickhire.controller;

import com.fpt.quickhire.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Controller
public class LoginController {


    @GetMapping("/sign-in")
    public String login(
            RedirectAttributes redirect,
            @SessionAttribute(value = "user", required = false) User userDTO) {
        if (Objects.nonNull(userDTO)) {
            /* Already login */
            redirect.addFlashAttribute("mess", "Bạn đã đăng nhập");
            return "redirect:/index";
        }

        return "login/login";
    }
}
