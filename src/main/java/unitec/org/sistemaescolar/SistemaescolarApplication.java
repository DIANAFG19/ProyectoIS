package unitec.org.sistemaescolar;

import com.mongodb.*;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{
@Autowired RepositorioAlumnos repoAlumnos;
    public static void main(String[] args) {
        SpringApplication.run(SistemaescolarApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Alumnos alumno = new Alumnos(14949470, "Maria", "Sanchez", "Lopez", "25", "22334477", "5577448899", "maria@hotmail.com", "17948651", "externo");
        repoAlumnos.save(alumno);
        System.out.println("Mensaje guardado");
    }
}
