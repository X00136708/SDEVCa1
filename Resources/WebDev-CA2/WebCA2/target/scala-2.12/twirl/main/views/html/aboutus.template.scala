
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

object aboutus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
        <link rel="stylesheet" href="/assets/stylesheets/index.css" />
        <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
    </head>
<!--Nathan did this page-->
    <title>About Us</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src="../assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav">
			
			
			<li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
			
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li class="active"><a href="/aboutus">About us</a></li>
                """),_display_(/*30.18*/if(user != null )/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""
                    """),format.raw/*31.21*/("""<li><a href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*34.23*/else/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
                    """),format.raw/*35.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*36.22*/("""
			"""),format.raw/*37.4*/("""</ul>

    </nav>
	<body>
		    
 
			<div class="well mainAbout">
                  <h1> Who we are. </h1>
                  <h4>In establishing ourselves in such a competitive industry, this is something we have had to ask ourselves frequently. We are an aspiring group of musical hobbylist, businessmen and programmers. An unusual combination for most companies however the irregular team has provided us with a unique ablility to supply and understand our customer's needs all in a way that allows us to grow as a business.</h4>
                </div>
            
            
    


        <div class="well mainAbout">
                  <h1> What we do. </h1>
                  <h4>Currently we provide a service similar to many others, we sell tickets to concerts and other live events. In the future, we aim to branch out into other areas and host new types of events that will accommodate more opportunities more opportunities for people to meet their favourite celebrities. We also anticipate funding a program for sponsoring local talent and hosting new unsigned bands to smaller events.</h4>
                </div>
            
           
       
		
	
            
     
				<div class="well mainAbout">
                  <h1>Where are we?</h1>
                  <h4>Our main branch is located in Bogtown, Clonygowan, Tullamore, Co.Offally, Ireland. </h4>

                </div>

                <div class="well mainAbout">
                    <h1>Contact us</h1>
                    <h4>If you have any questions please contact us by Email: theTicketShark@gmail.com  or by phone at 0858358380</h4>
                </div>
				
				<div class="footerabout">
		<img src="assets/images/Concert.jpg">
		</img></div>
           
        
</body>
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
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/aboutus.scala.html
                  HASH: 414ca62af1968a6a6b62f55954270ad48b87ab4f
                  MATRIX: 961->1|1081->26|1109->28|2513->1408|2539->1425|2578->1426|2628->1448|2835->1637|2848->1642|2887->1643|2937->1665|3030->1727|3062->1732
                  LINES: 28->1|33->1|34->2|62->30|62->30|62->30|63->31|66->34|66->34|66->34|67->35|68->36|69->37
                  -- GENERATED --
              */
          