package controller;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.login.Configuration;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/list")
    public String listCustomers (Model theModel){
        return "list-customers";
    }
}
