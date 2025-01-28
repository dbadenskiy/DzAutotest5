import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class TestHeader {

    @BeforeAll
    static void beforeALL() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1474x822";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void TestHeaderEnterprize() {
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $("a[href='https://github.com/enterprise']").click();
        $("#js-flash-container").shouldHave(text("The AI-powered developer platform"));

    }
}
