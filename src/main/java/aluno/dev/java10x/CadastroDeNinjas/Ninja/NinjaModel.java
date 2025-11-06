package aluno.dev.java10x.CadastroDeNinjas.Ninja;

import aluno.dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA = Java Persistent API
@Entity //Transforma a classe em uma entidade do banco de dados
@Table(name = "tb_cadastro") //Dá um nome à tabela / Uma boa prática é o nome ser minúsculo e com o underline (snake case)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id //Informa que a tabela trabalha com ID
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Gera os valores da ID sequencialmente
    private Long id;
    private String nome, email;
    private int idade;

    @ManyToOne // Um ninja, uma missão
    @JoinColumn (name = "missoes_id") //Criando a foreign key (chave estrangeira)
    private MissoesModel missoes;

}