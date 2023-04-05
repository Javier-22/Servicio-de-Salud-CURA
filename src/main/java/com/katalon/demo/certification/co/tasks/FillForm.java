package com.katalon.demo.certification.co.tasks;



import com.katalon.demo.certification.co.models.DataModelFillForm;
import com.katalon.demo.certification.co.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


import static com.katalon.demo.certification.co.userinterfaces.FillFormPage.*;


public class FillForm implements Task {
    private DataModelFillForm dataModelFillForm;

    public FillForm(DataModelFillForm dataModelFillForm) {
        this.dataModelFillForm = dataModelFillForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Wait.Time(5000);
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(dataModelFillForm.getStrFacility()).from(FACILITY),
                Click.on(APPLY_FORM_HOSPITAL),
                Click.on(PROGRAM),
                Enter.theValue(dataModelFillForm.getStrVisitDate()).into(VISIT_DATE),
                Enter.theValue(dataModelFillForm.getStrVisitDate()).into(COMMENT),
                Click.on(CONFIRMATION_FORM)


        );
        Wait.Time(5000);
    }
        public static FillForm appointment(DataModelFillForm dataModelFillForm)
        {return Tasks.instrumented(FillForm.class, dataModelFillForm);}


}
