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
public class ControladorProfesor {
    @Autowired
    RepositorioProfesor repoProfe;

    //Aquí a continuación van las cinco operaciones básicas con la entidad mensaje.
    
    //Metodo GET: Buscar Todos
    @CrossOrigin
    @RequestMapping(value = "/profesor", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Profesor> obtenerTodos() throws Exception {
        return (ArrayList<Profesor>) repoProfe.findAll();
    }

    //Metodo GET: Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/profesor/{id}", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public Profesor obtenerPorId(@PathVariable Integer id) throws Exception {
        return repoProfe.findOne(id);
    }

    //Metodo POST: Guardar pero es una version mas pura y efectiva
    @CrossOrigin
    @RequestMapping(value = "/profesor", method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardarProfesor(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Profesor profesor = maper.readValue(json, Profesor.class);
        repoProfe.save(profesor);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Métoddo PUT: Actualizar
    @CrossOrigin
    @RequestMapping(value = "/profesor", method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizarProfesor(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Profesor profesor = maper.readValue(json, Profesor.class);
        repoProfe.save(profesor);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Metodo DELETE. Borrar
    @CrossOrigin
    @RequestMapping(value = "/profesor/{id}", method = RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrarProfesor(@PathVariable Integer id) throws Exception {
        repoProfe.delete(id);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }
}
