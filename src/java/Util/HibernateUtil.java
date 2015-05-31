package Util;


import Model.Chamados;
import Model.Empresas;
import Model.Projetos;
import Model.Tarefas;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
// Create the SessionFactory from standard (hibernate.cfg.xml)
// config file.
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Chamados.class);
                ac.addAnnotatedClass(Empresas.class);
                ac.addAnnotatedClass(Projetos.class);
                ac.addAnnotatedClass(Tarefas.class);
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
// Log the exception.
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}
