
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

object temp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script data-require="jquery@3.0.0" data-semver="3.0.0" src="/assets/javascripts/jquery.js"></script>
    <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
    <link data-require="bootstrap-css@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
    <link data-require="bootstrap@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="/assets/stylesheets/main.css" />
    <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
</head>

<body>

    <title>Venues</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
                """),_display_(/*31.18*/if(user != null )/*31.35*/{_display_(Seq[Any](format.raw/*31.36*/("""
				"""),format.raw/*32.5*/("""<li><a href="/profile">My Profile</a></li>
                <li><a href="/logout">Logout</a></li>
                <li><a href="/cart">Shopping Cart</a></li>
                """)))}/*35.19*/else/*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
                """),format.raw/*36.17*/("""<li><a href="/login">Login</a></li>    
                """)))}),format.raw/*37.18*/("""
    """),format.raw/*38.5*/("""</nav>

<container>

<div class="row">
<div class="col-md-12">
<div class="content">
"""),_display_(/*45.2*/content),format.raw/*45.9*/("""
"""),format.raw/*46.1*/("""</div>
</div>
</div>

</container>

<container>

<div class="row">
<div class="col-md-12">
</div>
</div>

</container>

<div class="footer">
    <img src="/assets/images/Concert.jpg">
    </img></div>
<script src=""""),_display_(/*64.15*/routes/*64.21*/.Assets.versioned("javascripts/main.js")),format.raw/*64.61*/(""""></script>
</body>

</html> """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:47:08 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/temp.scala.html
                  HASH: 2d541bc342378ec816de3950c812c6da6b2cf5bf
                  MATRIX: 970->1|1120->56|1150->60|2488->1374|2514->1391|2553->1392|2586->1398|2781->1575|2794->1580|2833->1581|2879->1599|2968->1657|3001->1663|3120->1756|3147->1763|3176->1765|3436->1998|3451->2004|3512->2044
                  LINES: 28->1|33->1|35->3|63->31|63->31|63->31|64->32|67->35|67->35|67->35|68->36|69->37|70->38|77->45|77->45|78->46|96->64|96->64|96->64
                  -- GENERATED --
              */
          