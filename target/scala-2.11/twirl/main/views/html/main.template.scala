
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <link href=""""),_display_(/*9.22*/routes/*9.28*/.Assets.at("bootstrap/css/bootstrap.css")),format.raw/*9.69*/("""" rel="stylesheet">
        <style type="text/css">
          body """),format.raw/*11.16*/("""{"""),format.raw/*11.17*/("""
            """),format.raw/*12.13*/("""padding-top: 60px;
            padding-bottom: 40px;
          """),format.raw/*14.11*/("""}"""),format.raw/*14.12*/("""
        """),format.raw/*15.9*/("""</style>
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.at("bootstrap/css/bootstrap-responsive.css")),format.raw/*16.80*/("""" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.at("stylesheets/main.css")),format.raw/*17.94*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*18.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/app.js")),format.raw/*19.61*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
          <div class="navbar-inner">
            <div class="container">
              <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </a>
              <a class="brand" href="/">Articles</a>
            </div>
          </div>
        </div>
    
        <div class="container">
        """),_display_(/*36.10*/content),format.raw/*36.17*/("""
        """),format.raw/*37.9*/("""</div>
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


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Nov 23 14:51:58 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/main.scala.html
                  HASH: 79661bef6b4be6ade5f2e1b956c8d6b6221cd817
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|878->156|892->162|944->194|994->218|1008->224|1069->265|1164->332|1193->333|1234->346|1325->409|1354->410|1390->419|1447->449|1462->455|1535->507|1635->580|1650->586|1705->620|1757->645|1772->651|1838->696|1922->753|1937->759|1990->791|2596->1370|2624->1377|2660->1386
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|35->11|35->11|36->12|38->14|38->14|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|60->36|60->36|61->37
                  -- GENERATED --
              */
          