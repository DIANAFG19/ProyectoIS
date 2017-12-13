
package unitec.org.sistemaescolar;

/*
 * @author YOO
 */
public class CursoAlumno {
    
    private String Grupo;
    private int Id_A;
    private float Promedio;

    public CursoAlumno() {
    }

    public CursoAlumno(int Id_A, String Grupo, float Promedio) {
        this.Id_A = Id_A;
        this.Grupo = Grupo;
        this.Promedio = Promedio;
    }

    public int getId_A() {
        return Id_A;
    }

    public void setId_A(int Id_A) {
        this.Id_A = Id_A;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }
}
