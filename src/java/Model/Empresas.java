package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresas {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_EMPRESA;
    @Column
    private String NM_EMPRESA;
    @Column
    private String DS_EMPRESA;
    @Column
    private Date DT_ABERTURA;

    public int getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public String getNM_EMPRESA() {
        return NM_EMPRESA;
    }

    public String getDS_EMPRESA() {
        return DS_EMPRESA;
    }

    public Date getDT_ABERTURA() {
        return DT_ABERTURA;
    }

    public void setID_EMPRESA(int ID_EMPRESA) {
        this.ID_EMPRESA = ID_EMPRESA;
    }

    public void setNM_EMPRESA(String NM_EMPRESA) {
        this.NM_EMPRESA = NM_EMPRESA;
    }

    public void setDS_EMPRESA(String DS_EMPRESA) {
        this.DS_EMPRESA = DS_EMPRESA;
    }

    public void setDT_ABERTURA(Date DT_ABERTURA) {
        this.DT_ABERTURA = DT_ABERTURA;
    }
}