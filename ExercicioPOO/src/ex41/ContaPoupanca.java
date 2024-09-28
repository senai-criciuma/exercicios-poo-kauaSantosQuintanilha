package ex41;

import ex33.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
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

    public  void rendimentoJurosMensal(){
        long rendimentoMensal=10/100;
    }
}
