package DAO;

import Model.Tarefas;
import java.util.List;

public interface TarefasDAO {

    public void save(Tarefas tarefa);

    public Tarefas getTarefas(int id);

    public List<Tarefas> list();

    public void remove(Tarefas terafa);

    public void update(Tarefas tarefa);
}
