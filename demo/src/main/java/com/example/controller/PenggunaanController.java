package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 3/23/2017.
 */
@Controller
public class PenggunaanController {

    @RequestMapping("/penggunaan/list")
    public ModelMap daftarPenggunaan(){
        return new ModelMap();
    }
}
