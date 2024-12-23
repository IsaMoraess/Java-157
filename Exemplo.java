package EX2;

import java.io.File;

public class Exemplo {
    public static void main(String[] args) {
        File arqSaida = new File("C:\\Users\\laboratorio\\Desktop\\Ex2.1.txt");
        Verificar vf = new Verificar();
        vf.verificaArquivo(arqSaida);
        Dados dd = new Dados();
        dd.escreveDados(arqSaida, true, "First name: Isabelly, Last name: Moraes, Age: 19");
    }

}
