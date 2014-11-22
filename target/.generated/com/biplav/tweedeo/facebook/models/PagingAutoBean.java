package com.biplav.tweedeo.facebook.models;

public class PagingAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Paging> {
  private final com.biplav.tweedeo.facebook.models.Paging shim = new com.biplav.tweedeo.facebook.models.Paging() {
    public java.lang.String getNext()  {
      java.lang.String toReturn = PagingAutoBean.this.getWrapped().getNext();
      return toReturn;
    }
    public java.lang.String getPrevious()  {
      java.lang.String toReturn = PagingAutoBean.this.getWrapped().getPrevious();
      return toReturn;
    }
    public void setNext(java.lang.String next)  {
      PagingAutoBean.this.getWrapped().setNext(next);
      PagingAutoBean.this.set("setNext", next);
    }
    public void setPrevious(java.lang.String previous)  {
      PagingAutoBean.this.getWrapped().setPrevious(previous);
      PagingAutoBean.this.set("setPrevious", previous);
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.web.bindery.autobean.shared.AutoBean.class.getName(), this); }
  public PagingAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public PagingAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Paging wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Paging as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Paging> getType() {return com.biplav.tweedeo.facebook.models.Paging.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Paging createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Paging() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.PagingAutoBean.this.data;
      public java.lang.String getNext()  {
        return (java.lang.String) getOrReify("next");
      }
      public java.lang.String getPrevious()  {
        return (java.lang.String) getOrReify("previous");
      }
      public void setNext(java.lang.String next)  {
        setProperty("next", next);
      }
      public void setPrevious(java.lang.String previous)  {
        setProperty("previous", previous);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Paging as = as();
    value = as.getNext();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PagingAutoBean.this, "next"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("next", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("next", value, propertyContext);
    value = as.getPrevious();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PagingAutoBean.this, "previous"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("previous", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("previous", value, propertyContext);
  }
}
