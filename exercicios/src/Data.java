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

    // Método para retornar a data formatada como string
    String obterDataFormatada() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}
