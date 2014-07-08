
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Confirmacio {
	
	//1er declarem
		JFrame frame = new JFrame("Confirmacion");
		JPanel panel;
		JLabel texto;
		
		public Confirmacio(){
			crearPanelTexto();
			crearMensaje();
		}
		
		//metode 1:
		public void crearMensaje(){
			//sortir de l'aplicacio al tancar la finestra
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setSize(300, 100);
			frame.setVisible(false);
			
			frame.add(panel);
			
			//Que la finestra aparegui al mig de la pantalla, ennloc del costat superior esquerra
			frame.setLocationRelativeTo(null);
			
		}
		
		public void crearPanelTexto(){
			panel = new JPanel();
			
			texto = new JLabel();//tambe prodria ser tot en una linia: texto = new JLabel("Escribe tu comentario");
			texto.setText("REGISTRO EXITOSO!!!!");
			
			
			panel.add(texto);
			
		}
		
		//enllaç amb el oto de la finestra anterior
		public void enllasBoto(){
			frame.setVisible(true);
		}

}
