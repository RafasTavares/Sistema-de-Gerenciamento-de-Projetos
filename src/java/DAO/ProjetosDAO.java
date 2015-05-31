package DAO;

import Model.Projetos;
import java.util.List;

public interface ProjetosDAO {

    public void save(Projetos projeto);

    public Projetos getProjetos(int id);

    public List<Projetos> list();

    public void remove(Projetos projeto);

    public void update(Projetos projeto);
}
