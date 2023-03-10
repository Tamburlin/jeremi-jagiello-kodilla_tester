package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class WeatherWarningSystemTest {

    WeatherWarningSystem weatherWarningSystemExample = new WeatherWarningSystem();
    Notification notification = Mockito.mock(Notification.class);

    Person person11 = Mockito.mock(Person.class);
    Person person12 = Mockito.mock(Person.class);
    Person person21 = Mockito.mock(Person.class);
    Person person22 = Mockito.mock(Person.class);
    Person person31 = Mockito.mock(Person.class);

    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);

    @Test
    public void shouldAddPersonToChosenLocalization() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        assertTrue(weatherWarningSystemExample.weatherWarningSystem.get(localization1).contains(person11));
    }

    @Test
    public void shouldRemovePersonFromOnlyChosenLocalization() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        weatherWarningSystemExample.addPerson(localization1, person12);
        weatherWarningSystemExample.removePerson(localization1, person12);
        assertFalse(weatherWarningSystemExample.weatherWarningSystem.get(localization1).contains(person12));

        HashSet<Person> set2 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization2, set2);
        weatherWarningSystemExample.addPerson(localization2, person11);
        weatherWarningSystemExample.addPerson(localization2, person12);
        assertTrue(weatherWarningSystemExample.weatherWarningSystem.get(localization2).contains(person12));
    }

    @Test
    public void shouldRemovePersonFromAllLocalizations() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        weatherWarningSystemExample.addPerson(localization1, person12);

        HashSet<Person> set2 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization2, set2);
        weatherWarningSystemExample.addPerson(localization2, person11);
        weatherWarningSystemExample.addPerson(localization2, person12);

        weatherWarningSystemExample.removePersonFromAll(person12);
        assertFalse(weatherWarningSystemExample.weatherWarningSystem.get(localization1).contains(person12));
        assertFalse(weatherWarningSystemExample.weatherWarningSystem.get(localization2).contains(person12));

        assertTrue(weatherWarningSystemExample.weatherWarningSystem.get(localization1).contains(person11));
        assertTrue(weatherWarningSystemExample.weatherWarningSystem.get(localization1).contains(person11));
    }

    @Test
    public void shouldSendNotificationOnlyToPersonsInChosenLocalization() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        weatherWarningSystemExample.addPerson(localization1, person12);

        HashSet<Person> set2 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization2, set2);
        weatherWarningSystemExample.addPerson(localization2, person21);
        weatherWarningSystemExample.addPerson(localization2, person22);

        weatherWarningSystemExample.sendNotificationForSpecificLocation(notification, localization1);
        Mockito.verify(person11).receive(notification);
        Mockito.verify(person12).receive(notification);
        Mockito.verify(person22, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAllSubscribers() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        weatherWarningSystemExample.addPerson(localization1, person12);

        HashSet<Person> set2 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization2, set2);
        weatherWarningSystemExample.addPerson(localization2, person21);
        weatherWarningSystemExample.addPerson(localization2, person22);

        weatherWarningSystemExample.sendMessageToAllSubscribed(notification);

        Mockito.verify(person11).receive(notification);
        Mockito.verify(person12).receive(notification);
        Mockito.verify(person21).receive(notification);
        Mockito.verify(person22).receive(notification);
        Mockito.verify(person31, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldDeleteChosenLocation() {
        HashSet<Person> set1 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization1, set1);
        weatherWarningSystemExample.addPerson(localization1, person11);
        weatherWarningSystemExample.addPerson(localization1, person12);

        HashSet<Person> set2 = new HashSet<>();
        weatherWarningSystemExample.weatherWarningSystem.put(localization2, set2);
        weatherWarningSystemExample.addPerson(localization2, person21);
        weatherWarningSystemExample.addPerson(localization2, person22);

        weatherWarningSystemExample.removeLocation(localization1);
        assertFalse(weatherWarningSystemExample.weatherWarningSystem.containsKey(localization1));
        assertTrue(weatherWarningSystemExample.weatherWarningSystem.containsKey(localization2));
    }
}