package DAO;

import Model.Projetos;
import Util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjetosDAOImp implements ProjetosDAO {

    @Override
    public void save(Projetos projeto) {
        Session session;
        session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        Serializable save = session.save(projeto);
        t.commit();
    }

    @Override
    public Projetos getProjetos(int id) {
        Session session = HibernateUtil.getSession();
        return (Projetos) session.load(Projetos.class, id);
    }

    @Override
    public List<Projetos> list() {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from TB_PROJETOS").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Projetos projeto) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.delete(projeto);
        t.commit();
    }

    @Override
    public void update(Projetos projeto) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.update(projeto);
        t.commit();
    }
}
