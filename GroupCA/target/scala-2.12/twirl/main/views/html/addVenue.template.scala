
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

object addVenue extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Venues],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(venueForm: Form[models.Venues], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/temp("Add Venue", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new venue</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addVenueSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(venueForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.79*/("""
    """),_display_(/*13.6*/inputText(venueForm("country"), '_label -> "Country", 'class -> "form-control")),format.raw/*13.85*/("""
    """),_display_(/*14.6*/inputText(venueForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*14.79*/("""
    """),_display_(/*15.6*/inputText(venueForm("capacity"), '_label -> "Capacity", 'class -> "form-control")),format.raw/*15.87*/("""

    """),_display_(/*17.6*/inputText(venueForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.68*/("""

    """),format.raw/*19.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Venue" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.venues),format.raw/*22.47*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(venueForm:Form[models.Venues],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(venueForm,user)

  def f:((Form[models.Venues],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (venueForm,user) => apply(venueForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 17:00:50 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/addVenue.scala.html
                  HASH: 0b48529878a31bca2541046a3052319a0d8b56f6
                  MATRIX: 982->1|1112->63|1157->58|1187->80|1215->83|1246->106|1285->108|1313->110|1392->164|1498->261|1538->263|1577->276|1590->280|1621->290|1656->299|1750->372|1783->379|1883->458|1916->465|2010->538|2043->545|2145->626|2180->635|2263->697|2298->705|2448->828|2463->834|2506->856|2644->964
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          