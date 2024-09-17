package com.fpt.quickhire.controller;

import com.fpt.quickhire.entity.User;
import com.fpt.quickhire.model.impl.UserServiceImpl;
import com.fpt.quickhire.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/sign-in")
    public String login(
            RedirectAttributes redirect,
            @SessionAttribute(value = "user", required = false) User userDTO) {
        test();
        if (Objects.nonNull(userDTO)) {
            /* Already login */
            redirect.addFlashAttribute("mess", "Bạn đã đăng nhập");
            return "redirect:/index";
        }

        return "login/login";
    }

    public void test(){
        System.out.println(userServiceImpl.findUserById(1));
    }
}
