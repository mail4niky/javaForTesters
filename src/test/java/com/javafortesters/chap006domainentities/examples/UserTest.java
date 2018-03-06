package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainobject.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


   public class UserTest {

       @Test
    public void canConstructANewUser () {
           User user = new User ();

        assertEquals("default username	expected", "username", user.getUsername());
        assertEquals("default	password	expected", "password",	user.getPassword());
    }

       @Test
       public	void	canConstructWithUsernameAndPassword(){
           User	user	=	new	User("admin",	"pA55w0rD");
           assertEquals("given	username	expected","admin",	user.getUsername());
           assertEquals("given	password	expected", "pA55w0rD",	user.getPassword());
       }


   }
