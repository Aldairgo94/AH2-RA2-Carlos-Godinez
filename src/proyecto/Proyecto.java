
package proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        
        //matriz
        int numero[][] = new int [8][8];
        char jugador [][] = new char [8][8];
        char trampas [][] = new char [8][8];
        //char tablero [][] = new char [8][8];
        

        Scanner sp = new Scanner(System.in);
        
        int posicion= 0;
        
        
        
        int numero_castigos1 = (int) (Math.random() * (4 - 2 + 1) + 2); 
        int numero_castigos2 = (int) (Math.random() * (4 - 2 + 1) + 2);
        int numero_castigos3 = (int) (Math.random() * (4 - 2 + 1) + 2);
        
        int var = 64; 
        boolean inverso = true;
        
        System.out.println("-MENU DEL JUEGO--");
        System.out.println("1. Iniciar Juego");
        System.out.println("2. Reanudar Juego");
        System.out.println("3. Salir");
        int play = sp.nextInt();
        
        switch (play){
            case 1:
                
                for (int i = 0; i < numero.length; i++) {
                    if (inverso){
                        for (int j = numero.length-1; j >= 0; j--) {
                            numero [i][j] = var;
                            var--;
                            
                        }
                    inverso = false;
                    }
                    else {
                        for (int j = 0; j < numero[i].length; j++) {
                            numero [i][j] = var;
                            var--;
                            
                        }
                    inverso = true;

                    }     
                }
                trampas [7][7] = '#';
                jugador [7][7] = '@';
                //tablero [7][7]=' ';
                while (posicion <=64){
                System.out.println("----------------------------------");
                for (int i = 0; i < numero.length; i++) {
                    for (int j = 0; j < numero.length; j++) {
                   
                        if (numero[i][j] < 10){
                            System.out.print("|  "+ numero[i][j]);
                        }
                        else {
                       System.out.print("| "+ numero[i][j]);
                        }
                             
                    
                    }
                    
                    System.out.println("| ");
                    for (int j = 0; j < trampas.length; j++) {
                       System.out.print("|  "+jugador[i][j]);
                    } 
                    
                for (int j = 0; j < numero_castigos1; j++) {
                        int numero_castigo1 = (int) (Math.random() * (6 - 0 + 1) + 0);
                        int numero_castigo_fila = (int) (Math.random() * (7 - 6 + 1) + 6);
                        trampas[numero_castigo_fila][numero_castigo1]='#';
                     
                        
                    }  
                    
                            System.out.println("| ");
                            System.out.println("---------------------------------"); 
                }
                
                
                    for (int i = 0; i < jugador.length; i++) {
                         for (int j = 0; j < jugador[i].length; j++) {
                             jugador[i][j] = ' ';
                             
                         }
                         
                     }
                      
    
                    
           System.out.println("deseas tirar el dado con r o salir al menu principal?");     
           String opcion = sp.nextLine();
           
             switch (opcion ){
             
                 case "r":
                     int dado = (int) (Math.random()*(6-2)+2);
                     System.out.println("Tu dado salio con "+ dado);
                     posicion += dado;
                     
                     if (posicion == 64){
                          System.out.println("Felicidades GANASTE! :D "); //8 fila cuando sea igual a 64
                    }else if(posicion >= 64){
                          System.out.println("Felicidades GANASTE! :D ");// 8 fila cuando sea mayor a 64 
                    }else if (posicion >= 56){
                          jugador [0][posicion-56] = '@'; //7 fila
                    }else if (posicion >= 48){
                          jugador [1][55-posicion] = '@'; //7 fila
                    }else if (posicion >= 40){
                          jugador [2][posicion-40] = '@'; //6 fila
                    }else if (posicion >= 32){
                          jugador [3][39-posicion] = '@'; //5 fila
                    }else if (posicion >= 24) {
                          jugador[4][posicion-24] = '@';  //4 fila
                    }else if (posicion >= 16){
                          jugador [5][23-posicion] = '@'; //3 fila
                    }else if (posicion >= 8){
                          jugador [6][posicion - 8] = '@';//2 fila
                    }else {
                          jugador [7][7-posicion] = '@';  //1 fila
                    }
                     break;
                 case "p":
                      System.out.println("-MENU DEL JUEGO--");
                      System.out.println("1. Iniciar Juego");
                      System.out.println("2. Reanudar Juego");
                      System.out.println("3. Salir");
                      int replay = sp.nextInt();
                      
                        if(replay == 2){
                          
                            if (posicion == 64){
                                System.out.println("Felicidades GANASTE! :D "); //8 fila cuando sea igual a 64
                                }else if(posicion >= 64){
                                System.out.println("Felicidades GANASTE! :D ");// 8 fila cuando sea mayor a 64 
                                }else if (posicion >= 56){
                                jugador [0][posicion-56] = '@'; //7 fila
                                }else if (posicion >= 48){
                                jugador [1][55-posicion] = '@'; //7 fila
                                }else if (posicion >= 40){
                                jugador [2][posicion-40] = '@'; //6 fila
                                }else if (posicion >= 32){
                                jugador [3][39-posicion] = '@'; //5 fila
                                }else if (posicion >= 24) {
                                jugador[4][posicion-24] = '@';  //4 fila
                                }else if (posicion >= 16){
                                jugador [5][23-posicion] = '@'; //3 fila
                                }else if (posicion >= 8){
                                jugador [6][posicion - 8] = '@';//2 fila
                                }else {
                                jugador [7][7-posicion] = '@';  //1 fila
                                }                             
                            }
                      
                     break;
           }
             

        }
                
         break;
         case 3:
            System.out.println("Gracias por Jugar Pana :D ");
            System.exit(0);
         break;
    }
    }
}
