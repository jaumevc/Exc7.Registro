import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Ejercicio Dos:
//Crear una ventana de Registro en donde se realiza el ingreso de los siguientes datos, con sus respectivas validaciones:
//Nombre(Solo letras y espacios)
//Apellido(Solo letras y espacios)
//Correo (Que tenga los elementos de un correo)
//Edad – Este puede ser un combo.
//Username  (el nombre de usuario solo puede tener letras y numeros)
//Password.(al menos 8 caracteres.)

public class Main {
	public static void main (String[] args){
		final Formulari formulario = new Formulari();
		final Confirmacio missatge = new Confirmacio();
		formulario.boto.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch (e.getActionCommand()) {
				case "Validar":
					formulario.tancarFinestra();
					missatge.enllasBoto();
					break;

				default:
					break;
				}
				
			}
		});
		
	}

}
