public class Hello {
public static int copiaValor(int a, int b){
    a = 10;

    }

    public static void copiaReferencia(int[]a){

    }

    public static void main(String[]args){
        int [] vetor = {5, 6, 7};
        copiavalor(vetor[0]);

        for(int i = 0; 1 < vetor.length; i++)
            System.out.print(vetor[i] + " ");

      copiaReferencia(vetor);
      System.out.println();
      for(int i = 0; i < vetor.length; i++)
      System.out.print(vetor[i] + " ");                               

    }

}