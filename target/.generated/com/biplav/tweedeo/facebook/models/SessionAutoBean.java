package com.biplav.tweedeo.facebook.models;

public class SessionAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.Session> {
  private final com.biplav.tweedeo.facebook.models.Session shim = new com.biplav.tweedeo.facebook.models.Session() {
    public com.biplav.tweedeo.facebook.models.AuthResponse getAuthResponse()  {
      com.biplav.tweedeo.facebook.models.AuthResponse toReturn = SessionAutoBean.this.getWrapped().getAuthResponse();
      if (toReturn != null) {
        if (SessionAutoBean.this.isWrapped(toReturn)) {
          toReturn = SessionAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new com.biplav.tweedeo.facebook.models.AuthResponseAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.lang.String getStatus()  {
      java.lang.String toReturn = SessionAutoBean.this.getWrapped().getStatus();
      return toReturn;
    }
    public void setAuthResponse(com.biplav.tweedeo.facebook.models.AuthResponse authResponse)  {
      SessionAutoBean.this.getWrapped().setAuthResponse(authResponse);
      SessionAutoBean.this.set("setAuthResponse", authResponse);
    }
    public void setStatus(java.lang.String status)  {
      SessionAutoBean.this.getWrapped().setStatus(status);
      SessionAutoBean.this.set("setStatus", status);
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
  public SessionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public SessionAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.Session wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.Session as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.Session> getType() {return com.biplav.tweedeo.facebook.models.Session.class;}
  @Override protected com.biplav.tweedeo.facebook.models.Session createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.Session() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.SessionAutoBean.this.data;
      public com.biplav.tweedeo.facebook.models.AuthResponse getAuthResponse()  {
        return (com.biplav.tweedeo.facebook.models.AuthResponse) getOrReify("authResponse");
      }
      public java.lang.String getStatus()  {
        return (java.lang.String) getOrReify("status");
      }
      public void setAuthResponse(com.biplav.tweedeo.facebook.models.AuthResponse authResponse)  {
        setProperty("authResponse", authResponse);
      }
      public void setStatus(java.lang.String status)  {
        setProperty("status", status);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.biplav.tweedeo.facebook.models.Session as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getAuthResponse());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(SessionAutoBean.this, "authResponse"),
      com.biplav.tweedeo.facebook.models.AuthResponse.class
    );
    if (visitor.visitReferenceProperty("authResponse", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("authResponse", bean, propertyContext);
    value = as.getStatus();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(SessionAutoBean.this, "status"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("status", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("status", value, propertyContext);
  }
}
