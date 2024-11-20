package tarefa01lpooii;

public class CalculaSalario {

    public static double calculaSalarioBruto(double valorHora, double horasTrabalhadas){
        if (valorHora <= 0 || horasTrabalhadas <= 0){
            throw new RuntimeException("Valores tem que ser maior que 0");
        }
        return valorHora * horasTrabalhadas;
    }

    public static double calculaSalarioLiquido(double salarioBruto, double inss){
        if (inss < 0 || inss > 100){
            throw new RuntimeException("inss deve estar entre 0 e 100");
        }
        return salarioBruto * (1 - inss/100);
    }

    public static void imprimeExtrato(double valorHora, double horasTrabalhadas, double salarioBruto, double salarioLiquido){
        System.out.println("Extrato do Salario\n");
        System.out.printf("Valor por hora: %.2f\n", valorHora);
        System.out.printf("Horas trabalhadas: %.2f\n", horasTrabalhadas);
        System.out.printf("Salario Bruto: %.2f\n", salarioBruto);
        System.out.printf("Salario Liquido: %.2f", salarioLiquido);
    }

}
