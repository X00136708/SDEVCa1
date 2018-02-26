
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

object addEvent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Events],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(eventForm: Form[models.Events], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/temp("Add Event", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new event</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addEventSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(eventForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.79*/("""
    """),_display_(/*13.6*/inputText(eventForm("venue"), '_label -> "Venue", 'class -> "form-control")),format.raw/*13.81*/("""
        """),_display_(/*14.10*/select(
            eventForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*19.14*/("""

    """),_display_(/*21.6*/inputText(eventForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*21.79*/("""
    """),_display_(/*22.6*/inputText(eventForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.81*/("""

    """),_display_(/*24.6*/inputText(eventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.68*/("""

    """),format.raw/*26.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Event" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.events(0)),format.raw/*29.50*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(eventForm:Form[models.Events],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(eventForm,user)

  def f:((Form[models.Events],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (eventForm,user) => apply(eventForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:22:37 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/addEvent.scala.html
                  HASH: 4a02f50ffb9032303d433f18f13d5f563385a812
                  MATRIX: 982->1|1112->63|1157->58|1187->80|1215->83|1246->106|1285->108|1313->110|1392->164|1498->261|1538->263|1577->276|1590->280|1621->290|1656->299|1750->372|1783->379|1879->454|1917->465|2181->708|2216->717|2310->790|2343->797|2439->872|2474->881|2557->943|2592->951|2742->1074|2757->1080|2803->1105|2941->1213
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|51->19|53->21|53->21|54->22|54->22|56->24|56->24|58->26|61->29|61->29|61->29|66->34
                  -- GENERATED --
              */
          