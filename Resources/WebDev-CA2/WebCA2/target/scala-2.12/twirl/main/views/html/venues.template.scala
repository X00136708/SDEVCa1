
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

object venues extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Venues],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(venues: List[models.Venues], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""
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
    <title>Venues</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li class="active"><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				"""),_display_(/*29.6*/if(user != null )/*29.23*/{_display_(Seq[Any](format.raw/*29.24*/("""
                    """),format.raw/*30.21*/("""<li><a href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                    """),format.raw/*34.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*35.22*/("""

                
    """),format.raw/*38.5*/("""</nav>

    <div class="container">

        
        <div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    <table id="venuesTable" class="table table-bordered table-condensed">
                        
                        <thead>
                        
                        
                        <tr>
                        
                        <th>ID</th>
                        
                        <th>Name</th>
                        
                        <th>Country</th>
                        
                        <th>City</th>
                        
                        <th>Capacity</th>
                        
                        </tr>
                        
                        </thead>
                        
                        <tbody>
                        
                        """),_display_(/*70.26*/for(v<-venues) yield /*70.40*/ {_display_(Seq[Any](format.raw/*70.42*/("""
                        """),format.raw/*71.25*/("""<tr>
                        
                        <td>"""),_display_(/*73.30*/v/*73.31*/.getId),format.raw/*73.37*/("""</td>
                        
                        <td>"""),_display_(/*75.30*/v/*75.31*/.getName),format.raw/*75.39*/("""</td>
                        
                        <td>"""),_display_(/*77.30*/v/*77.31*/.getCountry),format.raw/*77.42*/("""</td>
                        
                        <td>"""),_display_(/*79.30*/v/*79.31*/.getCity),format.raw/*79.39*/("""</td>
                        
                        <td>"""),_display_(/*81.30*/v/*81.31*/.getCapacity),format.raw/*81.43*/("""</td>

                        
                            """),_display_(/*84.30*/if(user != null)/*84.46*/{_display_(Seq[Any](format.raw/*84.47*/("""
                        """),format.raw/*85.25*/("""<td>
                          <a href=""""),_display_(/*86.37*/routes/*86.43*/.HomeController.updateVenue(v.getId)),format.raw/*86.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-pencil"></span>
                          </a>
                        </td>
                        <td>
                          <a href=""""),_display_(/*91.37*/routes/*91.43*/.HomeController.deleteVenue(v.getId)),format.raw/*91.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                          </a>
                        </td>
                    """)))}),format.raw/*95.22*/("""
                        """),format.raw/*96.25*/("""</tr>
                      
                    """)))}),format.raw/*98.22*/("""
                        
                        """),format.raw/*100.25*/("""</tbody>
                        
                        </table>
                        
                        """),_display_(/*104.26*/if(user != null)/*104.42*/{_display_(Seq[Any](format.raw/*104.43*/("""
                        """),format.raw/*105.25*/("""<p>
                          <a href=""""),_display_(/*106.37*/routes/*106.43*/.HomeController.addVenue()),format.raw/*106.69*/("""">
                              <button class="btn btn-primary">Add a venue</button>
                          </a>
                      
                        </p>
                    """)))}),format.raw/*111.22*/("""
                """),format.raw/*112.17*/("""</div>
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

  def render(venues:List[models.Venues],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(venues,user)

  def f:((List[models.Venues],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (venues,user) => apply(venues,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:47:08 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/venues.scala.html
                  HASH: a96d730d6cb8a5d66a23a4dbc25fc82566d81962
                  MATRIX: 980->1|1129->55|1157->57|2552->1429|2578->1446|2617->1447|2667->1469|2874->1658|2887->1663|2926->1664|2976->1686|3069->1748|3122->1774|4095->2720|4125->2734|4165->2736|4219->2762|4307->2823|4317->2824|4344->2830|4433->2892|4443->2893|4472->2901|4561->2963|4571->2964|4603->2975|4692->3037|4702->3038|4731->3046|4820->3108|4830->3109|4863->3121|4954->3185|4979->3201|5018->3202|5072->3228|5141->3270|5156->3276|5213->3312|5511->3583|5526->3589|5583->3625|5839->3850|5893->3876|5976->3928|6057->3980|6206->4101|6232->4117|6272->4118|6327->4144|6396->4185|6412->4191|6460->4217|6687->4412|6734->4430
                  LINES: 28->1|33->1|34->2|61->29|61->29|61->29|62->30|65->33|65->33|65->33|66->34|67->35|70->38|102->70|102->70|102->70|103->71|105->73|105->73|105->73|107->75|107->75|107->75|109->77|109->77|109->77|111->79|111->79|111->79|113->81|113->81|113->81|116->84|116->84|116->84|117->85|118->86|118->86|118->86|123->91|123->91|123->91|127->95|128->96|130->98|132->100|136->104|136->104|136->104|137->105|138->106|138->106|138->106|143->111|144->112
                  -- GENERATED --
              */
          