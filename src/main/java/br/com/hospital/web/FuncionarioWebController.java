package br.com.hospital.web;
import br.com.hospital.model.Funcionario;
import br.com.hospital.service.FuncionarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/funcionarios")
public class FuncionarioWebController {
    private final FuncionarioService service;
    public FuncionarioWebController(FuncionarioService service){this.service=service;}
    @GetMapping public String list(Model m){ m.addAttribute("funcionarios", service.listarTodos()); return "funcionarios/list"; }
    @GetMapping("/new") public String form(Model m){ m.addAttribute("funcionario", new Funcionario()); return "funcionarios/form"; }
    @PostMapping public String create(@ModelAttribute Funcionario f){ service.salvar(f); return "redirect:/funcionarios"; }
@GetMapping("/editar/{id}")
public String editarForm(@PathVariable Integer id, Model model) {
    var opt = service.buscarPorId(id);
    if (opt.isPresent()) model.addAttribute("funcionario", opt.get());
    else model.addAttribute("funcionario", new br.com.hospital.model.Funcionario());
    return "funcionarios/form";
}

@PostMapping("/salvar")
public String salvar(@ModelAttribute br.com.hospital.model.Funcionario funcionario) {
    // If cargo id is submitted, we need to set cargo reference (simple approach)
    service.salvar(funcionario);
    return "redirect:/funcionarios";
}

@PostMapping("/delete/{id}")
public String deleteFuncionario(@PathVariable Integer id) {
    service.deletar(id);
    return "redirect:/funcionarios";
}

}