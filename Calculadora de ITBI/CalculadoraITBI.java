import javax.swing.JOptionPane;
public class CalculadoraITBI {
 public static void main(String[] args) {
     String inputTransacao = JOptionPane.showInputDialog("Digite o valor do imóvel:");
     String inputVenal = JOptionPane.showInputDialog("Digite o valor venal:");
     String inputPorcentagemITBI = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");

    double valorTransacao = Double.parseDouble(inputTransacao);
    double valorVenal = Double.parseDouble(inputVenal);
    double porcentagemITBI = Double.parseDouble(inputPorcentagemITBI);

     double maiorValor = Math.max(valorTransacao, valorVenal);
     double itbi = maiorValor * (porcentagemITBI / 100);

       
     JOptionPane.showMessageDialog(null, String.format("O valor do ITBI é: R$ %.2f", itbi));
    }
}
