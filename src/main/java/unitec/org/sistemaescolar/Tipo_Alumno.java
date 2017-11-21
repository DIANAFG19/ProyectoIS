
package unitec.org.sistemaescolar;
import org.springframework.data.annotation.Id;
/*
 * @author YOO
 */
public class Tipo_Alumno {
    @Id
    private String id;
    
    private String tipo;
    
    /*public Tipo_Alumno(String tipo) {
        this.tipo = tipo;
    }*/

    public Tipo_Alumno(String id) {
        this.id = id;
    }

    public Tipo_Alumno(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Tipo_Alumno() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
