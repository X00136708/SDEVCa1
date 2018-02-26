
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

object events extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Events],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Events], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""
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
    <title>Events</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li class="active"><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
                """),_display_(/*30.18*/if(user != null )/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""
                    """),format.raw/*31.21*/("""<li><a href="/profile">My Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/cart">Shopping Cart</a></li>
                    """)))}/*34.23*/else/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
                    """),format.raw/*35.21*/("""<li><a href="/login">Login</a></li>    
                    """)))}),format.raw/*36.22*/("""
                
    """),format.raw/*38.5*/("""</nav>

    <div class="container">

        """),_display_(/*42.10*/if(flash.containsKey("success"))/*42.42*/{_display_(Seq[Any](format.raw/*42.43*/("""
            """),format.raw/*43.13*/("""<div class="alert alert-success">
              """),_display_(/*44.16*/flash/*44.21*/.get("success")),format.raw/*44.36*/("""
            """),format.raw/*45.13*/("""</div>
        """)))}),format.raw/*46.10*/("""
  
        """),format.raw/*48.9*/("""<div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    

                    <table class="table table-bordered table-condensed">
                        
                        <thead>
                        
                        <!-- The header row-->
                        
                        <tr>
                        
                        <th>ID</th>
                        
                        <th>Name</th>
                      
                        <th>Category</th>
                        
                        <th>Venue</th>
                        
                        <th>Date</th>
                        
                        <th>Price</th>
                        
                        </tr>
                        
                        </thead>
                        
                        <tbody>
                        
                        <!-- Product row(s) -->
                        """),_display_(/*81.26*/for(e<-events) yield /*81.40*/ {_display_(Seq[Any](format.raw/*81.42*/("""
                        """),format.raw/*82.25*/("""<tr>
                        
                        <td>"""),_display_(/*84.30*/e/*84.31*/.getId),format.raw/*84.37*/("""</td>
                        
                        <td>"""),_display_(/*86.30*/e/*86.31*/.getName),format.raw/*86.39*/("""</td>
                      
                        <td>"""),_display_(/*88.30*/e/*88.31*/.getCategory.getName),format.raw/*88.51*/("""</td>
                        
                        <td>"""),_display_(/*90.30*/e/*90.31*/.getVenue),format.raw/*90.40*/("""</td>
                        
                        <td>"""),_display_(/*92.30*/e/*92.31*/.getDate),format.raw/*92.39*/("""</td>
                      
                        <td class="numeric">&euro; """),_display_(/*94.53*/("%.0f".format(e.getPrice))),format.raw/*94.80*/("""</td>
                            """),_display_(/*95.30*/if(user != null)/*95.46*/{_display_(Seq[Any](format.raw/*95.47*/("""
                        """),format.raw/*96.25*/("""<td>
                          <a href=""""),_display_(/*97.37*/routes/*97.43*/.HomeController.updateEvent(e.getId)),format.raw/*97.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-pencil"></span>
                          </a>
                        </td>
                      
                        <td>
                          <a href=""""),_display_(/*103.37*/routes/*103.43*/.HomeController.deleteEvent(e.getId)),format.raw/*103.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                          </a>
                        </td>
                            """)))}),format.raw/*107.30*/("""
                        """),format.raw/*108.25*/("""</tr>
                      """)))}),format.raw/*109.24*/("""
                        
                        """),format.raw/*111.25*/("""</tbody>
                        
                        </table>
                        """),_display_(/*114.26*/if(user != null)/*114.42*/{_display_(Seq[Any](format.raw/*114.43*/("""
                        """),format.raw/*115.25*/("""<p>
                            <a href=""""),_display_(/*116.39*/routes/*116.45*/.HomeController.addEvent()),format.raw/*116.71*/("""">
                                <button class="btn btn-primary">Add a event</button>
                            </a>
                        """)))}),format.raw/*119.26*/("""
                """),format.raw/*120.17*/("""</div>
            </div>
        </div>
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>
            <script src=""""),_display_(/*126.27*/routes/*126.33*/.Assets.versioned("javascripts/main.js")),format.raw/*126.73*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(events:List[models.Events],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user)

  def f:((List[models.Events],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user) => apply(events,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:47:08 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/events.scala.html
                  HASH: 553c519f3946108e6d170f64d8986fea516b2e9e
                  MATRIX: 1002->1|1186->90|1214->92|2616->1470|2642->1487|2681->1488|2731->1510|2938->1699|2951->1704|2990->1705|3040->1727|3133->1789|3184->1813|3261->1863|3302->1895|3341->1896|3383->1910|3460->1960|3474->1965|3510->1980|3552->1994|3600->2011|3641->2025|4721->3078|4751->3092|4791->3094|4845->3120|4933->3181|4943->3182|4970->3188|5059->3250|5069->3251|5098->3259|5185->3319|5195->3320|5236->3340|5325->3402|5335->3403|5365->3412|5454->3474|5464->3475|5493->3483|5603->3566|5651->3593|5714->3629|5739->3645|5778->3646|5832->3672|5901->3714|5916->3720|5973->3756|6296->4051|6312->4057|6370->4093|6635->4326|6690->4352|6752->4382|6833->4434|6956->4529|6982->4545|7022->4546|7077->4572|7148->4615|7164->4621|7212->4647|7393->4796|7440->4814|7646->4992|7662->4998|7724->5038
                  LINES: 28->1|33->1|34->2|62->30|62->30|62->30|63->31|66->34|66->34|66->34|67->35|68->36|70->38|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|78->46|80->48|113->81|113->81|113->81|114->82|116->84|116->84|116->84|118->86|118->86|118->86|120->88|120->88|120->88|122->90|122->90|122->90|124->92|124->92|124->92|126->94|126->94|127->95|127->95|127->95|128->96|129->97|129->97|129->97|135->103|135->103|135->103|139->107|140->108|141->109|143->111|146->114|146->114|146->114|147->115|148->116|148->116|148->116|151->119|152->120|158->126|158->126|158->126
                  -- GENERATED --
              */
          