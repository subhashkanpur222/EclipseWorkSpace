package com.loveingcode.Helloworld.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	static 
	{ 
		users.add(new User(1, "subhash", new Date()));
		users.add(new User(2, "namit", new Date()));
		users.add(new User(3, "sandeep", new Date()));
	}
	
	//Method for returning all the users findAll
	public List<User> findAll()
	{
		return users;
	}
	
	//Method for saving a user
	public User save(User user)
	{
		if(user.getId() == null)
			user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	//Method for finding one  user based on id
	public User findOne(int id)
	{
		for(User user: users)
		{
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	//Method to delete a user
	public User deleteById(int id)
	{
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.getId() == id)
			{
				users.remove(user);
			    return user;   
			}   
		}
		return null;
	}
}
