
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Thu Dec 21 18:47:08 GMT 2017


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
