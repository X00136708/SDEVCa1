
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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

<body>
    <!--Brandon did this page-->
    <!--The sign in was working in html NotePad++ but not here, We're not sure what the error is, we asked on slack-->
<title>Home</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li class="active"><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
                """),_display_(/*29.18*/if(user != null )/*29.35*/{_display_(Seq[Any](format.raw/*29.36*/("""
                    """),format.raw/*30.21*/("""<li><a href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                    """),format.raw/*34.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*35.22*/("""

            """),format.raw/*37.13*/("""</ul>
        </div>
    </nav>

    

        <div id="wrapper" class="container">
          <div class="col-sm-1"></div>
            <div id="left" class="col-sm-2">
              <div id="sidebar" class="well well-sm">
                    <div class="panel-heading"><h4> Follow Us </h4></div>
                    <a href="#">
                    <div class="panel panel-default">
                            <div class="panel-body">
                                    <img src="/assets/images/facebook.png"/>
                            </div>
                    </div>
                </a>
                <a href="#">
                    <div class="panel panel-default">
                            <div class="panel-body">
                                    <img src="/assets/images/twitter.jpg"/>
                            </div>
                    </div>
                </a>
                <a href="#">
                    <div class="panel panel-default">
                            <div class="panel-body">
                                    <img src="/assets/images/google-plus.png"/>
                            </div>
                            
                    </div>
                </a>
                <a href="#">
                        <div class="panel panel-default">
                                <div class="panel-body">
                                        <img src="/assets/images/snapchat.png"/>
                                </div>
                                
                        </div>
                    </a>
                
                <div class="panel-heading"><h4> Download the App </h4></div>
                <a href="#">
                        <div class="panel panel-default">
                                <div class="panel-body">
                                        <img src="/assets/images/play-store.png"/>
                                </div>
                        </div>
                    </a>
                    <a href="#">
                            <div class="panel panel-default">
                                    <div class="panel-body">
                                            <img src="/assets/images/app-store.jpg"/>
                                    </div>
                            </div>
                        </a>
               
                   
                    
                    
                    
                    
                          
                


              </div>
            </div>
            <div class="col-sm-1"></div>
            <div id="slideshow" class="col-sm-9 col-centered">
                <div id="slideWell" class="well well-sm">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                                <img src="/assets/images/1.PNG" alt=>
                            </div>

                            <div class="item">
                                <img src="/assets/images/2.PNG" alt=>
                            </div>

                            <div class="item">
                                <img src="/assets/images/3.PNG" alt=>
                            </div>
                        </div>

                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                        <div class="carousel-caption">
                            <span><h4>Upcoming Events</h4></span>
                        </div>
                    </div>
                    
                </div>
            </div>
        


            <div id="row2" class="row">
                <div id="Content" class="col-sm-6 col-centered">
                    <div id="contentWell" class="well well-sm">
                        <h1> -- Event News -- </h1>
                        <h4>Finn Wolfhard's (aka Mike from Stranger Things) band have signed a record deal</h4>
                        <img src="/assets/images/News1.jpg"><p>As you may know, since making it big as an actor with his role on Stranger Things,
 						Finn Wolfhard has also shown the world that he's no one-trick-pony when it comes to
						entertainment. Speaking to NME about their deal with Royal Mountain Records - and 
						their imminent EP release, recorded with the frontman of Chicagoan indie band 
						Twin Peaks - Wolfhard said: "It is so sweet that we have such a good team at 
						Royal Mountain Records. I love everyone on it". <a href="http://entertainment.ie/music/news/Finn-Wolfhards-aka-Mike-from-Stranger-Things-band-have-signed-a-record-deal/399552.htm" target="_blank">Read more...</a></p><br>
                        <h4><br>Linkin Park paid emotional tribute to Chester Bennington at the AMAs last night </h4>
                        <img src="/assets/images/News2.jpg"><p>Linkin Park were the winners of 'Favourite Alternative Rock Artist' award at the 
						American Music Awards last night, and the band took the opportunity to pay tribute 
						to their late frontman in an emotional speech. They dedicated the award to Bennington, 
						saying: "We want to dedicate this award to him - to his memory, to his talent, to his 
						sense of humour, to his joy. “Remember, you guys — all of you, tonight; whether you’re 
						a fan or an artist, I want you guys to take a moment to appreciate what you’ve got and 
						make Chester proud." <a href="http://entertainment.ie/music/news/Watch-Linkin-Park-paid-emotional-tribute-to-Chester-Bennington-at-the-AMAs-last-night/399405.htm" target="_blank">Read more...</a></p><br>
						
						
						
                      
						
                    </div>
                </div>

        </div>
		<div class="footer">
		<img src="/assets/images/Concert.jpg">
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
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/index.scala.html
                  HASH: a3ba2403027b2e7d426646aabbbff7eaea3a0614
                  MATRIX: 959->1|1079->26|1107->28|2581->1478|2607->1495|2646->1496|2696->1518|2903->1707|2916->1712|2955->1713|3005->1735|3098->1797|3142->1813
                  LINES: 28->1|33->1|34->2|61->29|61->29|61->29|62->30|65->33|65->33|65->33|66->34|67->35|69->37
                  -- GENERATED --
              */
          