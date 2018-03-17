package com.vic.controller;

import com.vic.pojo.EbookEntry;
import com.vic.service.EbookEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private EbookEntryService service;

    @ResponseBody
    @RequestMapping(value="/getAll", method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    public List<EbookEntry> getAllEntry(){
        List<EbookEntry> entries=service.selectAllEntry();
        System.out.println(entries);
        return entries;
    }
    @ResponseBody
    @RequestMapping(value="/getEntryByCategoryId", method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    public List<EbookEntry> getEntrtByCategoryId(String categoryId){
        int cId=Integer.parseInt(categoryId);
        System.out.println("cId====>"+categoryId);
        System.out.println("进入了EntryController的getEntrtByCategoryId方法");
        List<EbookEntry> entries=service.selectEntryByCategoryId(cId);
        System.out.println(entries);
        return entries;
    }

    @RequestMapping("/toAdd")
    public ModelAndView toEntryAdd(String categoryId){
        ModelAndView mv=new ModelAndView("bookEntryAdd");
        mv.addObject("categoryId",categoryId);
        return mv;
    }
    @RequestMapping("/toUpdate")
    public ModelAndView toEntryUpdate(String id){
        System.out.println("进入了toUpdate");
        ModelAndView mv=new ModelAndView("bookEntryUpdate");
        EbookEntry entry=service.selectOneById(id);
        System.out.println(entry);
        mv.addObject("entry",entry);
        return mv;
    }

    @RequestMapping("/addEntry")
    public ModelAndView addEntry(@Validated EbookEntry entry, BindingResult result){
        ModelAndView mv=new ModelAndView();
        if(result.hasErrors()){
            mv.addObject("categoryId",entry.getCategoryId());
            if (result.getFieldError("title")!=null){
                mv.addObject("titleError",result.getFieldError("title").getDefaultMessage());
            }
            if (result.getFieldError("createdate")!=null){
                mv.addObject("createdateError",result.getFieldError("createdate").getDefaultMessage());
            }
            mv.setViewName("bookEntryAdd");
        }else {
            service.addEntry(entry);
            mv.setViewName("redirect:/index.jsp");
        }
        return mv;
    }
    @RequestMapping("/updateEntry")
    public ModelAndView updateEntry(@Validated EbookEntry entry, BindingResult result){
        System.out.println("进入了entry的updateEntry方法");
        ModelAndView mv=new ModelAndView();
        if(result.hasErrors()){
            mv.addObject("entry",entry);
            if (result.getFieldError("title")!=null){
                mv.addObject("titleError",result.getFieldError("title").getDefaultMessage());
            }
            if (result.getFieldError("createdate")!=null){
                mv.addObject("createdateError",result.getFieldError("createdate").getDefaultMessage());
            }
            mv.setViewName("bookEntryUpdate");
        }else {
            service.updateEntry(entry);
            mv.setViewName("redirect:/index.jsp");
        }
        return mv;
    }

    @RequestMapping("/deleteEntry")
    public ModelAndView deleteEntry(String id){
        int delId=Integer.parseInt(id);
        ModelAndView mv=new ModelAndView("redirect:/index.jsp");
        if(service.delEntry(delId)){
            mv.addObject("delInfo","删除成功！");
        }else {
            mv.addObject("delInfo","删除失败！");
        }
        return mv;
    }

}
