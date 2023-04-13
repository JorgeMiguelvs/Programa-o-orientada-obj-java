public class Nota {
    Integer n1;
    Integer n2;
    Integer n3;
    Integer notaFinal;

    public String verificarMedia() {
        if (notaFinal >= 6) {
            return "Sua nota foi "+notaFinal+" Aprovado";

        }
        else {
            return "Sua nota foi "+notaFinal +" Reprovado";
        }
    }

}
