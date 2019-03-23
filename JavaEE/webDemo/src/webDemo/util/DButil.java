package webDemo.util;

import java.util.HashMap;
import java.util.Map;

import webDemo.model.User;

public class DButil {
	public static String s="123";
	private static Map<String,webDemo.model.User> db=new HashMap<String,webDemo.model.User>();
	public static boolean User(String username) {
		if(db.containsKey(username)) {
			return false;
		}
		else {
			User user=new User(username,s);
			db.put(username,user);
			return true;
		}
	}
}
