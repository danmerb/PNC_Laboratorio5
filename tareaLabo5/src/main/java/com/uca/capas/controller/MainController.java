package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;

@Controller
public class MainController {
	
	@Autowired
	private EstudianteDAO estudianteDAO;
	
	@RequestMapping("/inicio")
	public ModelAndView initMain() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("estudiante", new Estudiante());
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/insertar")
	public ModelAndView insertar(@Valid @ModelAttribute Estudiante estudiante, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
			return mav;
		}else {
			try {
				estudianteDAO.insert(estudiante);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			mav.addObject("estudiante", new Estudiante());
			mav.setViewName("index");
		}
		
		return mav;
	}
	
	@RequestMapping("/listado")
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		
		try {
			estudiantes = estudianteDAO.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("estudiantes",estudiantes);
		mav.setViewName("listado");
		
		return mav;
	}

}