package com.hoppers_receipt.hoppers_receipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        // String name = "Grace Hopper";
        // String itemName = "Copper wire";
        // double price = 5.25;
        // String description = "Metal strips, also an illustration of nanoseconds.";
        // String vendor = "Little Things Corner Store";

        String name = "Ada Lovelace";
        String itemName = "Aluminum wire";
        double price = 7.50;
        String description = "High-quality aluminum wire.";
        String vendor = "Tech Supplies Store";
    
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "index.jsp";
    }
}
