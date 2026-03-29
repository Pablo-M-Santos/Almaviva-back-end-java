
import models.Bootcamp;
import models.Curso;
import models.Dev;
import models.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Java Basico", "Aprenda fundamentos de Java", 8);
        Curso cursoOO = new Curso("POO em Java", "Aprenda Orientacao a Objetos", 10);
        Mentoria mentoria = new Mentoria("Mentoria Java", "Esclarecendo duvidas", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Treinamento intensivo Java");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoOO);
        bootcamp.adicionarConteudo(mentoria);

        Dev devAlice = new Dev("Pablo");
        Dev devBob = new Dev("Isaac");

        devAlice.inscreverBootcamp(bootcamp);
        devBob.inscreverBootcamp(bootcamp);

        devAlice.progredir();
        devAlice.progredir();

        devBob.progredir();

        devAlice.mostrarProgresso();
        devBob.mostrarProgresso();
    }
}