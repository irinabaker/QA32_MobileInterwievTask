package com.telran.tests;

import org.testng.annotations.Test;

public class ArticleTest extends TestBase{

    @Test
    public void addArticleToFavoriteAndRemoveTest() {
        System.out.println("app launch");
        app.getMainScreen().searchArticle();
        app.getArticle().addToFavorites();
        app.getArticle().createReadingList();
        app.getArticle().close();
        app.getMainScreen().selectFavorites();
        app.getArticle().removeFromFavorites();
    }
}
