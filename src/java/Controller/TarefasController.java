package Controller;

import DAO.TarefasDAO;
import DAO.TarefasDAOImp;
import Model.Tarefas;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

@SessionScoped
@Named
public class TarefasController {

    private Tarefas tarefa;
    private DataModel listaTarefas;

    public DataModel ListarTarefas() {
        List<Tarefas> lista = new TarefasDAOImp().list();
        listaTarefas = new ListDataModel(lista);
        return listaTarefas;
    }

    public Tarefas getTarefa() {
        return tarefa;
    }

    public void setTarefas(Tarefas tarefa) {
        this.tarefa = tarefa;
    }

    public String PrepararAddTarefa() {
        tarefa = new Tarefas();
        return "GerenciarChamados";
    }

    public String PrepararAlterarTarefa() {
        tarefa = (Tarefas) (listaTarefas.getRowData());
        return "GerenciarTarefas";
    }

    public String ExcluirTarefa() {
        Tarefas tarefaTemp = (Tarefas) (listaTarefas.getRowData());
        TarefasDAO dao = new TarefasDAOImp();
        dao.remove(tarefaTemp);
        return "index";
    }

    public String AddTarefa() {
        TarefasDAO dao = new TarefasDAOImp();
        dao.save(tarefa);
        return "index";
    }

    public String AlterarTarefa() {
        TarefasDAO dao = new TarefasDAOImp();
        dao.update(tarefa);
        return "index";
    }
}