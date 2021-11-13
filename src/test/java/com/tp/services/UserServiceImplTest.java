package com.tp.services;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tp.entities.Role;
import com.tp.entities.User;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {
	/*private static final Logger l = LogManager.getLogger(UserServiceImplTest.class);


	@Autowired
	IUserService us;
	
	User testCaseUser;

	@Test
	@Order(1)
	public void isConnectingtoDb() {
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertNotNull(listUsers);

	}

	@Test
	@Order(2)
	public void addUser() {
		User usr = new User("donny", "fabrice", new Date(1996, 9, 22), Role.INGENIEUR);
		this.testCaseUser = us.addUser(usr);
		l.info(this.testCaseUser);
		Assertions.assertEquals(usr.getLastName(),this.testCaseUser.getLastName());
	}
	
	@Test
	@Order(3)
	public void retrieveUser() {
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertEquals(3,listUsers.size());

	}

	@Test
	@Order(4)
	public void modifyUser() {
		User usr = us.retrieveUser(7L);
		usr.setRole(Role.ADMINISTRATEUR);
		this.testCaseUser = us.updateUser(usr);
		Assertions.assertEquals(Role.ADMINISTRATEUR, this.testCaseUser.getRole());
	}
	
	@Test
	@Order(5)
	public void deleteUser() {
		us.deleteUser(6L);
		User usr = us.retrieveUser(6L);
		Assertions.assertNull(usr);
	}
*/
}
