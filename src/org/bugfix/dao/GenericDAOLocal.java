/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/
package org.bugfix.dao;

public interface GenericDAOLocal<INTERFACECLASS, PKCLASS> {
  INTERFACECLASS create(INTERFACECLASS entity);

  void update(INTERFACECLASS entity);

  INTERFACECLASS findByPrimaryKey(PKCLASS entityPK);

  void remove(PKCLASS entityPK);
}
