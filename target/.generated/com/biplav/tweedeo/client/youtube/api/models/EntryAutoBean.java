package com.biplav.tweedeo.client.youtube.api.models;

public class EntryAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.client.youtube.api.models.Entry> {
  private final com.biplav.tweedeo.client.youtube.api.models.Entry shim = new com.biplav.tweedeo.client.youtube.api.models.Entry() {
    public com.biplav.tweedeo.client.youtube.api.models.MediaGroup getMedia$group()  {
      com.biplav.tweedeo.client.youtube.api.models.MediaGroup toReturn = EntryAutoBean.this.getWrapped().getMedia$group();
      if (toReturn != null) {
        if (EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.client.youtube.api.models.MediaGroupAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public com.biplav.tweedeo.client.youtube.api.models.Rating getGd$rating()  {
      com.biplav.tweedeo.client.youtube.api.models.Rating toReturn = EntryAutoBean.this.getWrapped().getGd$rating();
      if (toReturn != null) {
        if (EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.client.youtube.api.models.RatingAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getCategory()  {
      java.util.List toReturn = EntryAutoBean.this.getWrapped().getCategory();
      if (toReturn != null) {
        if (EntryAutoBean.this.isWrapped(toReturn)) {
          toReturn = EntryAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setCategory(java.util.List category)  {
      EntryAutoBean.this.getWrapped().setCategory(category);
      EntryAutoBean.this.set("setCategory", category);
    }
    public void setGd$rating(com.biplav.tweedeo.client.youtube.api.models.Rating gd$rating)  {
      EntryAutoBean.this.getWrapped().setGd$rating(gd$rating);
      EntryAutoBean.this.set("setGd$rating", gd$rating);
    }
    public void setMedia$group(com.biplav.tweedeo.client.youtube.api.models.MediaGroup media$Group)  {
      EntryAutoBean.this.getWrapped().setMedia$group(media$Group);
      EntryAutoBean.this.set("setMedia$group", media$Group);
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
  public EntryAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public EntryAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.client.youtube.api.models.Entry wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.client.youtube.api.models.Entry as() {return shim;}
  public Class<com.biplav.tweedeo.client.youtube.api.models.Entry> getType() {return com.biplav.tweedeo.client.youtube.api.models.Entry.class;}
  @Override protected com.biplav.tweedeo.client.youtube.api.models.Entry createSimplePeer() {
    return new com.biplav.tweedeo.client.youtube.api.models.Entry() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.client.youtube.api.models.EntryAutoBean.this.data;
      public com.biplav.tweedeo.client.youtube.api.models.MediaGroup getMedia$group()  {
        return (com.biplav.tweedeo.client.youtube.api.models.MediaGroup) getOrReify("media$group");
      }
      public com.biplav.tweedeo.client.youtube.api.models.Rating getGd$rating()  {
        return (com.biplav.tweedeo.client.youtube.api.models.Rating) getOrReify("gd$rating");
      }
      public java.util.List getCategory()  {
        return (java.util.List) getOrReify("category");
      }
      public void setCategory(java.util.List category)  {
        setProperty("category", category);
      }
      public void setGd$rating(com.biplav.tweedeo.client.youtube.api.models.Rating gd$rating)  {
        setProperty("gd$rating", gd$rating);
      }
      public void setMedia$group(com.biplav.tweedeo.client.youtube.api.models.MediaGroup media$Group)  {
        setProperty("media$group", media$Group);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.client.youtube.api.models.Entry as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getMedia$group());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(EntryAutoBean.this, "media$group"),
      com.biplav.tweedeo.client.youtube.api.models.MediaGroup.class
    );
    if (visitor.visitReferenceProperty("media$group", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("media$group", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getGd$rating());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(EntryAutoBean.this, "gd$rating"),
      com.biplav.tweedeo.client.youtube.api.models.Rating.class
    );
    if (visitor.visitReferenceProperty("gd$rating", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("gd$rating", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getCategory());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(EntryAutoBean.this, "category"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.client.youtube.api.models.ICategory.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("category", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("category", bean, propertyContext);
  }
}
