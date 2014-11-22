package com.biplav.tweedeo.client.youtube.api.models;

public class IThumbnailAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.IThumbnail> {
  private final com.biplav.tweedeo.client.youtube.api.models.IThumbnail shim = new com.biplav.tweedeo.client.youtube.api.models.IThumbnail() {
    public java.lang.String getHeight()  {
      java.lang.String toReturn = IThumbnailAutoBean.this.getWrapped().getHeight();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = IThumbnailAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.lang.String getUrl()  {
      java.lang.String toReturn = IThumbnailAutoBean.this.getWrapped().getUrl();
      return toReturn;
    }
    public java.lang.String getWidth()  {
      java.lang.String toReturn = IThumbnailAutoBean.this.getWrapped().getWidth();
      return toReturn;
    }
    public void setHeight(java.lang.String height)  {
      IThumbnailAutoBean.this.getWrapped().setHeight(height);
      IThumbnailAutoBean.this.set("setHeight", height);
    }
    public void setName(java.lang.String name)  {
      IThumbnailAutoBean.this.getWrapped().setName(name);
      IThumbnailAutoBean.this.set("setName", name);
    }
    public void setUrl(java.lang.String url)  {
      IThumbnailAutoBean.this.getWrapped().setUrl(url);
      IThumbnailAutoBean.this.set("setUrl", url);
    }
    public void setWidth(java.lang.String width)  {
      IThumbnailAutoBean.this.getWrapped().setWidth(width);
      IThumbnailAutoBean.this.set("setWidth", width);
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
  public IThumbnailAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public IThumbnailAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.IThumbnail wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.IThumbnail as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.IThumbnail> getType() {return com.biplav.tweedeo.client.youtube.api.models.IThumbnail.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.IThumbnail createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.IThumbnail() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.IThumbnailAutoBean.this.data;
      public java.lang.String getHeight()  {
        return (java.lang.String) getOrReify("height");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public java.lang.String getUrl()  {
        return (java.lang.String) getOrReify("url");
      }
      public java.lang.String getWidth()  {
        return (java.lang.String) getOrReify("width");
      }
      public void setHeight(java.lang.String height)  {
        setProperty("height", height);
      }
      public void setName(java.lang.String name)  {
        setProperty("name", name);
      }
      public void setUrl(java.lang.String url)  {
        setProperty("url", url);
      }
      public void setWidth(java.lang.String width)  {
        setProperty("width", width);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.IThumbnail as = as();
    value = as.getHeight();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IThumbnailAutoBean.this, "height"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("height", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("height", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IThumbnailAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    value = as.getUrl();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IThumbnailAutoBean.this, "url"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("url", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("url", value, propertyContext);
    value = as.getWidth();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IThumbnailAutoBean.this, "width"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("width", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("width", value, propertyContext);
  }
}
