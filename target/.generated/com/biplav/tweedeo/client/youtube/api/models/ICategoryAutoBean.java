package com.biplav.tweedeo.client.youtube.api.models;

public class ICategoryAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.ICategory> {
  private final com.biplav.tweedeo.client.youtube.api.models.ICategory shim = new com.biplav.tweedeo.client.youtube.api.models.ICategory() {
    public java.lang.String getLabel()  {
      java.lang.String toReturn = ICategoryAutoBean.this.getWrapped().getLabel();
      return toReturn;
    }
    public java.lang.String getScheme()  {
      java.lang.String toReturn = ICategoryAutoBean.this.getWrapped().getScheme();
      return toReturn;
    }
    public java.lang.String getTerm()  {
      java.lang.String toReturn = ICategoryAutoBean.this.getWrapped().getTerm();
      return toReturn;
    }
    public void setLabel(java.lang.String label)  {
      ICategoryAutoBean.this.getWrapped().setLabel(label);
      ICategoryAutoBean.this.set("setLabel", label);
    }
    public void setScheme(java.lang.String scheme)  {
      ICategoryAutoBean.this.getWrapped().setScheme(scheme);
      ICategoryAutoBean.this.set("setScheme", scheme);
    }
    public void setTerm(java.lang.String term)  {
      ICategoryAutoBean.this.getWrapped().setTerm(term);
      ICategoryAutoBean.this.set("setTerm", term);
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
  public ICategoryAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ICategoryAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.ICategory wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.ICategory as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.ICategory> getType() {return com.biplav.tweedeo.client.youtube.api.models.ICategory.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.ICategory createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.ICategory() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.ICategoryAutoBean.this.data;
      public java.lang.String getLabel()  {
        return (java.lang.String) getOrReify("label");
      }
      public java.lang.String getScheme()  {
        return (java.lang.String) getOrReify("scheme");
      }
      public java.lang.String getTerm()  {
        return (java.lang.String) getOrReify("term");
      }
      public void setLabel(java.lang.String label)  {
        setProperty("label", label);
      }
      public void setScheme(java.lang.String scheme)  {
        setProperty("scheme", scheme);
      }
      public void setTerm(java.lang.String term)  {
        setProperty("term", term);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.ICategory as = as();
    value = as.getLabel();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ICategoryAutoBean.this, "label"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("label", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("label", value, propertyContext);
    value = as.getScheme();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ICategoryAutoBean.this, "scheme"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("scheme", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("scheme", value, propertyContext);
    value = as.getTerm();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ICategoryAutoBean.this, "term"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("term", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("term", value, propertyContext);
  }
}
