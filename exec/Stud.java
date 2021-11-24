package exec;
import java.util.Scanner;

import proj.ClassMedio;
import proj.ClassSuperior;
import proj.Menu;

public class Stud{

    public static void main(String[] args) {
        
        int acao = 0;

        Scanner scan = new Scanner(System.in);

        int cadastro;
        System.out.print("\nDeseja cadastrar um usu�rio? \n-> 0 para sim\n-> 1 para n�o\n");
        cadastro = scan.nextInt();

        if(cadastro == 0){

            System.out.println("\nInforme: \n-> 0 para ensino m�dio \n-> 1 para superior");
            acao = scan.nextInt();

            if(acao == 0) {
                ClassMedio medio = new ClassMedio();
                Menu menuGeral = new Menu();
                Scanner scMedio = new Scanner(System.in);
                System.out.print("\nInforme seu nome: ");
                medio.setNome(scMedio.nextLine());
                System.out.print("Informe seu email: ");
                medio.setEmail(scMedio.nextLine());
                medio.verificacao();
                medio.selecTempoEstudo();
                medio.selecTempoPausa();

                int menu = 0;

                do{

                    menuGeral.opcoes();

                    Scanner sc2 = new Scanner(System.in);
                    menu = sc2.nextInt();
                    switch(menu){

                        case 1:
                            medio.info();
                            break;
                        
                        case 2:
                            medio.afazeres();
                            break;

                        case 3: 
                            medio.listaAfazeres();
                            break;

                        case 4:
                            medio.somaTempo(medio.getTempoEstudo(), medio.getTempoPausa());
                            break;

                            default: System.out.println("\nOp��o inv�lida");
                    }

                }while(menu != 0);

            }

            else if(acao == 1){
                ClassSuperior superior = new ClassSuperior();
                Menu menuGeral = new Menu();
                Scanner scSuperior = new Scanner(System.in);
                System.out.print("\nInforme seu nome: ");
                superior.setNome(scSuperior.nextLine());
                System.out.print("Informe seu email: ");
                superior.setEmail(scSuperior.nextLine());
                superior.verificacao();
                superior.selecTempoEstudo();
                superior.selecTempoPausa();

                int menu = 0;
                do{
                    
                    menuGeral.opcoes();

                    Scanner sc2 = new Scanner(System.in);
                    menu = sc2.nextInt();
                    switch(menu){

                        case 1:
                            superior.info();
                            break;
                        
                        case 2:
                            superior.afazeres();
                            break;

                        case 3: 
                            superior.listaAfazeres();
                            break;

                        case 4:
                            superior.somaTempo(superior.getTempoEstudo(), superior.getTempoPausa());
                            break;

                            default: System.out.println("\nOp��o inv�lida");       
                    }

                }while(menu != 0);

            }

            else{
                System.out.println("Opera��o inv�lida\n");
            }
            
        }

        else{
            System.out.println("Opera��o inv�lida\n");
        }

            System.out.println("\nOk, at� a pr�xima\n");
    }
}