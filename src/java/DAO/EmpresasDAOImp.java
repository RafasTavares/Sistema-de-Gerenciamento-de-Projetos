package DAO;

import Model.Chamados;
import Model.Empresas;
import Util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpresasDAOImp implements EmpresasDAO {

    @Override
    public void save(Empresas empresa) {
        Session session;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Serializable save = session.save(empresa);
        t.commit();
    }

    @Override
    public Empresas getEmpresas(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Empresas) session.load(Chamados.class, id);
    }

    @Override
    public List<Empresas> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from TB_EMPRESAS").list();
        t.commit();
        return lista;
    }

    @Override
    public void remove(Empresas empresa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(empresa);
        t.commit();
    }

    @Override
    public void update(Empresas empresa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(empresa);
        t.commit();
    }
}
