import java.util.concurrent.ThreadLocalRandom;

public class candidatura {  // Nome da classe ajustado para iniciar com letra maiúscula
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        System.out.println("Imprimindo os candidatos selecionados, informando o índice do elemento:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número: " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado.");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1000, 3000);
    }

    static void analisarCandidatura(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para candidato.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para candidato com contraproposta.");
        } else {
            System.out.println("Aguardando os demais candidatos.");
        }
    }
}
