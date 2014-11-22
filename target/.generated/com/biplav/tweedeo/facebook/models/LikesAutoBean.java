package com.biplav.tweedeo.facebook.models;

public class LikesAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Likes> {
  private final com.biplav.tweedeo.facebook.models.Likes shim = new com.biplav.tweedeo.facebook.models.Likes() {
    public int getCount()  {
      int toReturn = LikesAutoBean.this.getWrapped().getCount();
      return toReturn;
    }
    public java.util.List getData()  {
      java.util.List toReturn = LikesAutoBean.this.getWrapped().getData();
      if (toReturn != null) {
        if (LikesAutoBean.this.isWrapped(toReturn)) {
          toReturn = LikesAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setCount(int count)  {
      LikesAutoBean.this.getWrapped().setCount(count);
      LikesAutoBean.this.set("setCount", count);
    }
    public void setData(java.util.List data)  {
      LikesAutoBean.this.getWrapped().setData(data);
      LikesAutoBean.this.set("setData", data);
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
  public LikesAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public LikesAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Likes wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Likes as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Likes> getType() {return com.biplav.tweedeo.facebook.models.Likes.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Likes createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Likes() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.LikesAutoBean.this.data;
      public int getCount()  {
        java.lang.Integer toReturn = getOrReify("count");
        return toReturn == null ? 0 : toReturn;
      }
      public java.util.List getData()  {
        return (java.util.List) getOrReify("data");
      }
      public void setCount(int count)  {
        setProperty("count", count);
      }
      public void setData(java.util.List data)  {
        setProperty("data", data);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Likes as = as();
    value = as.getCount();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(LikesAutoBean.this, "count"),
      int.class
    );
    if (visitor.visitValueProperty("count", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("count", value, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getData());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(LikesAutoBean.this, "data"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.FacebookUserDetails.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("data", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("data", bean, propertyContext);
  }
}
