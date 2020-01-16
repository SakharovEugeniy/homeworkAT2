import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {
    @Test
    void shouldSubmitRequest(){
        open("http://localhost:9999");
        $("input[type='text']").setValue("Василий");
        $("input[type='tel']").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $("[data-test-id=span.button__text]").click();
        $("p.paragraph").shouldHave(exactText("Ваша заявка успешно отправлена!"));






//        SelenideElement form = $( "[input class=input_contorl]");
//        form.$("[input class=input_contorl").setValue("Василий");
//        form.$("[data-test-id=phone]input").setValue("+79270000000");
//        form.$("[data-test-id=agreement]").click();
//        form.$("[data-test-id=submit]").click();
//        $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена!"));



    }
}
