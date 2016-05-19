/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/
package org.bugfix.dao;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserDAO extends GenericDAO<User, Long> implements UserLocal {

  @Override
  public void checkUser(String login, String password) throws LoginException{
    List<User> users = em.createNamedQuery("user.bylogin").setParameter("login", login).getResultList();
    if (users.size() == 0) {
      throw new LoginException("Invalid user "+login);
    }
    User user = users.get(0);
    if (! password.equals(user.getUserPassword())) {
      throw new LoginException("Incorrect password");
    }
  }

  @Override
  public List<User> listUsers() {
    return em.createNamedQuery("users.all").getResultList();
  }
}
