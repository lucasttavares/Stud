package proj;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClassSuperior extends ClassEstudante implements Tempo {
    
    private double somaTempo;
    private int projetos;

    public ClassSuperior() {

    }

    public ClassSuperior(int disciplinas, double tempoEstudo, double tempoPausa, String usuario, String email, String id) {
        super(disciplinas, tempoEstudo, tempoPausa, usuario, email, id);
    }


    public double getSomaTempo(){
        return somaTempo;
    }

    public void setSomaTempo(double somaTempo){
        this.somaTempo = somaTempo;
    }

    public int getProjetos() {
        return projetos;
    }

    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }

    @Override
    public void verificacao() {
        String str = "303";

        Random r = new Random();
        String conc = str + Integer.toString(r.nextInt(9999));
        setId(conc);
    }

    public void info(){

        System.out.println("\nNome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Seu id: " + getId());
    }

    ArrayList<String> list = new ArrayList();
    String adiciona;

    @Override
    public void afazeres(){

        Scanner scarray = new Scanner(System.in);

            System.out.print("\nQuantas disciplinas você vai estudar hoje? ");
            setDisciplinas(scarray.nextInt());
            System.out.print("E quantos projetos para fazer? ");
            setProjetos(scarray.nextInt());

            Scanner sc1 = new Scanner(System.in);
            for(int i = 0; i < getDisciplinas(); i++){
                System.out.print("\nInforme a disciplina " + (i + 1) + ": ");
                adiciona = sc1.nextLine();
                list.add(adiciona);
            }

            for(int i = 0; i < getProjetos(); i++){
                System.out.print("\nInforme o projeto " + (i + 1) + ": ");
                adiciona = sc1.nextLine();
                list.add(adiciona);
            }
    }

    public void listaAfazeres(){

        if(list.size() == 0){
            System.out.println("\nAinda não há nada na lista");
        }
        
        else{
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }

    @Override
    public void selecTempoEstudo(){
        System.out.println("\nQuanto tempo você pretende estudar? (em minutos) ");
        Scanner scTempo = new Scanner(System.in);
        double tempoE = scTempo.nextDouble();
        setTempoEstudo(tempoE);
    }

    @Override
    public void selecTempoPausa(){
        System.out.println("\nE quanto tempo de pausa? (em minutos) ");
        Scanner scTempo = new Scanner(System.in);
        double tempoP = scTempo.nextDouble();
        setTempoPausa(tempoP);
    }

    public double somaTempo(double tempoE, double tempoP){
        somaTempo = tempoE + tempoP;
        System.out.println("\n" + somaTempo + " min");
        return somaTempo;
    }
}