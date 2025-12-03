package br.com.hospital.web;
import br.com.hospital.model.Consulta;
import br.com.hospital.service.ConsultaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/consultas")
public class ConsultaWebController {
    private final ConsultaService service;
    public ConsultaWebController(ConsultaService service){this.service=service;}
    @GetMapping public String list(Model m){ m.addAttribute("consultas", service.listarTodos()); return "consultas/list"; }
    @GetMapping("/new") public String form(Model m){ m.addAttribute("consulta", new Consulta()); return "consultas/form"; }
    @PostMapping public String create(@ModelAttribute Consulta c){ service.salvar(c); return "redirect:/consultas"; }
@GetMapping("/editar/{id}")
public String editarForm(@PathVariable Integer id, Model model) {
    var opt = service.buscarPorId(id);
    if (opt.isPresent()) model.addAttribute("consulta", opt.get());
    else model.addAttribute("consulta", new br.com.hospital.model.Consulta());
    return "consultas/form";
}

@PostMapping("/salvar")
public String salvar(@ModelAttribute br.com.hospital.model.Consulta consulta) {
    service.salvar(consulta);
    return "redirect:/consultas";
}

@PostMapping("/delete/{id}")
public String deleteConsulta(@PathVariable Integer id) {
    service.deletar(id);
    return "redirect:/consultas";
}

}