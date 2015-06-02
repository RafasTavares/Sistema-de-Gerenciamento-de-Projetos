package Controller.Chamados;

import DAO.ChamadosDAO;
import Dao.ChamadosDAOImp;
import Model.Chamados;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.faces.model.DataModel;

@SessionScoped
@Named(value = "GerenciarChamados")
public class GerenciarChamadosController {

    private Chamados chamado;
    private DataModel listaChamados;

    public Chamados getChamado() {
        return chamado;
    }

    public void setChamado(Chamados chamado) {
        this.chamado = chamado;
    }

    public String PrepararAddChamado() {
        chamado = new Chamados();
        return "GerenciarChamados";
    }

    public String PrepararAlterarChamado() {
        chamado = (Chamados) (listaChamados.getRowData());
        return "GerenciarChamados";
    }

    public String ExcluirChamado() {
        Chamados chamadoTemp = (Chamados) (listaChamados.getRowData());
        ChamadosDAOImp dao = new ChamadosDAOImp();
        dao.remove(chamadoTemp);
        return "index";
    }

    public String AddChamado() {
        ChamadosDAO dao = (ChamadosDAO) new ChamadosDAOImp();
        dao.save(chamado);
        return "index";
    }

    public String AlterarChamado() {
        ChamadosDAO dao = (ChamadosDAO) new ChamadosDAOImp();
        dao.update(chamado);
        return "index";
    }
}
