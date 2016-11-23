
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nandpa/Documents/Intellij/ScalaPlayDemo/conf/routes
// @DATE:Wed Nov 23 14:51:58 PST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseArticles Articles = new controllers.ReverseArticles(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCharactersController CharactersController = new controllers.ReverseCharactersController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseArticles Articles = new controllers.javascript.ReverseArticles(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCharactersController CharactersController = new controllers.javascript.ReverseCharactersController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
