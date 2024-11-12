import java.time.LocalDate;

public class Conta {
    private String Cliente;
    private int NumConta;
    private double Saldo;
    private LocalDate DataNascimento;

    public Conta(String Cliente, int NumConta, double Saldo,LocalDate DataNascimento){
        this.Cliente = Cliente;
        this.NumConta = NumConta;
        this.Saldo = Saldo;
        this.DataNascimento = DataNascimento;
    }

    public String getNome(){
        return Cliente;
    }
    public int getConta(){
        return NumConta;
    }
    public double getSaldo(){
        return Saldo;
    }
    public LocalDate getDataNascimento(){
        return DataNascimento;
    }
    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }

    public void MostrarSaldo(){
        System.out.println("O Saldo atual da conta é: " + getSaldo() + " reais");
    }

    public void Sacar(double valor){
        if(valor>getSaldo()){
            System.out.println("Não é possivel realizar o saque, pois o valor informado é maior que em saldo disponivel");
        }else{
            Saldo -= valor;
            MostrarSaldo();
        }
    }

    public void Depositar(double valor){
        Saldo += valor;
        MostrarSaldo();
    }

    public void Menu(){
        System.out.println("Bem vindo " + getNome() + " ao sistema do banco");
        System.out.println("-----------------");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Aplicar poupança");
        System.out.println("4 - Saque especial");
        System.out.println("5 - Sair do sistema");
        System.out.println("-----------------");
        System.out.print("\n");
        System.out.print("Escolha o que deseja fazer no sistema (de 1 a 5): ");
    }
}