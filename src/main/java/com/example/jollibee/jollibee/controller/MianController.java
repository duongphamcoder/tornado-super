package com.example.jollibee.jollibee.controller;

import com.example.jollibee.jollibee.model.CartProduct;
import com.example.jollibee.jollibee.model.Product;
import com.example.jollibee.jollibee.model.User;
import com.example.jollibee.jollibee.service.ServiceClassImpl;
import com.example.jollibee.jollibee.dao.CartCrud;
import com.example.jollibee.jollibee.dao.ProductCrud;
import com.example.jollibee.jollibee.dao.UserCrud;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MianController {

    @Autowired
    private UserCrud userCrud;

    @Autowired
    private ProductCrud productCr;

    @Autowired
    private CartCrud cartCrud;

    @Autowired
    ServiceClassImpl service;

    @GetMapping("/")
    public String homePage(Principal principal, Model model) {

        if (service.checkLogin(principal)) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
        }
        model.addAttribute("checkSl", 0);
        return "index";
    }

    @GetMapping("/thuc-don/mon-moi-mon-ngon")
    public String comboPage(Principal principal, Model model) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 0);
        model.addAttribute("list", productCr.findByClassify("combo"));
        model.addAttribute("link", " /thuc-don/mon-moi-mon-ngon");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/mon-moi-mon-ngon")
    public String comboPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/mon-moi-mon-ngon";
    }

    @GetMapping("/thuc-don/ga-gion-vui-ve")
    public String chickenHpPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 1);
        model.addAttribute("list", productCr.findByClassify("gavv"));
        model.addAttribute("link", "/thuc-don/ga-gion-vui-ve");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/ga-gion-vui-ve")
    public String chickenHpPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }

        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/ga-gion-vui-ve";
    }

    @GetMapping("thuc-don/ga-sot-cay")
    public String chickenSpicyPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 2);
        model.addAttribute("list", productCr.findByClassify("gacay"));
        model.addAttribute("link", "/thuc-don/ga-sot-cay");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/ga-sot-cay")
    public String chickenSpicyPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/ga-sot-cay";
    }

    @GetMapping("/thuc-don/mi-y-sot-bo-bam")
    public String pastaPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 3);
        model.addAttribute("list", productCr.findByClassify("pasta"));
        model.addAttribute("link", "/thuc-don/mi-y-sot-bo-bam");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/mi-y-sot-bo-bam")
    public String pastaPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/mi-y-sot-bo-bam";
    }

    @GetMapping("/thuc-don/burger-com")
    public String burgerPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 4);
        model.addAttribute("list", productCr.findByClassify("burger"));
        model.addAttribute("link", "/thuc-don/burger-com");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/burger-com")
    public String burgerPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/burger-com";
    }

    @GetMapping("/thuc-don/phan-an-phu")
    public String servingsPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 5);
        model.addAttribute("list", productCr.findByClassify("servings"));
        model.addAttribute("link", "/thuc-don/phan-an-phu");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/phan-an-phu")
    public String servingsPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/phan-an-phu";
    }

    @GetMapping("/thuc-don/mon-trang-mieng")
    public String dessertPage(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
            model.addAttribute("quantityProductOfCart", service.quantityProductOfCart(principal.getName()));
        }
        model.addAttribute("check", 6);
        model.addAttribute("list", productCr.findByClassify("dessert"));
        model.addAttribute("link", "/thuc-don/mon-trang-mieng");
        model.addAttribute("checkSl", 1);
        return "food";
    }

    @PostMapping("/thuc-don/mon-trang-mieng")
    public String dessertPageP(HttpServletRequest request, Principal principal) {
        if (!service.checkLogin(principal)) {
            return "redirect:/login";
        }
        service.addProductToCart(request.getParameter("name__product"), request.getParameter("price__product"),
                request.getParameter("input__quantity"), principal.getName());
        return "redirect:/thuc-don/mon-trang-mieng";
    }

    @GetMapping("/dich-vu")
    public String service(Principal principal, Model model) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
        }
        model.addAttribute("checkSl", 2);
        return "service";
    }

    @GetMapping("/lien-he")
    public String contact(Principal principal, Model model) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
        }
        model.addAttribute("checkSl", 3);
        return "contact";
    }

    @PostMapping("/lien-he")
    public String contactPost(Principal principal, Model model, HttpServletRequest request) {
        System.out.println(request.getParameter("test123"));
        return "redirect:/lien-he";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("check1", "123");
        return "register";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(HttpServletRequest request, @ModelAttribute("user") User user, Model model) {
        user.setPhoneNumber(request.getParameter("phonenumber"));
        if (!service.saveUser(user)) {
            model.addAttribute("error", "Tài khoản đã tồn tại!!!!");
            System.out.println("Da ton tai");
            return "register";
        }

        return "redirect:/";
    }

    @GetMapping("/infor-user")
    public String getProfile(Principal principal, Model model) {
        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());

        }
        model.addAttribute("profileCheck", 0);
        model.addAttribute("user_name", principal.getName());
        User user = userCrud.findByUsername(principal.getName());
        switch (user.getGender()) {
            case "male": {
                user.setGender("Nam");
                break;
            }

            case "female": {
                user.setGender("Nữ");
                break;
            }
            default: {
                user.setGender("Khác");
            }
        }
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/cart-list")
    public String getCartList(Principal principal, Model model) {

        if (principal != null) {
            model.addAttribute("checklog", 1);
            model.addAttribute("name", principal.getName());
        }

        model.addAttribute("user_name", principal.getName());
        model.addAttribute("user", new User());

        model.addAttribute("profileCheck", 1);
        model.addAttribute("listPorduct", cartCrud.findByUser(userCrud.findByUsername(principal.getName())));
        float count = 0;
        for (CartProduct cartItem : cartCrud.findByUser(userCrud.findByUsername(principal.getName()))) {
            count += cartItem.getSumProductOfFloat();
        }
        model.addAttribute("sumAllProduct", service.calculate(count + ""));
        return "profile";
    }
}
