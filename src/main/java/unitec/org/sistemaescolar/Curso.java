
package unitec.org.sistemaescolar;

import org.springframework.data.annotation.Id;

/*
 * @author YOO
 */
public class Curso {
    private String Grupo;
    private String Id_P;
    private String Curso;
    private String Departamento;
    private String F_inicio;
    private String F_final;
    private String Horario;
    private String Dia;
    private int Precio;
    private String Cupo_minimo;
    private String Cupo_maximo;

    public Curso() {
    }

    public Curso(String Grupo, String Id_P, String Curso, String Departamento, String F_inicio, String F_final, String Horario, String Dia, int Precio, String Cupo_minimo, String Cupo_maximo) {
        this.Grupo = Grupo;
        this.Id_P = Id_P;
        this.Curso = Curso;
        this.Departamento = Departamento;
        this.F_inicio = F_inicio;
        this.F_final = F_final;
        this.Horario = Horario;
        this.Dia = Dia;
        this.Precio = Precio;
        this.Cupo_minimo = Cupo_minimo;
        this.Cupo_maximo = Cupo_maximo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getId_P() {
        return Id_P;
    }

    public void setId_P(String Id_P) {
        this.Id_P = Id_P;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getF_inicio() {
        return F_inicio;
    }

    public void setF_inicio(String F_inicio) {
        this.F_inicio = F_inicio;
    }

    public String getF_final() {
        return F_final;
    }

    public void setF_final(String F_final) {
        this.F_final = F_final;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCupo_minimo() {
        return Cupo_minimo;
    }

    public void setCupo_minimo(String Cupo_minimo) {
        this.Cupo_minimo = Cupo_minimo;
    }

    public String getCupo_maximo() {
        return Cupo_maximo;
    }

    public void setCupo_maximo(String Cupo_maximo) {
        this.Cupo_maximo = Cupo_maximo;
    }
}
