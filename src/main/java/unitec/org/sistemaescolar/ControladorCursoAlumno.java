
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
public class ControladorCursoAlumno {
    @Autowired
    RepositorioCursoAlumno repoCursoA;

    //Aquí a continuación van las cinco operaciones básicas con la entidad mensaje.
    
    //Metodo GET: Buscar Todos
    @CrossOrigin
    @RequestMapping(value = "/curso", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<CursoAlumno> obtenerTodos() throws Exception {
        return (ArrayList<CursoAlumno>) repoCursoA.findAll();
    }

    //Metodo GET: Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public CursoAlumno obtenerPorId(@PathVariable String id) throws Exception {
        return repoCursoA.findOne(id);
    }

    //Metodo POST: Guardar pero es una version mas pura y efectiva
    @CrossOrigin
    @RequestMapping(value = "/curso", method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardarCurso(@RequestBody String json) throws Exception {
        //Tranformamos el json a objeto Java
        ObjectMapper maper = new ObjectMapper();
        CursoAlumno curso = maper.readValue(json, CursoAlumno.class);
        repoCursoA.save(curso);
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
        CursoAlumno curso = maper.readValue(json, CursoAlumno.class);
        repoCursoA.save(curso);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }

    //Metodo DELETE. Borrar
    @CrossOrigin
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrarCurso(@PathVariable String id) throws Exception {
        repoCursoA.delete(id);
        Estatus es = new Estatus();
        es.setSuccess(true);
        return es;
    }
}
