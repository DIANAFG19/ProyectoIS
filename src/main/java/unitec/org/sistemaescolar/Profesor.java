
package unitec.org.sistemaescolar;

import org.springframework.data.annotation.Id;

/*
 * @author YOO
 */
public class Profesor {
    @Id
    private int Id_P;
    
    private String t_profesor;
    private String Nombre;
    private String APaterno;
    private String AMaterno;
    private String fecha_nac;
    private String Telefono;
    private String email;
    private String contraseña;

    public Profesor(String t_profesor, String Nombre, String APaterno, String AMaterno, String fecha_nac, String Telefono, String email, String contraseña) {
        this.t_profesor = t_profesor;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.fecha_nac = fecha_nac;
        this.Telefono = Telefono;
        this.email = email;
        this.contraseña = contraseña;
    }

    public Profesor(int Id_P) {
        this.Id_P = Id_P;
    }

    public Profesor(int Id_P, String t_profesor, String Nombre, String APaterno, String AMaterno, String fecha_nac, String Telefono, String email, String contraseña) {
        this.Id_P = Id_P;
        this.t_profesor = t_profesor;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.fecha_nac = fecha_nac;
        this.Telefono = Telefono;
        this.email = email;
        this.contraseña = contraseña;
    }

    public Profesor() {
    }

    public int getId_P() {
        return Id_P;
    }

    public void setId_P(int Id_P) {
        this.Id_P = Id_P;
    }

    public String getT_profesor() {
        return t_profesor;
    }

    public void setT_profesor(String t_profesor) {
        this.t_profesor = t_profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
