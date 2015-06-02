package DAO;

import Model.Chamados;
import java.util.List;

public interface ChamadosDAO {
 
    public void save(Chamados chamado);

    public Chamados getChamado(int id);

    public List<Chamados> list();

    public void remove(Chamados chamado);

    public void update(Chamados chamado);
}
