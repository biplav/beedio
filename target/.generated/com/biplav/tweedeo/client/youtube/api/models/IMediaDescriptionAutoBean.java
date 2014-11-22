package com.biplav.tweedeo.client.youtube.api.models;

public class IMediaDescriptionAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.IMediaDescription> {
  private final com.biplav.tweedeo.client.youtube.api.models.IMediaDescription shim = new com.biplav.tweedeo.client.youtube.api.models.IMediaDescription() {
    public java.lang.String get$t()  {
      java.lang.String toReturn = IMediaDescriptionAutoBean.this.getWrapped().get$t();
      return toReturn;
    }
    public java.lang.String getType()  {
      java.lang.String toReturn = IMediaDescriptionAutoBean.this.getWrapped().getType();
      return toReturn;
    }
    public void set$t(java.lang.String t)  {
      IMediaDescriptionAutoBean.this.getWrapped().set$t(t);
      IMediaDescriptionAutoBean.this.set("set$t", t);
    }
    public void setType(java.lang.String type)  {
      IMediaDescriptionAutoBean.this.getWrapped().setType(type);
      IMediaDescriptionAutoBean.this.set("setType", type);
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
  public IMediaDescriptionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public IMediaDescriptionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.IMediaDescription wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.IMediaDescription as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.IMediaDescription> getType() {return com.biplav.tweedeo.client.youtube.api.models.IMediaDescription.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.IMediaDescription createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.IMediaDescription() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.IMediaDescriptionAutoBean.this.data;
      public java.lang.String get$t()  {
        return (java.lang.String) getOrReify("$t");
      }
      public java.lang.String getType()  {
        return (java.lang.String) getOrReify("type");
      }
      public void set$t(java.lang.String t)  {
        setProperty("$t", t);
      }
      public void setType(java.lang.String type)  {
        setProperty("type", type);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.IMediaDescription as = as();
    value = as.get$t();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IMediaDescriptionAutoBean.this, "$t"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("$t", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("$t", value, propertyContext);
    value = as.getType();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IMediaDescriptionAutoBean.this, "type"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("type", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("type", value, propertyContext);
  }
}
