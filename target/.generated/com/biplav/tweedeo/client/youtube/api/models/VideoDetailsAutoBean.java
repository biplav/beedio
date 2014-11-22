package com.biplav.tweedeo.client.youtube.api.models;

public class VideoDetailsAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.VideoDetails> {
  private final com.biplav.tweedeo.client.youtube.api.models.VideoDetails shim = new com.biplav.tweedeo.client.youtube.api.models.VideoDetails() {
    public com.biplav.tweedeo.client.youtube.api.models.Entry getEntry()  {
      com.biplav.tweedeo.client.youtube.api.models.Entry toReturn = VideoDetailsAutoBean.this.getWrapped().getEntry();
      if (toReturn != null) {
        if (VideoDetailsAutoBean.this.isWrapped(toReturn)) {
          toReturn = VideoDetailsAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.client.youtube.api.models.EntryAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setEntry(com.biplav.tweedeo.client.youtube.api.models.Entry entry)  {
      VideoDetailsAutoBean.this.getWrapped().setEntry(entry);
      VideoDetailsAutoBean.this.set("setEntry", entry);
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
  public VideoDetailsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public VideoDetailsAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.VideoDetails wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.VideoDetails as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.VideoDetails> getType() {return com.biplav.tweedeo.client.youtube.api.models.VideoDetails.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.VideoDetails createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.VideoDetails() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.VideoDetailsAutoBean.this.data;
      public com.biplav.tweedeo.client.youtube.api.models.Entry getEntry()  {
        return (com.biplav.tweedeo.client.youtube.api.models.Entry) getOrReify("entry");
      }
      public void setEntry(com.biplav.tweedeo.client.youtube.api.models.Entry entry)  {
        setProperty("entry", entry);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.VideoDetails as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getEntry());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(VideoDetailsAutoBean.this, "entry"),
      com.biplav.tweedeo.client.youtube.api.models.Entry.class
    );
    if (visitor.visitReferenceProperty("entry", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("entry", bean, propertyContext);
  }
}
