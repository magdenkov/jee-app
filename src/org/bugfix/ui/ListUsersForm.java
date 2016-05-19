/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/

package org.bugfix.ui;

import org.apache.struts.action.ActionForm;
import org.bugfix.dao.User;

import java.util.List;

public class ListUsersForm extends ActionForm {
  private List<User> users;

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
