package com.biplav.tweedeo.facebook.models;

public class FeedAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Feed> {
  private final com.biplav.tweedeo.facebook.models.Feed shim = new com.biplav.tweedeo.facebook.models.Feed() {
    public com.biplav.tweedeo.facebook.models.Paging getPaging()  {
      com.biplav.tweedeo.facebook.models.Paging toReturn = FeedAutoBean.this.getWrapped().getPaging();
      if (toReturn != null) {
        if (FeedAutoBean.this.isWrapped(toReturn)) {
          toReturn = FeedAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.PagingAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getData()  {
      java.util.List toReturn = FeedAutoBean.this.getWrapped().getData();
      if (toReturn != null) {
        if (FeedAutoBean.this.isWrapped(toReturn)) {
          toReturn = FeedAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setData(java.util.List post)  {
      FeedAutoBean.this.getWrapped().setData(post);
      FeedAutoBean.this.set("setData", post);
    }
    public void setPaging(com.biplav.tweedeo.facebook.models.Paging paging)  {
      FeedAutoBean.this.getWrapped().setPaging(paging);
      FeedAutoBean.this.set("setPaging", paging);
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
  public FeedAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public FeedAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Feed wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Feed as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Feed> getType() {return com.biplav.tweedeo.facebook.models.Feed.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Feed createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Feed() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.FeedAutoBean.this.data;
      public com.biplav.tweedeo.facebook.models.Paging getPaging()  {
        return (com.biplav.tweedeo.facebook.models.Paging) getOrReify("paging");
      }
      public java.util.List getData()  {
        return (java.util.List) getOrReify("data");
      }
      public void setData(java.util.List post)  {
        setProperty("data", post);
      }
      public void setPaging(com.biplav.tweedeo.facebook.models.Paging paging)  {
        setProperty("paging", paging);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Feed as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getPaging());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(FeedAutoBean.this, "paging"),
      com.biplav.tweedeo.facebook.models.Paging.class
    );
    if (visitor.visitReferenceProperty("paging", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("paging", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getData());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(FeedAutoBean.this, "data"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.Post.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("data", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("data", bean, propertyContext);
  }
}
