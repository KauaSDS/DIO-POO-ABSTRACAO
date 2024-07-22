import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // Criação da mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criação do bootcamp e adição dos conteúdos
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Inscrição e progresso de Kauã
        Dev devKaua = new Dev();
        devKaua.setNome("Kauã");
        devKaua.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kauã:" + devKaua.getConteudosInscritos());
        devKaua.progredir();
        devKaua.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Kauã:" + devKaua.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kauã:" + devKaua.getConteudosConcluidos());
        System.out.println("XP:" + devKaua.calcularTotalXp());

        System.out.println("-------");

        // Inscrição e progresso de Maria
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }
}
