package co.com.iosproject.certificacion.questions;

import co.com.iosproject.certificacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarInicioDeSesion implements Question<Boolean> {

    public static ValidarInicioDeSesion enSauceLabs(){
        return new ValidarInicioDeSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.ADD_CART.resolveFor(actor).isVisible();
    }
}
