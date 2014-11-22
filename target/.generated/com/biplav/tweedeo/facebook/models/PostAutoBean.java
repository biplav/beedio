package com.biplav.tweedeo.facebook.models;

public class PostAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Post> {
  private final com.biplav.tweedeo.facebook.models.Post shim = new com.biplav.tweedeo.facebook.models.Post() {
    public com.biplav.tweedeo.facebook.models.Application getApplication()  {
      com.biplav.tweedeo.facebook.models.Application toReturn = PostAutoBean.this.getWrapped().getApplication();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.ApplicationAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public com.biplav.tweedeo.facebook.models.Comments getComments()  {
      com.biplav.tweedeo.facebook.models.Comments toReturn = PostAutoBean.this.getWrapped().getComments();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.CommentsAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public com.biplav.tweedeo.facebook.models.FacebookUserDetails getFrom()  {
      com.biplav.tweedeo.facebook.models.FacebookUserDetails toReturn = PostAutoBean.this.getWrapped().getFrom();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.FacebookUserDetailsAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public com.biplav.tweedeo.facebook.models.Likes getLikes()  {
      com.biplav.tweedeo.facebook.models.Likes toReturn = PostAutoBean.this.getWrapped().getLikes();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.LikesAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public com.biplav.tweedeo.facebook.models.Likes getShare()  {
      com.biplav.tweedeo.facebook.models.Likes toReturn = PostAutoBean.this.getWrapped().getShare();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.LikesAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.lang.String getCaption()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getCaption();
      return toReturn;
    }
    public java.lang.String getCreated_time()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getCreated_time();
      return toReturn;
    }
    public java.lang.String getDescription()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getDescription();
      return toReturn;
    }
    public java.lang.String getIcon()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getIcon();
      return toReturn;
    }
    public java.lang.String getId()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getId();
      return toReturn;
    }
    public java.lang.String getLink()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getLink();
      return toReturn;
    }
    public java.lang.String getMessage()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getMessage();
      return toReturn;
    }
    public java.lang.String getMessage_tags()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getMessage_tags();
      return toReturn;
    }
    public java.lang.String getName()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getName();
      return toReturn;
    }
    public java.lang.String getObject_id()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getObject_id();
      return toReturn;
    }
    public java.lang.String getPicture()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getPicture();
      return toReturn;
    }
    public java.lang.String getPlace()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getPlace();
      return toReturn;
    }
    public java.lang.String getPrivacy()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getPrivacy();
      return toReturn;
    }
    public java.lang.String getSource()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getSource();
      return toReturn;
    }
    public java.lang.String getStory()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getStory();
      return toReturn;
    }
    public java.lang.String getStory_tags()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getStory_tags();
      return toReturn;
    }
    public java.lang.String getType()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getType();
      return toReturn;
    }
    public java.lang.String getUpdated_time()  {
      java.lang.String toReturn = PostAutoBean.this.getWrapped().getUpdated_time();
      return toReturn;
    }
    public java.util.List getActions()  {
      java.util.List toReturn = PostAutoBean.this.getWrapped().getActions();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getTo()  {
      java.util.List toReturn = PostAutoBean.this.getWrapped().getTo();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.List getProperties()  {
      java.util.List toReturn = PostAutoBean.this.getWrapped().getProperties();
      if (toReturn != null) {
        if (PostAutoBean.this.isWrapped(toReturn)) {
          toReturn = PostAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.ListAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setActions(java.util.List actions)  {
      PostAutoBean.this.getWrapped().setActions(actions);
      PostAutoBean.this.set("setActions", actions);
    }
    public void setApplication(com.biplav.tweedeo.facebook.models.Application application)  {
      PostAutoBean.this.getWrapped().setApplication(application);
      PostAutoBean.this.set("setApplication", application);
    }
    public void setCaption(java.lang.String caption)  {
      PostAutoBean.this.getWrapped().setCaption(caption);
      PostAutoBean.this.set("setCaption", caption);
    }
    public void setComments(com.biplav.tweedeo.facebook.models.Comments comments)  {
      PostAutoBean.this.getWrapped().setComments(comments);
      PostAutoBean.this.set("setComments", comments);
    }
    public void setCreated_time(java.lang.String created_time)  {
      PostAutoBean.this.getWrapped().setCreated_time(created_time);
      PostAutoBean.this.set("setCreated_time", created_time);
    }
    public void setDescription(java.lang.String decription)  {
      PostAutoBean.this.getWrapped().setDescription(decription);
      PostAutoBean.this.set("setDescription", decription);
    }
    public void setFrom(com.biplav.tweedeo.facebook.models.FacebookUserDetails from)  {
      PostAutoBean.this.getWrapped().setFrom(from);
      PostAutoBean.this.set("setFrom", from);
    }
    public void setIcon(java.lang.String icon)  {
      PostAutoBean.this.getWrapped().setIcon(icon);
      PostAutoBean.this.set("setIcon", icon);
    }
    public void setId(java.lang.String id)  {
      PostAutoBean.this.getWrapped().setId(id);
      PostAutoBean.this.set("setId", id);
    }
    public void setLikes(com.biplav.tweedeo.facebook.models.Likes likes)  {
      PostAutoBean.this.getWrapped().setLikes(likes);
      PostAutoBean.this.set("setLikes", likes);
    }
    public void setLink(java.lang.String link)  {
      PostAutoBean.this.getWrapped().setLink(link);
      PostAutoBean.this.set("setLink", link);
    }
    public void setMessage(java.lang.String message)  {
      PostAutoBean.this.getWrapped().setMessage(message);
      PostAutoBean.this.set("setMessage", message);
    }
    public void setMessage_tags(java.lang.String message_tags)  {
      PostAutoBean.this.getWrapped().setMessage_tags(message_tags);
      PostAutoBean.this.set("setMessage_tags", message_tags);
    }
    public void setName(java.lang.String name)  {
      PostAutoBean.this.getWrapped().setName(name);
      PostAutoBean.this.set("setName", name);
    }
    public void setObject_id(java.lang.String object_id)  {
      PostAutoBean.this.getWrapped().setObject_id(object_id);
      PostAutoBean.this.set("setObject_id", object_id);
    }
    public void setPicture(java.lang.String picture)  {
      PostAutoBean.this.getWrapped().setPicture(picture);
      PostAutoBean.this.set("setPicture", picture);
    }
    public void setPlace(java.lang.String place)  {
      PostAutoBean.this.getWrapped().setPlace(place);
      PostAutoBean.this.set("setPlace", place);
    }
    public void setPrivacy(java.lang.String privacy)  {
      PostAutoBean.this.getWrapped().setPrivacy(privacy);
      PostAutoBean.this.set("setPrivacy", privacy);
    }
    public void setProperties(java.util.List properties)  {
      PostAutoBean.this.getWrapped().setProperties(properties);
      PostAutoBean.this.set("setProperties", properties);
    }
    public void setShare(com.biplav.tweedeo.facebook.models.Likes likes)  {
      PostAutoBean.this.getWrapped().setShare(likes);
      PostAutoBean.this.set("setShare", likes);
    }
    public void setSource(java.lang.String source)  {
      PostAutoBean.this.getWrapped().setSource(source);
      PostAutoBean.this.set("setSource", source);
    }
    public void setStory(java.lang.String story)  {
      PostAutoBean.this.getWrapped().setStory(story);
      PostAutoBean.this.set("setStory", story);
    }
    public void setStory_tags(java.lang.String story_tags)  {
      PostAutoBean.this.getWrapped().setStory_tags(story_tags);
      PostAutoBean.this.set("setStory_tags", story_tags);
    }
    public void setTo(java.util.List toList)  {
      PostAutoBean.this.getWrapped().setTo(toList);
      PostAutoBean.this.set("setTo", toList);
    }
    public void setType(java.lang.String type)  {
      PostAutoBean.this.getWrapped().setType(type);
      PostAutoBean.this.set("setType", type);
    }
    public void setUpdated_time(java.lang.String updated_time)  {
      PostAutoBean.this.getWrapped().setUpdated_time(updated_time);
      PostAutoBean.this.set("setUpdated_time", updated_time);
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
  public PostAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public PostAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Post wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Post as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Post> getType() {return com.biplav.tweedeo.facebook.models.Post.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Post createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Post() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.PostAutoBean.this.data;
      public com.biplav.tweedeo.facebook.models.Application getApplication()  {
        return (com.biplav.tweedeo.facebook.models.Application) getOrReify("application");
      }
      public com.biplav.tweedeo.facebook.models.Comments getComments()  {
        return (com.biplav.tweedeo.facebook.models.Comments) getOrReify("comments");
      }
      public com.biplav.tweedeo.facebook.models.FacebookUserDetails getFrom()  {
        return (com.biplav.tweedeo.facebook.models.FacebookUserDetails) getOrReify("from");
      }
      public com.biplav.tweedeo.facebook.models.Likes getLikes()  {
        return (com.biplav.tweedeo.facebook.models.Likes) getOrReify("likes");
      }
      public com.biplav.tweedeo.facebook.models.Likes getShare()  {
        return (com.biplav.tweedeo.facebook.models.Likes) getOrReify("share");
      }
      public java.lang.String getCaption()  {
        return (java.lang.String) getOrReify("caption");
      }
      public java.lang.String getCreated_time()  {
        return (java.lang.String) getOrReify("created_time");
      }
      public java.lang.String getDescription()  {
        return (java.lang.String) getOrReify("description");
      }
      public java.lang.String getIcon()  {
        return (java.lang.String) getOrReify("icon");
      }
      public java.lang.String getId()  {
        return (java.lang.String) getOrReify("id");
      }
      public java.lang.String getLink()  {
        return (java.lang.String) getOrReify("link");
      }
      public java.lang.String getMessage()  {
        return (java.lang.String) getOrReify("message");
      }
      public java.lang.String getMessage_tags()  {
        return (java.lang.String) getOrReify("message_tags");
      }
      public java.lang.String getName()  {
        return (java.lang.String) getOrReify("name");
      }
      public java.lang.String getObject_id()  {
        return (java.lang.String) getOrReify("object_id");
      }
      public java.lang.String getPicture()  {
        return (java.lang.String) getOrReify("picture");
      }
      public java.lang.String getPlace()  {
        return (java.lang.String) getOrReify("place");
      }
      public java.lang.String getPrivacy()  {
        return (java.lang.String) getOrReify("privacy");
      }
      public java.lang.String getSource()  {
        return (java.lang.String) getOrReify("source");
      }
      public java.lang.String getStory()  {
        return (java.lang.String) getOrReify("story");
      }
      public java.lang.String getStory_tags()  {
        return (java.lang.String) getOrReify("story_tags");
      }
      public java.lang.String getType()  {
        return (java.lang.String) getOrReify("type");
      }
      public java.lang.String getUpdated_time()  {
        return (java.lang.String) getOrReify("updated_time");
      }
      public java.util.List getActions()  {
        return (java.util.List) getOrReify("actions");
      }
      public java.util.List getTo()  {
        return (java.util.List) getOrReify("to");
      }
      public java.util.List getProperties()  {
        return (java.util.List) getOrReify("properties");
      }
      public void setActions(java.util.List actions)  {
        setProperty("actions", actions);
      }
      public void setApplication(com.biplav.tweedeo.facebook.models.Application application)  {
        setProperty("application", application);
      }
      public void setCaption(java.lang.String caption)  {
        setProperty("caption", caption);
      }
      public void setComments(com.biplav.tweedeo.facebook.models.Comments comments)  {
        setProperty("comments", comments);
      }
      public void setCreated_time(java.lang.String created_time)  {
        setProperty("created_time", created_time);
      }
      public void setDescription(java.lang.String decription)  {
        setProperty("description", decription);
      }
      public void setFrom(com.biplav.tweedeo.facebook.models.FacebookUserDetails from)  {
        setProperty("from", from);
      }
      public void setIcon(java.lang.String icon)  {
        setProperty("icon", icon);
      }
      public void setId(java.lang.String id)  {
        setProperty("id", id);
      }
      public void setLikes(com.biplav.tweedeo.facebook.models.Likes likes)  {
        setProperty("likes", likes);
      }
      public void setLink(java.lang.String link)  {
        setProperty("link", link);
      }
      public void setMessage(java.lang.String message)  {
        setProperty("message", message);
      }
      public void setMessage_tags(java.lang.String message_tags)  {
        setProperty("message_tags", message_tags);
      }
      public void setName(java.lang.String name)  {
        setProperty("name", name);
      }
      public void setObject_id(java.lang.String object_id)  {
        setProperty("object_id", object_id);
      }
      public void setPicture(java.lang.String picture)  {
        setProperty("picture", picture);
      }
      public void setPlace(java.lang.String place)  {
        setProperty("place", place);
      }
      public void setPrivacy(java.lang.String privacy)  {
        setProperty("privacy", privacy);
      }
      public void setProperties(java.util.List properties)  {
        setProperty("properties", properties);
      }
      public void setShare(com.biplav.tweedeo.facebook.models.Likes likes)  {
        setProperty("share", likes);
      }
      public void setSource(java.lang.String source)  {
        setProperty("source", source);
      }
      public void setStory(java.lang.String story)  {
        setProperty("story", story);
      }
      public void setStory_tags(java.lang.String story_tags)  {
        setProperty("story_tags", story_tags);
      }
      public void setTo(java.util.List toList)  {
        setProperty("to", toList);
      }
      public void setType(java.lang.String type)  {
        setProperty("type", type);
      }
      public void setUpdated_time(java.lang.String updated_time)  {
        setProperty("updated_time", updated_time);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Post as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getApplication());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "application"),
      com.biplav.tweedeo.facebook.models.Application.class
    );
    if (visitor.visitReferenceProperty("application", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("application", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getComments());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "comments"),
      com.biplav.tweedeo.facebook.models.Comments.class
    );
    if (visitor.visitReferenceProperty("comments", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("comments", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getFrom());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "from"),
      com.biplav.tweedeo.facebook.models.FacebookUserDetails.class
    );
    if (visitor.visitReferenceProperty("from", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("from", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getLikes());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "likes"),
      com.biplav.tweedeo.facebook.models.Likes.class
    );
    if (visitor.visitReferenceProperty("likes", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("likes", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getShare());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "share"),
      com.biplav.tweedeo.facebook.models.Likes.class
    );
    if (visitor.visitReferenceProperty("share", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("share", bean, propertyContext);
    value = as.getCaption();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "caption"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("caption", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("caption", value, propertyContext);
    value = as.getCreated_time();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "created_time"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("created_time", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("created_time", value, propertyContext);
    value = as.getDescription();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "description"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("description", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("description", value, propertyContext);
    value = as.getIcon();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "icon"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("icon", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("icon", value, propertyContext);
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "id"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getLink();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "link"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("link", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("link", value, propertyContext);
    value = as.getMessage();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "message"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("message", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("message", value, propertyContext);
    value = as.getMessage_tags();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "message_tags"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("message_tags", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("message_tags", value, propertyContext);
    value = as.getName();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "name"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("name", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("name", value, propertyContext);
    value = as.getObject_id();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "object_id"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("object_id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("object_id", value, propertyContext);
    value = as.getPicture();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "picture"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("picture", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("picture", value, propertyContext);
    value = as.getPlace();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "place"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("place", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("place", value, propertyContext);
    value = as.getPrivacy();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "privacy"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("privacy", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("privacy", value, propertyContext);
    value = as.getSource();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "source"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("source", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("source", value, propertyContext);
    value = as.getStory();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "story"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("story", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("story", value, propertyContext);
    value = as.getStory_tags();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "story_tags"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("story_tags", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("story_tags", value, propertyContext);
    value = as.getType();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "type"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("type", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("type", value, propertyContext);
    value = as.getUpdated_time();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "updated_time"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("updated_time", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("updated_time", value, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getActions());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "actions"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.Action.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("actions", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("actions", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getTo());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "to"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.FacebookUserDetails.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("to", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("to", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getProperties());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(PostAutoBean.this, "properties"),
      new Class<?>[] {java.util.List.class, com.biplav.tweedeo.facebook.models.Property.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("properties", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("properties", bean, propertyContext);
  }
}
