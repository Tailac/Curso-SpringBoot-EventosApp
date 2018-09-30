package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventoapp.models.Evento;
import com.eventoapp.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired //Injeção de dependencias, ou seja toda vez que precisar a interface abaixo ela vai criar uma nova instancia automaticamente.
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form(){
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento){
		
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
}
