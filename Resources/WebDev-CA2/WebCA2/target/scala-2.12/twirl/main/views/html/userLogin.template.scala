
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/temp("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""

    
        """),format.raw/*7.9*/("""<p>Sign in</p>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/{_display_(Seq[Any](format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/("""
            """),format.raw/*11.13*/("""</p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/("""
        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*18.80*/ {_display_(Seq[Any](format.raw/*18.82*/("""
            """),_display_(/*19.14*/CSRF/*19.18*/.formField),format.raw/*19.28*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                """),_display_(/*21.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*22.76*/("""
            """),format.raw/*23.13*/("""</div>
            <div class="form-group">
                    """),_display_(/*25.22*/inputPassword(loginForm("password"), '_label -> "",
                    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*26.83*/("""
            """),format.raw/*27.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign in" class="btn btn-primary">
            </div>
        """)))}),format.raw/*31.10*/("""
    
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 17:19:33 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/userLogin.scala.html
                  HASH: ad41065c4559121d178f970b104a1f67dcf1efab
                  MATRIX: 988->1|1123->66|1168->63|1196->83|1224->86|1251->105|1290->107|1334->125|1385->150|1422->179|1460->180|1501->194|1578->244|1596->253|1637->273|1679->287|1725->302|1763->313|1802->343|1842->345|1884->359|1961->409|1975->414|2017->435|2059->449|2105->464|2143->475|2158->481|2231->545|2271->547|2313->562|2326->566|2357->576|2399->590|2469->633|2611->754|2653->768|2747->835|2903->970|2945->984|3130->1138
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|53->21|54->22|55->23|57->25|58->26|59->27|63->31
                  -- GENERATED --
              */
          