
package unitec.org.sistemaescolar;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
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
public class ControladorCurso {
    
    @Autowired
    RepositorioCurso repoCurso;

    //Aquí a continuación van las cinco operaciones básicas con la entidad mensaje.
    
    //Metodo GET: Buscar Todos
    @CrossOrigin
    @RequestMapping(value = "/curso", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public List<Curso> obtenerTodos() throws Exception {
        return (List<Curso>) repoCurso.findAll();
    }

    //Metodo GET: Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public Curso obtenerPorId(@PathVariable String id) throws Exception {
        return repoCurso.findOne(id);
    }

    //Metodo POST: Guardar pero es una version mas pura y efectiva
    @CrossOrigin
    @RequestMapping(value = "/curso", method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardarCurso(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Curso curso = maper.readValue(json, Curso.class);
        repoCurso.save(curso);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Métoddo PUT: Actualizar
    @CrossOrigin
    @RequestMapping(value = "/curso", method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizarCurso(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        Curso curso = maper.readValue(json, Curso.class);
        repoCurso.save(curso);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Metodo DELETE. Borrar
    @CrossOrigin
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrarCurso(@PathVariable String id) throws Exception {
        repoCurso.delete(id);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }
}
