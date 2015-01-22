package ordenarmmenores;

public class Metodo {

    private int lim, limI, limD, numeroMenores;
    public int[] ordenar(int[] vector, int tamResult, int linf, int lsup) {
        
        if ((linf > lsup) || ((tamResult)>(vector.length))) {
            System.out.println("Error, se han cruzado los lÃ­mites.");
            return null;
        }
        
        int[] result = new int[tamResult];
        int[] vecI = new int[tamResult];
        int[] vecD = new int[tamResult];
        int mitad;
        
        if (linf == lsup) {
            result[tamResult - 1] = vector[linf];
            return result;
        }

        mitad = (linf + lsup) / 2;

        vecI = ordenar(vector, tamResult, linf, mitad);
        vecD = ordenar(vector, tamResult, mitad + 1, lsup);

        numeroMenores = tamResult - 1; //Numero de elementos que me queda por meter en el resultado
        lim = lsup - linf + 1; //Numero de elementos que tengo hasta este momento
        limI = 0; //Elementos totales que he cogido del vecI
        limD = 0;

        while ((numeroMenores >= 0) & ((limI + limD) < tamResult) & (lim > 0)) {
            if (limI == (mitad - linf + 1)) {
                result[numeroMenores--] = vecD[tamResult - limD - 1];
                limD++;
                lim--;
            } else if (limD == (lsup - mitad)) {
                result[numeroMenores--] = vecI[tamResult - limI - 1];
                limI++;
                lim--;
            } else if (vecD[tamResult - limD - 1] > vecI[tamResult - limI - 1]) {
                result[numeroMenores--] = vecI[tamResult - limI - 1];
                limI++;
                lim--;
            } else {
                result[numeroMenores--] = vecD[tamResult - limD - 1];
                limD++;
                lim--;
            }

        }
        return result;
    }
}
