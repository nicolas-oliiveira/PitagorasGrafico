package lampada;

import javax.swing.JOptionPane;

/**
 *
 * @author a22273
 */
public class Lampada
{
    public static int lamp_est;
    
    public static void main(String[] args) 
    {
        mostrarEstado();
    }
    
    public static void mostrarEstado()
    {
        lamp_est = Integer.parseInt(JOptionPane.showInputDialog("Informe o estado da lamada digitando 1 para acesa"
                + ", ou 0 para apagada"));
        if(lamp_est == 1)
        {
            JOptionPane.showMessageDialog(null, "A lampada está acesa.");
        }
        else if(lamp_est == 0)
        {
            JOptionPane.showMessageDialog(null, "A lampada está apagada.");
                    }
        else
        {
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        }
    }
    
}
