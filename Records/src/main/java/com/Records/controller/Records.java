package com.Records.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.Records.Repositories.RecordRepositories;
import com.Records.entities.Employees;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Records {

	@Autowired
	 private RecordRepositories RecordRepositories;
	
	
	@RequestMapping("/Registration")
	public String insertData()
	{ 
		return "InsertData";
		
		//return "ShowData";
		
	}
	
	@RequestMapping("/SaveIntoDB")
	public String SaveInto(HttpServletRequest request,HttpServletResponse response)
	{   
		
		Employees obj = new  Employees();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String DOB = request.getParameter("DOB");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		String status = request.getParameter("status");
		System.out.println(status.getClass());
		System.out.println(status.toLowerCase());
		String st=status.toLowerCase();
		boolean flag;
		
		if(st.equals("active"))
		{   
			System.out.println(status.toLowerCase());
			flag=true;
		}
		else
		{
			flag=false;
		}
        
		obj.setAge(Integer.parseInt(age));
		obj.setDOB(DOB);
		obj.setEmail(email);
		obj.setName(name);
		obj.setSalary(Double.parseDouble(salary));
		obj.setStatus((Boolean)flag);
	
		//System.out.println(name+email+DOB+age+salary+status);
		RecordRepositories.save(obj);
       
		return "InsertData";
	}
	
	

	@RequestMapping("/ShowAllData")
	public String ShowData(ModelMap modelMap,HttpServletRequest request)
	{    
		List<Employees> allData = RecordRepositories.findAll();
		request.setAttribute("values", allData);
		
		return "ShowData";
	}
	
	
	@RequestMapping("/DeleteId")
	public String deleteData(@RequestParam("id") int id,HttpServletRequest request)
	{
		RecordRepositories.deleteById(id);
		List<Employees> allData = RecordRepositories.findAll();
		request.setAttribute("values", allData);
		return "ShowData";
	}
	
	
	@RequestMapping("/UpdateId")
	public String Update(@RequestParam("id") int id,ModelMap model)
	{
		Optional<Employees> findById = RecordRepositories.findById(id);
		Employees obj= findById.get();
		model.addAttribute("id", obj.getId());
		 model.addAttribute("email", obj.getEmail());
		 model.addAttribute("name", obj.getName());
		 model.addAttribute("status", obj.isStatus());
		 model.addAttribute("age", obj.getAge());
		 model.addAttribute("salary", obj.getSalary());
		 model.addAttribute("DOB", obj.getDOB());
      
		return "UpdateData";
	}
	
	
	
	@RequestMapping("/UpdateData")
	public String UpdateData(ModelMap model,HttpServletRequest request)
	{   
        
		Employees obj = new Employees();
		obj.setId(Integer.parseInt(request.getParameter("id")));
		obj.setAge(Integer.parseInt(request.getParameter("age")));
		obj.setEmail(request.getParameter("email"));
		obj.setName(request.getParameter("name"));
		obj.setSalary(Double.parseDouble(request.getParameter("salary")));
		obj.setStatus(obj.isStatus());
		obj.setDOB(request.getParameter("DOB"));
		RecordRepositories.save(obj);
		System.out.println("working");
        model.addAttribute("msg", "Data Updatedl");
        List<Employees> allData = RecordRepositories.findAll();
		
		//modelMap.addAttribute("allData",allData);
	    request.setAttribute("values", allData);
		
		return "ShowData";
		
	}

	
}
