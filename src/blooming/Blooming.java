package blooming;

import Controlador.ctrl_SingIn;
import Modelo.SingIn;
import Vista.frm_SingIn;

public class Blooming {
     public static void main(String[] args) {
        frm_SingIn vista = new frm_SingIn();
        SingIn modelo = new SingIn(vista);
        ctrl_SingIn controlador = new ctrl_SingIn(vista);
        vista.setVisible(true);
    }
}