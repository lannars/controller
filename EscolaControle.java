package com.br.escola.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/escola")
public class EscolaControle {

        @RequestMapping(value = "/paginaInicial", method = RequestMethod.GET)
                public String carregarHome() {
            return "home";
        }

    @RequestMapping(value = "/contato", method = RequestMethod.GET)
    public String carregarContato() {
        return "contato";
    }

    @RequestMapping(value = "/servicos", method = RequestMethod.GET)
    public String carregarServicos() {
        return "servicos";
    }

    @RequestMapping(value = "/sobre", method = RequestMethod.GET)
    public String carregarSobre() {
        return "sobre";
    }

    }

