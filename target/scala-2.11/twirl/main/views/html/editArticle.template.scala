
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editArticle_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Option[String],Form[models.Article],Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]],play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Option[String], form: Form[models.Article], files: Option[List[(play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString])]])(implicit lang: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.265*/("""

"""),_display_(/*3.2*/main("Welcome to ReactiveMongo on Play 2.4")/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""
  """),format.raw/*4.3*/("""<div class="row">
  <div class="span8">
  <h2>
    """),_display_(/*7.6*/if(!id.isDefined)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
      """),format.raw/*8.7*/("""Add
    """)))}/*9.7*/else/*9.12*/{_display_(Seq[Any](format.raw/*9.13*/("""
      """),format.raw/*10.7*/("""Edit
    """)))}),format.raw/*11.6*/(""" """),format.raw/*11.7*/("""an article</h2>
  """),_display_(/*12.4*/helper/*12.10*/.form(action = (if(!id.isDefined) routes.Articles.create else routes.Articles.edit(id.get)), 'class -> "form-horizontal")/*12.131*/ {_display_(Seq[Any](format.raw/*12.133*/("""
    """),_display_(/*13.6*/helper/*13.12*/.inputText(form("title"))),format.raw/*13.37*/("""
    """),_display_(/*14.6*/helper/*14.12*/.inputText(form("publisher"))),format.raw/*14.41*/("""
    """),_display_(/*15.6*/helper/*15.12*/.textarea(form("content"))),format.raw/*15.38*/("""
    """),format.raw/*16.5*/("""<div class="form-actions">
      <input class="btn btn-primary" type="submit">
    </div>
  """)))}),format.raw/*19.4*/("""
  """),format.raw/*20.3*/("""</div>
  <div class="span4">
  <h2>Attachments</h2>
  """),_display_(/*23.4*/if(id.isDefined)/*23.20*/ {_display_(Seq[Any](format.raw/*23.22*/("""
    """),_display_(/*24.6*/if(files.isDefined)/*24.25*/ {_display_(Seq[Any](format.raw/*24.27*/("""
    """),format.raw/*25.5*/("""<ul>
      """),_display_(/*26.8*/files/*26.13*/.get.map/*26.21*/ { file =>_display_(Seq[Any](format.raw/*26.31*/("""
      """),format.raw/*27.7*/("""<li><a href=""""),_display_(/*27.21*/routes/*27.27*/.Articles.getAttachment(file._1.value)),format.raw/*27.65*/("""">"""),_display_(/*27.68*/file/*27.72*/._2.filename),format.raw/*27.84*/("""</a> - <a target="_blank" href=""""),_display_(/*27.117*/routes/*27.123*/.Articles.getAttachment(file._1.value)),format.raw/*27.161*/("""?inline=true">inline</a> - <a class="delete" href=""""),_display_(/*27.213*/routes/*27.219*/.Articles.removeAttachment(file._1.value)),format.raw/*27.260*/("""">delete</a></li>
      """)))}),format.raw/*28.8*/("""
    """),format.raw/*29.5*/("""</ul>
    """)))}),format.raw/*30.6*/("""
    """),_display_(/*31.6*/helper/*31.12*/.form(action = routes.Articles.saveAttachment(id.get), 'enctype -> "multipart/form-data")/*31.101*/ {_display_(Seq[Any](format.raw/*31.103*/("""
      """),format.raw/*32.7*/("""<input type="file" name="picture">
      <div>
        <input type="submit" class="btn">
      </div>
    """)))}),format.raw/*36.6*/("""
  """)))}),format.raw/*37.4*/("""
  """),format.raw/*38.3*/("""</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(id:Option[String],form:Form[models.Article],files:Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]],lang:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,form,files)(lang)

  def f:((Option[String],Form[models.Article],Option[List[scala.Tuple2[play.api.libs.json.JsString, reactivemongo.api.gridfs.ReadFile[play.modules.reactivemongo.json.JSONSerializationPack.type, play.api.libs.json.JsString]]]]) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,form,files) => (lang) => apply(id,form,files)(lang)

  def ref: this.type = this

}


}

/**/
object editArticle extends editArticle_Scope0.editArticle
              /*
                  -- GENERATED --
                  DATE: Sun Nov 27 23:21:16 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/editArticle.scala.html
                  HASH: 1b17ea3211d7d9ee3c6bd533256e60a7c996c93e
                  MATRIX: 771->1|1130->264|1158->267|1210->311|1249->313|1278->316|1355->368|1380->385|1419->387|1452->394|1478->404|1490->409|1528->410|1562->417|1602->427|1630->428|1675->447|1690->453|1821->574|1862->576|1894->582|1909->588|1955->613|1987->619|2002->625|2052->654|2084->660|2099->666|2146->692|2178->697|2301->790|2331->793|2412->848|2437->864|2477->866|2509->872|2537->891|2577->893|2609->898|2647->910|2661->915|2678->923|2726->933|2760->940|2801->954|2816->960|2875->998|2905->1001|2918->1005|2951->1017|3012->1050|3028->1056|3088->1094|3168->1146|3184->1152|3247->1193|3302->1218|3334->1223|3375->1234|3407->1240|3422->1246|3521->1335|3562->1337|3596->1344|3733->1451|3767->1455|3797->1458|3835->1466
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|32->8|33->9|33->9|33->9|34->10|35->11|35->11|36->12|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|43->19|44->20|47->23|47->23|47->23|48->24|48->24|48->24|49->25|50->26|50->26|50->26|50->26|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|52->28|53->29|54->30|55->31|55->31|55->31|55->31|56->32|60->36|61->37|62->38|63->39
                  -- GENERATED --
              */
          