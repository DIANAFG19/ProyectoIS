package unitec.org.sistemaescolar;

import org.springframework.data.annotation.Id;
/*
 * @author YOO
 */
public class Alumno {
    @Id
    private int Id_A;
    
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Edad;
    private String Telefono_Casa;
    private String Telefono_Celular;
    private String Correo_Electronico;
    private String Contraseña;
    private String T_Alumno;

    public Alumno(String Nombre, String Apellido_Paterno, String Apellido_Materno, String Edad, String Telefono_Casa, String Telefono_Celular, String Correo_Electronico, String Contraseña, String T_Alumno) {
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Edad = Edad;
        this.Telefono_Casa = Telefono_Casa;
        this.Telefono_Celular = Telefono_Celular;
        this.Correo_Electronico = Correo_Electronico;
        this.Contraseña = Contraseña;
        this.T_Alumno = T_Alumno;
    }

    public Alumno(int Id_A) {
        this.Id_A = Id_A;
    }

    public Alumno(int Id_A, String Nombre, String Apellido_Paterno, String Apellido_Materno, String Edad, String Telefono_Casa, String Telefono_Celular, String Correo_Electronico, String Contraseña, String T_Alumno) {
        this.Id_A = Id_A;
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Edad = Edad;
        this.Telefono_Casa = Telefono_Casa;
        this.Telefono_Celular = Telefono_Celular;
        this.Correo_Electronico = Correo_Electronico;
        this.Contraseña = Contraseña;
        this.T_Alumno = T_Alumno;
    }

    public Alumno() {
    }

    public int getId_A() {
        return Id_A;
    }

    public void setId_A(int Id_A) {
        this.Id_A = Id_A;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getTelefono_Casa() {
        return Telefono_Casa;
    }

    public void setTelefono_Casa(String Telefono_Casa) {
        this.Telefono_Casa = Telefono_Casa;
    }

    public String getTelefono_Celular() {
        return Telefono_Celular;
    }

    public void setTelefono_Celular(String Telefono_Celular) {
        this.Telefono_Celular = Telefono_Celular;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getT_Alumno() {
        return T_Alumno;
    }

    public void setT_Alumno(String T_Alumno) {
        this.T_Alumno = T_Alumno;
    }
    
}
