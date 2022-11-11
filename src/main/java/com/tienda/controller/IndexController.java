

package com.tienda.controller;
import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Controller
public class IndexController {
    /**
 *
 * @author nahum
 */
    @Autowired
    private ArticuloService articuloService;
       
    @GetMapping("/")
    public String inicio(Model model) { 
        log.info("ahora se usa arquitectura MVC");

        var articulos=articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        return "index";
    }

}

