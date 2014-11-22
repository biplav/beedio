package com.biplav.tweedeo.client.youtube.api.models;

public class RatingAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.Rating> {
  private final com.biplav.tweedeo.client.youtube.api.models.Rating shim = new com.biplav.tweedeo.client.youtube.api.models.Rating() {
    public java.lang.String getAverage()  {
      java.lang.String toReturn = RatingAutoBean.this.getWrapped().getAverage();
      return toReturn;
    }
    public java.lang.String getMax()  {
      java.lang.String toReturn = RatingAutoBean.this.getWrapped().getMax();
      return toReturn;
    }
    public java.lang.String getMin()  {
      java.lang.String toReturn = RatingAutoBean.this.getWrapped().getMin();
      return toReturn;
    }
    public java.lang.String getRel()  {
      java.lang.String toReturn = RatingAutoBean.this.getWrapped().getRel();
      return toReturn;
    }
    public void setAverage(java.lang.String average)  {
      RatingAutoBean.this.getWrapped().setAverage(average);
      RatingAutoBean.this.set("setAverage", average);
    }
    public void setMax(java.lang.String scheme)  {
      RatingAutoBean.this.getWrapped().setMax(scheme);
      RatingAutoBean.this.set("setMax", scheme);
    }
    public void setMin(java.lang.String term)  {
      RatingAutoBean.this.getWrapped().setMin(term);
      RatingAutoBean.this.set("setMin", term);
    }
    public void setRel(java.lang.String term)  {
      RatingAutoBean.this.getWrapped().setRel(term);
      RatingAutoBean.this.set("setRel", term);
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
  public RatingAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public RatingAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.Rating wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.Rating as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.Rating> getType() {return com.biplav.tweedeo.client.youtube.api.models.Rating.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.Rating createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.Rating() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.RatingAutoBean.this.data;
      public java.lang.String getAverage()  {
        return (java.lang.String) getOrReify("average");
      }
      public java.lang.String getMax()  {
        return (java.lang.String) getOrReify("max");
      }
      public java.lang.String getMin()  {
        return (java.lang.String) getOrReify("min");
      }
      public java.lang.String getRel()  {
        return (java.lang.String) getOrReify("rel");
      }
      public void setAverage(java.lang.String average)  {
        setProperty("average", average);
      }
      public void setMax(java.lang.String scheme)  {
        setProperty("max", scheme);
      }
      public void setMin(java.lang.String term)  {
        setProperty("min", term);
      }
      public void setRel(java.lang.String term)  {
        setProperty("rel", term);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.Rating as = as();
    value = as.getAverage();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(RatingAutoBean.this, "average"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("average", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("average", value, propertyContext);
    value = as.getMax();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(RatingAutoBean.this, "max"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("max", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("max", value, propertyContext);
    value = as.getMin();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(RatingAutoBean.this, "min"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("min", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("min", value, propertyContext);
    value = as.getRel();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(RatingAutoBean.this, "rel"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("rel", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("rel", value, propertyContext);
  }
}
