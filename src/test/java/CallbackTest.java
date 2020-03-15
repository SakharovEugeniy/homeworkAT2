import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CallbackTest {
    @Test
    void shouldSubmitRequest() throws InterruptedException {
        open("http://localhost:9999");
        $("input[type='text']").setValue("Василий");
        $("input[type='tel']").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $("button[type='button']").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
