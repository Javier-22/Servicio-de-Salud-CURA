package com.katalon.demo.certification.co.questions;


import com.katalon.demo.certification.co.userinterfaces.FillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheValidOption implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return FillFormPage.CONFIRMATION_TEST.resolveAllFor(actor).get(0).getText();
    }
    public static TheValidOption isEqual(){
        return new TheValidOption();
    }
}
