package com.tienda.controller;

import com.tienda.entity.Conciertos;
import com.tienda.entity.Persona;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.tienda.service.IConciertosService;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IConciertosService conciertosService;
    
    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Conciertos");
        model.addAttribute("personas", listaPersona);
        return "conciertos";
        
    }
    
    @GetMapping("/personas")
    public String crearPersona(Model model) {
        List<Conciertos> listaConciertos = conciertosService.listConciertos();
      model.addAttribute("personas", new Persona());
      model.addAttribute("conciertos", listaConciertos);
      return "crear";
    
}
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return"redirect:/conciertos";
    }

}