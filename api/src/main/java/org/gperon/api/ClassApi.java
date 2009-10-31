/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gperon.api;

/**
 *
 * @author GiorgioP
 */
public class ClassApi {

    public static void main(String[] args) {
        /* modifica 1*/
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

    private void d(String msg) {
        System.out.println("d");
    }

    private void f(String msg) {
        System.out.println("f");
    }

    private void g(String msg) {
        System.out.println("g");
    }
}
