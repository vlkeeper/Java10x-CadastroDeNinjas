package aluno.dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador para APIs REST
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas") //Anotação que pega informações e mapeia
    public String boasVindas() {
        return "Esta é a minha primeira mensagem nessa rota!";
    }
}
