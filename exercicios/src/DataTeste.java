public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(29, 10, 1999);
        //d1.dia = 29;
        //d1.mes = 10;
        //d1.ano = 1999;
        Data d2 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(Math.PI);
    }
}
