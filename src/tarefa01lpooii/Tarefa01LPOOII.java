package tarefa01lpooii;
import java.util.Scanner;

public class Tarefa01LPOOII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para Calculos de Area e 2 para Calculos de Salario: ");
        int menu = scanner.nextInt();

        if(menu == 1){
            try{
                System.out.println("1. Area Retangulo, 2. Circunferencia, 3. Triangulo");
                int escolha = scanner.nextInt();
                switch (escolha){
                    case 1:
                        System.out.println("Lado 1:");
                        double lado1 = scanner.nextDouble();
                        System.out.println("Lado 2:");
                        double lado2 = scanner.nextDouble();
                        System.out.println("Area do Retangulo: " + CalculaArea.areaRetangulo(lado1, lado2));
                        break;
                    case 2:
                        System.out.println("Digite o Raio:");
                        double raio = scanner.nextDouble();
                        System.out.println("Area da Circunferencia: " + CalculaArea.areaCircunferencia(raio));
                        break;
                    case 3:
                        System.out.println("Digite a base: ");
                        double base = scanner.nextDouble();
                        System.out.println("Digite a altura");
                        double altura = scanner.nextDouble();
                        System.out.println("Area do Triangulo: " + CalculaArea.areaTriangulo(base, altura));
                        break;
                    default:
                        System.out.println("Opção Invalida");
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        } else if (menu == 2) {
            try{
                System.out.println("Digite o valor da hora:");
                double valorHora = scanner.nextDouble();

                System.out.println("Digite o numero de horas trabalhadas:");
                double horasTrabalhadas = scanner.nextDouble();

                System.out.println("Digite o percentual de desconto inss:");
                double inss = scanner.nextDouble();

                double salarioBruto = CalculaSalario.calculaSalarioBruto(valorHora, horasTrabalhadas);
                double salarioLiquido = CalculaSalario.calculaSalarioLiquido(salarioBruto, inss);

                CalculaSalario.imprimeExtrato(valorHora, horasTrabalhadas, salarioBruto, salarioLiquido);

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }

        }
    }
    
}
