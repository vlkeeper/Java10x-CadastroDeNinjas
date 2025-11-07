package aluno.dev.java10x.CadastroDeNinjas.Missoes;

import aluno.dev.java10x.CadastroDeNinjas.Ninja.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String missao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") //Uma missão pode ter vários ninjas
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
