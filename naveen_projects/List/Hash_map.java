package naveen_projects.List;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		
		HashMap<Integer, User> m= new HashMap<>();
		
		User user1=new User(100,"naveen",25,"TX");
		User user2=new User(101,"taran",23,"NY");
		User user3=new User(102,"nikhi",28,"NJ");
		User user4=new User(103,"aishu",26,"CA");
		User user5=new User(104,"nikhil",23,"PA");
		User user6=new User(105,"raja",25,"JA");
		User user7=new User(106,"pavan",22,"LA");
		User user8=new User(107,"ravi",25,"FL");
		User user9=new User(108,"praveen",21,"CL");
		User user10=new User(109,"mani",26,"RI");
		
		
		m.put(1020,user1);
		m.put(1021,user2);
		m.put(1022,user3);
		m.put(1023,user4);
		m.put(1024,user5);
		m.put(1025,user6);
		m.put(1026,user7);
		m.put(1027,user8);
		m.put(1028,user9);
		m.put(1029,user10);
		
		
		System.out.println(m.keySet());
	}

}
