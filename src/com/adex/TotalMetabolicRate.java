package com.adex;

import java.util.Scanner;

class TotalMetabolicRate {

    private Scanner sc = new Scanner(System.in);

    private String name;
    private String sex;
    private double weight;
    private int height;
    private int age;

    TotalMetabolicRate(){

        System.out.print("Podaj swoje imię: ");
        this.name = sc.next();
        this.sex = setSex();
        System.out.print("Podaj swoją wagę: ");
        this.weight = sc.nextDouble();
        System.out.print("Podaj swój wzrost w cm: ");
        this.height = sc.nextInt();
        System.out.print("Ile masz lat?: ");
        this.age = sc.nextInt();
    }

    private String setSex() {
        System.out.print("Podaj swoją płeć (m/k): ");
        return sc.next();
    }

    private int setSexRate(){
        return this.sex.equals("m") ? 5 : -161;
    }

    double setBasialMetabolicRate(){
        return (10*this.weight)+(6.25*this.height)-
                (5*this.age+setSexRate());
    }

    private double setMultiplier(){
        int choice;
        double multiplier = 0;
        do {
            System.out.println("\t\tWybierz z poniższych aktywności fizycznych:");
            System.out.println("\t1: Praca siedząca, brak dodatkowej aktywności fizycznej");
            System.out.println("\t2: Praca niefizyczna, mało aktywny tryb życia");
            System.out.println("\t3: Lekka praca fizyczna, regularne ćwiczenia 3-4 razy (ok. 5h) w tygodniu");
            System.out.println("\t4: Praca fizyczna, regularne ćwiczenia od 5 razy (ok. 7h) w tygodniu");
            System.out.println("\t5: Praca fizyczna ciężka, regularne ćwiczenia 7 razy w tygodniu");
            System.out.println();
            System.out.print("\tWYBIERZ NUMER Z ZAKRESU OD 1-5: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    multiplier = 1.2;
                    break;
                case 2:
                    multiplier = 1.4;
                    break;
                case 3:
                    multiplier = 1.6;
                    break;
                case 4:
                    multiplier = 1.8;
                    break;
                case 5:
                    multiplier = 2.0;
                    break;
            }
        } while(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5);
        return multiplier;
    }

    double calculateResult(){
        return setBasialMetabolicRate()*setMultiplier();
    }

    public String getName() {
        return this.name;
    }
}
