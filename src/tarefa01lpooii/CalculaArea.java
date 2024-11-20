package tarefa01lpooii;

public class CalculaArea {
    
        public static double areaRetangulo(double lado1, double lado2){
            if (lado1 < 0 || lado2 < 0){
                throw new RuntimeException("Os lados nao podem ser negativos");
            }
            return lado1 * lado2;
        }
        
        public static double areaCircunferencia(double raio){
            double pi = 3.14;
            if (raio < 0){
                throw new RuntimeException("O raio nao pode ser negativo");
            }
            return pi * raio * raio;
        }
        
        public static double areaTriangulo(double base, double altura){
            if (base < 0 || altura < 0){
                throw new RuntimeException("A base e a altura nao podem ser negativos");
            }
            return (base * altura)/2;
        }
}
