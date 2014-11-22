package com.biplav.tweedeo.facebook.models;

public class FacebookUserDetailsAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.FacebookUserDetails> {
  private final com.biplav.tweedeo.facebook.models.FacebookUserDetails shim = new com.biplav.tweedeo.facebook.models.FacebookUserDetails() {
    public java.lang.String getId()  {
      java.lang.String toReturn = FacebookUserDetailsAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = FacebookUserDetailsAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public void setId(java.lang.String id)  {
      FacebookUserDetailsAutoBean.this.getWrapped().setId(id);
      FacebookUserDetailsAutoBean.this.set("setId", id);
    }
    public void setName(java.lang.String name)  {
      FacebookUserDetailsAutoBean.this.getWrapped().setName(name);
      FacebookUserDetailsAutoBean.this.set("setName", name);
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
  public FacebookUserDetailsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public FacebookUserDetailsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.FacebookUserDetails wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.FacebookUserDetails as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.FacebookUserDetails> getType() {return com.biplav.tweedeo.facebook.models.FacebookUserDetails.class;}
  @Override protected com.biplav.tweedeo.facebook.models.FacebookUserDetails createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.FacebookUserDetails() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.FacebookUserDetailsAutoBean.this.data;
      public java.lang.String getId()  {
        return (java.lang.String) getOrReify("id");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public void setId(java.lang.String id)  {
        setProperty("id", id);
      }
      public void setName(java.lang.String name)  {
        setProperty("name", name);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.FacebookUserDetails as = as();
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(FacebookUserDetailsAutoBean.this, "id"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(FacebookUserDetailsAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
  }
}
