package entidades.sistema;

import entidades.AbstractEntity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "UFC_LOTE_2")
public class Lote extends AbstractEntity {

    private String nome;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataIntegracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataIntegracao() {
        return dataIntegracao;
    }

    public void setDataIntegracao(Date dataIntegracao) {
        this.dataIntegracao = dataIntegracao;
    }

}
