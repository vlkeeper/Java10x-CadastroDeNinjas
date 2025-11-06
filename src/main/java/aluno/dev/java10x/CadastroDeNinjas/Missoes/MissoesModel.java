package aluno.dev.java10x.CadastroDeNinjas.Missoes;

import aluno.dev.java10x.CadastroDeNinjas.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String missao;
    private char rank;

    @OneToMany //Uma missão pode ter vários ninjas
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String missao, char rank) {
        this.missao = missao;
        this.rank = rank;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
}
