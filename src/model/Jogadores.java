package model;

public class Jogadores {
    private String nome;
    private int id;
    private String nome2;
    private int id2;

    public int getId2() {
        return id2;
    }
    public void setId2(int id2) {
        this.id2 = id2;
    }
    public String getNome() {
        return nome;
    }
    public String getNome2() {
        return nome2;
    }
    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "nome=" + nome + "\n" +
               "id=" + id + "\n" + 
               "nome2=" + nome2 + "\n" +
               "id2=" + id2 + "\n";
    }
}
