package lista5_10;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista5_10 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITECIMA = 50;
        final int LIMITEBAIXO = 0;
        int vet[] = new int [TAM];
        int cont;
        for(int x=0; x < TAM; x++){
            do{
                cont=1;
                do{
                vet[x] = (int) (Math.random() * (LIMITECIMA+1));
                }while(vet[x] < LIMITEBAIXO);
                for(int y=0; y < x; y++){
                    if(vet[x] == vet[y]){
                        cont=0;
                    }
                }
            }while(cont == 0);
        }
        JOptionPane.showMessageDialog(null, "Vetor: " +Arrays.toString(vet));
    }    
}
