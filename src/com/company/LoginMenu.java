package com.company;

import java.util.Scanner;

public class LoginMenu implements Menu{
    private userServise userServise;
    private String[] items = {"1.Login" , "2.Regvest" };
    private Scanner scanner;



    @Override
    public void show() {
        showItems(items);
        System.out.println("0.Exit");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    loginSubMenu(scanner);
                    break;
                case  2:
                    loginSubMenu(scanner);
                    break;
                case 3:
                    exit();
                    break;
            }
        }

    }



    @Override
    public void exit() {
        System.exit(0);

    }
    private void loginSubMenu (Scanner scanner){
        System.out.println("input login");
        String login = scanner.nextLine();

        System.out.println("input pass");
        String password = scanner.nextLine();
    }

}
