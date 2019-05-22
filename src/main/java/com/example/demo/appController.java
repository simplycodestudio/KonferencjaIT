package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class appController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("AppController ->test()");
        //w properties mam dodany prefix i suffix
        return "test";
    }


    @RequestMapping("/lectures")
    public String lecture(Model model) {
        SciezkiTematyczneBusiness business = new SciezkiTematyczneBusiness();
        List<SciezkiTematyczne> tematyczneList = business.getSciezkiList();

        model.addAttribute("lectures", tematyczneList);
        return "lecture";

    }


    @RequestMapping("/")
    public String Ekran_logowania(Model model) throws Exception {
        ArrayList<String> users = ApplicationSingleton.getInstance().getRetrieveUsersfromdb().getUsers_list();
        model.addAttribute("users_list", users);
        return "Ekran_logowania";

    }

    @RequestMapping("/profil_uzytkownika")
    public String profil(Model model) {
        return "hello";
    }


}
