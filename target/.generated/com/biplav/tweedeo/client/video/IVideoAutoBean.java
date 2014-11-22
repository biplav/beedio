package com.biplav.tweedeo.client.video;

public class IVideoAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.video.IVideo> {
  private final com.biplav.tweedeo.client.video.IVideo shim = new com.biplav.tweedeo.client.video.IVideo() {
    public com.biplav.tweedeo.facebook.models.Post getPost()  {
      com.biplav.tweedeo.facebook.models.Post toReturn = IVideoAutoBean.this.getWrapped().getPost();
      if (toReturn != null) {
        if (IVideoAutoBean.this.isWrapped(toReturn)) {
          toReturn = IVideoAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.PostAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public int getBeedioScore()  {
      int toReturn = IVideoAutoBean.this.getWrapped().getBeedioScore();
      return toReturn;
    }
    public java.lang.String getStatus()  {
      java.lang.String toReturn = IVideoAutoBean.this.getWrapped().getStatus();
      return toReturn;
    }
    public java.lang.String getUrl()  {
      java.lang.String toReturn = IVideoAutoBean.this.getWrapped().getUrl();
      return toReturn;
    }
    public java.lang.String getUserId()  {
      java.lang.String toReturn = IVideoAutoBean.this.getWrapped().getUserId();
      return toReturn;
    }
    public void setBeedioScore(int score)  {
      IVideoAutoBean.this.getWrapped().setBeedioScore(score);
      IVideoAutoBean.this.set("setBeedioScore", score);
    }
    public void setPost(com.biplav.tweedeo.facebook.models.Post post)  {
      IVideoAutoBean.this.getWrapped().setPost(post);
      IVideoAutoBean.this.set("setPost", post);
    }
    public void setStatus(java.lang.String status)  {
      IVideoAutoBean.this.getWrapped().setStatus(status);
      IVideoAutoBean.this.set("setStatus", status);
    }
    public void setUrl(java.lang.String url)  {
      IVideoAutoBean.this.getWrapped().setUrl(url);
      IVideoAutoBean.this.set("setUrl", url);
    }
    public void setUserId(java.lang.String userId)  {
      IVideoAutoBean.this.getWrapped().setUserId(userId);
      IVideoAutoBean.this.set("setUserId", userId);
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
  public IVideoAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public IVideoAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.video.IVideo wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.video.IVideo as() {return shim;}
  public Class<com.biplav.tweedeo.client.video.IVideo> getType() {return com.biplav.tweedeo.client.video.IVideo.class;}
  @Override protected com.biplav.tweedeo.client.video.IVideo createSimplePeer() {
    return new com.biplav.tweedeo.client.video.IVideo() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.video.IVideoAutoBean.this.data;
      public com.biplav.tweedeo.facebook.models.Post getPost()  {
        return (com.biplav.tweedeo.facebook.models.Post) getOrReify("post");
      }
      public int getBeedioScore()  {
        java.lang.Integer toReturn = getOrReify("beedioScore");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.String getStatus()  {
        return (java.lang.String) getOrReify("status");
      }
      public java.lang.String getUrl()  {
        return (java.lang.String) getOrReify("url");
      }
      public java.lang.String getUserId()  {
        return (java.lang.String) getOrReify("userId");
      }
      public void setBeedioScore(int score)  {
        setProperty("beedioScore", score);
      }
      public void setPost(com.biplav.tweedeo.facebook.models.Post post)  {
        setProperty("post", post);
      }
      public void setStatus(java.lang.String status)  {
        setProperty("status", status);
      }
      public void setUrl(java.lang.String url)  {
        setProperty("url", url);
      }
      public void setUserId(java.lang.String userId)  {
        setProperty("userId", userId);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.video.IVideo as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getPost());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IVideoAutoBean.this, "post"),
      com.biplav.tweedeo.facebook.models.Post.class
    );
    if (visitor.visitReferenceProperty("post", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("post", bean, propertyContext);
    value = as.getBeedioScore();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IVideoAutoBean.this, "beedioScore"),
      int.class
    );
    if (visitor.visitValueProperty("beedioScore", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("beedioScore", value, propertyContext);
    value = as.getStatus();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IVideoAutoBean.this, "status"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("status", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("status", value, propertyContext);
    value = as.getUrl();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IVideoAutoBean.this, "url"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("url", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("url", value, propertyContext);
    value = as.getUserId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(IVideoAutoBean.this, "userId"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("userId", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("userId", value, propertyContext);
  }
}
