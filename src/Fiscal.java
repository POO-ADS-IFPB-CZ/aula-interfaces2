public class Fiscal extends Servidor implements Autenticavel{
    @Override
    public boolean autenticar(String login, String senha) {
        return true;
    }
}
