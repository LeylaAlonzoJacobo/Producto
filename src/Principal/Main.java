
package Principal;

import GUI.JFPrincipal;

public class Main {

   //se mando a mostrar JF principal/
    public static void main(String[] args) {
        // TODO code application logic here
        JFPrincipal frmprincipal = new JFPrincipal();
        frmprincipal.setExtendedState(frmprincipal.MAXIMIZED_BOTH);
        frmprincipal.show();
                
    }
    
}

