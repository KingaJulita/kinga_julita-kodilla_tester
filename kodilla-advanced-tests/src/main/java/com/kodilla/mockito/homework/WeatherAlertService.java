package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private final Map<Location, Set<Person>> subscribers = new HashMap<>();


    public void addSubscriber(Person person, Location location) {
        this.subscribers
                .computeIfAbsent(location, loc -> new HashSet<>())
                .add(person);
    }


    public void removeSubscriberFromLocation(Person person, Location location) {
        Set<Person> persons = this.subscribers.get(location);
        if (persons != null) {
            persons.remove(person);
            if (persons.isEmpty()) {
                this.subscribers.remove(location);
            }
        }
    }


    public void removeSubscriberFromAllLocations(Person person) {
        this.subscribers.forEach((location, persons) -> persons.remove(person));
        this.subscribers.values().removeIf(Set::isEmpty);
    }


    public void sendAlertToLocation(Location location, WeatherAlert weatherAlert) {
        Set<Person> persons = this.subscribers.get(location);
        if (persons != null) {
            for (Person person : persons) {
                person.receive(weatherAlert);
            }
        }
    }


    public void removeLocation(Location location) {
        this.subscribers.remove(location);
    }


    public void sendNotificationToAll(Notification notification) {
        for (Set<Person> persons : this.subscribers.values()) {
            for (Person person : persons) {
                person.receive(notification);
            }
        }
    }
}