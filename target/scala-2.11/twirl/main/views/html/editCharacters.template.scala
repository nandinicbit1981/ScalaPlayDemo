
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

class editCharacters extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Characters,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(characters: models.Characters):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
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
        <div class="col-sm-10 background-white" style="padding: 50px;">
            <div>
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="name" class="form-control" id="name" value=""""),_display_(/*36.83*/characters/*36.93*/.name),format.raw/*36.98*/("""">
                    </div>
                    <div class="form-group">
                        <label>Class:</label>
                        <div>
                            <select class="selectpicker" id="classSelect" data-value=""""),_display_(/*41.88*/characters/*41.98*/.className),format.raw/*41.108*/("""">
                                <optgroup label="select">
                                    <option>Fighter</option>
                                    <option>Cleric</option>
                                    <option>Wizard</option>
                                    <option>Thief</option>
                                </optgroup>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Race:</label>
                        <div>
                             <select class="selectpicker" id="raceSelect" data-value=""""),_display_(/*55.88*/characters/*55.98*/.race),format.raw/*55.103*/("""">
                                <optgroup label="select">
                                    <option>Human</option>
                                    <option>Dwarf</option>
                                    <option>Elf</option>
                                    <option>Half-elf</option>
                                </optgroup>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Strength:</label>
                        <div class="row">

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="strength_stat" value=""""),_display_(/*71.100*/characters/*71.110*/.strength_stat),format.raw/*71.124*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control"  disabled="disabled" id="strength_mod" value=""""),_display_(/*74.120*/characters/*74.130*/.strength_mod),format.raw/*74.143*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="strength_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Dexterity:</label>
                        <div class="row">

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="dex_stat" value=""""),_display_(/*87.95*/characters/*87.105*/.dex_stat),format.raw/*87.114*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" disabled="disabled" id="dex_mod" value=""""),_display_(/*90.114*/characters/*90.124*/.dex_mod),format.raw/*90.132*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="dex_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Constitution:</label>
                        <div class="row">
                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="con_stat" value=""""),_display_(/*102.95*/characters/*102.105*/.con_stat),format.raw/*102.114*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" disabled="disabled" id="con_mod" value=""""),_display_(/*105.114*/characters/*105.124*/.con_mod),format.raw/*105.132*/("""">
                                <input type="text" class="form-control" disabled="disabled" id="con_mod" value=""""),_display_(/*106.114*/characters/*106.124*/.con_mod),format.raw/*106.132*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="con_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Intelligence:</label>
                        <div class="row">

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="intl_stat" value=""""),_display_(/*119.96*/characters/*119.106*/.intl_stat),format.raw/*119.116*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" disabled="disabled" id="intl_mod" value=""""),_display_(/*122.115*/characters/*122.125*/.intl_mod),format.raw/*122.134*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="intl_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Wisdom:</label>
                        <div class="row">

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="wsdm_stat" value=""""),_display_(/*135.96*/characters/*135.106*/.wsdm_stat),format.raw/*135.116*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" disabled="disabled" id="wsdm_mod" value=""""),_display_(/*138.115*/characters/*138.125*/.wsdm_mod),format.raw/*138.134*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="wsdm_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Charisma:</label>
                        <div class="row">
                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="charisma_stat" value=""""),_display_(/*150.100*/characters/*150.110*/.chr_stat),format.raw/*150.119*/("""">
                            </div>
                            <div class="col-sm-3">
                                <input type="text" class="form-control" disabled="disabled" id="charisma_mod" value=""""),_display_(/*153.119*/characters/*153.129*/.chr_mod),format.raw/*153.137*/("""">
                            </div>
                            <div class="col-sm-3">
                                <button id="charisma_roll" class="form-control btn btn-info">roll</button>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>AC:</label>
                        <div class="row">
                            <div class="col-sm-5">
                                <input type="text" disabled="disabled" class="form-control" id="ac" value=""""),_display_(/*165.109*/characters/*165.119*/.ac),format.raw/*165.122*/("""">
                            </div>

                        </div>
                    </div>
                    <button type="button" class="btn btn-default" id="editSubmitBtn" data-id=""""),_display_(/*170.96*/characters/*170.106*/.id),format.raw/*170.109*/("""">Submit</button>
                </form>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(characters:models.Characters): play.twirl.api.HtmlFormat.Appendable = apply(characters)

  def f:((models.Characters) => play.twirl.api.HtmlFormat.Appendable) = (characters) => apply(characters)

  def ref: this.type = this

}


}

/**/
object editCharacters extends editCharacters_Scope0.editCharacters
              /*
                  -- GENERATED --
                  DATE: Sun Nov 27 23:27:27 PST 2016
                  SOURCE: /Users/nandpa/Documents/Intellij/ScalaPlayDemo/app/views/editCharacters.scala.html
                  HASH: d7660978f69f30cec5289a20b1617161be3bbb6e
                  MATRIX: 556->1|682->32|710->34|775->73|789->79|850->120|942->185|970->186|1010->199|1098->260|1127->261|1163->270|1220->300|1235->306|1308->358|1408->431|1423->437|1478->471|1530->496|1545->502|1611->547|1695->604|1710->610|1764->643|2774->1626|2793->1636|2819->1641|3084->1879|3103->1889|3135->1899|3811->2548|3830->2558|3857->2563|4611->3289|4631->3299|4667->3313|4903->3521|4923->3531|4958->3544|5558->4117|5578->4127|5609->4136|5839->4338|5859->4348|5889->4356|6487->4926|6508->4936|6540->4945|6771->5147|6792->5157|6823->5165|6968->5281|6989->5291|7020->5299|7620->5871|7641->5881|7674->5891|7906->6094|7927->6104|7959->6113|8554->6680|8575->6690|8608->6700|8840->6903|8861->6913|8893->6922|9494->7494|9515->7504|9547->7513|9783->7720|9804->7730|9835->7738|10443->8317|10464->8327|10490->8330|10710->8522|10731->8532|10757->8535
                  LINES: 20->1|25->1|27->3|29->5|29->5|29->5|31->7|31->7|32->8|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|60->36|60->36|60->36|65->41|65->41|65->41|79->55|79->55|79->55|95->71|95->71|95->71|98->74|98->74|98->74|111->87|111->87|111->87|114->90|114->90|114->90|126->102|126->102|126->102|129->105|129->105|129->105|130->106|130->106|130->106|143->119|143->119|143->119|146->122|146->122|146->122|159->135|159->135|159->135|162->138|162->138|162->138|174->150|174->150|174->150|177->153|177->153|177->153|189->165|189->165|189->165|194->170|194->170|194->170
                  -- GENERATED --
              */
          