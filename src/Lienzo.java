import javax.swing.*;
import java.awt.*;

public class Lienzo extends JPanel {

    private Color colorFondo;
    int coordXOrig, coordYOrig;

    @Override
    public void paintComponent(Graphics g){
        //Establecer el color de fondo
        //-----ésta forma no funciona cuando se trabaja en el contexto gráfico
        //
        //this.setBackground(colorFondo);
        //-------------

        g.setColor(colorFondo);
        g.fillRect(0,0, getWidth()-1, getHeight()-1);
        //Dibujar el plano cartesiano
/*
        //Obtener coordenadas centrales del lienzo para establecer origen (0,0)
        coordXOrig = (int) (this.getWidth() / 2);
        coordYOrig = (int) (this.getHeight() / 2);

        g.setColor(Color.GREEN);
        //Dibujar eje X con valores y etiquetas
        g.drawLine(0, coordYOrig, this.getWidth()-1, coordYOrig);

        //Dibujar eje y con valores y etiquetas
        g.drawLine(coordXOrig, 0, coordXOrig, this.getHeight());*/

    }

    public Lienzo(){
        super();

        //Crear JPanel y agregarlo
        this.setPreferredSize(new Dimension(800, 400));
        colorFondo = Color.BLACK;
        this.setBackground(colorFondo);
    }


    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;

        //---- ésta forma no funciona cuando se trabaja en el contexto gráfico.
        //---- Se pinta el fondo en el método paintComponente(Graphics)
        //this.setBackground(this.colorFondo);
    }
}
