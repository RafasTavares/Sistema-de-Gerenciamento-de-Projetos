package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefas implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_TAREFA;
    @Column
    private String MN_TAFERA;
    @Column
    private String DS_TAREFA;
    @Column
    private Date DT_INICIAL;
    @Column
    private Date DT_FINAL;
    @Column
    private int ID_PROJETO_FK;

    public int getID_TAREFA() {
        return ID_TAREFA;
    }

    public void setID_TAREFA(int ID_TAREFA) {
        this.ID_TAREFA = ID_TAREFA;
    }

    public String getMN_TAFERA() {
        return MN_TAFERA;
    }

    public void setMN_TAFERA(String MN_TAFERA) {
        this.MN_TAFERA = MN_TAFERA;
    }

    public String getDS_TAREFA() {
        return DS_TAREFA;
    }

    public void setDS_TAREFA(String DS_TAREFA) {
        this.DS_TAREFA = DS_TAREFA;
    }

    public Date getDT_INICIAL() {
        return DT_INICIAL;
    }

    public void setDT_INICIAL(Date DT_INICIAL) {
        this.DT_INICIAL = DT_INICIAL;
    }

    public Date getDT_FINAL() {
        return DT_FINAL;
    }

    public void setDT_FINAL(Date DT_FINAL) {
        this.DT_FINAL = DT_FINAL;
    }

    public int getID_PROJETO_FK() {
        return ID_PROJETO_FK;
    }

    public void setID_PROJETO_FK(int ID_PROJETO_FK) {
        this.ID_PROJETO_FK = ID_PROJETO_FK;
    }
}
