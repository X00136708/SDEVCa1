
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script data-require="jquery@3.0.0" data-semver="3.0.0" src="/assets/javascripts/jquery.js"></script>
        <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
        <link data-require="bootstrap-css@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link data-require="bootstrap@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="/assets/stylesheets/style.css" />
        <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
    </head>

<body>
    <!--Ronan did this page-->
    <title>Profile Information</title>
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
                """),_display_(/*28.18*/if(user != null )/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
                    """),format.raw/*29.21*/("""<li><a href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*32.23*/else/*32.28*/{_display_(Seq[Any](format.raw/*32.29*/("""
                    """),format.raw/*33.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*34.22*/("""
                
            """),format.raw/*36.13*/("""</ul>
			</nav>

            <form action="/page.html" method="post">
            
                <div>
                
                    <label for="name">Name:</label>
                
                    <input type="text" id="name" name="user_name">   </div>

            
                <div>
                
                    <label for="mail">Email:</label>
                
                    <input type="email" id="mail" name="user_email">   </div>

            
                <div>
                
                    <label for="msg">Add funds:</label>
                
                    <textarea id="addFunds" name="add_funds"></textarea>
                    </div>

            <br>
                <div class="button">
                
                    <button type="submit">Update</button>
                    </div>
            
        </form>
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>
</html>"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:47:08 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/form.scala.html
                  HASH: 1d78c713084949a44b05e5cba2bab6a79403e57c
                  MATRIX: 958->1|1078->26|1106->28|2498->1396|2524->1413|2563->1414|2613->1436|2820->1625|2833->1630|2872->1631|2922->1653|3015->1715|3075->1747
                  LINES: 28->1|33->1|34->2|60->28|60->28|60->28|61->29|64->32|64->32|64->32|65->33|66->34|68->36
                  -- GENERATED --
              */
          