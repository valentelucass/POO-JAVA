public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // nesse ponto fiz uma atribuição por valor (Tipo primitivo).

        // saída = 2.0 e 2.0 dessa linha para cima.
        // incremento e decremento para teste e entender melhor.

        a++;
        b--;
        // saída = 3.0 e 1.0 sendo esse último pois b = a -> a = 2 inicialmente e nao incrementa agora.

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // atribuição por referência (Objeto).

        System.out.println(d1.obterDataFormatada());
        //01/06/2022

        d1.dia = 31;
        d2.mes = 12;
        //31/12/2022
        //31/12/2022

        d1.ano = 2025;
        //31/12/2025
        //31/12/2025

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        //3.0 1.0
        //01/06/2022
        //31/12/2025
        //31/12/2025

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        //3.0 1.0
        //01/06/2022
        //31/12/2025
        //31/12/2025
        //01/01/1970
        //01/01/1970

        // ou seja, a referencia do objeto mudou a resposta, mas no outro exemplo com tipo primitivo não.

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
        //3.0 1.0
        //01/06/2022
        //31/12/2025
        //31/12/2025
        //01/01/1970
        //01/01/1970
        //5
        //continou sendo 5 mesmo passando pelo metodo alterarPrimitivo, ao contrario do outro acima
    }
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c) {
        c++;
    }
}
