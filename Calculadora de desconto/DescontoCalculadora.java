import java.util.Scanner;
public class DescontoCalculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite valor do produto: ");
    double valorProduto = scanner.nextDouble();
    System.out.print("Digite a porcentagem de desconto: ");
    double porcentagemDesconto = scanner.nextDouble();

    double valorDesconto = (valorProduto * porcentagemDesconto) / 100;
    double precoFinal = valorProduto - valorDesconto;

    System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
    System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        
    scanner.close();
    }
}