//Criado por Ian Batista Fornaziero

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate DataNascimento = LocalDate.of(1979,05,11);
        Conta Cliente1 = new Conta("Anri de Astora",255446874,1200,DataNascimento);
        Poupanca Poup = new Poupanca (Cliente1.getNome(),Cliente1.getConta(), Cliente1.getSaldo(),Cliente1.getDataNascimento(),0);
        Especial Esp = new Especial (Cliente1.getNome(),Cliente1.getConta(), Cliente1.getSaldo(),Cliente1.getDataNascimento(),600);

        boolean continuar = true;
        double valor;

        while (continuar){
                Cliente1.Menu();
                int escolha = scan.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("Insira o valor a ser depositado: ");
                        valor = scan.nextDouble();
                        Cliente1.Depositar(valor);
                        Poup.setSaldo(Cliente1.getSaldo());
                        Esp.setSaldo(Cliente1.getSaldo());
                        break;
                    case 2:
                        System.out.print("Insira o valor a sacar: ");
                        valor = scan.nextDouble();
                        Cliente1.Sacar(valor);
                        Poup.setSaldo(Cliente1.getSaldo());
                        Esp.setSaldo(Cliente1.getSaldo());
                        break;
                    case 3:
                        System.out.print("Insira a quantidade de dias que o saldo irá render: ");
                        int diasrendimento = scan.nextInt();
                        Poup.setDiasRendimento(diasrendimento);
                        Poup.CalcularNovoSaldo(0.005);
                        Esp.setSaldo(Cliente1.getSaldo());
                        break;
                    case 4:
                        System.out.print("Insira o valor a sacar: ");
                        valor = scan.nextDouble();
                        Esp.SaqueEspecial(valor);
                        break;
                    case 5:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção desconhecida, tente novamente inserir um numero de 1 a 5");
                }
        }
    }
}