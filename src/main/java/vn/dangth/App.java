package vn.dangth;

import org.rapidoid.setup.On;
import vn.dangth.module.entity.*;

public class App {
    public static void main( String[] args ) {

        org.rapidoid.setup.App.bootstrap(args).jpa();
        //Main
        On.get("/home").view("home").mvc("OK");
        On.get("/").view("home").mvc("OK");

    }
}
