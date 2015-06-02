/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Chamados;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChamadosDAOImp implements ChamadosDAO {

    public void save(Chamados chamado) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.save(chamado);
        t.commit();
    }

    public Chamados getChamado(int id) {
        Session session = HibernateUtil.getSession();
        return (Chamados) session.load(Chamados.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Chamados> list() {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from Chamados").list();
        t.commit();
        return lista;
    }

    public void remove(Chamados chamado) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.delete(chamado);
        t.commit();
    }

    public void update(Chamados chamado) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.update(chamado);
        t.commit();
    }
}
