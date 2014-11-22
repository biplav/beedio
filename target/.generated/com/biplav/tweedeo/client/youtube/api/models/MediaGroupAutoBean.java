package com.biplav.tweedeo.client.youtube.api.models;

public class MediaGroupAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.MediaGroup> {
  private final com.biplav.tweedeo.client.youtube.api.models.MediaGroup shim = new com.biplav.tweedeo.client.youtube.api.models.MediaGroup() {
    public com.biplav.tweedeo.client.youtube.api.models.IMediaDescription getMedia$description()  {
      com.biplav.tweedeo.client.youtube.api.models.IMediaDescription toReturn = MediaGroupAutoBean.this.getWrapped().getMedia$description();
      if (toReturn != null) {
        if (MediaGroupAutoBean.this.isWrapped(toReturn)) {
          toReturn = MediaGroupAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.client.youtube.api.models.IMediaDescriptionAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getMedia$thumbnail()  {
      java.util.List toReturn = MediaGroupAutoBean.this.getWrapped().getMedia$thumbnail();
      if (toReturn != null) {
        if (MediaGroupAutoBean.this.isWrapped(toReturn)) {
          toReturn = MediaGroupAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setMedia$description(com.biplav.tweedeo.client.youtube.api.models.IMediaDescription mediaDescription)  {
      MediaGroupAutoBean.this.getWrapped().setMedia$description(mediaDescription);
      MediaGroupAutoBean.this.set("setMedia$description", mediaDescription);
    }
    public void setMedia$thumbnail(java.util.List thumbnail)  {
      MediaGroupAutoBean.this.getWrapped().setMedia$thumbnail(thumbnail);
      MediaGroupAutoBean.this.set("setMedia$thumbnail", thumbnail);
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
  public MediaGroupAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public MediaGroupAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.MediaGroup wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.MediaGroup as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.MediaGroup> getType() {return com.biplav.tweedeo.client.youtube.api.models.MediaGroup.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.MediaGroup createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.MediaGroup() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.MediaGroupAutoBean.this.data;
      public com.biplav.tweedeo.client.youtube.api.models.IMediaDescription getMedia$description()  {
        return (com.biplav.tweedeo.client.youtube.api.models.IMediaDescription) getOrReify("media$description");
      }
      public java.util.List getMedia$thumbnail()  {
        return (java.util.List) getOrReify("media$thumbnail");
      }
      public void setMedia$description(com.biplav.tweedeo.client.youtube.api.models.IMediaDescription mediaDescription)  {
        setProperty("media$description", mediaDescription);
      }
      public void setMedia$thumbnail(java.util.List thumbnail)  {
        setProperty("media$thumbnail", thumbnail);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.MediaGroup as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getMedia$description());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(MediaGroupAutoBean.this, "media$description"),
      com.biplav.tweedeo.client.youtube.api.models.IMediaDescription.class
    );
    if (visitor.visitReferenceProperty("media$description", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("media$description", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getMedia$thumbnail());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(MediaGroupAutoBean.this, "media$thumbnail"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.client.youtube.api.models.IThumbnail.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("media$thumbnail", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("media$thumbnail", bean, propertyContext);
  }
}
