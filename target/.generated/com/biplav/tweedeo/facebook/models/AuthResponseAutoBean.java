package com.biplav.tweedeo.facebook.models;

public class AuthResponseAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.biplav.tweedeo.facebook.models.AuthResponse> {
  private final com.biplav.tweedeo.facebook.models.AuthResponse shim = new com.biplav.tweedeo.facebook.models.AuthResponse() {
    public java.lang.String getAccessToken()  {
      java.lang.String toReturn = AuthResponseAutoBean.this.getWrapped().getAccessToken();
      return toReturn;
    }
    public java.lang.String getExpiresIn()  {
      java.lang.String toReturn = AuthResponseAutoBean.this.getWrapped().getExpiresIn();
      return toReturn;
    }
    public java.lang.String getSignedRequest()  {
      java.lang.String toReturn = AuthResponseAutoBean.this.getWrapped().getSignedRequest();
      return toReturn;
    }
    public java.lang.String getUserId()  {
      java.lang.String toReturn = AuthResponseAutoBean.this.getWrapped().getUserId();
      return toReturn;
    }
    public void setAccessToken(java.lang.String accessToken)  {
      AuthResponseAutoBean.this.getWrapped().setAccessToken(accessToken);
      AuthResponseAutoBean.this.set("setAccessToken", accessToken);
    }
    public void setExpiresIn(java.lang.String expiresIn)  {
      AuthResponseAutoBean.this.getWrapped().setExpiresIn(expiresIn);
      AuthResponseAutoBean.this.set("setExpiresIn", expiresIn);
    }
    public void setSignedRequest(java.lang.String signedRequest)  {
      AuthResponseAutoBean.this.getWrapped().setSignedRequest(signedRequest);
      AuthResponseAutoBean.this.set("setSignedRequest", signedRequest);
    }
    public void setUserId(java.lang.String userId)  {
      AuthResponseAutoBean.this.getWrapped().setUserId(userId);
      AuthResponseAutoBean.this.set("setUserId", userId);
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
  public AuthResponseAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public AuthResponseAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.biplav.tweedeo.facebook.models.AuthResponse wrapped) {
    super(wrapped, factory);
  }
  public com.biplav.tweedeo.facebook.models.AuthResponse as() {return shim;}
  public Class<com.biplav.tweedeo.facebook.models.AuthResponse> getType() {return com.biplav.tweedeo.facebook.models.AuthResponse.class;}
  @Override protected com.biplav.tweedeo.facebook.models.AuthResponse createSimplePeer() {
    return new com.biplav.tweedeo.facebook.models.AuthResponse() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.biplav.tweedeo.facebook.models.AuthResponseAutoBean.this.data;
      public java.lang.String getAccessToken()  {
        return (java.lang.String) getOrReify("accessToken");
      }
      public java.lang.String getExpiresIn()  {
        return (java.lang.String) getOrReify("expiresIn");
      }
      public java.lang.String getSignedRequest()  {
        return (java.lang.String) getOrReify("signedRequest");
      }
      public java.lang.String getUserId()  {
        return (java.lang.String) getOrReify("userId");
      }
      public void setAccessToken(java.lang.String accessToken)  {
        setProperty("accessToken", accessToken);
      }
      public void setExpiresIn(java.lang.String expiresIn)  {
        setProperty("expiresIn", expiresIn);
      }
      public void setSignedRequest(java.lang.String signedRequest)  {
        setProperty("signedRequest", signedRequest);
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
    com.biplav.tweedeo.facebook.models.AuthResponse as = as();
    value = as.getAccessToken();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(AuthResponseAutoBean.this, "accessToken"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("accessToken", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("accessToken", value, propertyContext);
    value = as.getExpiresIn();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(AuthResponseAutoBean.this, "expiresIn"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("expiresIn", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("expiresIn", value, propertyContext);
    value = as.getSignedRequest();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(AuthResponseAutoBean.this, "signedRequest"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("signedRequest", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("signedRequest", value, propertyContext);
    value = as.getUserId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(AuthResponseAutoBean.this, "userId"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("userId", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("userId", value, propertyContext);
  }
}
