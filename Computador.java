public class Computador {
    // Atributos
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private int armazenamento;
    private double preco;

    // Construtor 
    public Computador() {
        this.marca = "";
        this.modelo = "";
        this.memoriaRAM = 0;
        this.armazenamento = 0;
        this.preco = 0.0;
    }

    // Construtor com parâmetros
    public Computador(String marca, String modelo, int memoriaRAM, int armazenamento, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para imprimir todos os atributos
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println();
    }
}
