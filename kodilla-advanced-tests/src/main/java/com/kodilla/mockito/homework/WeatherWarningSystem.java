package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherWarningSystem {
    public HashMap<Localization, HashSet<Person>> weatherWarningSystem = new HashMap<>();

    public void addPerson(Localization localization, Person person) {
        if (weatherWarningSystem.containsKey(localization)) {
            weatherWarningSystem.get(localization).add(person);
        }
    }

    public void removePerson(Localization localization, Person person) {
        if (weatherWarningSystem.containsKey(localization)) {
            weatherWarningSystem.get(localization).remove(person);
        }
    }

    public void removePersonFromAll(Person person) {
        for (Localization localization : weatherWarningSystem.keySet()) {
            weatherWarningSystem.get(localization).remove(person);
        }
    }

    public void sendNotificationForSpecificLocation(Notification notification, Localization localization1) {
        for (Localization localization : weatherWarningSystem.keySet()) {
            if (localization == localization1) {
                weatherWarningSystem.get(localization).forEach(person -> person.receive(notification));
            }
        }
    }

    public void sendMessageToAllSubscribed(Notification notification) {
        HashSet<Person> all = new HashSet<Person>();
        for (Localization localization : weatherWarningSystem.keySet()) {
            all.addAll(weatherWarningSystem.get(localization));
        }
        all.forEach(person -> person.receive(notification));
    }

    public void removeLocation(Localization localization) {
        weatherWarningSystem.remove(localization);
    }

    public static void main(String[] args) {

    }
}