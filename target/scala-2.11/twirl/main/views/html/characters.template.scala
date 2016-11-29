
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
"""),format.raw/*2.1*/("""<html>
    <head>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*4.59*/routes/*4.65*/.Assets.at("images/favicon.png")),format.raw/*4.97*/("""">
        <link href=""""),_display_(/*5.22*/routes/*5.28*/.Assets.at("bootstrap/css/bootstrap.css")),format.raw/*5.69*/("""" rel="stylesheet">
        <style type="text/css">
        body """),format.raw/*7.14*/("""{"""),format.raw/*7.15*/("""
            """),format.raw/*8.13*/("""padding-top: 60px;
            padding-bottom: 40px;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""</style>
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.at("bootstrap/css/bootstrap-responsive.css")),format.raw/*12.80*/("""" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("stylesheets/main.css")),format.raw/*13.94*/("""">
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*14.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/main.js")),format.raw/*15.62*/("""" type="text/javascript"></script>
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
                    <a class="brand" href="/">Characters</a>
                    <a class="brand" href="/characters/create">create</a>
                </div>
            </div>
        </div>

    <div class="row center">
        <div>
            <h2>Available characters</h2>
            """),_display_(/*35.14*/if(characters.isEmpty)/*35.36*/ {_display_(Seq[Any](format.raw/*35.38*/("""
                """),format.raw/*36.17*/("""<p>No characters available yet.</p>
            """)))}/*37.15*/else/*37.20*/{_display_(Seq[Any](format.raw/*37.21*/("""
                """),format.raw/*38.17*/("""<div style="margin-top: 40px;">
                    <div>
                        <table class="table-responsive table">
                            <thead>
                                <tr>
                                    <th>id</th>
                                    <th>Name</th>
                                    <th>Class</th>
                                    <th>Race</th>
                                    <th>&nbsp;</th>
                                    <th>&nbsp;</th>
                                    <th>&nbsp;</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*53.30*/characters/*53.40*/.map/*53.44*/ { c =>_display_(Seq[Any](format.raw/*53.51*/("""
                                """),format.raw/*54.33*/("""<tr>
                                    <td>"""),_display_(/*55.42*/c/*55.43*/.id),format.raw/*55.46*/("""</td>
                                    <td>"""),_display_(/*56.42*/c/*56.43*/.name),format.raw/*56.48*/("""</td>
                                    <td>"""),_display_(/*57.42*/c/*57.43*/.className),format.raw/*57.53*/("""</td>
                                    <td>"""),_display_(/*58.42*/c/*58.43*/.race),format.raw/*58.48*/("""</td>
                                    <td><a href="/characters/html/"""),_display_(/*59.68*/c/*59.69*/.id),format.raw/*59.72*/("""" class="view-character" data-id=""""),_display_(/*59.107*/c/*59.108*/.id),format.raw/*59.111*/("""">
                                        view</a></td>
                                    <td><a href="/characters/json/"""),_display_(/*61.68*/c/*61.69*/.id),format.raw/*61.72*/("""">json</a></td>
                                    <td><a href="/characters/edit/"""),_display_(/*62.68*/c/*62.69*/.id),format.raw/*62.72*/("""">edit</a></td>
                                    <td>
                                        <button class="btn btn-sm btn-primary deleteCharacter" data-id=""""),_display_(/*64.106*/c/*64.107*/.id),format.raw/*64.110*/("""" >
                                            delete
                                        </button>
                                    </td>
                                </tr>
                            """)))}),format.raw/*69.30*/("""
                            """),format.raw/*70.29*/("""</tbody>
                        </table>
                    </div>
                </div>
                """)))}),format.raw/*74.18*/("""

            """),format.raw/*76.13*/("""<div>

            </div>
        </div>
    </div>
    </body>
    </html>

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
                  DATE: Mon Nov 28 10:24:23 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/characters.scala.html
                  HASH: 7cfe39b7b4e54064f3956d6e8f1102fd2dcf2716
                  MATRIX: 561->1|713->58|740->59|842->135|856->141|908->173|958->197|972->203|1033->244|1125->309|1153->310|1193->323|1281->384|1310->385|1346->394|1403->424|1418->430|1491->482|1591->555|1606->561|1661->595|1713->620|1728->626|1794->671|1878->728|1893->734|1947->767|2736->1529|2767->1551|2807->1553|2852->1570|2920->1620|2933->1625|2972->1626|3017->1643|3733->2332|3752->2342|3765->2346|3810->2353|3871->2386|3944->2432|3954->2433|3978->2436|4052->2483|4062->2484|4088->2489|4162->2536|4172->2537|4203->2547|4277->2594|4287->2595|4313->2600|4413->2673|4423->2674|4447->2677|4510->2712|4521->2713|4546->2716|4697->2840|4707->2841|4731->2844|4841->2927|4851->2928|4875->2931|5065->3093|5076->3094|5101->3097|5346->3311|5403->3340|5543->3449|5585->3463
                  LINES: 20->1|25->1|26->2|28->4|28->4|28->4|29->5|29->5|29->5|31->7|31->7|32->8|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|59->35|59->35|59->35|60->36|61->37|61->37|61->37|62->38|77->53|77->53|77->53|77->53|78->54|79->55|79->55|79->55|80->56|80->56|80->56|81->57|81->57|81->57|82->58|82->58|82->58|83->59|83->59|83->59|83->59|83->59|83->59|85->61|85->61|85->61|86->62|86->62|86->62|88->64|88->64|88->64|93->69|94->70|98->74|100->76
                  -- GENERATED --
              */
          