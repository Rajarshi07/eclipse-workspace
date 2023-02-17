package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.EmplDao;
import com.spring.model.Empl;

@Controller
public class EmplController {
	@Autowired
	EmplDao emplDao;
    /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */    
    @RequestMapping("/emplcreateform")    
    public String showform(Model m){    
        m.addAttribute("command", new Empl());  
        return "emplcreateform";   
    }    
    /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("empl") Empl empl){    
        emplDao.insert(empl);    
        return "redirect:/emplview";//will redirect to emplview request mapping    
    }    
    /* It provides list of employees in model object */    
    @RequestMapping("/emplview")    
    public ModelAndView emplview(Model m){    
        List<Empl> list=emplDao.getEmpl();  
        ModelAndView mv=new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("emplview");
        return mv;    
    }    
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/    
    @RequestMapping(value="/empleditform/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Empl emp=emplDao.getEmplById(id);    
        m.addAttribute("command",emp);  
        return "empleditform";    
    }    
    /* It updates model object. */    
    @RequestMapping(value="/update",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("empl") Empl empl){    
        emplDao.update(empl);    
        return "redirect:/emplview";    
    }    
    /* It deletes record for the given id in URL and redirects to /emplview */    
    @RequestMapping(value="/deleteempl/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        emplDao.delete(id);    
        return "redirect:/emplview";    
    }     
	public EmplController() {
		// TODO Auto-generated constructor stub
	}

}
