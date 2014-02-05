/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokercartas;

/**
 *
 * @author usuario
 */
public class JuegoPoker {

    public final static int NADA = 0;
    public final static int PAREJA = 1;
    public final static int TRIO = 2;
    public final static int POKER = 3;
    public final static int REPOKER = 4;

    private static int combinacion;

    public static int getCombinacion(CartaFrancesa carta1, CartaFrancesa carta2, CartaFrancesa carta3, CartaFrancesa carta4, CartaFrancesa carta5) {
        int contador = 0;
        if (carta1.getNumero() != carta2.getNumero() && carta1.getNumero() != carta3.getNumero()
                && carta1.getNumero() != carta4.getNumero() && carta1.getNumero() != carta5.getNumero()
                && carta1.getPalo() != 4 && carta2.getPalo() != 4 && carta3.getPalo() != 4 && carta4.getPalo() != 4
                && carta5.getPalo() != 4) {
            combinacion = NADA;
        }
        if (carta2.getNumero() != carta1.getNumero() && carta2.getNumero() != carta3.getNumero()
                && carta2.getNumero() != carta4.getNumero() && carta2.getNumero() != carta5.getNumero()
                && carta1.getPalo() != 4 && carta2.getPalo() != 4 && carta3.getPalo() != 4 && carta4.getPalo() != 4
                && carta5.getPalo() != 4) {
            combinacion = NADA;
        }
        if (carta3.getNumero() != carta1.getNumero() && carta3.getNumero() != carta2.getNumero()
                && carta3.getNumero() != carta4.getNumero() && carta3.getNumero() != carta5.getNumero()
                && carta1.getPalo() != 4 && carta2.getPalo() != 4 && carta3.getPalo() != 4 && carta4.getPalo() != 4
                && carta5.getPalo() != 4) {
            combinacion = NADA;
        }
        if (carta4.getNumero() != carta1.getNumero() && carta4.getNumero() != carta2.getNumero()
                && carta4.getNumero() != carta3.getNumero() && carta4.getNumero() != carta5.getNumero()
                && carta1.getPalo() != 4 && carta2.getPalo() != 4 && carta3.getPalo() != 4 && carta4.getPalo() != 4
                && carta5.getPalo() != 4) {
            combinacion = NADA;
        }
        if (carta5.getNumero() != carta1.getNumero() && carta5.getNumero() != carta2.getNumero()
                && carta5.getNumero() != carta3.getNumero() && carta5.getNumero() != carta4.getNumero()
                && carta1.getPalo() != 4 && carta2.getPalo() != 4 && carta3.getPalo() != 4 && carta4.getPalo() != 4
                && carta5.getPalo() != 4) {
            combinacion = NADA;
        }
        if (carta1.getNumero() == carta2.getNumero() || carta1.getPalo() == 4) {
            contador++;
        }
        if (carta1.getNumero() == carta3.getNumero() || carta3.getPalo() == 4) {
            contador++;
        }
        if (carta1.getNumero() == carta4.getNumero() || carta4.getPalo() == 4) {
            contador++;
        }
        if (carta1.getNumero() == carta5.getNumero() || carta5.getPalo() == 4) {
            contador++;
        }
        if (carta2.getNumero() == carta1.getNumero() || carta2.getPalo() == 4) {
            contador++;
        }
        if (carta2.getNumero() == carta3.getNumero() || carta3.getPalo() == 4) {
            contador++;
        }
        if (carta2.getNumero() == carta4.getNumero() || carta4.getPalo() == 4) {
            contador++;
        }
        if (carta2.getNumero() == carta5.getNumero() || carta5.getPalo() == 4) {
            contador++;
        }
        if (carta3.getNumero() == carta1.getNumero() || carta3.getPalo() == 4) {
            contador++;
        }
        if (carta3.getNumero() == carta2.getNumero() || carta2.getPalo() == 4) {
            contador++;
        }
        if (carta3.getNumero() == carta4.getNumero() || carta4.getPalo() == 4) {
            contador++;
        }
        if (carta3.getNumero() == carta5.getNumero() || carta5.getPalo() == 4) {
            contador++;
        }
        if (carta4.getNumero() == carta1.getNumero() || carta4.getPalo() == 4) {
            contador++;
        }
        if (carta4.getNumero() == carta2.getNumero() || carta2.getPalo() == 4) {
            contador++;
        }
        if (carta4.getNumero() == carta3.getNumero() || carta3.getPalo() == 4) {
            contador++;
        }
        if (carta4.getNumero() == carta5.getNumero() || carta5.getPalo() == 4) {
            contador++;
        }
        if (carta5.getNumero() == carta1.getNumero() || carta5.getPalo() == 4) {
            contador++;
        }
        if (carta5.getNumero() == carta2.getNumero() || carta2.getPalo() == 4) {
            contador++;
        }
        if (carta5.getNumero() == carta3.getNumero() || carta3.getPalo() == 4) {
            contador++;
        }
        if (carta5.getNumero() == carta4.getNumero() || carta4.getPalo() == 4) {
            contador++;
        }
        
        switch(contador){
            case 2:
                combinacion = PAREJA;
                break;
            case 3:
                combinacion = TRIO;
                break;
            case 4:
                combinacion = POKER;
                break;
            case 5:
                combinacion = REPOKER;
                break;
        }
        return combinacion;
    }
}
