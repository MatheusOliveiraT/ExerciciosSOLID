package ISP;

public class Vendedor implements Funcionario {
    @Override
    public int salario() {
        return 1;
    }

    @Override
    public int comissao() {
        return 1;
    }
}
