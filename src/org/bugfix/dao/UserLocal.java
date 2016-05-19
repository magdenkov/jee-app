/*
* Agiloft
*
* Copyright (C) 2013 Agiloft corp. All Rights Reserved.
*
* $Id$
*/

package org.bugfix.dao;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserLocal extends GenericDAOLocal<User, Long> {
  public void checkUser(String login, String password) throws LoginException;
  public List<User> listUsers();
}
