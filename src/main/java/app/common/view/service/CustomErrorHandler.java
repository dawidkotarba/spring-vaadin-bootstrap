package app.common.view.service;

import com.vaadin.server.*;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Notification;


/**
 * Created on 02.04.2017.
 */
public class CustomErrorHandler implements ErrorHandler {
    @Override
    public void error(ErrorEvent errorEvent) {
        AbstractComponent component = DefaultErrorHandler.findAbstractComponent(errorEvent);
        if (component != null) {
            ErrorMessage errorMessage = new UserError("error"); // TODO: 02.04.2017
            if (errorMessage != null) {
                component.setComponentError(errorMessage);
                Notification.show("error", Notification.Type.ERROR_MESSAGE);// TODO: 02.04.2017
                return;
            }
            DefaultErrorHandler.doDefault(errorEvent);
        }
    }
}