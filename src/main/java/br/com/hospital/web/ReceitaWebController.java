package br.com.hospital.web;
import br.com.hospital.model.Receita;
import br.com.hospital.service.ReceitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/receitas")
public class ReceitaWebController {
    private final ReceitaService service;
    public ReceitaWebController(ReceitaService service){this.service=service;}
    @GetMapping public String list(Model m){ m.addAttribute("receitas", service.listarTodos()); return "receitas/list"; }
    @GetMapping("/new") public String form(Model m){ m.addAttribute("receita", new Receita()); return "receitas/form"; }
    @PostMapping public String create(@ModelAttribute Receita r){ service.salvar(r); return "redirect:/receitas"; }
@GetMapping("/editar/{id}")
public String editarForm(@PathVariable Integer id, Model model) {
    var opt = service.buscarPorId(id);
    if (opt.isPresent()) model.addAttribute("receita", opt.get());
    else model.addAttribute("receita", new br.com.hospital.model.Receita());
    return "receitas/form";
}

@PostMapping("/salvar")
public String salvar(@ModelAttribute br.com.hospital.model.Receita receita) {
    service.salvar(receita);
    return "redirect:/receitas";
}

@PostMapping("/delete/{id}")
public String deleteReceita(@PathVariable Integer id) {
    service.deletar(id);
    return "redirect:/receitas";
}

}