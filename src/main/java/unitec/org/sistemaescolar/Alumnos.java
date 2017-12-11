package unitec.org.sistemaescolar;

import org.springframework.data.annotation.Id;
/*
 * @author YOO
 */
public class Alumnos {
    @Id
    private int id;
    
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String edad;
    private String tel_casa;
    private String tel_cel;
    private String correo;
    private String contra;
    private String tipo_alumno;

    public Alumnos(int id) {
        this.id = id;
    }

    public Alumnos(String nombre, String a_paterno, String a_materno, String edad, String tel_casa, String tel_cel, String correo, String contra, String tipo_alumno) {
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.edad = edad;
        this.tel_casa = tel_casa;
        this.tel_cel = tel_cel;
        this.correo = correo;
        this.contra = contra;
        this.tipo_alumno = tipo_alumno;
    }

    public Alumnos(int id, String nombre, String a_paterno, String a_materno, String edad, String tel_casa, String tel_cel, String correo, String contra, String tipo_alumno) {
        this.id = id;
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.edad = edad;
        this.tel_casa = tel_casa;
        this.tel_cel = tel_cel;
        this.correo = correo;
        this.contra = contra;
        this.tipo_alumno = tipo_alumno;
    }

    public Alumnos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTel_casa() {
        return tel_casa;
    }

    public void setTel_casa(String tel_casa) {
        this.tel_casa = tel_casa;
    }

    public String getTel_cel() {
        return tel_cel;
    }

    public void setTel_cel(String tel_cel) {
        this.tel_cel = tel_cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo_alumno() {
        return tipo_alumno;
    }

    public void setTipo_alumno(String tipo_alumno) {
        this.tipo_alumno = tipo_alumno;
    }
}
