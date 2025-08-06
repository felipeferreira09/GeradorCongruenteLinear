package src;
public class GeradorCongruenteLinear {
    // Parâmetros do gerador
    private static final int a = 4;     // multiplicador
    private static final int c = 4;     // incremento
    private static final int M = 9;    // módulo (vai gerar números entre 0 e 9)
    private static int X = 7;           // semente (valor inicial)

    public static int proximoNumero() {
        X = (a * X + c) % M;
        return X;
    }

    public static void main(String[] args) {
        System.out.println("Os numeros aleatorios:");
        for (int i = 0; i < 10; i++) {
            System.out.println(proximoNumero());
        }
    }
}
