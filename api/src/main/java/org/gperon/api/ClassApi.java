/*
 * @(#)ClassApi.java   2009-10-31
 *
 * Copyright (c) 2005-2010 Luxottica Group
 * All Rights Reserved.
 * This program contains proprietary and trade secret information of Luxottica Group.
 *
 *
 *
 */
package org.gperon.api;

/**
 *
 * @author GiorgioP
 */
public class ClassApi {

    /**
     * Method description
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        /* modifica 1 */
        printMessage("Hello world!");
    }

    private static void printMessage(String msg) {
        System.out.println(msg);
    }

    private void hello(String msg) {
        System.out.println("msg: " + msg);
    }

    private void a(String msg) {
        System.out.println("a");
    }

    private void b(String msg) {
        System.out.println("b");
    }

    private void c(String msg) {
        System.out.println("c");
    }

    private void d(String msg) {
        System.out.println("d");
    }

    private void f(String msg) {
        System.out.println("f");
    }

    private void g(String msg) {
        System.out.println("g");
    }

    private void h(String msg) {
        System.out.println("h");
    }
}
