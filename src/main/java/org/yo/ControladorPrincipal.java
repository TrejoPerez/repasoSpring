/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class ControladorPrincipal {
    @RequestMapping(value="/", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String reprobados() {
        return "<h1>Todos vamos a morir, menos Javier ese cabron es un puto dios</h1>";
    }
    
    @RequestMapping(value="/p", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String pasamos() {
        return "<h1>Creo que no va a pasar Trejo</h1>";
    }
    
    @RequestMapping(value="/suma/{primero}/{segundo}", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String suma(@PathVariable Float primero, @PathVariable Float segundo) {
    Operaciones o=new Operaciones(primero, segundo);
    return o.suma();
    }
}
