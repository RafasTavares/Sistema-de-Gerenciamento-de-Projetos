package DAO;

import Model.Tarefas;
import Util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TarefasDAOImp implements TarefasDAO {

    @Override
    public void save(Tarefas tarefa) {
        Session session;
        session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        Serializable save = session.save(tarefa);
        t.commit();
    }

    @Override
    public Tarefas getTarefas(int id) {
        Session session = HibernateUtil.getSession();
        return (Tarefas) session.load(Tarefas.class, id);
    }

    @Override
    public List<Tarefas> list() {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from TB_TAREFAS").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Tarefas tarefa) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.delete(tarefa);
        t.commit();
    }

    @Override
    public void update(Tarefas tarefa) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.update(tarefa);
        t.commit();
    }
}
