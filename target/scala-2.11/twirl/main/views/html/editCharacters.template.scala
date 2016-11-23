
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editCharacters_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editCharacters extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Option[String],Form[models.Characters],Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Option[String], form: Form[models.Characters], files: Option[List[(play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString])]])(implicit lang: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.268*/("""

"""),_display_(/*3.2*/main("Welcome to ReactiveMongo on Play 2.4")/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="span8">
            <h2>
                """),_display_(/*7.18*/if(!id.isDefined)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
                    """),format.raw/*8.21*/("""Add
                """)))}/*9.19*/else/*9.24*/{_display_(Seq[Any](format.raw/*9.25*/("""
                    """),format.raw/*10.21*/("""Edit
                """)))}),format.raw/*11.18*/(""" """),format.raw/*11.19*/("""an article</h2>
            """),_display_(/*12.14*/helper/*12.20*/.form(action = (if(!id.isDefined) routes.Articles.create else routes.Articles.edit(id.get)), 'class -> "form-horizontal")/*12.141*/ {_display_(Seq[Any](format.raw/*12.143*/("""
                """),_display_(/*13.18*/helper/*13.24*/.inputText(form("title"))),format.raw/*13.49*/("""
                """),_display_(/*14.18*/helper/*14.24*/.inputText(form("publisher"))),format.raw/*14.53*/("""
                """),_display_(/*15.18*/helper/*15.24*/.textarea(form("content"))),format.raw/*15.50*/("""
                """),format.raw/*16.17*/("""<div class="form-actions">
                    <input class="btn btn-primary" type="submit">
                </div>
            """)))}),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""</div>
        <div class="span4">
            <h2>Attachments</h2>
            """),_display_(/*23.14*/if(id.isDefined)/*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
                """),_display_(/*24.18*/if(files.isDefined)/*24.37*/ {_display_(Seq[Any](format.raw/*24.39*/("""
                    """),format.raw/*25.21*/("""<ul>
                    """),_display_(/*26.22*/files/*26.27*/.get.map/*26.35*/ { file =>_display_(Seq[Any](format.raw/*26.45*/("""
                        """),format.raw/*27.25*/("""<li><a href=""""),_display_(/*27.39*/routes/*27.45*/.Articles.getAttachment(file._1.value)),format.raw/*27.83*/("""">"""),_display_(/*27.86*/file/*27.90*/._2.filename),format.raw/*27.102*/("""</a> - <a target="_blank" href=""""),_display_(/*27.135*/routes/*27.141*/.Articles.getAttachment(file._1.value)),format.raw/*27.179*/("""?inline=true">inline</a> - <a class="delete" href=""""),_display_(/*27.231*/routes/*27.237*/.Articles.removeAttachment(file._1.value)),format.raw/*27.278*/("""">delete</a></li>
                    """)))}),format.raw/*28.22*/("""
                    """),format.raw/*29.21*/("""</ul>
                """)))}),format.raw/*30.18*/("""
                """),_display_(/*31.18*/helper/*31.24*/.form(action = routes.Articles.saveAttachment(id.get), 'enctype -> "multipart/form-data")/*31.113*/ {_display_(Seq[Any](format.raw/*31.115*/("""
                    """),format.raw/*32.21*/("""<input type="file" name="picture">
                    <div>
                        <input type="submit" class="btn">
                    </div>
                """)))}),format.raw/*36.18*/("""
            """)))}),format.raw/*37.14*/("""
        """),format.raw/*38.9*/("""</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(id:Option[String],form:Form[models.Characters],files:Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]],lang:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,form,files)(lang)

  def f:((Option[String],Form[models.Characters],Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,form,files) => (lang) => apply(id,form,files)(lang)

  def ref: this.type = this

}


}

/**/
object editCharacters extends editCharacters_Scope0.editCharacters
              /*
                  -- GENERATED --
                  DATE: Wed Nov 23 14:51:58 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/editCharacters.scala.html
                  HASH: b540222e5ccc82d59cb3a75814a3a20fd2f3774a
                  MATRIX: 780->1|1142->267|1170->270|1222->314|1261->316|1292->321|1398->401|1423->418|1462->420|1510->441|1549->463|1561->468|1599->469|1648->490|1701->512|1730->513|1786->542|1801->548|1932->669|1973->671|2018->689|2033->695|2079->720|2124->738|2139->744|2189->773|2234->791|2249->797|2296->823|2341->840|2501->969|2537->978|2645->1059|2670->1075|2710->1077|2755->1095|2783->1114|2823->1116|2872->1137|2925->1163|2939->1168|2956->1176|3004->1186|3057->1211|3098->1225|3113->1231|3172->1269|3202->1272|3215->1276|3249->1288|3310->1321|3326->1327|3386->1365|3466->1417|3482->1423|3545->1464|3615->1503|3664->1524|3718->1547|3763->1565|3778->1571|3877->1660|3918->1662|3967->1683|4161->1846|4206->1860|4242->1869|4280->1877
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|32->8|33->9|33->9|33->9|34->10|35->11|35->11|36->12|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|43->19|44->20|47->23|47->23|47->23|48->24|48->24|48->24|49->25|50->26|50->26|50->26|50->26|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|52->28|53->29|54->30|55->31|55->31|55->31|55->31|56->32|60->36|61->37|62->38|63->39
                  -- GENERATED --
              */
          