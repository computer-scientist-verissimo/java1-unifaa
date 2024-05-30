public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Flores", 123, "Jardim Primavera", "São Paulo", "Apto 45");
        Endereco endereco2 = new Endereco("Avenida Brasil", 456, "Centro", "Rio de Janeiro", "Casa");
        Endereco endereco3 = new Endereco("Rua dos Pinheiros", 789, "Vila Mariana", "São Paulo", "São paulo");

        Vendedor vendedor = new Vendedor("João Silva", "123.456.789-00", "11987654321", "Masculino", endereco1);
        Cliente cliente1 = new Cliente("Maria Oliveira", "987.654.321-00", "21987654321", "Feminino", endereco2);
        Cliente cliente2 = new Cliente("Ana Costa", "456.789.123-00", "31987654321", "Feminino", endereco3);

        vendedor.seApresentar();
        cliente1.seApresentar();
        cliente2.seApresentar();
    }
}
