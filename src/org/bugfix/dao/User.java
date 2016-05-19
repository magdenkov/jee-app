/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/
package org.bugfix.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")

@NamedQueries({
    @NamedQuery(name="user.bylogin", query = "select u from User u where userName=:login"),
    @NamedQuery(name="users.all", query = "select u from User u"),
})

public class User implements Serializable{
  private Long userID;
  private String userLogin;
  private String userPassword;
  private String userName;

  @Id @GeneratedValue
  public Long getUserID() {
    return userID;
  }

  public void setUserID(Long userID) {
    this.userID = userID;
  }

  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
