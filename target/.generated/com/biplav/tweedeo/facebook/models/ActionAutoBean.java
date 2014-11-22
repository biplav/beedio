package com.biplav.tweedeo.facebook.models;

public class ActionAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Action> {
  private final com.biplav.tweedeo.facebook.models.Action shim = new com.biplav.tweedeo.facebook.models.Action() {
    public java.lang.String getLink()  {
      java.lang.String toReturn = ActionAutoBean.this.getWrapped().getLink();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = ActionAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public void setLink(java.lang.String link)  {
      ActionAutoBean.this.getWrapped().setLink(link);
      ActionAutoBean.this.set("setLink", link);
    }
    public void setName(java.lang.String name)  {
      ActionAutoBean.this.getWrapped().setName(name);
      ActionAutoBean.this.set("setName", name);
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
  public ActionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ActionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Action wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Action as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Action> getType() {return com.biplav.tweedeo.facebook.models.Action.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Action createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Action() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.ActionAutoBean.this.data;
      public java.lang.String getLink()  {
        return (java.lang.String) getOrReify("link");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public void setLink(java.lang.String link)  {
        setProperty("link", link);
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
    com.biplav.tweedeo.facebook.models.Action as = as();
    value = as.getLink();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ActionAutoBean.this, "link"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("link", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("link", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ActionAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
  }
}
