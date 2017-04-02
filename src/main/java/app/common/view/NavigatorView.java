package app.common.view;

import app.authentication.view.LoginView;
import app.common.view.service.CustomErrorHandler;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

import javax.inject.Inject;

@SpringUI
public class NavigatorView extends UI {

    Navigator navigator;

    @Inject
    private LoginView loginView;

    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        UI.getCurrent().setErrorHandler(new CustomErrorHandler());
        navigator = new Navigator(this, this);
        navigator.addView("", loginView);
    }
}
