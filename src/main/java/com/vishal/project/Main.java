package com.vishal.project;

public class Main {
    final static String PATHNAME = "D:\\new_file";

    public static void main(String[] args) {
        System.out.println( "\n*****************  Locked.me *******************"+
                            "\n***************** Vishal V1 *******************"+
                            "\n\nDIRECTORY : "+PATHNAME);

        MainMenu mainMenu = new MainMenu(PATHNAME);
        mainMenu.showMenu();
    }
}