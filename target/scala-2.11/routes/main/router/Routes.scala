
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nandpa/Documents/Intellij/ScalaPlayDemo/conf/routes
// @DATE:Wed Nov 23 14:51:58 PST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Articles_2: controllers.Articles,
  // @LINE:16
  CharactersController_1: controllers.CharactersController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Articles_2: controllers.Articles,
    // @LINE:16
    CharactersController_1: controllers.CharactersController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, Articles_2, CharactersController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Articles_2, CharactersController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Articles.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/new""", """controllers.Articles.showCreationForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/new""", """controllers.Articles.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""", """controllers.Articles.showEditForm(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""", """controllers.Articles.edit(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""", """controllers.Articles.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>/attachments""", """controllers.Articles.saveAttachment(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """attachments/$id<[^/]+>""", """controllers.Articles.getAttachment(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """attachments/$id<[^/]+>""", """controllers.Articles.removeAttachment(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """characters""", """controllers.CharactersController.index"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """characters""", """controllers.CharactersController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """characters/$id<[^/]+>""", """controllers.CharactersController.edit(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """characters/$id<[^/]+>""", """controllers.CharactersController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Articles_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Articles_index0_invoker = createInvoker(
    Articles_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Articles_showCreationForm1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/new")))
  )
  private[this] lazy val controllers_Articles_showCreationForm1_invoker = createInvoker(
    Articles_2.showCreationForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "showCreationForm",
      Nil,
      "GET",
      """""",
      this.prefix + """articles/new"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Articles_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/new")))
  )
  private[this] lazy val controllers_Articles_create2_invoker = createInvoker(
    Articles_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """articles/new"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Articles_showEditForm3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Articles_showEditForm3_invoker = createInvoker(
    Articles_2.showEditForm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "showEditForm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """articles/$id<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Articles_edit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Articles_edit4_invoker = createInvoker(
    Articles_2.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "edit",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """articles/$id<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Articles_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Articles_delete5_invoker = createInvoker(
    Articles_2.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """articles/$id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Articles_saveAttachment6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/attachments")))
  )
  private[this] lazy val controllers_Articles_saveAttachment6_invoker = createInvoker(
    Articles_2.saveAttachment(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "saveAttachment",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """articles/$id<[^/]+>/attachments"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Articles_getAttachment7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attachments/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Articles_getAttachment7_invoker = createInvoker(
    Articles_2.getAttachment(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "getAttachment",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """attachments/$id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Articles_removeAttachment8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attachments/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Articles_removeAttachment8_invoker = createInvoker(
    Articles_2.removeAttachment(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "removeAttachment",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """attachments/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CharactersController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("characters")))
  )
  private[this] lazy val controllers_CharactersController_index9_invoker = createInvoker(
    CharactersController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CharactersController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """characters"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CharactersController_create10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("characters")))
  )
  private[this] lazy val controllers_CharactersController_create10_invoker = createInvoker(
    CharactersController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CharactersController",
      "create",
      Nil,
      "PUT",
      """""",
      this.prefix + """characters"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CharactersController_edit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("characters/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CharactersController_edit11_invoker = createInvoker(
    CharactersController_1.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CharactersController",
      "edit",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """characters/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CharactersController_delete12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("characters/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CharactersController_delete12_invoker = createInvoker(
    CharactersController_1.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CharactersController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """characters/$id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Articles_index0_route(params) =>
      call { 
        controllers_Articles_index0_invoker.call(Articles_2.index)
      }
  
    // @LINE:7
    case controllers_Articles_showCreationForm1_route(params) =>
      call { 
        controllers_Articles_showCreationForm1_invoker.call(Articles_2.showCreationForm)
      }
  
    // @LINE:8
    case controllers_Articles_create2_route(params) =>
      call { 
        controllers_Articles_create2_invoker.call(Articles_2.create)
      }
  
    // @LINE:9
    case controllers_Articles_showEditForm3_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_showEditForm3_invoker.call(Articles_2.showEditForm(id))
      }
  
    // @LINE:10
    case controllers_Articles_edit4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_edit4_invoker.call(Articles_2.edit(id))
      }
  
    // @LINE:11
    case controllers_Articles_delete5_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_delete5_invoker.call(Articles_2.delete(id))
      }
  
    // @LINE:12
    case controllers_Articles_saveAttachment6_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_saveAttachment6_invoker.call(Articles_2.saveAttachment(id))
      }
  
    // @LINE:13
    case controllers_Articles_getAttachment7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_getAttachment7_invoker.call(Articles_2.getAttachment(id))
      }
  
    // @LINE:14
    case controllers_Articles_removeAttachment8_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Articles_removeAttachment8_invoker.call(Articles_2.removeAttachment(id))
      }
  
    // @LINE:16
    case controllers_CharactersController_index9_route(params) =>
      call { 
        controllers_CharactersController_index9_invoker.call(CharactersController_1.index)
      }
  
    // @LINE:17
    case controllers_CharactersController_create10_route(params) =>
      call { 
        controllers_CharactersController_create10_invoker.call(CharactersController_1.create)
      }
  
    // @LINE:18
    case controllers_CharactersController_edit11_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CharactersController_edit11_invoker.call(CharactersController_1.edit(id))
      }
  
    // @LINE:19
    case controllers_CharactersController_delete12_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CharactersController_delete12_invoker.call(CharactersController_1.delete(id))
      }
  
    // @LINE:22
    case controllers_Assets_at13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_0.at(path, file))
      }
  }
}