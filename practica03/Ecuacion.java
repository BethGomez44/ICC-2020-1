public class Ecuacion {

	public static void main(String[] args) {
		double a = 3, b = 17, c = 10, d = -5.7, e = 3.5;
<<<<<<< HEAD
		int i = 1, n = 10*10*10*10*10*10*10*10;
=======
		int i = 1, n = 10;
>>>>>>> 47bfb4ba8559f0d6079bfb596700658cb50685f7
		double suma = 0;
		while (i <= n) {
			/* Escribe en la línea 9 */
			suma+= -550*(a+(i*(b-a))/n)*(a+(i*(b-a))/n)+2992*(a+(i*(b-a))/n);
			suma-= ((49*c)*(d+e))/(34*(3*d+c));
			/* ************************ */
			i++;
		}
		System.out.println("Resultado = " + (((b - a) / n) * suma));
	}

}
