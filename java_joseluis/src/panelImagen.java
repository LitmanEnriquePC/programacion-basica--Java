
import java.awt.Image;
import javax.swing.JPanel;

public class panelImagen extends JPanel {
    private Image imagen;
    
    public PanelImagen() {
        imagen = null;
    }
    
    
    
    public panelImagen( String nombreImagen){
        if ( nombreImagen != null) {
            imagen = new ImagenIcon( getClass().getResource(nombreImagen)
        }
    }
}
