
import java.util.Scanner;

/**
 * Esta clase representa a los usuarios a los cuales se les generara el calculo
 * de su IMC para luego medir su nivel de riesgo.
 *
 * @author Juancho
 */
class Usuario {

    /**
     * peso del usuario
     */
    public float pesoUsuario;

    /**
     * altura del usuario
     */
    public float alturaUsuario;

    /**
     * edad del usuario
     */
    public int edadUsuario;

    /**
     * Constructor de la clase Usuario
     *
     * @param pesoUsuario
     * @param alturaUsuario
     * @param edadUsuario
     */
    public Usuario(float pesoUsuario, float alturaUsuario, int edadUsuario) {
        this.pesoUsuario = pesoUsuario;
        this.alturaUsuario = alturaUsuario;
        this.edadUsuario = edadUsuario;
    }
}

/**
 * Esta clase se utilizara de ahora en adelante para generar el código de
 * nuestros retos en Master Tech
 *
 * @author desaextremo
 */
public class Reto1 {

    /**
     * Este debe ser el único objeto de tipo Scanner en el código
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Este método es usado para solicitar datos al usuario
     *
     * @return Lectura de la siguiente linea del teclado
     */
    public static String read() {
        return scanner.nextLine();
    }

    /**
     * retorna si los rangos ingresados son permitidos
     *
     * @param pesoUsuario
     * @param alturaUsuario
     * @param edadUsuario
     * @return bandera
     */
    public static boolean validarEntrada(float pesoUsuario, float alturaUsuario, int edadUsuario) {
        boolean bandera = false;

        if (0 < pesoUsuario && pesoUsuario < 150 && 0.1 < alturaUsuario && alturaUsuario < 2.5 && 0 < edadUsuario && edadUsuario < 110) {
            bandera = true;
        }

        return bandera;
    }

    /**
     * retorna nivel de riesgo del Usuario segun su IMC
     *
     * @param indiceMC
     * @param edadUsuario
     * @return riesgoUsuario
     */
    public static String riesgo(float indiceMC, int edadUsuario) {
        String riesgoUsuario = "";
        if (edadUsuario <= 40 && indiceMC <= 22) {
            riesgoUsuario = "Bajo";
        } else if (edadUsuario > 40 && indiceMC <= 22) {
            riesgoUsuario = "Medio";
        } else if (edadUsuario <= 40 && indiceMC > 22) {
            riesgoUsuario = "Medio";
        } else if (edadUsuario > 40 && indiceMC > 22) {
            riesgoUsuario = "Alto";
        }

        return riesgoUsuario;
    }

    /**
     * Se requiere para poder probar nuestro programa en Netbeas, todas las
     * sentencias de este método se deben copiar y pegar en Master Tech en el
     * método run
     *
     * @param args arreglo de cadenas de caracteres
     */
    public static void main(String[] args) {

        String valores[] = read().split(" ");

        Usuario usuario = new Usuario(
                Float.parseFloat(valores[0]),
                Float.parseFloat(valores[1]),
                Integer.parseInt(valores[2]));

        float indiceMC = usuario.pesoUsuario / (usuario.alturaUsuario * usuario.alturaUsuario);

        if (validarEntrada(usuario.pesoUsuario, usuario.alturaUsuario, usuario.edadUsuario)) {
            System.out.println(String.format("%.2f", indiceMC) + " " + riesgo(indiceMC, usuario.edadUsuario));

        } else {
            System.out.println("ERROR");
        }
    }
}
