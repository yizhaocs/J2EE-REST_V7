package org.koushik.javabrains.messenger7.database;

import java.util.HashMap;
import java.util.Map;

import org.koushik.javabrains.messenger7.model.Message;
import org.koushik.javabrains.messenger7.model.Profile;

/*
 * 
 * This can be a JDBC hibernate class, which store the data to the database
 * 
 * */
public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
