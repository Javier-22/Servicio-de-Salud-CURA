package com.katalon.demo.certification.co.tasks;

import com.katalon.demo.certification.co.models.DataModelCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.katalon.demo.certification.co.userinterfaces.MappingLogin.*;

public class Login implements Task {


    private DataModelCredentials dataModelCredentials;

    public Login(DataModelCredentials dataModelCredentials) {
        this.dataModelCredentials = dataModelCredentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataModelCredentials.getStrUsername()).into(USERNAME),
                Enter.theValue(dataModelCredentials.getStrPassword()).into(PASSWORD),
                Click.on(ACCESSBUTTON)
        );

    }
    public static Login with(DataModelCredentials dataModelCredentials)
    {return Tasks.instrumented(Login.class, dataModelCredentials);}
}
