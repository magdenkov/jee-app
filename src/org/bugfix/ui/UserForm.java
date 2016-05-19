/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/


package org.bugfix.ui;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
  private Long id;
  private String login;
  private String password;
  private String name;
  private String mode;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }
}
