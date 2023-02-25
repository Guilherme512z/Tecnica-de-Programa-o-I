package Heranca_java;

public class Gerente extends Funcionario{

        private int senha;
        public int getSenha() {

        return senha;

        }
        void setSenha(int senha) {
        this.senha = senha;
        }

        public boolean autentica(int senha) {
        if (this.senha == senha) {
        return true;

        } else {
        return false;
        
        }
    }
}