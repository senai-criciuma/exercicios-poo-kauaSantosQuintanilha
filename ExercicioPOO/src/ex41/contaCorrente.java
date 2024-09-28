package ex41;

import ex33.ContaBancaria;

public class contaCorrente  extends ContaBancaria {
    @Override
    public void depositar() {
        super.depositar();
    }

    @Override
    public void sacar() {
        super.sacar();
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    public void limitedeSaque(){
        double limitedesaque=100;
    }
}
