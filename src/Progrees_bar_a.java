import java.util.concurrent.TimeUnit;
public class Progrees_bar_a {


    public static void main(String[] args) throws Exception {
		
		
      
        System.out.print("Examne primer bimestre ");
		System.out.println("amable.quishpe@epn.edu.ec");
		int caracter = 24;
		int porcentaje;
		int faltante;
		int a=1;
		;
			for (int x = 1; x <= caracter; x++)
				{
					for (int i = 1; i <= x; i++)
					{
					
						TimeUnit.SECONDS.sleep((long) 1);
						System.out.print("#");
						
					}
					porcentaje=(a+x)*4;
					System.out.print("   "+porcentaje+"% ");
					faltante= (porcentaje*26)/100;
					System.out.print("   van "+faltante+" de 26 ");
					System.out.println("        amable.quishpe@epn.edu.ec");
				}
			}
			//un issue es un error que me permitira corre el codigo con algun error no tan notable, en este caso es un issue por que el codigo corre pero no cumple su funcion 
			// un errror no me deja correr el codigo 
			// un bug es una vantaja que puedo tener del codigo
		}
		
    
       


     
 
    

