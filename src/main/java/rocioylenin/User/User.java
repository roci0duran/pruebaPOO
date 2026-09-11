package rocioylenin.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    public static String username;
    public String password;
    public String nombreCompleto;
    public String correoElectronico;


    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public void setUsername (String username){
        this.username = username;
    }

    public void setNombreCompleto (String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }




}
