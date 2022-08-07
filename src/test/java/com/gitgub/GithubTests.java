package com.gitgub;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com/";
    }

    @Test
    void comparePlansTest() {
        open("");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("h1").shouldHave(text("Choose the plan that’s right for you."));
    }
}
