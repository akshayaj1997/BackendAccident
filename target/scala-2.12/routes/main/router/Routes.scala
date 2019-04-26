// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lavanya/Documents/Dev/accidentBack/conf/routes
// @DATE:Thu Apr 25 10:07:59 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_2: controllers.UserController,
  // @LINE:16
  ImagesController_4: controllers.ImagesController,
  // @LINE:24
  RHomeController_5: controllers.RHomeController,
  // @LINE:49
  CountController_0: controllers.CountController,
  // @LINE:51
  AsyncController_1: controllers.AsyncController,
  // @LINE:54
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_2: controllers.UserController,
    // @LINE:16
    ImagesController_4: controllers.ImagesController,
    // @LINE:24
    RHomeController_5: controllers.RHomeController,
    // @LINE:49
    CountController_0: controllers.CountController,
    // @LINE:51
    AsyncController_1: controllers.AsyncController,
    // @LINE:54
    Assets_3: controllers.Assets
  ) = this(errorHandler, UserController_2, ImagesController_4, RHomeController_5, CountController_0, AsyncController_1, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_2, ImagesController_4, RHomeController_5, CountController_0, AsyncController_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UserController.getCurrentUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UserController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UserController.signOutUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/update""", """controllers.UserController.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allUsers""", """controllers.UserController.getAllUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospital""", """controllers.UserController.registerHospital()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """passive/""" + "$" + """id<[^/]+>""", """controllers.UserController.activeToPassive(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.deleteImage(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/home/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.getImagesByHomeId(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes""", """controllers.RHomeController.createHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.getHomeByHomeId(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """approved""", """controllers.RHomeController.getApprovedListofUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pending""", """controllers.RHomeController.getPendingListofUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homelist""", """controllers.RHomeController.getHomeByUsername()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reported""", """controllers.RHomeController.getreportedListofUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes1""", """controllers.RHomeController.filters()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homesearch""", """controllers.RHomeController.homesearch()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/admin/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.requestedHomeDeletionByAdmin(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/report/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.reportedHomeDeletionByAdmin(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/users/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.homeDeletionByUser(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.updateHomeBooking(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/pending/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.changePendingStatus(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/report/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.reportHome(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homes/deleterequest/""" + "$" + """id<[^/]+>""", """controllers.RHomeController.changeDeleteRequestStatus(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_registerUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_registerUser0_invoker = createInvoker(
    UserController_2.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_getCurrentUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/me")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser1_invoker = createInvoker(
    UserController_2.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/me""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_signInUser2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UserController_signInUser2_invoker = createInvoker(
    UserController_2.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """users/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_signOutUser3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UserController_signOutUser3_invoker = createInvoker(
    UserController_2.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """users/signout""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_updateUser4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/update")))
  )
  private[this] lazy val controllers_UserController_updateUser4_invoker = createInvoker(
    UserController_2.updateUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Nil,
      "PUT",
      this.prefix + """users/update""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_getAllUsers5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allUsers")))
  )
  private[this] lazy val controllers_UserController_getAllUsers5_invoker = createInvoker(
    UserController_2.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """allUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_registerHospital6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospital")))
  )
  private[this] lazy val controllers_UserController_registerHospital6_invoker = createInvoker(
    UserController_2.registerHospital(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerHospital",
      Nil,
      "POST",
      this.prefix + """hospital""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_activeToPassive7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("passive/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_activeToPassive7_invoker = createInvoker(
    UserController_2.activeToPassive(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "activeToPassive",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """passive/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ImagesController_uploadImage8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_uploadImage8_invoker = createInvoker(
    ImagesController_4.uploadImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "uploadImage",
      Nil,
      "POST",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ImagesController_downloadImage9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_downloadImage9_invoker = createInvoker(
    ImagesController_4.downloadImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ImagesController_deleteImage10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_deleteImage10_invoker = createInvoker(
    ImagesController_4.deleteImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ImagesController_getImagesByHomeId11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/home/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_getImagesByHomeId11_invoker = createInvoker(
    ImagesController_4.getImagesByHomeId(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "getImagesByHomeId",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """images/home/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RHomeController_createHome12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes")))
  )
  private[this] lazy val controllers_RHomeController_createHome12_invoker = createInvoker(
    RHomeController_5.createHome(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "createHome",
      Nil,
      "POST",
      this.prefix + """homes""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RHomeController_getHomeByHomeId13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_getHomeByHomeId13_invoker = createInvoker(
    RHomeController_5.getHomeByHomeId(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "getHomeByHomeId",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """homes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_RHomeController_getApprovedListofUsers14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("approved")))
  )
  private[this] lazy val controllers_RHomeController_getApprovedListofUsers14_invoker = createInvoker(
    RHomeController_5.getApprovedListofUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "getApprovedListofUsers",
      Nil,
      "GET",
      this.prefix + """approved""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RHomeController_getPendingListofUsers15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pending")))
  )
  private[this] lazy val controllers_RHomeController_getPendingListofUsers15_invoker = createInvoker(
    RHomeController_5.getPendingListofUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "getPendingListofUsers",
      Nil,
      "GET",
      this.prefix + """pending""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RHomeController_getHomeByUsername16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homelist")))
  )
  private[this] lazy val controllers_RHomeController_getHomeByUsername16_invoker = createInvoker(
    RHomeController_5.getHomeByUsername(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "getHomeByUsername",
      Nil,
      "POST",
      this.prefix + """homelist""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_RHomeController_getreportedListofUsers17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reported")))
  )
  private[this] lazy val controllers_RHomeController_getreportedListofUsers17_invoker = createInvoker(
    RHomeController_5.getreportedListofUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "getreportedListofUsers",
      Nil,
      "GET",
      this.prefix + """reported""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_RHomeController_filters18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes1")))
  )
  private[this] lazy val controllers_RHomeController_filters18_invoker = createInvoker(
    RHomeController_5.filters(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "filters",
      Nil,
      "POST",
      this.prefix + """homes1""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_RHomeController_homesearch19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homesearch")))
  )
  private[this] lazy val controllers_RHomeController_homesearch19_invoker = createInvoker(
    RHomeController_5.homesearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "homesearch",
      Nil,
      "POST",
      this.prefix + """homesearch""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RHomeController_requestedHomeDeletionByAdmin20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/admin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_requestedHomeDeletionByAdmin20_invoker = createInvoker(
    RHomeController_5.requestedHomeDeletionByAdmin(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "requestedHomeDeletionByAdmin",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """homes/admin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_RHomeController_reportedHomeDeletionByAdmin21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/report/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_reportedHomeDeletionByAdmin21_invoker = createInvoker(
    RHomeController_5.reportedHomeDeletionByAdmin(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "reportedHomeDeletionByAdmin",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """homes/report/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_RHomeController_homeDeletionByUser22_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_homeDeletionByUser22_invoker = createInvoker(
    RHomeController_5.homeDeletionByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "homeDeletionByUser",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """homes/users/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_RHomeController_updateHomeBooking23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_updateHomeBooking23_invoker = createInvoker(
    RHomeController_5.updateHomeBooking(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "updateHomeBooking",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """homes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_RHomeController_changePendingStatus24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/pending/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_changePendingStatus24_invoker = createInvoker(
    RHomeController_5.changePendingStatus(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "changePendingStatus",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """homes/pending/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RHomeController_reportHome25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/report/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_reportHome25_invoker = createInvoker(
    RHomeController_5.reportHome(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "reportHome",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """homes/report/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_RHomeController_changeDeleteRequestStatus26_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homes/deleterequest/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RHomeController_changeDeleteRequestStatus26_invoker = createInvoker(
    RHomeController_5.changeDeleteRequestStatus(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RHomeController",
      "changeDeleteRequestStatus",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """homes/deleterequest/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_CountController_count27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count27_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_AsyncController_message28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message28_invoker = createInvoker(
    AsyncController_1.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_versioned29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned29_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_UserController_registerUser0_route(params@_) =>
      call { 
        controllers_UserController_registerUser0_invoker.call(UserController_2.registerUser())
      }
  
    // @LINE:7
    case controllers_UserController_getCurrentUser1_route(params@_) =>
      call { 
        controllers_UserController_getCurrentUser1_invoker.call(UserController_2.getCurrentUser())
      }
  
    // @LINE:8
    case controllers_UserController_signInUser2_route(params@_) =>
      call { 
        controllers_UserController_signInUser2_invoker.call(UserController_2.signInUser())
      }
  
    // @LINE:9
    case controllers_UserController_signOutUser3_route(params@_) =>
      call { 
        controllers_UserController_signOutUser3_invoker.call(UserController_2.signOutUser())
      }
  
    // @LINE:10
    case controllers_UserController_updateUser4_route(params@_) =>
      call { 
        controllers_UserController_updateUser4_invoker.call(UserController_2.updateUser())
      }
  
    // @LINE:11
    case controllers_UserController_getAllUsers5_route(params@_) =>
      call { 
        controllers_UserController_getAllUsers5_invoker.call(UserController_2.getAllUsers())
      }
  
    // @LINE:12
    case controllers_UserController_registerHospital6_route(params@_) =>
      call { 
        controllers_UserController_registerHospital6_invoker.call(UserController_2.registerHospital())
      }
  
    // @LINE:13
    case controllers_UserController_activeToPassive7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_activeToPassive7_invoker.call(UserController_2.activeToPassive(id))
      }
  
    // @LINE:16
    case controllers_ImagesController_uploadImage8_route(params@_) =>
      call { 
        controllers_ImagesController_uploadImage8_invoker.call(ImagesController_4.uploadImage())
      }
  
    // @LINE:17
    case controllers_ImagesController_downloadImage9_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_downloadImage9_invoker.call(ImagesController_4.downloadImage(id))
      }
  
    // @LINE:18
    case controllers_ImagesController_deleteImage10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_deleteImage10_invoker.call(ImagesController_4.deleteImage(id))
      }
  
    // @LINE:19
    case controllers_ImagesController_getImagesByHomeId11_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ImagesController_getImagesByHomeId11_invoker.call(ImagesController_4.getImagesByHomeId(id))
      }
  
    // @LINE:24
    case controllers_RHomeController_createHome12_route(params@_) =>
      call { 
        controllers_RHomeController_createHome12_invoker.call(RHomeController_5.createHome())
      }
  
    // @LINE:26
    case controllers_RHomeController_getHomeByHomeId13_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_getHomeByHomeId13_invoker.call(RHomeController_5.getHomeByHomeId(id))
      }
  
    // @LINE:27
    case controllers_RHomeController_getApprovedListofUsers14_route(params@_) =>
      call { 
        controllers_RHomeController_getApprovedListofUsers14_invoker.call(RHomeController_5.getApprovedListofUsers())
      }
  
    // @LINE:28
    case controllers_RHomeController_getPendingListofUsers15_route(params@_) =>
      call { 
        controllers_RHomeController_getPendingListofUsers15_invoker.call(RHomeController_5.getPendingListofUsers())
      }
  
    // @LINE:29
    case controllers_RHomeController_getHomeByUsername16_route(params@_) =>
      call { 
        controllers_RHomeController_getHomeByUsername16_invoker.call(RHomeController_5.getHomeByUsername())
      }
  
    // @LINE:32
    case controllers_RHomeController_getreportedListofUsers17_route(params@_) =>
      call { 
        controllers_RHomeController_getreportedListofUsers17_invoker.call(RHomeController_5.getreportedListofUsers())
      }
  
    // @LINE:33
    case controllers_RHomeController_filters18_route(params@_) =>
      call { 
        controllers_RHomeController_filters18_invoker.call(RHomeController_5.filters())
      }
  
    // @LINE:34
    case controllers_RHomeController_homesearch19_route(params@_) =>
      call { 
        controllers_RHomeController_homesearch19_invoker.call(RHomeController_5.homesearch())
      }
  
    // @LINE:36
    case controllers_RHomeController_requestedHomeDeletionByAdmin20_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_requestedHomeDeletionByAdmin20_invoker.call(RHomeController_5.requestedHomeDeletionByAdmin(id))
      }
  
    // @LINE:37
    case controllers_RHomeController_reportedHomeDeletionByAdmin21_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_reportedHomeDeletionByAdmin21_invoker.call(RHomeController_5.reportedHomeDeletionByAdmin(id))
      }
  
    // @LINE:38
    case controllers_RHomeController_homeDeletionByUser22_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_homeDeletionByUser22_invoker.call(RHomeController_5.homeDeletionByUser(id))
      }
  
    // @LINE:40
    case controllers_RHomeController_updateHomeBooking23_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_updateHomeBooking23_invoker.call(RHomeController_5.updateHomeBooking(id))
      }
  
    // @LINE:41
    case controllers_RHomeController_changePendingStatus24_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_changePendingStatus24_invoker.call(RHomeController_5.changePendingStatus(id))
      }
  
    // @LINE:42
    case controllers_RHomeController_reportHome25_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_reportHome25_invoker.call(RHomeController_5.reportHome(id))
      }
  
    // @LINE:43
    case controllers_RHomeController_changeDeleteRequestStatus26_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RHomeController_changeDeleteRequestStatus26_invoker.call(RHomeController_5.changeDeleteRequestStatus(id))
      }
  
    // @LINE:49
    case controllers_CountController_count27_route(params@_) =>
      call { 
        controllers_CountController_count27_invoker.call(CountController_0.count)
      }
  
    // @LINE:51
    case controllers_AsyncController_message28_route(params@_) =>
      call { 
        controllers_AsyncController_message28_invoker.call(AsyncController_1.message)
      }
  
    // @LINE:54
    case controllers_Assets_versioned29_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned29_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
