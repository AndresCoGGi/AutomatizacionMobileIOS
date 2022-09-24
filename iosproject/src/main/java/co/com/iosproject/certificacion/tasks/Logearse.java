package co.com.iosproject.certificacion.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.iosproject.certificacion.userinterfaces.LoginPage.LOGIN_BTN;
import static co.com.iosproject.certificacion.userinterfaces.LoginPage.USERNAME;

public class Logearse implements Task {

    public static Logearse enSauceLabs(){
        return Tasks.instrumented(Logearse.class);
    }

    @Step("Logearse")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(USERNAME, WebElementStateMatchers.isVisible()),
                Click.on(USERNAME), Click.on(LOGIN_BTN));

    }
}
