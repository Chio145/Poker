package RocioAguirre;

import java.util.Scanner;

public class Main {
    int menu;
    public void ShowMenu(){
        Deck o1 = new Deck();
        Scanner ent = new Scanner(System.in);
        System.out.println("\t Bienvenid@ a Poker!" +
                " \n Selecciona una opción"+"\n 1- Mezclar deck"+
                "\n 2- Sacar una carta"+ "\n 3- Carta al azar"+
                "\n 4- Generar una mano de 5 cartas"+
                "\n 0- Salir");
        System.out.print("Digite la opción: ");
        menu = ent.nextInt();
        switch (menu){
            case 1:
                o1.pok();
                o1.shuffle();
                break;
            case 2:
                o1.pok();
                o1.Random_head();
                o1.head();
                break;

            case 3:
                o1.pok();
                o1.pick();
                break;
            case 4:
                o1.pok();
                o1.hand();
                break;
            case 0:
                System.out.println("Gracias Por Jugar");
                break;
        }
    }
    public void Option_Message(){
        while (menu<0 || menu >4){
            System.out.println("Opción No Válida");
            ShowMenu();
        }
    }

    public static void main(String[] args) {
        Main Menu = new Main();
        Menu.ShowMenu();
        Menu.Option_Message();
    }
}
