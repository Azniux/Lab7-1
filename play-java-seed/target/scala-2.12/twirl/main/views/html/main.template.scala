
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
    </head>
    <body>
    <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                    <div class="navbar-header">
                      <a class="navbar-brand" href="#">WebSiteName</a>
                    </div>
        <ul class="nav navbar-nav">
            <li """),_display_(/*31.18*/if(title == "Home")/*31.37*/{_display_(Seq[Any](format.raw/*31.38*/("""class="active"""")))}),format.raw/*31.53*/("""><a href=""""),_display_(/*31.64*/routes/*31.70*/.HomeController.index()),format.raw/*31.93*/("""">Home</a></li>
            <li """),_display_(/*32.18*/if(title == "About")/*32.38*/{_display_(Seq[Any](format.raw/*32.39*/("""class="active"""")))}),format.raw/*32.54*/("""><a href=""""),_display_(/*32.65*/routes/*32.71*/.HomeController.about()),format.raw/*32.94*/("""">About</a></li>
            <li """),_display_(/*33.18*/if(title == "Products")/*33.41*/{_display_(Seq[Any](format.raw/*33.42*/("""class="active"""")))}),format.raw/*33.57*/("""><a href=""""),_display_(/*33.68*/routes/*33.74*/.HomeController.products()),format.raw/*33.100*/("""">Products</a></li>
        </ul>
        </div>
        </nav>
        """),format.raw/*38.32*/("""
        """),_display_(/*39.10*/content),format.raw/*39.17*/("""
        """),format.raw/*40.9*/("""<img rel="Pic" type="image/jpg" src=""""),_display_(/*40.47*/routes/*40.53*/.Assets.versioned("images/download.jpg")),format.raw/*40.93*/("""">
        <hr>
        <h4>Copyright &copy 2017</h4>

        <script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("javascripts/main.js")),format.raw/*44.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 11:53:16 GMT 2017
                  SOURCE: /media/sf_student/lab7innit/play-java-seed/app/views/main.scala.html
                  HASH: 2e59ffaa23142c29cbf2f8760e20a084801aecec
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|2191->989|2206->995|2267->1034|2601->1341|2629->1360|2668->1361|2714->1376|2752->1387|2767->1393|2811->1416|2871->1449|2900->1469|2939->1470|2985->1485|3023->1496|3038->1502|3082->1525|3143->1559|3175->1582|3214->1583|3260->1598|3298->1609|3313->1615|3361->1641|3461->1803|3498->1813|3526->1820|3562->1829|3627->1867|3642->1873|3703->1913|3807->1990|3822->1996|3883->2036
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|53->22|53->22|53->22|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|68->38|69->39|69->39|70->40|70->40|70->40|70->40|74->44|74->44|74->44
                  -- GENERATED --
              */
          