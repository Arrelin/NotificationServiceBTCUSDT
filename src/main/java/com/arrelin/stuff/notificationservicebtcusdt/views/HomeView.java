package com.arrelin.stuff.notificationservicebtcusdt.views;

import com.arrelin.stuff.notificationservicebtcusdt.notification.WebPushService;
import com.arrelin.stuff.notificationservicebtcusdt.notification.WebPushToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView(WebPushService webPushService) {

        var toggle = new WebPushToggle(webPushService.getPublicKey());
        var messageInput = new TextField("Message testing for now:");
        var sendButton = new Button("Notify testing");
        var messageLayout = new HorizontalLayout(messageInput, sendButton);
        messageLayout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

        add(
                new H1("Web Push Notification for BTCUSDT"),
                toggle,
                messageLayout
        );

        toggle.addSubscribeListener(e -> {
            webPushService.subscribe(e.getSubscription());
        });
        toggle.addUnsubscribeListener(e -> {
            webPushService.unsubscribe(e.getSubscription());
        });

        sendButton.addClickListener(e -> webPushService.notifyAll("BTC Alert", messageInput.getValue()));
    }
}
