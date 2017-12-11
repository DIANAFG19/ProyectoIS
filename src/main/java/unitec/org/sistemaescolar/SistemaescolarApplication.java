package unitec.org.sistemaescolar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{
@Autowired RepositorioAlumno repoAlumno;
@Autowired RepositorioProfesor repoProfesor;
    public static void main(String[] args) {
        SpringApplication.run(SistemaescolarApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        
    }
}
