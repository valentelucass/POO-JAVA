public class Data {
    int dia;
    int mes;
    int ano;

    // Construtor
    Data(int dia, int mes, int ano) {
        this.dia = dia;   // o atributo recebe o valor do parâmetro
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor que se não colocar nada no parametro puxa esse como data padrão
    Data() {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970); // apenas em construtores
    }

    // Método para retornar a data formatada como string
    String obterDataFormatada() {
        final String formato = "%02d/%02d/%04d";
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.println("Data: " + this.obterDataFormatada());
    }
}
