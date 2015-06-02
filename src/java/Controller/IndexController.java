package Controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean (name = "index")
@SessionScoped
public class IndexController {

    public String ManterChamados() {
        return "Chamados/ManterChamados.xhtml";
    }
    public String ManterTarefas() {
        return "Tarefas/ManterTarefas.xhtml";
    }
    public String ManterProjetos() {
        return "Projetos/ManterProjetos.xhtml";
    }
    public String ManterEmpresas() {
        return "Empresas/ManterEmpresas.xhtml";
    }
    
}
