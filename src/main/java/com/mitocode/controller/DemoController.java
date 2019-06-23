package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mitocode.model.Personas;
import com.mitocode.repo.IPersonaRepo;

//@Controller Es una clase cuya finalidad es rediccionar la petición del usuario hacia una lógica de negocio
@Controller
public class DemoController {
	/*la anotación @GetMapping está indicando que se va a poder acceder al método greeting 
	 * a través de la operación de tipo GET
	 */
	@Autowired
	private IPersonaRepo repo;
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Personas p = new Personas();
		p.setIdPersona(1);
		p.setNombre("Mitocode");
		repo.save(p);
		
        model.addAttribute("name", name);
        return "greeting";
    }
}
