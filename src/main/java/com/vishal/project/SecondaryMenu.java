package com.vishal.project;

import java.util.Scanner;

public class SecondaryMenu {
    Files files;

    public SecondaryMenu() {
        this.files = new Files(Main.PATHNAME);
    }

    void showSecondaryMenu() {
        System.out.println( "   \nSelect any of the following: \n"+
                "   a -> Add a file Into The Directory\n"+
                "   b -> Delete a file From Directory\n"+
                "   c -> Search a file\n"+
                "   d -> Go to the previous menu");
        try{
            Scanner sc = new Scanner(System.in);
            String s  = sc.nextLine().toLowerCase();
           

            switch (s.charAt(0)){
                case 'a' : {
                    System.out.println("   ↳ Adding a file...");

                    files.addFile(files.InputFileName());
                    showSecondaryMenu();
                }
                case 'b' : {
                    System.out.println("   ↳ Deleting a file...");
                    files.deleteFile(files.InputFileName());
                    showSecondaryMenu();
                }
                case 'c' : {
                    System.out.println("   ↳ Searching a file...");
                    files.searchFile(files.InputFileName());
                    showSecondaryMenu();
                }
                case 'd' : {
                    System.out.println("    Going Back to MAIN menu");
                    new MainMenu(Main.PATHNAME).showMenu();
                }
                default : {
                    System.out.println("   Please enter a, b, c or d");
                    showSecondaryMenu();
                }
            }
        }
        catch (Exception e){
            System.out.println("   Please enter 2.1 ,2.2,2.3 or 2.4");
            showSecondaryMenu();
        }
    }

}