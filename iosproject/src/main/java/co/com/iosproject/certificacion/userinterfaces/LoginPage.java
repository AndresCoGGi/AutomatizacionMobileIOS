package co.com.iosproject.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME = Target.the("Username")
            .locatedBy("//XCUIElementTypeOther[@name='test-standard_user']");
    public static final Target LOGIN_BTN = Target.the("Login btn")
            .locatedBy("//XCUIElementTypeOther[@name='test-LOGIN']");

    public static final Target ADD_CART =  Target.the("Add cart")
            .locatedBy("(//XCUIElementTypeOther[@name='test-ADD TO CART'])[1]");


}
