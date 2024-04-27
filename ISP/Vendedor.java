package ISP;

public class Vendedor implements Funcionario, Comissao {
    @Override
    public int salario() {
        return 1;
    }

    @Override
    public int comissao() {
        return 1;
    }
}
