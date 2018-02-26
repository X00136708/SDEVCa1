
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
				"""),_display_(/*27.6*/if(user != null )/*27.23*/{_display_(Seq[Any](format.raw/*27.24*/("""
                    """),format.raw/*28.21*/("""<li><a class= "active" href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*31.23*/else/*31.28*/{_display_(Seq[Any](format.raw/*31.29*/("""
                    """),format.raw/*32.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*33.22*/("""
                
    """),format.raw/*35.5*/("""</nav>
    <div class="container">
        <div class="col-sm-8">
            <div class="well main1">

                <div class="row">
                    <div class="col-sm-6">
                        <div class="wellprofile">
                            <h4>Account balance</h4>
                            <p>€0.00</p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="wellprofile">
                            <h4>Profile Information</h4>
                            <p>Name: dd</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Last Transaction</h4>
                            <p>blah</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Email address</h4>
                            <p> fdfdf@gmail.com</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Update profile</h4>
                            <li><a href="/form">Click me</li>
						</div>
					</div>

                </div>
				</div>
				</div></div>
				
				<div class="footerprofile">
                    <img src="/assets/images/Concert.jpg">
                    </img></div>
				
	 
</body>
    </div>



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
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/profile.scala.html
                  HASH: 13188442c7e9f34156b9af5da82ba7b164707c53
                  MATRIX: 961->1|1081->26|1109->28|2486->1382|2512->1399|2551->1400|2601->1422|2824->1627|2837->1632|2876->1633|2926->1655|3019->1717|3070->1741
                  LINES: 28->1|33->1|34->2|59->27|59->27|59->27|60->28|63->31|63->31|63->31|64->32|65->33|67->35
                  -- GENERATED --
              */
          