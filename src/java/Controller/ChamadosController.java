package Controller;

import DAO.ChamadosDAO;
import DAO.ChamadosDAOImp;
import Model.Chamados;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@SessionScoped
@Named
public class ChamadosController {

    private Chamados chamado;
    private DataModel listaChamados;

    public DataModel ListarChamados() {
        List<Chamados> lista;
        lista = new ChamadosDAOImp().list();
        listaChamados = new ListDataModel(lista);
        return listaChamados;
    }

    public Chamados getChamado() {
        return chamado;
    }

    public void setChamado(Chamados chamado) {
        this.chamado = chamado;
    }

    public String PrepararAddChamado() {
        chamado = new Chamados();
        return "GerenciarTarefas";
    }

    public String PrepararAlterarChamado() {
        chamado = (Chamados) (listaChamados.getRowData());
        return "GerenciarTarefas";
    }

    public String ExcluirChamado() {
        Chamados chamadoTemp = (Chamados) (listaChamados.getRowData());
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.remove(chamadoTemp);
        return "index";
    }

    public String AddChamado() {
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.save(chamado);
        return "index";
    }

    public String AlterarChamado() {
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.update(chamado);
        return "index";
    }
}