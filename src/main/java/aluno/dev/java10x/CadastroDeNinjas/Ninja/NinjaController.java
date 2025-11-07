package aluno.dev.java10x.CadastroDeNinjas.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Controlador para APIs REST
@RequestMapping("/ninjas") //Mapeia as API's, é possível colocar um caminho no Resquest e todos os demais mappings são mapeados dentro deste caminho principal
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas") //Anotação que pega informações e mapeia
    public String boasVindas() {
        return "Esta é a minha primeira mensagem nessa rota!";
    }

    @PostMapping("/criar")
    //Adicionar Ninja ao DB(CREATE)
    public String adicionarNinja(){
        return "Ninja Criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.mostrarTodosOsNinjas();
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("/todos/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id){ //@PathVariable transforma a ID fornecida pelo usuário em URL
        return ninjaService.mostrarNinjaPorId(id);
    }

    //Alterar ninja por ID (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterando ninja por id!";
    }

    //Alterar ninja por ID (UPDATE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Deletando ninja por id!";
    }
}
