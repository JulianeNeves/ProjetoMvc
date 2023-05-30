package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Sapato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sapatos")
public class SapatoController {

    public List<Sapato> sapatos = new ArrayList<Sapato>();

    public SapatoController() {
        sapatos.add(new Sapato("321315", "Salto", 250, 200));
        sapatos.add(new Sapato("351555", "Tênis", 150, 125));
        sapatos.add(new Sapato("464788", "Bota", 300, 250));
        sapatos.add(new Sapato("854848", "Sapatilha", 80, 70));
    }

    @GetMapping
    public String getSapatos(Model model) {
        model.addAttribute("sapatos", sapatos);
        return "sapatos";
    }
}