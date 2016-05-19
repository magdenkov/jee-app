/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/

package org.bugfix.ui;

import org.bugfix.dao.UserLocal;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class Utils {

  public static UserLocal getUserDao() throws NamingException {
    InitialContext ctx = new InitialContext();
    return (UserLocal) PortableRemoteObject.narrow(ctx.lookup("bugfix/UserDAO/local"), UserLocal.class);
  }

}
