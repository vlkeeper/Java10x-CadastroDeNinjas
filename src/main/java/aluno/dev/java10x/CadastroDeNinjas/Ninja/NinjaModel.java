package aluno.dev.java10x.CadastroDeNinjas.Ninja;

import aluno.dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

//JPA = Java Persistent API
@Entity //Transforma a classe em uma entidade do banco de dados
@Table(name = "tb_cadastro") //Dá um nome à tabela / Uma boa prática é o nome ser minúsculo e com o underline (snake case)
public class NinjaModel {

    @Id //Informa que a tabela trabalha com ID
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Gera os valores da ID sequencialmente
    private Long id;
    private String nome, email;
    private int idade;

    @ManyToOne // Um ninja, uma missão
    @JoinColumn (name = "missoes_id") //Criando a foreign key (chave estrangeira)
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}