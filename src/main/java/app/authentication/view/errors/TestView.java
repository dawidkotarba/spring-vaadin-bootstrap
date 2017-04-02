package app.authentication.view.errors;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import lombok.extern.slf4j.Slf4j;

/**
 * Created on 30.03.2017.
 */
@Slf4j
public class TestView extends VerticalLayout implements View {

    @Override
    public void enter(final ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        final Label label = new Label("test label");
        addComponent(label);
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        Notification.show("Welcome to test page!");
    }
}