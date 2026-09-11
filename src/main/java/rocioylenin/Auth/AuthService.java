package rocioylenin.Auth;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    public String username;
    public String password;

    public static void main(String[] args) {
        HashMap<String, String> loginUsuario = new HashMap<>();
        loginUsuario.put("password1", "panchito.perez");
        loginUsuario.put("password2", "juansito.jimenez");
        loginUsuario.put("password3", "carlitos.juarez");

        for (Map.Entry<String, String> entry : loginUsuario.entrySet()) {
            String password = entry.getKey();
            String username = entry.getValue();
            System.out.println(username + " es tu usuario y " + password + " es tu contraseña.");
        }

    }
}
