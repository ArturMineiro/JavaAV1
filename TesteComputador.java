import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os dois primeiros objetos utilizando o construtor default
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        // Preenchendo os atributos dos objetos criados com construtor default
        System.out.println("Informe os dados do computador 1:");
        System.out.print("Marca: ");
        computador1.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        computador1.setModelo(scanner.nextLine());
        System.out.print("Memória RAM (em GB): ");
        computador1.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (em GB): ");
        computador1.setArmazenamento(scanner.nextInt());
        System.out.print("Preço: ");
        computador1.setPreco(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Informe os dados do computador 2:");
        System.out.print("Marca: ");
        computador2.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        computador2.setModelo(scanner.nextLine());
        System.out.print("Memória RAM (em GB): ");
        computador2.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (em GB): ");
        computador2.setArmazenamento(scanner.nextInt());
        System.out.print("Preço: ");
        computador2.setPreco(scanner.nextDouble());
        scanner.nextLine(); 

        // Criando os dois últimos objetos utilizando o construtor com parâmetros
        System.out.println("Informe os dados do computador 3:");
        System.out.print("Marca: ");
        String marca3 = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo3 = scanner.nextLine();
        System.out.print("Memória RAM (em GB): ");
        int memoriaRAM3 = scanner.nextInt();
        System.out.print("Armazenamento (em GB): ");
        int armazenamento3 = scanner.nextInt();
        System.out.print("Preço: ");
        double preco3 = scanner.nextDouble();
        scanner.nextLine();
        Computador computador3 = new Computador(marca3, modelo3, memoriaRAM3, armazenamento3, preco3);

        System.out.println("Informe os dados do computador 4:");
        System.out.print("Marca: ");
        String marca4 = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo4 = scanner.nextLine();
        System.out.print("Memória RAM (em GB): ");
        int memoriaRAM4 = scanner.nextInt();
        System.out.print("Armazenamento (em GB): ");
        int armazenamento4 = scanner.nextInt();
        System.out.print("Preço: ");
        double preco4 = scanner.nextDouble();
        Computador computador4 = new Computador(marca4, modelo4, memoriaRAM4, armazenamento4, preco4);

    
        System.out.println("\nAtributos dos computadores criados:");
        computador1.imprimir();
        computador2.imprimir();
        computador3.imprimir();
        computador4.imprimir();
    }
}
