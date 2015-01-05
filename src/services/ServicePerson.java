package services;

import dao.Person;
import dao.Relationship;

public class ServicePerson {

	private static ServicePerson svcPerson;
	private Person person;
	private ServicePerson(){}
	
	public static ServicePerson getRoot() {
		ServicePerson svcPerson = ServicePerson.getInstance();
		Person ancestor = ServiceRelationship.getAncestor(); 
		svcPerson.person = ancestor;
		return null;
	}

	public static ServicePerson getInstance() {
		if(svcPerson == null){
			svcPerson = new ServicePerson();
		}
		return svcPerson;
	}

}
