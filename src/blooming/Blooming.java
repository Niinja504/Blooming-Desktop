package blooming;

import Controlador.Ctrl_SingIn;
import Modelo.SingIn;
import Vista.frm_SignIn;

public class Blooming {
     public static void main(String[] args) {
        frm_SignIn vista = new frm_SignIn();
        SingIn modelo = new SingIn(vista);
        Ctrl_SingIn controlador = new Ctrl_SingIn(vista);
        vista.setVisible(true);
    }
}