package com.adex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("\t\t\tPRZEMIANA MATERII 1.0");
        System.out.println();
        do {
            System.out.println("\t\tCo chcesz zrobić?");
            System.out.println();
            System.out.println("\t1: Wpisz swoje dane");
            System.out.println("\t2: Pokaż definicje");
            System.out.println("\t3: Wyczyść dane");
            System.out.println();
            System.out.println("\t0: Wyjdź z programu");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    TotalMetabolicRate obj = new TotalMetabolicRate();
                    System.out.println();
                    System.out.println("\tDane zostały wpisane");
                    System.out.println();
                    int submenu;
                    if(obj!=null){
                        do{
                            System.out.println("\t\t1: Pokaż podstawową przemianę materii");
                            System.out.println("\t\t2: Pokaż całkowitą przemianę materii");
                            System.out.println("\t\t0: Wyjdź poziom wyżej");
                            submenu = input.nextInt();
                            switch (submenu){
                                case 1:
                                    System.out.println("\t\t" + obj.getName()+ " twoja podstawowa przemiana materii wynosi " + obj.setBasialMetabolicRate() + " kcal");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("\t\t" + obj.getName() + " twoja całkowita przemiana materii wynosi " + obj.calculateResult() + " kcal");
                                    System.out.println();
                                    break;
                            }
                            if(submenu==0){
                                break;
                            }
                        }while((submenu!=1&&submenu!=2)||submenu!=0);
                    }
                    break;
                case 2:
                    System.out.println(displayDefinitionBMR());
                    System.out.println(displayDefinitionCMR());
                    System.out.println();
                    break;
                case 3:
                    obj=null;
            }
        }while (choice!=0);
    }

    private static String displayDefinitionBMR(){
        return "\tPodstawowa przemiana materii (PPM) (ang. Basal metabolic rate) – " +
                "najmniejsze tempo przemiany materii, zachodzącej w organizmie człowieka, " +
                "niezbędne do podtrzymania podstawowych funkcji życiowych, znajdującego się " +
                "w stanie czuwania, w warunkach zupełnego spokoju fizycznego i psychicznego, " +
                "komfortu cieplnego, który na 12 godzin przed badaniem nie spożywał żadnych posiłków, " +
                "po 3 dniach diety bezbiałkowej i po co najmniej 8 godzinach snu. " +
                "W zależności od wieku oraz stylu życia podstawowa przemiana materii pochłania od 45% do 70% " +
                "dziennego zapotrzebowania energetycznego człowieka";
    }

    private static String displayDefinitionCMR(){
        return "\tCałkowita przemiana materii (CPM) – suma wszystkich wydatków energetycznych człowieka, " +
                "które ponosi podczas aktywności fizycznej.";
    }
}
