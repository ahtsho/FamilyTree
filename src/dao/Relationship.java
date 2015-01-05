package dao;

import java.sql.ResultSet;
import java.sql.Statement;

public class Relationship {
	private long id; 
	private long person1_id; 
	private long person2_id; 
	private long relationship_type_id;
	private static Relationship relationship;
	
	public static Relationship getInstance() {
		if(relationship == null){
			relationship = new Relationship();
		}
		return relationship;
	}

	public static Person getAncestor() {
		Person ancestor = null;
		ResultSet rs = Statement.executeQuery("select * form relationship "
				+ "join person on person.id=person1_id "
				+ "join relationship_types on relationship_types.id=relationship.relationship_type_id "
				+ "where type = 'ancestor'");
		if(rs.next()){
			 ancestor = Person.getInstanceById(rs.getInt("person1_id"));
		}
		return null;
	}

}
