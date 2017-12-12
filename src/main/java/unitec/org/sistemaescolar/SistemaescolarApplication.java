package unitec.org.sistemaescolar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{
@Autowired RepositorioAlumno repoAlumno;
@Autowired RepositorioProfesor repoProfesor;
@Autowired RepositorioCurso repoCurso;
@Autowired RepositorioCursoAlumno repoCursoAlumno;
    public static void main(String[] args) {
        SpringApplication.run(SistemaescolarApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        /*Curso curso = new Curso("2564", "256", "JAVA", "PROGRAMACION", "20 Junio de 2017", "20 de Agosto de 2017", "1:00 pm", "Lunes y Jueves", 1500, "5", "10");
        repoCurso.save(curso);*/
        /*CursoAlumno cursoAlumno = new CursoAlumno(65164, 4564, "rv46v", 5.8f);
        repoCursoAlumno.save(cursoAlumno);*/
    }   
}
