
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object characters_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class characters extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Characters],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(characters: List[models.Characters], activeSort: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="span12">
            <h2>Available characters</h2>
            """),_display_(/*7.14*/if(characters.isEmpty)/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
                """),format.raw/*8.17*/("""<p>No characters available yet.</p>
            """)))}/*9.15*/else/*9.20*/{_display_(Seq[Any](format.raw/*9.21*/("""
                """),format.raw/*10.17*/("""<ul>
                """),_display_(/*11.18*/characters/*11.28*/.map/*11.32*/ { article =>_display_(Seq[Any](format.raw/*11.45*/("""
                    """),format.raw/*12.21*/("""<li>"""),_display_(/*12.26*/article/*12.33*/.name),format.raw/*12.38*/(""" """),format.raw/*12.39*/("""<em>by """),_display_(/*12.47*/article/*12.54*/.className),format.raw/*12.64*/("""</em> - </li>
                """)))}),format.raw/*13.18*/("""
                """),format.raw/*14.17*/("""</ul>
            """)))}),format.raw/*15.14*/("""
            """),format.raw/*16.13*/("""<div>

            </div>
        </div>
    </div>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(characters:List[models.Characters],activeSort:String): play.twirl.api.HtmlFormat.Appendable = apply(characters,activeSort)

  def f:((List[models.Characters],String) => play.twirl.api.HtmlFormat.Appendable) = (characters,activeSort) => apply(characters,activeSort)

  def ref: this.type = this

}


}

/**/
object characters extends characters_Scope0.characters
              /*
                  -- GENERATED --
                  DATE: Wed Nov 23 14:51:58 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/characters.scala.html
                  HASH: 62463a85bfb8d7ddb7d2e7ca8e5d723c960495bd
                  MATRIX: 561->1|713->58|741->61|776->88|815->90|846->95|974->197|1004->219|1043->221|1087->238|1154->288|1166->293|1204->294|1249->311|1298->333|1317->343|1330->347|1381->360|1430->381|1462->386|1478->393|1504->398|1533->399|1568->407|1584->414|1615->424|1677->455|1722->472|1772->491|1813->504|1896->557
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|32->8|33->9|33->9|33->9|34->10|35->11|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|36->12|36->12|36->12|37->13|38->14|39->15|40->16|45->21
                  -- GENERATED --
              */
          