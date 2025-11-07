package aluno.dev.java10x.CadastroDeNinjas.Ninja;

import aluno.dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
