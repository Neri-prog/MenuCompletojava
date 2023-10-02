import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        char operador;


        System.out.println("Menu");
        System.out.println("1 - Soma de Dois Números");
        System.out.println("2 - Verificar Número Par ou Ímpar");
        System.out.println("3 - Calculadora Simples");
        System.out.println("4 - Fatorial de um Número");
        System.out.println("5 - Contagem Regressiva");
        System.out.println("6 - Média de Números");
        System.out.println("7 - Tabuada");
        System.out.println("8 - Verificar Palíndromo");
        System.out.println("9 - Converso de Temperatura");
        System.out.println("0 - Advinhação de Números");

        System.out.println("Digite a opção desejada (0-9): ");
        operador = input.next().charAt(0);
        Thread.sleep(1000);


        switch (operador) {
            case '1':
                System.out.println();
                System.out.println("Soma De Dois Números");
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                double soma = n1 + n2;

                System.out.println("A soma dos números é: " + soma);

                scanner.close();
                break;
            case '2':
                System.out.println();
                System.out.println("Ímpar ou Par");
                System.out.println();
                Scanner sc = new Scanner(System.in);
                System.out.print("Insira um número: ");
                int numero = sc.nextInt();

                if (numero % 2 == 0) {
                    System.out.println(numero + " é um número par.");
                } else {
                    System.out.println(numero + " é um número ímpar.");
                }

                sc.close();
                break;
            case '3':

                double num1, num2, resultado;
                char seletor;
                System.out.println();
                System.out.println("Calculadora Simples");
                System.out.println();
                System.out.print("Digite o primeiro número: ");
                num1 = input.nextDouble();

                System.out.print("Digite o operador (+, -, *, /): ");
                seletor = input.next().charAt(0);

                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();

                switch (seletor) {
                    case '+':
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '-':
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '*':
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                    default:
                        System.out.println("Operador inválido. Por favor, use +, -, *, ou /.");

                }
                break;
            case '4':

                int numF;
                System.out.println();
                System.out.println("Fatorial");
                System.out.println();
                System.out.println("Digite um número:");
                numF = input.nextInt();

                long fatorial = 1;

                if (numF < 0) {
                    System.out.println("Sem fatorial negativo");
                } else {
                    for (int i = 1; i <= numF; i++) {
                        fatorial *= i;
                    }
                    System.out.println("O fatorial de " + numF + " é " + fatorial);
                }

                break;
            case '5':
                int numR;
                System.out.println();
                System.out.println("Contagem regressiva");
                System.out.println();
                System.out.println("Digite um número: ");
                numR = input.nextInt();
                System.out.println();


                for (int i = numR; i > 0; i--) {
                    System.out.println(i);
                }
                break;
            case '6':
                Scanner scMedia = new Scanner(System.in);
                System.out.print("Quantos números você deseja calcular média? ");
                int qtdNumeros = scMedia.nextInt();

                double somar = 0;

                for (int i = 1; i <= qtdNumeros; i++) {
                    System.out.print("Digite o número " + i + ": ");
                    double numMedia = scMedia.nextDouble();
                    somar += numMedia;
                }

                double media = somar / qtdNumeros;

                System.out.printf("A média dos números inseridos é: %.2f%n ", media);

                break;
            case '7':
                Scanner inpuTabu = new Scanner(System.in);
                System.out.println();
                System.out.println("Tabuada");
                System.out.println();
                System.out.println("insiria um número para mostrar a tabuada do mesmo: ");
                int numBase = inpuTabu.nextInt();

                for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                    int result = numBase * multiplicador;
                    System.out.println(numBase + " x " + multiplicador + " = " + result);
                }
                break;
            case '8':

                Scanner scannerP = new Scanner(System.in);

                System.out.print("Digite uma palavra ou frase: ");
                String newText = scannerP.nextLine();
                if (ePalin(newText)) {
                    System.out.println("É um palíndromo!");
                } else {
                    System.out.println("Não é um palíndromo.");
                }

                scannerP.close();

                break;

            case '9':
                Scanner inpuTemp = new Scanner(System.in);
                double numTemp, resulTemp;
                char opcao;

                System.out.println("Temperatura");
                System.out.print("Digite o valor que quer converter: ");
                numTemp = inpuTemp.nextDouble();

                System.out.print("Digite umas das opções (c) para celsius, (f) para fahrenheit: ");
                opcao = inpuTemp.next().charAt(0);

                if (opcao == 'C' || opcao == 'c') {
                    resulTemp = (numTemp * 1.8) + 32;
                    System.out.println("Resultado: " + resulTemp + " °F");
                } else if (opcao == 'F' || opcao == 'f') {
                    resulTemp = (numTemp - 32) / 1.8;
                    System.out.printf("Resultado: " + resulTemp + " °C");
                } else {
                    System.out.println("Opção inválida. Por favor, digite 'C' ou 'F'.");
                }

                input.close();
                break;
            case '0':

                Random random = new Random();

                int randomNumber = random.nextInt(100);
                int numRad;

                do {
                    Scanner inputRad = new Scanner(System.in);

                    System.out.println("Digite o valor: ");
                    numRad = inputRad.nextInt();

                    if (numRad < randomNumber) {
                        System.out.println("O numero informado e maior!");
                    } else if (numRad > randomNumber) {
                        System.out.println("O numero informado e menor!");
                    }
                } while (randomNumber != numRad);

                System.out.println("Vc acertou !");
                break;


            default:
                System.out.println("Opção inválida. Por favor, use de 0 a 9.");

        }

        input.close();
    }
    public static boolean ePalin (String texto){
        texto = texto.replaceAll("\\W", "").toLowerCase();

        int tamanho = texto.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (texto.charAt(i) != texto.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}