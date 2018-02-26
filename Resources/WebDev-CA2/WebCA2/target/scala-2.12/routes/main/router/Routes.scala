
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Thu Dec 21 18:47:08 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:24
  LoginController_2: controllers.LoginController,
  // @LINE:29
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:24
    LoginController_2: controllers.LoginController,
    // @LINE:29
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """venues""", """controllers.HomeController.venues"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutus""", """controllers.HomeController.aboutus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.HomeController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addevent""", """controllers.HomeController.addEvent"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addvenue""", """controllers.HomeController.addVenue"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addVenueSubmit""", """controllers.HomeController.addVenueSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteVenue/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteVenue(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateVenue/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateVenue(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_events1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events1_invoker = createInvoker(
    HomeController_0.events(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "events",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """events""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_venues2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("venues")))
  )
  private[this] lazy val controllers_HomeController_venues2_invoker = createInvoker(
    HomeController_0.venues,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "venues",
      Nil,
      "GET",
      this.prefix + """venues""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_aboutus3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutus")))
  )
  private[this] lazy val controllers_HomeController_aboutus3_invoker = createInvoker(
    HomeController_0.aboutus,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutus",
      Nil,
      "GET",
      this.prefix + """aboutus""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile4_invoker = createInvoker(
    HomeController_0.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_form5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_HomeController_form5_invoker = createInvoker(
    HomeController_0.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "form",
      Nil,
      "GET",
      this.prefix + """form""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_cart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart6_invoker = createInvoker(
    HomeController_0.cart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addEvent7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent7_invoker = createInvoker(
    HomeController_0.addEvent,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEvent",
      Nil,
      "GET",
      this.prefix + """addevent""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_addEventSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit8_invoker = createInvoker(
    HomeController_0.addEventSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEventSubmit",
      Nil,
      "POST",
      this.prefix + """addEventSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_deleteEvent9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent9_invoker = createInvoker(
    HomeController_0.deleteEvent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEvent",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteEvent/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_updateEvent10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent10_invoker = createInvoker(
    HomeController_0.updateEvent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEvent",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateEvent/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addVenue11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addvenue")))
  )
  private[this] lazy val controllers_HomeController_addVenue11_invoker = createInvoker(
    HomeController_0.addVenue,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addVenue",
      Nil,
      "GET",
      this.prefix + """addvenue""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addVenueSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addVenueSubmit")))
  )
  private[this] lazy val controllers_HomeController_addVenueSubmit12_invoker = createInvoker(
    HomeController_0.addVenueSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addVenueSubmit",
      Nil,
      "POST",
      this.prefix + """addVenueSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteVenue13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteVenue/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteVenue13_invoker = createInvoker(
    HomeController_0.deleteVenue(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteVenue",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteVenue/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateVenue14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateVenue/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateVenue14_invoker = createInvoker(
    HomeController_0.updateVenue(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateVenue",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateVenue/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_login15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login15_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_LoginController_loginSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit16_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout17_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_events1_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events1_invoker.call(HomeController_0.events(cat))
      }
  
    // @LINE:8
    case controllers_HomeController_venues2_route(params@_) =>
      call { 
        controllers_HomeController_venues2_invoker.call(HomeController_0.venues)
      }
  
    // @LINE:9
    case controllers_HomeController_aboutus3_route(params@_) =>
      call { 
        controllers_HomeController_aboutus3_invoker.call(HomeController_0.aboutus)
      }
  
    // @LINE:10
    case controllers_HomeController_profile4_route(params@_) =>
      call { 
        controllers_HomeController_profile4_invoker.call(HomeController_0.profile)
      }
  
    // @LINE:11
    case controllers_HomeController_form5_route(params@_) =>
      call { 
        controllers_HomeController_form5_invoker.call(HomeController_0.form)
      }
  
    // @LINE:12
    case controllers_HomeController_cart6_route(params@_) =>
      call { 
        controllers_HomeController_cart6_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:14
    case controllers_HomeController_addEvent7_route(params@_) =>
      call { 
        controllers_HomeController_addEvent7_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:15
    case controllers_HomeController_addEventSubmit8_route(params@_) =>
      call { 
        controllers_HomeController_addEventSubmit8_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_deleteEvent9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent9_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:17
    case controllers_HomeController_updateEvent10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent10_invoker.call(HomeController_0.updateEvent(id))
      }
  
    // @LINE:19
    case controllers_HomeController_addVenue11_route(params@_) =>
      call { 
        controllers_HomeController_addVenue11_invoker.call(HomeController_0.addVenue)
      }
  
    // @LINE:20
    case controllers_HomeController_addVenueSubmit12_route(params@_) =>
      call { 
        controllers_HomeController_addVenueSubmit12_invoker.call(HomeController_0.addVenueSubmit)
      }
  
    // @LINE:21
    case controllers_HomeController_deleteVenue13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteVenue13_invoker.call(HomeController_0.deleteVenue(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateVenue14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateVenue14_invoker.call(HomeController_0.updateVenue(id))
      }
  
    // @LINE:24
    case controllers_LoginController_login15_route(params@_) =>
      call { 
        controllers_LoginController_login15_invoker.call(LoginController_2.login)
      }
  
    // @LINE:25
    case controllers_LoginController_loginSubmit16_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit16_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:26
    case controllers_LoginController_logout17_route(params@_) =>
      call { 
        controllers_LoginController_logout17_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:29
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
