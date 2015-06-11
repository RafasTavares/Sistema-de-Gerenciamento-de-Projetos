package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projetos implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PROJETO;
    @Column
    private String NM_PROJETO;
    @Column
    private Date DT_INICIAL;
    @Column
    private Date DT_FINAL;
    @Column
    private double VL_PROJETO;
    @Column
    private int ID_EMPRESA_FK;
    @Column
    private int ID_CHAMADO_FK;

    public int getID_PROJETO() {
        return ID_PROJETO;
    }

    public String getNM_PROJETO() {
        return NM_PROJETO;
    }

    public Date getDT_INICIAL() {
        return DT_INICIAL;
    }

    public Date getDT_FINAL() {
        return DT_FINAL;
    }

    public double getVL_PROJETO() {
        return VL_PROJETO;
    }

    public int getID_EMPRESA_FK() {
        return ID_EMPRESA_FK;
    }

    public int getID_CHAMADO_FK() {
        return ID_CHAMADO_FK;
    }

    public void setID_PROJETO(int ID_PROJETO) {
        this.ID_PROJETO = ID_PROJETO;
    }

    public void setNM_PROJETO(String NM_PROJETO) {
        this.NM_PROJETO = NM_PROJETO;
    }

    public void setDT_INICIAL(Date DT_INICIAL) {
        this.DT_INICIAL = DT_INICIAL;
    }

    public void setDT_FINAL(Date DT_FINAL) {
        this.DT_FINAL = DT_FINAL;
    }

    public void setVL_PROJETO(double VL_PROJETO) {
        this.VL_PROJETO = VL_PROJETO;
    }

    public void setID_EMPRESA_FK(int ID_EMPRESA_FK) {
        this.ID_EMPRESA_FK = ID_EMPRESA_FK;
    }

    public void setID_CHAMADO_FK(int ID_CHAMADO_FK) {
        this.ID_CHAMADO_FK = ID_CHAMADO_FK;
    }
}
