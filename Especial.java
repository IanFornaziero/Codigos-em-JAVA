import java.time.LocalDate;

public class Especial extends Conta{
    private double limite;

    public Especial (String Cliente, int NumConta, double Saldo, LocalDate DataNascimento, double limite){
        super(Cliente, NumConta, Saldo, DataNascimento);
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }

    public void SaqueEspecial(double valor){
        if(getSaldo() <= 0 ){
            if(valor < getLimite()){
                setSaldo(getSaldo() - valor);
                MostrarSaldo();
            }else System.out.println("O valor a sacar é maior que o limite");

        }else System.out.println("O saldo está positivo, tente realizar um saque comum");
    }
}
