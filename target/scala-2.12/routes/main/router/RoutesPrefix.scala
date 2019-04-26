// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/lavanya/Documents/Dev/accidentBack/conf/routes
// @DATE:Thu Apr 25 10:07:59 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
