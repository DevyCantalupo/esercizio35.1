public class Triangulo implements Shape {
    private String nome;
    private int numLati;

    public Triangulo(String nome, int numLati) {
        this.nome = nome;
        this.numLati = numLati;
    }

    @Override
    public void draw() {
        System.out.println(nome + " " + numLati);
    }
}