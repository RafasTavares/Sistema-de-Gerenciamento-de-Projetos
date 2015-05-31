package DAO;

import Model.Empresas;
import java.util.List;

public interface EmpresasDAO {

    public void save(Empresas empresa);

    public Empresas getEmpresas(int id);

    public List<Empresas> list();

    public void remove(Empresas empresa);

    public void update(Empresas empresa);
}
