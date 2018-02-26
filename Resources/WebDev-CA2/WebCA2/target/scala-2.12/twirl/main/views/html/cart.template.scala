
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/temp("Cart", user)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<div class= "cart">
		<div class="title">
		Cart
		</div>
		<div class="item">
			<div class="button">
				<span class="delete"></span>
			</div>
			<div class="description">
				<span>location</span>
				<span>date</span>
				<span>country</span>
			</div>
			
			<div class="numOfTickets">
				<button class="plus" type="button" name="button">
					<img src="../IMG/plus.jpg" alt="" />
				</button>
			<input type="text" name="name" value="1">
			<button class="minus" type="button" name="button">
				<img src="../IMG/minus.jpg" alt="" />
			</button>
		</div>
		<div class="price"></div>
		</div>
<script>
$('.minus').on('click', function(e) """),format.raw/*29.37*/("""{"""),format.raw/*29.38*/("""
    """),format.raw/*30.5*/("""e.preventDefault();
    var $this = $(this);
    var $input = $this.closest('div').find('input');
    var value = parseInt($input.val());
 
    if (value &amp;gt; 1) """),format.raw/*35.27*/("""{"""),format.raw/*35.28*/("""
        """),format.raw/*36.9*/("""value = value - 1;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/(""" """),format.raw/*37.7*/("""else """),format.raw/*37.12*/("""{"""),format.raw/*37.13*/("""
        """),format.raw/*38.9*/("""value = 0;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""
 
  """),format.raw/*41.3*/("""$input.val(value);
 
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/(""");
 
$('.plus').on('click', function(e) """),format.raw/*45.36*/("""{"""),format.raw/*45.37*/("""
    """),format.raw/*46.5*/("""e.preventDefault();
    var $this = $(this);
    var $input = $this.closest('div').find('input');
    var value = parseInt($input.val());
 
    if (value &amp;lt; 100) """),format.raw/*51.29*/("""{"""),format.raw/*51.30*/("""
        """),format.raw/*52.9*/("""value = value + 1;
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""" """),format.raw/*53.7*/("""else """),format.raw/*53.12*/("""{"""),format.raw/*53.13*/("""
        """),format.raw/*54.9*/("""value =100;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
 
    """),format.raw/*57.5*/("""$input.val(value);
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/(""");
</script>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 18:48:23 GMT 2017
                  SOURCE: C:/Users/brand/Documents/Web/WebDev-CA2/WebCA2/app/views/cart.scala.html
                  HASH: 21972d18c0b99efbe8c8725ef34254a83c7ba94d
                  MATRIX: 958->1|1078->26|1106->29|1132->47|1171->49|1203->55|1904->728|1933->729|1966->735|2165->906|2194->907|2231->917|2282->941|2310->942|2338->943|2371->948|2400->949|2437->959|2480->975|2508->976|2542->983|2592->1006|2620->1007|2690->1049|2719->1050|2752->1056|2953->1229|2982->1230|3019->1240|3070->1264|3098->1265|3126->1266|3159->1271|3188->1272|3225->1282|3269->1299|3297->1300|3333->1309|3380->1329|3408->1330
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|61->29|61->29|62->30|67->35|67->35|68->36|69->37|69->37|69->37|69->37|69->37|70->38|71->39|71->39|73->41|75->43|75->43|77->45|77->45|78->46|83->51|83->51|84->52|85->53|85->53|85->53|85->53|85->53|86->54|87->55|87->55|89->57|90->58|90->58
                  -- GENERATED --
              */
          