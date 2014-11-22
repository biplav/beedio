package com.biplav.tweedeo.facebook.models;

public class ApplicationAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Application> {
  private final com.biplav.tweedeo.facebook.models.Application shim = new com.biplav.tweedeo.facebook.models.Application() {
    public java.lang.String getCanvas_name()  {
      java.lang.String toReturn = ApplicationAutoBean.this.getWrapped().getCanvas_name();
      return toReturn;
    }
    public java.lang.String getId()  {
      java.lang.String toReturn = ApplicationAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = ApplicationAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.lang.String getNamespace()  {
      java.lang.String toReturn = ApplicationAutoBean.this.getWrapped().getNamespace();
      return toReturn;
    }
    public void setCanvas_name(java.lang.String canvas_name)  {
      ApplicationAutoBean.this.getWrapped().setCanvas_name(canvas_name);
      ApplicationAutoBean.this.set("setCanvas_name", canvas_name);
    }
    public void setId(java.lang.String id)  {
      ApplicationAutoBean.this.getWrapped().setId(id);
      ApplicationAutoBean.this.set("setId", id);
    }
    public void setName(java.lang.String name)  {
      ApplicationAutoBean.this.getWrapped().setName(name);
      ApplicationAutoBean.this.set("setName", name);
    }
    public void setNamespace(java.lang.String namesapce)  {
      ApplicationAutoBean.this.getWrapped().setNamespace(namesapce);
      ApplicationAutoBean.this.set("setNamespace", namesapce);
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
  public ApplicationAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ApplicationAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Application wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Application as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Application> getType() {return com.biplav.tweedeo.facebook.models.Application.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Application createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Application() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.ApplicationAutoBean.this.data;
      public java.lang.String getCanvas_name()  {
        return (java.lang.String) getOrReify("canvas_name");
      }
      public java.lang.String getId()  {
        return (java.lang.String) getOrReify("id");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public java.lang.String getNamespace()  {
        return (java.lang.String) getOrReify("namespace");
      }
      public void setCanvas_name(java.lang.String canvas_name)  {
        setProperty("canvas_name", canvas_name);
      }
      public void setId(java.lang.String id)  {
        setProperty("id", id);
      }
      public void setName(java.lang.String name)  {
        setProperty("name", name);
      }
      public void setNamespace(java.lang.String namesapce)  {
        setProperty("namespace", namesapce);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Application as = as();
    value = as.getCanvas_name();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ApplicationAutoBean.this, "canvas_name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("canvas_name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("canvas_name", value, propertyContext);
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ApplicationAutoBean.this, "id"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ApplicationAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    value = as.getNamespace();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ApplicationAutoBean.this, "namespace"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("namespace", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("namespace", value, propertyContext);
  }
}
