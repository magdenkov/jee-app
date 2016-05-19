/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/

package org.bugfix.ui;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.bugfix.dao.LoginException;
import org.bugfix.dao.UserLocal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    LoginForm formBean = (LoginForm)form;
    UserLocal userDao = Utils.getUserDao();
    try {
      userDao.checkUser(formBean.getLogin(), formBean.getPassword());
      return mapping.findForward("success");
    } catch (LoginException e) {
      return new ActionForward(mapping.findForward("error").getPath()+"?errMsg="+e.getMessage());
    }
  }
}
