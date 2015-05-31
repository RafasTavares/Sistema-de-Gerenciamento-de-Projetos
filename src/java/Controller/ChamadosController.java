package Controller;

import DAO.ChamadosDAO;
import DAO.ChamadosDAOImp;
import Model.Chamados;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author José Alexandre
 */
@ManagedBean
@SessionScoped
public class ChamadosController {

    private Chamados chamado;
    private DataModel listaChamados;

    public DataModel ListarChamados() {
        List<Chamados> lista = new ChamadosDAOImp().list();
        listaChamados = new ListDataModel(lista);
        return listaChamados;
    }

    public Chamados getChamado() {
        return chamado;
    }

    public void serChamado(Chamados chamado) {
        this.chamado = chamado;
    }

    public String prepararAdicionarChamado() {
        chamado = new Chamados();
        return "gerenciarChamados";
    }

    public String prepararAlterarChamado() {
        chamado = (Chamados) (listaChamados.getRowData());
        return "gerenciarChamados";
    }

    public String excluirChamado() {
        Chamados chamadoTemp = (Chamados) (listaChamados.getRowData());
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.remove(chamadoTemp);
        return "index";
    }

    public String adicionarChamado() {
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.save(chamado);
        return "index";
    }

    public String alterarLivro() {
        ChamadosDAO dao = new ChamadosDAOImp();
        dao.update(chamado);
        return "index";
    }
}
