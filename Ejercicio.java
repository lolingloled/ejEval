package exament2e3;
import utilidades.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		final int DOLOR_DE_BARRIGA=2534;
		int pestCom=0, numCop=0, nivGrad=0, glotNav=0, fact=1;
		char salida=' ';
		System.out.println("Bienvenido a nuestro programa, le haremos saber cu�n gordo est� usted");
		do{
			
				while (pestCom==0){					//Para asegurarnos de que sean 5 o menos
			System.out.println("Introduzca n�mero de pesti�os que ha consumido (recuerde que no m�s de 5)");
			pestCom=Leer.datoInt();
				
			if (pestCom>5){
				System.out.println("NO M�S DE 5 (recordatorio)");
				pestCom=0;
			}
			}	
			while (numCop==0){						//Para asegurarnos de que sean 5 o menos
				System.out.println("Introduzca n�mero de copas de an�s (recuerde que no m�s de 5)");
				numCop=Leer.datoInt();
				
				if (numCop>5){
					System.out.println("NO M�S DE 5 (recordatorio)");
					numCop=0;	
				}
			}
				while (nivGrad==0){					//Para asegurarnos de que sean 5 o menos
					System.out.println("Introduzca graduaci�n (recuerde que no m�s de 5)");
					nivGrad=Leer.datoInt();
					if (nivGrad>5){
						System.out.println("NO M�S DE 5 (recordatorio)");
						nivGrad=0;					
				}
				}	glotNav=pestCom;				//As� podr� usar un glotNav como contador para modificar el valor de pestCom
				for(int i=0;i<glotNav;i++){			//Factorial de pestCom
					fact=pestCom*fact;
					pestCom--;
				}
			glotNav=fact+(int)Math.pow(numCop, nivGrad);		//Teorema
			System.out.println("Su nivel de glotoner�a navide�a es de "+glotNav);
			if (glotNav>DOLOR_DE_BARRIGA)						//Comprobaci�n con la constante
				System.out.println("No s� c�mo a�n est�s vivo.");
			else
				System.out.println("A�n puedes seguir");
			System.out.println("�Desea repetir el programa?(S/N)");		//Le damos la opci�n al usuario de repetir el programa
			salida=Leer.datoChar();
			nivGrad=0;
			numCop=0;	
			pestCom=0;
		}while(salida=='s'||salida=='S');
		System.out.println("Gracias por ustilizar nuestro programa.");
		

		}
	}
