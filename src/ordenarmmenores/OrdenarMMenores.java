package ordenarmmenores;

public class OrdenarMMenores {

    public static void main(String[] args) {
        int tamResult = 7;
        //int[] vector = {7, 5, 8, 2, 6, 4};
        int[] vector = {45, 24, 45, 2, 36, 77, 96, 2, 36, 25, 8, 9, 78, 45, 4,-1, 6, 3, 1, 7};
        int[] Resultado = new int[tamResult];
        Resultado = new Metodo().ordenar(vector, tamResult, 0, vector.length - 1);
        if (Resultado == null) {
            System.out.println("El programa ha acabado con error");
        } else {
            System.out.println("Los " + tamResult + " numeros de menor tamaño ordenados de mayor a menor son:");
            for (int i = 0; i < Resultado.length; i++) {
                System.out.print(Resultado[i] + ", ");
            }
        }
        System.out.println("");
        System.out.println("Se acabo");
    }
}

