package unitec.org.sistemaescolar;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
 * @author YOO
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorAlumnos {

    @Autowired
    RepositorioAlumnos repoAlum;

    //Aquí a continuación van las cinco operaciones básicas con la entidad mensaje.
    
    //Metodo GET: Buscar Todos
    @CrossOrigin
    @RequestMapping(value = "/alumnos", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Alumnos> obtenerTodos() throws Exception {
        return (ArrayList<Alumnos>) repoAlum.findAll();
    }

    //Metodo GET: Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/alumnos/{id}", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public Alumnos obtenerPorId(@PathVariable Integer id) throws Exception {
        return repoAlum.findOne(id);
    }

    //Metodo POST: Guardar pero es una version mas pura y efectiva
    @CrossOrigin
    @RequestMapping(value = "/alumnos", method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardarAlumno(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Alumnos mensa = maper.readValue(json, Alumnos.class);
        repoAlum.save(mensa);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Métoddo PUT: Actualizar
    @CrossOrigin
    @RequestMapping(value = "/alumnos", method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizarAlumno(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Alumnos alumno = maper.readValue(json, Alumnos.class);
        repoAlum.save(alumno);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Metodo DELETE. Borrar
    @CrossOrigin
    @RequestMapping(value = "/alumnos/{id}", method = RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrarAlumno(@PathVariable Integer id) throws Exception {
        repoAlum.delete(id);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }
}
