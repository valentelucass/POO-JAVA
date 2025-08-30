public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(29, 10, 1999);
        //d1.dia = 29;
        //d1.mes = 10;
        //d1.ano = 1999;

        System.out.println(d1.obterDataFormatada());
    }
}
