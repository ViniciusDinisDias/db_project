package br.com.hospital.web;

import br.com.hospital.model.Paciente;
import br.com.hospital.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteWebController {

    private final PacienteService pacienteService;

    public PacienteWebController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    // Listar pacientes
    @GetMapping
    public String list(Model model) {
        model.addAttribute("pacientes", pacienteService.listarTodos());
        return "pacientes/list";
    }

    // Formulário de novo paciente
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes/form";
    }

    // Salvar paciente (novo)
    @PostMapping
    public String create(@ModelAttribute Paciente paciente) {
        pacienteService.salvar(paciente);
        return "redirect:/pacientes";
    }

    // Formulário para editar
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        model.addAttribute("paciente", pacienteService.buscarPorId(id).orElse(new Paciente()));
        return "pacientes/form";
    }

    // Salvar alterações (edição)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Paciente paciente) {
        pacienteService.salvar(paciente);
        return "redirect:/pacientes";
    }

    // Deletar paciente
    @PostMapping("/delete/{id}")
    public String deletePaciente(@PathVariable Integer id) {
        pacienteService.deletar(id);
        return "redirect:/pacientes";
    }
}