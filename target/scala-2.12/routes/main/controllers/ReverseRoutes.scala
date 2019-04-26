// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lavanya/Documents/Dev/accidentBack/conf/routes
// @DATE:Thu Apr 25 10:07:59 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:54
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseRHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def homeDeletionByUser(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "homes/users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:26
    def getHomeByHomeId(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "homes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:32
    def getreportedListofUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reported")
    }
  
    // @LINE:40
    def updateHomeBooking(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "homes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:42
    def reportHome(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "homes/report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:33
    def filters(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "homes1")
    }
  
    // @LINE:34
    def homesearch(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "homesearch")
    }
  
    // @LINE:37
    def reportedHomeDeletionByAdmin(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "homes/report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:27
    def getApprovedListofUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "approved")
    }
  
    // @LINE:29
    def getHomeByUsername(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "homelist")
    }
  
    // @LINE:24
    def createHome(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "homes")
    }
  
    // @LINE:43
    def changeDeleteRequestStatus(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "homes/deleterequest/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:28
    def getPendingListofUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pending")
    }
  
    // @LINE:41
    def changePendingStatus(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "homes/pending/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:36
    def requestedHomeDeletionByAdmin(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "homes/admin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:49
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def getCurrentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/me")
    }
  
    // @LINE:12
    def registerHospital(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "hospital")
    }
  
    // @LINE:10
    def updateUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/update")
    }
  
    // @LINE:8
    def signInUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:13
    def activeToPassive(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "passive/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:6
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:9
    def signOutUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signout")
    }
  
    // @LINE:11
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "allUsers")
    }
  
  }

  // @LINE:51
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseImagesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def downloadImage(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "images/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:18
    def deleteImage(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:19
    def getImagesByHomeId(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "images/home/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def uploadImage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }


}
