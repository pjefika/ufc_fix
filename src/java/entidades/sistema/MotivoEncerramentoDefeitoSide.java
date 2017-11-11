package entidades.sistema;

import entidades.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UFC_MOTIVO_ENCERRAMENTO_DEFEITO_SIDE_2")
public class MotivoEncerramentoDefeitoSide extends AbstractEntity {

    private String nome;

    private Boolean ativo = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
