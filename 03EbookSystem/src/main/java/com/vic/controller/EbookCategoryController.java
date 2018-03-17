package com.vic.controller;

import com.vic.pojo.EbookCategory;
import com.vic.service.EbookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category")
public class EbookCategoryController {

    @Autowired
    private EbookCategoryService service;

    @ResponseBody
    @RequestMapping(value="/getAll", method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    public List<EbookCategory> getAllCategory(){
        List<EbookCategory> categories=service.getAllCategory();
        System.out.println(categories);
        return categories;
    }
}
