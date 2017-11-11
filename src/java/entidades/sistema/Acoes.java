package entidades.sistema;

import entidades.AbstractEntity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import entidades.UsuarioEfika;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "UFC_ACOES_2")
public class Acoes extends AbstractEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAcao;

    @ManyToOne
    private UsuarioEfika usuarioEfika;

    @ManyToOne
    private StatusDefeito statusDefeito;

    @ManyToOne
    private Defeito defeito;

    public Date getDataAcao() {
        return dataAcao;
    }

    public void setDataAcao(Date dataAcao) {
        this.dataAcao = dataAcao;
    }

    public UsuarioEfika getUsuarioEfika() {
        return usuarioEfika;
    }

    public void setUsuarioEfika(UsuarioEfika usuarioEfika) {
        this.usuarioEfika = usuarioEfika;
    }

    public StatusDefeito getStatusDefeito() {
        return statusDefeito;
    }

    public void setStatusDefeito(StatusDefeito statusDefeito) {
        this.statusDefeito = statusDefeito;
    }

    public Defeito getDefeito() {
        return defeito;
    }

    public void setDefeito(Defeito defeito) {
        this.defeito = defeito;
    }

}
