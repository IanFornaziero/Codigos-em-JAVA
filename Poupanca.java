import java.time.LocalDate;

public class Poupanca  extends Conta {
    private int DiasRendimento;

    public Poupanca(String Cliente, int NumConta, double Saldo, LocalDate DataNascimento, int DiasRendimento) {
        super(Cliente, NumConta, Saldo, DataNascimento);
        this.DiasRendimento = DiasRendimento;
    }

    public int getDiasRendimento(){
        return DiasRendimento;
    }

    public void setDiasRendimento(int DiasRendimento){
        this.DiasRendimento = DiasRendimento;
    }

    public void CalcularNovoSaldo(double Taxa){
        double M; //montante

        M = getSaldo() * Math.pow(1+Taxa,getDiasRendimento());
        Depositar((double) M);
    }

}
