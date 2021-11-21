package qa.metyun.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {
    @Test
    void formTest() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
        open("/automation-practice-form");
        $("#firstName").setValue("Roma");
        $("#lastName").setValue("Metyun");
        $("#userEmail").setValue("Metyun@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0336619417");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("2012");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
//        react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month
//        react-datepicker__day react-datepicker__day--030
        $("#subjectsInput").setValue("che").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Hareckaha - 21");
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();

        $("#submit").scrollTo().click();
        $(".modal-header").shouldHave(text("Thanks for submitting the form\n"));
        $("#close-fixedban").click();
        $("#closeLargeModal").click();


    }
}
