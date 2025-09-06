import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();// ler o peso digitado pelo usuário.

        System.out.println ("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();//ler altura digitada pelo usuário.

        double imc = peso/(altura*altura);// Fórmula para calcular IMC.
        System.out.printf ("\nSeu índice de massa corporal é:%.2f\n",imc);//mostra resultado.

        //Classificação
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III");
            }
        scanner.close();
    }
}
