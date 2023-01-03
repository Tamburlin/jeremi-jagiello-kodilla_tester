package com.kodilla;

public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (600 <= this.price && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
        }
    public void checkWeight() {
        if (this.weight < 1200) {
            System.out.println("This book is very light.");
        } else if (this.weight >=1200 && this.weight < 2000) {
            System.out.println("This book is not so heavy.");
        } else if (this.weight >=2000) {
            System.out.println("This book is quite heavy.");
        }
    }
    public void checkYear() {
        if (this.year >= 2013 && this.price <= 2000) {
            System.out.println("This is a notebook worth it's price.");
        } else if (this.year < 2013 && this.price > 2000) {
            System.out.println("This is a  scam or a collector edition notebook.");
        } else if (this.year < 2010 && this.price < 1000) {
            System.out.println("This is a bargain if all you want to do is play minesweeper.");
        }
    }
    }

