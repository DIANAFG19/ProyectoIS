package unitec.org.sistemaescolar;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner {

    @Autowired
    //RepositorioAlumnos repoAlumno;

    public static void main(String[] args) {
        SpringApplication.run(SistemaescolarApplication.class, args);

    }

    @Override
    public void run(String... strings) throws Exception {
        
    }
}
