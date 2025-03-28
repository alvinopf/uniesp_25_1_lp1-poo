package questao2;

// Implemente o código java para a seguinte situação

// Médico: (trabalhaNoHospital boolean, tratarPaciente())
// - Clínico Geral (atendeEmCasa boolean, receitar())
// - Cirurgião (tratarPaciente(), fazerIncisão())

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Medico m = new Medico();
        ClinicoGeral cg = new ClinicoGeral();
        Cirurgiao c = new Cirurgiao();

    }
}
