import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso React");
        curso2.setDescricao("Descrição do curso React");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java Developer");
        bootcamp.setDescricao("Descrição Bootcampo Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Soares");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        devCamila.progredir();     
        devCamila.progredir();     
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluidos Camila" + devCamila.getConteudosConcluidos());   
        System.out.println("XP: " + devCamila.calcularXp());     
        
        System.out.println("---------");
        
        Dev devJuarez = new Dev();
        devJuarez.setNome("Juarez Souza");
        devJuarez.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Juarez" + devJuarez.getConteudoInscritos());
        devJuarez.progredir();
        devJuarez.progredir();
        devJuarez.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Juarez" + devJuarez.getConteudoInscritos());
        System.out.println("Conteúdos concluidos Juarez" + devJuarez.getConteudosConcluidos());        
        System.out.println("XP: " + devJuarez.calcularXp());     
        
        
        
    }
}