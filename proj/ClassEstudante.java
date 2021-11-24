package proj;
public abstract class ClassEstudante {

    protected int disciplinas;
    protected double tempoEstudo;
    protected double tempoPausa;
    protected String nome;
    protected String email;
    protected String id;

    public ClassEstudante() {

    }

    public ClassEstudante(int disciplinas, double tempoEstudo, double tempoPausa, String nome, String email, String id) {
        this.disciplinas = disciplinas;
        this.tempoEstudo = tempoEstudo;
        this.tempoPausa = tempoPausa;
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public int getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getTempoEstudo(){
        return tempoEstudo;
    }

    public void setTempoEstudo(double tempoEstudo){
        this.tempoEstudo = tempoEstudo;
    }

    public double getTempoPausa(){
        return tempoPausa;
    }

    public void setTempoPausa(double tempoPausa){
        this.tempoPausa = tempoPausa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void verificacao() {
        
    }

    public void afazeres(){
        
    }

    public void listaAfazeres(){
        
    }
}

