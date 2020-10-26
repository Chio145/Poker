package RocioAguirre;

import java.util.Scanner;

public class Main {
    Deck Play = new Deck();
    boolean b =true;
    boolean continue_game = true;
    public void ShowMenu(){
        System.out.println("\t Bienvenid@ a Poker!" +
                "\n Selecciona una opción"+"\n 1- Mezclar deck"+
                "\n 2- Sacar una carta"+ "\n 3- Carta al azar"+
                "\n 4- Generar una mano de 5 cartas"+
                "\n 5- Reiniciar Juego"+
                "\n 0- Salir Del Juego");
    }

    private int ask() throws Exception{
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite una opcion: ");
        var menu = ent.nextInt();
        return menu;
    }

    public void Show_Switch(int menu) throws Exception {

        switch (menu){
            case 1:
                Play.shuffle();
                break;

            case 2:
               Play.Random_head();
                Play.head();
                break;

            case 3:
                Play.pick();
                break;

            case 4:
                Play.hand();
                break;

            case 0:
                System.out.println("Gracias Por Jugar");
                continue_game = false;
                break;
        }
    }
    public void Option_Message() throws Exception {
        do{
            line();
            ShowMenu();
            try {
                var menu = ask();
                if (menu <0 || menu >5){
                    throw new Exception("Opción No Valida");
                }
                Show_Switch(menu);

            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }while (continue_game);
    }
    void line(){
        System.out.println("\n---------------------");
    }
    public static void main(String[] args) throws  Exception {
        Main Menu = new Main();
        Menu.Option_Message();
    }
}
