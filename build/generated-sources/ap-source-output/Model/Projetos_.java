package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Projetos.class)
public abstract class Projetos_ {

	public static volatile SingularAttribute<Projetos, Integer> ID_CHAMADO_FK;
	public static volatile SingularAttribute<Projetos, String> NM_PROJETO;
	public static volatile SingularAttribute<Projetos, Double> VL_PROJETO;
	public static volatile SingularAttribute<Projetos, Date> DT_FINAL;
	public static volatile SingularAttribute<Projetos, Integer> ID_PROJETO;
	public static volatile SingularAttribute<Projetos, Integer> ID_EMPRESA_FK;
	public static volatile SingularAttribute<Projetos, Date> DT_INICIAL;

}

