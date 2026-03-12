package com.victor.sistemaalunos.controller;

import com.victor.sistemaalunos.model.Aluno;
import com.victor.sistemaalunos.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("alunos", alunoService.listarTodos());
        return "alunos/lista";
    }

    @GetMapping("/novo")
    public String novoFormulario(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "alunos/formulario";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Aluno aluno = alunoService.buscarPorId(id);
        if (aluno != null) {
            model.addAttribute("aluno", aluno);
            return "alunos/formulario";
        } else {
            redirectAttributes.addFlashAttribute("mensagemErro", "Aluno não encontrado!");
            return "redirect:/alunos";
        }
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Aluno aluno, RedirectAttributes redirectAttributes) {
        alunoService.salvar(aluno);
        redirectAttributes.addFlashAttribute("mensagem", "Aluno salvo com sucesso!");
        return "redirect:/alunos";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        alunoService.excluir(id);
        redirectAttributes.addFlashAttribute("mensagem", "Aluno excluído com sucesso!");
        return "redirect:/alunos";
    }
}
