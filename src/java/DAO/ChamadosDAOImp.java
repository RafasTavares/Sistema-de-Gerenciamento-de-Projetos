package DAO;

import Util.HibernateUtilCongfig;
import Model.Chamados;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChamadosDAOImp implements ChamadosDAO {

    @Override
    public void save(Chamados chamado) {
        Session session;
        session = HibernateUtilCongfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Serializable save = session.save(chamado);
        t.commit();
    }

    @Override
    public Chamados getChamado(int id) {
        Session session = HibernateUtilCongfig.getSessionFactory().openSession();
        return (Chamados) session.load(Chamados.class, id);
    }

    @Override
    public List<Chamados> list() {
        Session session = HibernateUtilCongfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("select * from TB_CHAMADOS").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Chamados chamado) {
        Session session = HibernateUtilCongfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(chamado);
        t.commit();
    }

    @Override
    public void update(Chamados chamado) {
        Session session = HibernateUtilCongfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(chamado);
        t.commit();
    }
}
