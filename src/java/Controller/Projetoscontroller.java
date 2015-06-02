package Controller;

import DAO.ProjetosDAO;
import DAO.ProjetosDAOImp;
import Model.Projetos;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

@SessionScoped
@Named
public class ProjetosController {

    private Projetos projeto;
    private DataModel listaProjetos;

    public DataModel ListarProjetos() {
        List<Projetos> lista = new ProjetosDAOImp().list();
        listaProjetos = new ListDataModel(lista);
        return listaProjetos;
    }

    public Projetos getProjetos() {
        return projeto;
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }

    public String PrepararAddProjeto() {
        projeto = new Projetos();
        return "GerenciarProjetos";
    }

    public String PrepararAlterarProjeto() {
        projeto = (Projetos) (listaProjetos.getRowData());
        return "GerenciarProjetos";
    }

    public String ExcluirProjeto() {
        Projetos projetoTemp = (Projetos) (listaProjetos.getRowData());
        ProjetosDAO dao = new ProjetosDAOImp();
        dao.remove(projetoTemp);
        return "index";
    }

    public String AddProjeto() {
        ProjetosDAO dao = new ProjetosDAOImp();
        dao.save(projeto);
        return "index";
    }

    public String AlterarProjeto() {
        ProjetosDAO dao = new ProjetosDAOImp();
        dao.update(projeto);
        return "index";
    }
}
