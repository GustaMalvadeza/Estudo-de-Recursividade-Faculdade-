public class Main {
    public static void main(String[] args) {
        int n=10;
        int[] vetor= {1,2,3,4,5};
        System.out.println("Fatorial de "+n+" :"+fatorial(n));
        System.out.println("Expondencial de "+n+": "+expondecial(n,2));
        System.out.println("Soma em cadeia de "+n+": "+somaEmCadeia(n));
        System.out.println("Divisao em dividir de "+n+": "+divisao(n, 5));
        System.out.println("Vetor invertido");
        verVetor(vetor);
        System.out.println();
        verVetor(inverteVetor(vetor, 0, 4));
    }

    static int fatorial(int n){
        if (n==1){
            return 1;
        }
        return n* fatorial(n-1);
    }
    static int expondecial(int n, int x){
        if (x==1){
            return n;
        } else if (x==0) {
            return 1;
        }
        return n * expondecial(n,x-1);
    }
    static int somaEmCadeia(int n){
        if (n==1){
            return 1;
        }
        return n+somaEmCadeia(n-1);
    }
    static int divisao(int n1, int n2) {
        if (n1 < n2){
        return 0;
        }
        return 1 + divisao(n1 - n2, n2);
    }
    static int[] inverteVetor(int[] v, int inicio, int fim) {
        if (inicio >= fim) {
            return v;
        }
        int temp = v[inicio];
        v[inicio] = v[fim];
        v[fim] = temp;
        return inverteVetor(v, inicio + 1, fim - 1);
    }

    static void verVetor(int[] vetor){
        for (int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}