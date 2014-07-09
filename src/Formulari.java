import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;


public class Formulari {
	//1er declaramos
		JFrame frame;
		JPanel panel, zonaBoto;
		JLabel nombre, apellido, correo, edad, user, pswd;
		JTextField tNombre, tApellido, tCorreo;
		JSpinner sEdad;
		JButton boto;
		
		public Formulari(){
			//crearZonaBoto();
			finestraFormulari();
		}

		public void finestraFormulari (){
			frame = new JFrame("Formulario");
			
			//contexte del frame
    		Container contenidor = frame.getContentPane();
			SpringLayout layout= new SpringLayout();
			contenidor.setLayout(layout);
			
			
			//Nom dels elements a introduir
			Component nombre = new JLabel("Nombre:");
			//la caixa de text a on introduir lo que ens demana l'anterior fila
			Component tNombre = new JTextField(15);
	
			
			Component apellido = new JLabel("Apellido:");
			Component tApellido = new JTextField(15);
			
			Component correo = new JLabel("Correo:");
			Component tCorreo = new JTextField(15);
			
			Component edad = new JLabel("Edad:");
			SpinnerNumberModel valor = new SpinnerNumberModel(18,18,67,1);
			Component sEdad = new JSpinner(valor);
			
			Component user = new JLabel("Usuario:");
			Component tUser = new JTextField(15);
			
			Component pswd = new JLabel("Contraseña:");
			Component tPswd = new JTextField(15);
			
			boto = new JButton("Validar");
			boto.setVisible(true);
			
			//afegim components al contenidor:
			
			contenidor.add(nombre);
			contenidor.add(tNombre);
			contenidor.add(apellido);
			contenidor.add(tApellido);
			contenidor.add(correo);
			contenidor.add(tCorreo);
			contenidor.add(edad);
			contenidor.add(sEdad);
			contenidor.add(user);
			contenidor.add(tUser);
			contenidor.add(pswd);
			contenidor.add(tPswd);
			
			contenidor.add(boto);
			
			
			//configuracio d'espais:
			layout.putConstraint(SpringLayout.WEST, nombre, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, nombre, 25, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, tNombre, 25, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, tNombre, 22, SpringLayout.EAST, nombre);
			
			layout.putConstraint(SpringLayout.WEST, apellido, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, apellido, 50, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, tApellido, 50, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, tApellido, 20, SpringLayout.EAST, apellido);
			
			layout.putConstraint(SpringLayout.WEST, correo, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, correo, 75, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, tCorreo, 75, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, tCorreo, 30, SpringLayout.EAST, correo);
			
			layout.putConstraint(SpringLayout.WEST, edad, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, edad, 100, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, sEdad, 100, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, sEdad, 43, SpringLayout.EAST, edad);
			
			layout.putConstraint(SpringLayout.WEST, user, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, user, 125, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, tUser, 125, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, tUser, 25, SpringLayout.EAST, user);
			
			layout.putConstraint(SpringLayout.WEST, pswd, 10, SpringLayout.WEST, contenidor);
			layout.putConstraint(SpringLayout.NORTH, pswd, 150, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.NORTH, tPswd, 150, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, tPswd, 3, SpringLayout.EAST, pswd);
			
			
			layout.putConstraint(SpringLayout.NORTH, boto, 210, SpringLayout.NORTH, contenidor);
			layout.putConstraint(SpringLayout.WEST, boto, 100, SpringLayout.WEST, contenidor);
				
			
			frame.setSize(300,300);
			frame.setLocation(600, 100);
			//frame.add(zonaBoto);
			
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			
		}
		
//		public void crearZonaBoto(){
//			zonaBoto = new JPanel();//creo la zona on hi posare el boto
//			zonaBoto.setLayout(new BoxLayout(zonaBoto, BoxLayout.Y_AXIS));
//			boto = new JButton("Validar");//creo el boto
//			zonaBoto.add(boto);
//			
//		}
		
		//metode4 fer desapareixer la finestra quan es cliqui en boto "ENTRAR"
		public void tancarFinestra(){
			frame.setVisible(false);
		}

		
}

