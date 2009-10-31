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

}
