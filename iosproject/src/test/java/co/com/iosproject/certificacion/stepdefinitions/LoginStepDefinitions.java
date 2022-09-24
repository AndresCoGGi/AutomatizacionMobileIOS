package co.com.iosproject.certificacion.stepdefinitions;

import co.com.iosproject.certificacion.questions.ValidarInicioDeSesion;
import co.com.iosproject.certificacion.tasks.Logearse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {

    @Given("^el usuario se encuentra en la pagina principal del Sauce Mobile$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipalDelSauceMobile() throws MalformedURLException {
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
    }

    @When("^el ingresa los datos de autenticacion$")
    public void elIngresaLosDatosDeAutenticacion() {
        theActorInTheSpotlight().attemptsTo(Logearse.enSauceLabs());
    }

    @Then("^el iniciara sesion exitosamente$")
    public void elIniciaraSesionExitosamente() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarInicioDeSesion.enSauceLabs()));
    }

}
