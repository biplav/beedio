package com.biplav.tweedeo.facebook.models;

public class CommentsAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Comments> {
  private final com.biplav.tweedeo.facebook.models.Comments shim = new com.biplav.tweedeo.facebook.models.Comments() {
    public int getCount()  {
      int toReturn = CommentsAutoBean.this.getWrapped().getCount();
      return toReturn;
    }
    public java.util.List getData()  {
      java.util.List toReturn = CommentsAutoBean.this.getWrapped().getData();
      if (toReturn != null) {
        if (CommentsAutoBean.this.isWrapped(toReturn)) {
          toReturn = CommentsAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setCount(int count)  {
      CommentsAutoBean.this.getWrapped().setCount(count);
      CommentsAutoBean.this.set("setCount", count);
    }
    public void setData(java.util.List comments)  {
      CommentsAutoBean.this.getWrapped().setData(comments);
      CommentsAutoBean.this.set("setData", comments);
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
  public CommentsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public CommentsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Comments wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Comments as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Comments> getType() {return com.biplav.tweedeo.facebook.models.Comments.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Comments createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Comments() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.CommentsAutoBean.this.data;
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
      public void setData(java.util.List comments)  {
        setProperty("data", comments);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Comments as = as();
    value = as.getCount();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentsAutoBean.this, "count"),
      int.class
    );
    if (visitor.visitValueProperty("count", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("count", value, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getData());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentsAutoBean.this, "data"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.Comment.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("data", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("data", bean, propertyContext);
  }
}
