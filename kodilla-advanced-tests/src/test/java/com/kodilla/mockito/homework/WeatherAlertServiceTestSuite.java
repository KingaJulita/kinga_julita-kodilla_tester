package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

public class WeatherAlertServiceTestSuite {

    WeatherAlertService service = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void shouldSendAlertToSubscribedClients() {
        service.addSubscriber(person, location);
        service.addSubscriber(person2, location);

        service.sendAlertToLocation(location, weatherAlert);

        Mockito.verify(person, times(1)).receive(weatherAlert);
        Mockito.verify(person2, times(1)).receive(weatherAlert);
    }

    @Test
    public void shouldNotSendAlertToUnsubscribedClients() {
        service.addSubscriber(person, location);
        service.removeSubscriberFromLocation(person, location);

        service.sendAlertToLocation(location, weatherAlert);

        Mockito.verify(person, never()).receive(weatherAlert);
    }

    @Test
    public void shouldRemoveSubscriberFromAllLocations() {
        service.addSubscriber(person, location);
        service.addSubscriber(person, location2);
        service.removeSubscriberFromAllLocations(person);

        service.sendAlertToLocation(location, weatherAlert);
        service.sendAlertToLocation(location2, weatherAlert);

        Mockito.verify(person, never()).receive(weatherAlert);
    }

    @Test
    public void shouldSendNotificationToAllPeople() {
        service.addSubscriber(person, location);
        service.addSubscriber(person2, location2);

        service.sendNotificationToAll(notification);

        Mockito.verify(person, times(1)).receive(notification);
        Mockito.verify(person2, times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        service.addSubscriber(person, location);
        service.addSubscriber(person, location2);

        service.removeLocation(location2);

        service.sendAlertToLocation(location2, weatherAlert);

        Mockito.verify(person, never()).receive(weatherAlert);
    }

    @Test
    public void shouldSendAlertToSubscriberSubscribedToMultipleLocations() {

        service.addSubscriber(person, location);
        service.addSubscriber(person, location2);

        service.sendAlertToLocation(location, weatherAlert);
        service.sendAlertToLocation(location2, weatherAlert);

        Mockito.verify(person, times(2)).receive(weatherAlert);
    }

    @Test
    public void shouldHandleRemovingLocationWithNoSubscribers() {

        service.removeLocation(location);

        service.sendAlertToLocation(location, weatherAlert);

        Mockito.verify(person, never()).receive(weatherAlert);
    }
    @Test
    public void shouldNotDuplicateSubscriberInSameLocation() {

        service.addSubscriber(person, location);
        service.addSubscriber(person, location);

        service.sendAlertToLocation(location, weatherAlert);

        Mockito.verify(person, times(1)).receive(weatherAlert);
    }
    @Test
    public void shouldNotSendAlertToNonExistentLocation() {

        service.sendAlertToLocation(location, weatherAlert);

        Mockito.verify(person, never()).receive(weatherAlert);
    }

}
