package com.Rupeshk_3150001_NAGP2_userservice.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
private static List<User> users= new ArrayList<>();
	
	private static int usersCount =5;
	
	
	static {
		users.add(new User(1,"Swati",25, "swati@gmail.com"));
		users.add(new User(2,"Rupesh",26,"rupeshk829@gmail.com"));
		users.add(new User(3,"Ravi",29,"Sharmaravi@yahoo.com"));
		users.add(new User(4,"Ashish",21,"AshishK@yahoo.com"));
		users.add(new User(5,"Rekha",54,"rekhadas@yahoo.com"));
	}
	
	public List<User> findAll(){
	return users;
	}
	public User save(User user) {
		if (user.getId()== null) {	
			user.setId(++usersCount);
					}
		users.add(user);
		return user;
		
	}
	public User findOne(int id) {
		for (User users:users) {
			if (users.getId()==id) {
				return users;
			}	
		}
		return null;
	}
	

	
}


