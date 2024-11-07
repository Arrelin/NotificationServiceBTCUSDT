package com.arrelin.stuff.notificationservicebtcusdt.views;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        add(new Paragraph("Enable notifications for BTCUSDT"));


        add(new Paragraph("Enter API Key"));

        add(new Paragraph("Enter Secret Key"));

        add(new Paragraph("How frequently check price:"));


        add(new Paragraph("Your last purchase price:"));

    }
}
