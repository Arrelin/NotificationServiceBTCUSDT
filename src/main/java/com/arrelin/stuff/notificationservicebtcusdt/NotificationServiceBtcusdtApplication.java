package com.arrelin.stuff.notificationservicebtcusdt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@Theme("my-theme")
public class NotificationServiceBtcusdtApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceBtcusdtApplication.class, args);
    }
}
