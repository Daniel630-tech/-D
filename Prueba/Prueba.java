public class Prueba {
    // Genera un número aleatorio entre 1 y 6
    public static int lanzarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    // Lanza el dado varias veces y devuelve un arreglo con los resultados
    public static int[] lanzarDadoVeces(int veces) {
        int[] resultados = new int[veces];

        for (int i = 0; i < veces; i++) {
            resultados[i] = lanzarDado();
        }

        return resultados;
    }

    public static void main(String[] args) {
        int valor = lanzarDado();
        System.out.println("Resultado del dado: " + valor);

        int[] tiradas = lanzarDadoVeces(5);
        System.out.print("Resultados: ");
        for (int i = 0; i < tiradas.length; i++) {
            System.out.print(tiradas[i] + " ");
        }
        System.out.println();
    }
}

