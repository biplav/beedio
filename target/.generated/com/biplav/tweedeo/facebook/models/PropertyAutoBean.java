package com.biplav.tweedeo.facebook.models;

public class PropertyAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Property> {
  private final com.biplav.tweedeo.facebook.models.Property shim = new com.biplav.tweedeo.facebook.models.Property() {
    public java.lang.String getHref()  {
      java.lang.String toReturn = PropertyAutoBean.this.getWrapped().getHref();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = PropertyAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.lang.String getText()  {
      java.lang.String toReturn = PropertyAutoBean.this.getWrapped().getText();
      return toReturn;
    }
    public void setHref(java.lang.String href)  {
      PropertyAutoBean.this.getWrapped().setHref(href);
      PropertyAutoBean.this.set("setHref", href);
    }
    public void setName(java.lang.String name)  {
      PropertyAutoBean.this.getWrapped().setName(name);
      PropertyAutoBean.this.set("setName", name);
    }
    public void setText(java.lang.String text)  {
      PropertyAutoBean.this.getWrapped().setText(text);
      PropertyAutoBean.this.set("setText", text);
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
  public PropertyAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public PropertyAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Property wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Property as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Property> getType() {return com.biplav.tweedeo.facebook.models.Property.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Property createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Property() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.PropertyAutoBean.this.data;
      public java.lang.String getHref()  {
        return (java.lang.String) getOrReify("href");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public java.lang.String getText()  {
        return (java.lang.String) getOrReify("text");
      }
      public void setHref(java.lang.String href)  {
        setProperty("href", href);
      }
      public void setName(java.lang.String name)  {
        setProperty("name", name);
      }
      public void setText(java.lang.String text)  {
        setProperty("text", text);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Property as = as();
    value = as.getHref();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PropertyAutoBean.this, "href"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("href", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("href", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PropertyAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    value = as.getText();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PropertyAutoBean.this, "text"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("text", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("text", value, propertyContext);
  }
}
