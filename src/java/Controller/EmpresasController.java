package Controller;

import DAO.EmpresasDAO;
import DAO.EmpresasDAOImp;
import Model.Empresas;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean(name = "GerenciarEmpresas")
@SessionScoped
public class EmpresasController {

    private Empresas empresa;
    private DataModel listaEmpresas;

    public DataModel ListarEmpresas() {
        List<Empresas> lista = new EmpresasDAOImp().list();
        listaEmpresas = new ListDataModel(lista);
        return listaEmpresas;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public String PrepararAddEmpresa() {
        empresa = new Empresas();
        return "GerenciarEmpresas";
    }

    public String PrepararAlterarEmpresa() {
        empresa = (Empresas) (listaEmpresas.getRowData());
        return "GerenciarEmpresas";
    }

    public String ExcluirEmpresa() {
        Empresas empresaTemp = (Empresas) (listaEmpresas.getRowData());
        EmpresasDAO dao = new EmpresasDAOImp();
        dao.remove(empresaTemp);
        return "index";
    }

    public String AddEmpresa() {
        EmpresasDAO dao = new EmpresasDAOImp();
        dao.save(empresa);
        return "index";
    }

    public String AlterarEmpresa() {
        EmpresasDAO dao = new EmpresasDAOImp();
        dao.update(empresa);
        return "index";
    }
}
