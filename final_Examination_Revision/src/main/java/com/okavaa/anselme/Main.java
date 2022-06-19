package com.okavaa.anselme;

public class Main {
    public static void main(String[] args) {

        Currency currency = new Currency("USD", "USD", 1.0, new Registerer("irumvanselme", "IRUMVA HABUMUGISHA Anselme"));

        currency.getRegisterer().setFullNames("Thew new Names are here ... ");

        System.out.println(currency.getRegisterer().getFullNames());
    }
}