package Controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class IndexController {

    public String ManterChamados() {
        return "ManterChamados.xhtml";
    }
    public String ManterTarefas() {
        return "ManterTarefas.xhtml";
    }
    public String ManterProjetos() {
        return "ManterProjetos.xhtml";
    }
    public String ManterEmpresas() {
        return "ManterEmpresas.xhtml";
    }
    
}
