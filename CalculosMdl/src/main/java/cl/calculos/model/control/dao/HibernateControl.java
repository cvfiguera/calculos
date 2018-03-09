package cl.calculos.model.control.dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional(value = "transactionManagerControl")
public class HibernateControl extends HibernateDaoSupport {

	protected Logger log = Logger.getLogger(getClass().getName());

	@Autowired
	public void annyMethodName(@Qualifier("sessionControl") SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	final protected void error(String message) {
		log.error(message);
	}

	final protected void error(String message, Throwable t) {
		log.error(message, t);
	}

	final protected void debug(String message) {
		log.error(message);
	}

	final protected void debug(String message, Throwable t) {
		log.error(message, t);
	}

	final protected void info(String message) {
		log.info(message);
	}

	public Object getObjectSqlUnique(Object object, String hql) {
		Object obj = null;
		Session session = null;
		if (object != null) {
			try {
				session = getHibernateTemplate().getSessionFactory().openSession();
				obj = session.createSQLQuery(hql).setResultTransformer(Transformers.aliasToBean(object.getClass()))
						.uniqueResult();
			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql, e);
			} finally {
				session.close();
			}
		}
		else {
			error("Objeto null al realizar la consulta");
		}

		return obj;
	}
	
	public Integer getMaxId(String sql) {
		Session session = null;
		Integer id = 0;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			id = session.createSQLQuery(sql).getFirstResult();
		} catch (Exception e) {
			error("Al intentar realizar la consulta " + sql, e);
		} finally {
			session.close();
		}

		return id +1;
	}

	public Object getObjectListSql(Object object, String hql) {
		List<Object> list = null;
		Session session = null;
		if (object != null) {
			try {
				session = getHibernateTemplate().getSessionFactory().openSession();
				list = session.createSQLQuery(hql).setResultTransformer(Transformers.aliasToBean(object.getClass()))
						.list();
			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql, e);
			} finally {
				session.close();
			}

		}
		else {
			error("Objeto null al realizar la consulta");
		}

		return list;
	}

	public void addObject(Object object) {
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			session.save(object);
			session.flush();
			// session.beginTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateObject(Object object) {
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			session.update(object);
			session.flush();
			// session.beginTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteObject(Object object) {
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			session.delete(object);
			session.flush();
			// session.beginTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getObjectHqlUnique(Object object, String hql) {
		Object obj = null;
		Session session = null;
		if (object != null) {
			try {
				session = getHibernateTemplate().getSessionFactory().openSession();
				obj = session.createQuery(hql).uniqueResult();
			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql, e);
			} finally {
				session.close();
			}
		}
		else {
			error("Objeto null al realizar la consulta");
		}

		return obj;
	}

	public List<Object> getObjetHqlList(Object object, String hql) {
		List<Object> list = null;
		Session session = null;
		if (object != null) {
			try {
				session = getHibernateTemplate().getSessionFactory().openSession();
				list = session.createQuery(hql).list();
			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql + " " + e.getMessage());

			} finally {
				session.close();
			}

		}
		else {
			error("Objeto nulo, no se ha realizado la consulta -> " + hql);
		}

		return list;
	}

	public List<Object> getObjetHqlListTransform(Object object, String hql) {
		List<Object> list = null;
		Session session = null;
		if (object != null) {
			try {
				session = getHibernateTemplate().getSessionFactory().openSession();
				list = session.createQuery(hql).setResultTransformer(Transformers.aliasToBean(object.getClass()))
						.list();

			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql + " " + e.getMessage());

			} finally {
				session.close();
			}

		}
		else {
			error("Objeto nulo, no se ha realizado la consulta -> " + hql);
		}

		return list;
	}
	
	public void addObjectList(List<Object> list) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			tx = session.beginTransaction();
			for (int i = 0; i < list.size(); i++) {
				Object obj = new Object();
				obj = list.get(i);
				session.save(obj);
				
				if ( i % 300 == 0 ) {
					session.flush();
					session.clear();
				}
			}
		} catch (Exception e) {
			error(" Problemas en hibernate");
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
	}

	public void deleteObjectHqlUnique(String hql) {

		Session session = null;

			try {
				session = getHibernateTemplate().getSessionFactory().openSession();

				int result = session.createQuery(hql).executeUpdate();
				System.out.println(result);
			} catch (Exception e) {
				error("Al intentar realizar la consulta " + hql, e);
			} finally {
				session.close();
			}
	}
}
