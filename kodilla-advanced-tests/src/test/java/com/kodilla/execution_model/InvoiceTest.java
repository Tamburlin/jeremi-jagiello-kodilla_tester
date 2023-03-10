package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice = new Invoice();
    Item item1 = new Item("Papiesz", 21.37);
    Item item2 = new Item("AyyLmao", 420.69);

    @Test
    public void shouldAddNewObjToListAndIncreaseItSize() {
        invoice.addItem(item1);
        invoice.addItem(item2);
        assertEquals(2,invoice.getSize());
    }

    @Test
    public void getItemShouldReturnCorrectItemAndItemGettersShouldReturnCorrectValues() {
        invoice.addItem(item1);
        invoice.addItem(item2);
        assertEquals("Papiesz", invoice.getItem(0).getName());
        assertEquals(420.69, invoice.getItem(1).getPrice());
    }

    @Test
    public void shouldReturnNullWhenGettingItemWithIndexSmallerThanZero() {
        invoice.addItem(item1);
        assertNull(invoice.getItem(-1));
    }

    @Test
    public void shouldReturnNullWhenGettingItemOutsideTheList() {
        Invoice invoice = new Invoice();
        Item item1 = new Item("Papiesz", 21.37);
        invoice.addItem(item1);
        assertNull(invoice.getItem(1));
    }

    @Test
    public void ListShouldHaveZeroSizeAfterUsingClearMethod() {
        Invoice invoice = new Invoice();
        Item item1 = new Item("Papiesz", 21.37);
        Item item2 = new Item("AyyLmao", 420.69);
        invoice.addItem(item1);
        invoice.addItem(item2);
        assertEquals("Papiesz", invoice.getItem(0).getName());
        assertEquals(420.69, invoice.getItem(1).getPrice());
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
}