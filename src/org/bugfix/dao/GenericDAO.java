/*
* Agiloft
*
* Copyright (C) 2016 Agiloft corp. All Rights Reserved.
*
* $Id$
*/
package org.bugfix.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public class GenericDAO<ENTITYCLASS, PKCLASS> implements GenericDAOLocal<ENTITYCLASS,PKCLASS> {

  @PersistenceContext
  protected EntityManager em;
  private final Class<ENTITYCLASS> entityClass;

  public GenericDAO() {
    this.entityClass = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
  }

  public ENTITYCLASS create(ENTITYCLASS entity) {
    em.persist(entity);
    return entity;
  }

  public void update(ENTITYCLASS entity) {
    em.merge(entity);
    em.flush();
  }

  public ENTITYCLASS findByPrimaryKey(PKCLASS entityPK) {
    return (ENTITYCLASS)em.find(entityClass, entityPK);
  }

  public void remove(PKCLASS entityPK) {
    final Object entity = findByPrimaryKey(entityPK);
    if (entity != null) {
      em.remove(entity);
      em.flush();
    }
  }

}
