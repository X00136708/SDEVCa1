
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Thu Dec 21 18:47:08 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:20
    def addVenueSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addVenueSubmit")
    }
  
    // @LINE:16
    def deleteEvent(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteEvent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def updateEvent(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEvent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def addEvent(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addevent")
    }
  
    // @LINE:10
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:8
    def venues(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "venues")
    }
  
    // @LINE:11
    def form(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "form")
    }
  
    // @LINE:19
    def addVenue(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addvenue")
    }
  
    // @LINE:7
    def events(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "events" + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:22
    def updateVenue(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateVenue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def addEventSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEventSubmit")
    }
  
    // @LINE:9
    def aboutus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutus")
    }
  
    // @LINE:21
    def deleteVenue(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteVenue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:26
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:24
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
