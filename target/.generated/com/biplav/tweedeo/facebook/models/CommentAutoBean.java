package com.biplav.tweedeo.facebook.models;

public class CommentAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Comment> {
  private final com.biplav.tweedeo.facebook.models.Comment shim = new com.biplav.tweedeo.facebook.models.Comment() {
    public com.biplav.tweedeo.facebook.models.FacebookUserDetails getFrom()  {
      com.biplav.tweedeo.facebook.models.FacebookUserDetails toReturn = CommentAutoBean.this.getWrapped().getFrom();
      if (toReturn != null) {
        if (CommentAutoBean.this.isWrapped(toReturn)) {
          toReturn = CommentAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.FacebookUserDetailsAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.lang.String getCreated_time()  {
      java.lang.String toReturn = CommentAutoBean.this.getWrapped().getCreated_time();
      return toReturn;
    }
    public java.lang.String getId()  {
      java.lang.String toReturn = CommentAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getMessage()  {
      java.lang.String toReturn = CommentAutoBean.this.getWrapped().getMessage();
      return toReturn;
    }
    public void setCreated_time(java.lang.String created_time)  {
      CommentAutoBean.this.getWrapped().setCreated_time(created_time);
      CommentAutoBean.this.set("setCreated_time", created_time);
    }
    public void setFrom(com.biplav.tweedeo.facebook.models.FacebookUserDetails from)  {
      CommentAutoBean.this.getWrapped().setFrom(from);
      CommentAutoBean.this.set("setFrom", from);
    }
    public void setId(java.lang.String Id)  {
      CommentAutoBean.this.getWrapped().setId(Id);
      CommentAutoBean.this.set("setId", Id);
    }
    public void setMessage(java.lang.String message)  {
      CommentAutoBean.this.getWrapped().setMessage(message);
      CommentAutoBean.this.set("setMessage", message);
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
  public CommentAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public CommentAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Comment wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Comment as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Comment> getType() {return com.biplav.tweedeo.facebook.models.Comment.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Comment createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Comment() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.CommentAutoBean.this.data;
      public com.biplav.tweedeo.facebook.models.FacebookUserDetails getFrom()  {
        return (com.biplav.tweedeo.facebook.models.FacebookUserDetails) getOrReify("from");
      }
      public java.lang.String getCreated_time()  {
        return (java.lang.String) getOrReify("created_time");
      }
      public java.lang.String getId()  {
        return (java.lang.String) getOrReify("id");
      }
      public java.lang.String getMessage()  {
        return (java.lang.String) getOrReify("message");
      }
      public void setCreated_time(java.lang.String created_time)  {
        setProperty("created_time", created_time);
      }
      public void setFrom(com.biplav.tweedeo.facebook.models.FacebookUserDetails from)  {
        setProperty("from", from);
      }
      public void setId(java.lang.String Id)  {
        setProperty("id", Id);
      }
      public void setMessage(java.lang.String message)  {
        setProperty("message", message);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Comment as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getFrom());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentAutoBean.this, "from"),
      com.biplav.tweedeo.facebook.models.FacebookUserDetails.class
    );
    if (visitor.visitReferenceProperty("from", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("from", bean, propertyContext);
    value = as.getCreated_time();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentAutoBean.this, "created_time"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("created_time", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("created_time", value, propertyContext);
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentAutoBean.this, "id"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getMessage();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(CommentAutoBean.this, "message"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("message", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("message", value, propertyContext);
  }
}
