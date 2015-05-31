package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chamados implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_CHAMADO;
    @Column
    private String NM_CHAMADO;
    @Column
    private Date DT_CHAMADO;

    public int getID_CHAMADO() {
        return ID_CHAMADO;
    }
    public String getNM_CHAMADO() {
        return NM_CHAMADO;
    }
    public Date getDT_CHAMADO() {
        return DT_CHAMADO;
    }

    public void setID_CHAMADO(int ID_CHAMADO) {
        this.ID_CHAMADO = ID_CHAMADO;
    }
    public void setNM_CHAMADO(String NM_CHAMADO) {
        this.NM_CHAMADO = NM_CHAMADO;
    }
     public void setDT_CHAMADO(Date DT_CHAMADO) {
        this.DT_CHAMADO = DT_CHAMADO;
    }
}
