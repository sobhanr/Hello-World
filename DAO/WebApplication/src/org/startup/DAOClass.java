package org.startup;

import org.hibernate.Session;

public class DAOClass {

	public void saveData(Employee employee){
	    Session session = UtilityClass.getSession();
	    session.beginTransaction();
	    session.save(employee);
	    session.getTransaction().commit();
	    session.close();
 }
}