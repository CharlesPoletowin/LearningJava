package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Goods;
import model.User;

public class DBUtil {
	public static Map<String, User> userMap = new HashMap<String, User>();
	
	public static List<Goods> goodsList = new ArrayList<Goods>();
	static {
		addUser(new User("admin","123",10,"ÄÐ",true));
		goodsList.add(new Goods("fruit","position",100,400));
		
	}
	
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}
	
}
