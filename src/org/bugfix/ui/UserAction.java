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
import org.bugfix.dao.User;
import org.bugfix.dao.UserLocal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends Action {

  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    UserForm formBean = (UserForm)form;
    if ("finish".equals(formBean.getMode())) {
      User user = new User();
      user.setUserID(formBean.getId());
      user.setUserLogin(formBean.getLogin());
      user.setUserName(formBean.getLogin());
      user.setUserPassword(formBean.getPassword());
      UserLocal userDao = Utils.getUserDao();
      if (formBean.getId() == null) {
        userDao.create(user);
      } else {
        userDao.update(user);
      }
    } else if ("new".equals(formBean.getMode())) {
      formBean.setId(null);
      formBean.setLogin(null);
      formBean.setPassword(null);
      formBean.setName(null);
    } else if ("edit".equals(formBean.getMode())) {
      UserLocal userDao = Utils.getUserDao();
      User user = userDao.findByPrimaryKey(formBean.getId());
      formBean.setId(user.getUserID());
      formBean.setLogin(user.getUserLogin());
      formBean.setPassword(user.getUserPassword());
      formBean.setName(user.getUserName());
    }
    if ("cancel".equals(formBean.getMode()) || "finish".equals(formBean.getMode())) {
      return mapping.findForward("finish");
    } else {
      return mapping.findForward("show");
    }
  }
}
