package com.sistema;

import com.sistema.dao.IPersonaDao;
import com.sistema.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PersonaController {

    @Autowired
    private IPersonaDao personaDao;

    @GetMapping("/")
    public String comenzar(Model model){
        Iterable<Persona> personas = personaDao.findAll();
        model.addAttribute("personas", personas);
        return "home";
    }
}
