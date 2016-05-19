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
import org.bugfix.dao.UserLocal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUsersAction extends Action {

  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    ListUsersForm formBean = (ListUsersForm) form;
    UserLocal userDao = Utils.getUserDao();
    formBean.setUsers(userDao.listUsers());
    return mapping.findForward("list");
  }
}
