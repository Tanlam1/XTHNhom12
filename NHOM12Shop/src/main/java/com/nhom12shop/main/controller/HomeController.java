package com.nhom12shop.main.controller;

import com.nhom12shop.main.entity.Categories;
import com.nhom12shop.main.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping({"", "/index"})
    public String doGetHome(Model model) {
        List<Categories> categories = categoriesService.findAll();
        model.addAttribute("categories", categories);
        return "index";
    }

    @GetMapping("shop-grid")
    public String doGetShopGrid() {
        return "shop-grid";
    }

    @GetMapping("shop-details")
    public String doGetShopDetail() {
        return "shop-details";
    }

    @GetMapping("shopping-cart")
    public String doGetShoppingCart() {
        return "shopping-cart";
    }

    @GetMapping("checkout")
    public String doGetCheckout() {
        return "checkout";
    }

    public String doGetBlogDetails() {
        return "";
    }

    public String doGetBlog() {
        return "";
    }

    @GetMapping("contact")
    public String doGetContact() {
        return "contact";
    }

    @GetMapping("login")
    public String doGetLogin() {
        return "login";
    }

    @GetMapping("register")
    public String doGetRegister() {
        return "register";
    }
}
