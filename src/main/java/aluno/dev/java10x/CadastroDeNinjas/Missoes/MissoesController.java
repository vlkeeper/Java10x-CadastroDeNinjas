package aluno.dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada!";
    }

    @GetMapping("/todos")
    public String mostrarTodasAsMissoes(){
        return "Lista de Missões";
    }

    @GetMapping("/todosId")
    public String mostrarTodasAsMissoesPorId(){
        return "Lista de Missões por Id";
    }

    @PutMapping("/alterarId")
    public String alterarMissoesPorId(){
        return "Alterando missões por Id";
    }

    @DeleteMapping("/deletarId")
    public String deletarMissoesPorId(){
        return "Deletando missões por Id";
    }
}
