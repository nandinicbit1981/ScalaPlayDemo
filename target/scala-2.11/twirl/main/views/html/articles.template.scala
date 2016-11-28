
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object articles_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class articles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Article],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[models.Article], activeSort: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="span12">
      <h2>Available articles</h2>
      <div id="sort">
        <span>Sort by:</span>
        <ul class="nav nav-pills">
          <li """),_display_(/*10.16*/if(activeSort == "title")/*10.41*/{_display_(Seq[Any](format.raw/*10.42*/("""class="active"""")))}),format.raw/*10.57*/("""><a href=""""),_display_(/*10.68*/routes/*10.74*/.Articles.index),format.raw/*10.89*/("""?sort=title">title</a></li>
          <li """),_display_(/*11.16*/if(activeSort == "-title")/*11.42*/{_display_(Seq[Any](format.raw/*11.43*/("""class="active"""")))}),format.raw/*11.58*/("""><a href=""""),_display_(/*11.69*/routes/*11.75*/.Articles.index),format.raw/*11.90*/("""?sort=-title">-title</a></li>
          <li """),_display_(/*12.16*/if(activeSort == "publisher")/*12.45*/{_display_(Seq[Any](format.raw/*12.46*/("""class="active"""")))}),format.raw/*12.61*/("""><a href=""""),_display_(/*12.72*/routes/*12.78*/.Articles.index),format.raw/*12.93*/("""?sort=publisher">publisher</a></li>
          <li """),_display_(/*13.16*/if(activeSort == "-publisher")/*13.46*/{_display_(Seq[Any](format.raw/*13.47*/("""class="active"""")))}),format.raw/*13.62*/("""><a href=""""),_display_(/*13.73*/routes/*13.79*/.Articles.index),format.raw/*13.94*/("""?sort=-publisher">-publisher</a></li>
          <li """),_display_(/*14.16*/if(activeSort == "creationDate")/*14.48*/{_display_(Seq[Any](format.raw/*14.49*/("""class="active"""")))}),format.raw/*14.64*/("""><a href=""""),_display_(/*14.75*/routes/*14.81*/.Articles.index),format.raw/*14.96*/("""?sort=creationDate">creation</a></li>
          <li """),_display_(/*15.16*/if(activeSort == "-creationDate")/*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""class="active"""")))}),format.raw/*15.65*/("""><a href=""""),_display_(/*15.76*/routes/*15.82*/.Articles.index),format.raw/*15.97*/("""?sort=-creationDate">-creation</a></li>
          <li """),_display_(/*16.16*/if(activeSort == "updateDate")/*16.46*/{_display_(Seq[Any](format.raw/*16.47*/("""class="active"""")))}),format.raw/*16.62*/("""><a href=""""),_display_(/*16.73*/routes/*16.79*/.Articles.index),format.raw/*16.94*/("""?sort=updateDate">update</a></li>
          <li """),_display_(/*17.16*/if(activeSort == "-updateDate")/*17.47*/{_display_(Seq[Any](format.raw/*17.48*/("""class="active"""")))}),format.raw/*17.63*/("""><a href=""""),_display_(/*17.74*/routes/*17.80*/.Articles.index),format.raw/*17.95*/("""?sort=-updateDate">-update</a></li>
          <li """),_display_(/*18.16*/if(activeSort == "none")/*18.40*/{_display_(Seq[Any](format.raw/*18.41*/("""class="active"""")))}),format.raw/*18.56*/("""><a href=""""),_display_(/*18.67*/routes/*18.73*/.Articles.index),format.raw/*18.88*/("""">none</a></li>
        </ul>
      </div>
      """),_display_(/*21.8*/if(articles.isEmpty)/*21.28*/ {_display_(Seq[Any](format.raw/*21.30*/("""
        """),format.raw/*22.9*/("""<p>No articles available yet.</p>
      """)))}/*23.9*/else/*23.14*/{_display_(Seq[Any](format.raw/*23.15*/("""
      """),format.raw/*24.7*/("""<ul>
      """),_display_(/*25.8*/articles/*25.16*/.map/*25.20*/ { article =>_display_(Seq[Any](format.raw/*25.33*/("""
        """),format.raw/*26.9*/("""<li><a href=""""),_display_(/*26.23*/routes/*26.29*/.Articles.showEditForm(article.id.get)),format.raw/*26.67*/("""">"""),_display_(/*26.70*/article/*26.77*/.title),format.raw/*26.83*/("""</a> <em>by """),_display_(/*26.96*/article/*26.103*/.publisher),format.raw/*26.113*/("""</em> (last modified : """),_display_(/*26.137*/article/*26.144*/.updateDate.map(u => org.joda.time.format.DateTimeFormat.forPattern("MMM dd, yyyy").print(u)).orElse(Some("n/a"))),format.raw/*26.257*/(""") - <a href=""""),_display_(/*26.271*/routes/*26.277*/.Articles.delete(article.id.get)),format.raw/*26.309*/("""" class="delete">delete</a></li>
      """)))}),format.raw/*27.8*/("""
      """),format.raw/*28.7*/("""</ul>
      """)))}),format.raw/*29.8*/("""
      """),format.raw/*30.7*/("""<div>
        <a href=""""),_display_(/*31.19*/routes/*31.25*/.Articles.showCreationForm),format.raw/*31.51*/("""">Create</a>
      </div>
    </div>
  </div>
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(articles:List[models.Article],activeSort:String): play.twirl.api.HtmlFormat.Appendable = apply(articles,activeSort)

  def f:((List[models.Article],String) => play.twirl.api.HtmlFormat.Appendable) = (articles,activeSort) => apply(articles,activeSort)

  def ref: this.type = this

}


}

/**/
object articles extends articles_Scope0.articles
              /*
                  -- GENERATED --
                  DATE: Sun Nov 27 23:21:16 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/articles.scala.html
                  HASH: d42056f783050184c41b0a44b4e755c071056630
                  MATRIX: 554->1|701->53|729->56|764->83|803->85|832->88|1038->267|1072->292|1111->293|1157->308|1195->319|1210->325|1246->340|1316->383|1351->409|1390->410|1436->425|1474->436|1489->442|1525->457|1597->502|1635->531|1674->532|1720->547|1758->558|1773->564|1809->579|1887->630|1926->660|1965->661|2011->676|2049->687|2064->693|2100->708|2180->761|2221->793|2260->794|2306->809|2344->820|2359->826|2395->841|2475->894|2517->927|2556->928|2602->943|2640->954|2655->960|2691->975|2773->1030|2812->1060|2851->1061|2897->1076|2935->1087|2950->1093|2986->1108|3062->1157|3102->1188|3141->1189|3187->1204|3225->1215|3240->1221|3276->1236|3354->1287|3387->1311|3426->1312|3472->1327|3510->1338|3525->1344|3561->1359|3637->1409|3666->1429|3706->1431|3742->1440|3801->1482|3814->1487|3853->1488|3887->1495|3925->1507|3942->1515|3955->1519|4006->1532|4042->1541|4083->1555|4098->1561|4157->1599|4187->1602|4203->1609|4230->1615|4270->1628|4287->1635|4319->1645|4371->1669|4388->1676|4523->1789|4565->1803|4581->1809|4635->1841|4705->1881|4739->1888|4782->1901|4816->1908|4867->1932|4882->1938|4929->1964|5006->2011
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|34->10|34->10|34->10|34->10|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|45->21|45->21|45->21|46->22|47->23|47->23|47->23|48->24|49->25|49->25|49->25|49->25|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|51->27|52->28|53->29|54->30|55->31|55->31|55->31|59->35
                  -- GENERATED --
              */
          