public class Aluno implements Autenticavel{
    @Override
    public boolean autenticar(String login, String senha) {
        return true;
    }
}
