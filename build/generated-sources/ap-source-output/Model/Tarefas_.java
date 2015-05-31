package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefas.class)
public abstract class Tarefas_ {

	public static volatile SingularAttribute<Tarefas, Integer> ID_PROJETO_FK;
	public static volatile SingularAttribute<Tarefas, Date> DT_FINAL;
	public static volatile SingularAttribute<Tarefas, String> MN_TAFERA;
	public static volatile SingularAttribute<Tarefas, Integer> ID_TAREFA;
	public static volatile SingularAttribute<Tarefas, String> DS_TAREFA;
	public static volatile SingularAttribute<Tarefas, Date> DT_INICIAL;

}

