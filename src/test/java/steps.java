import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class steps {
    @Dado("^que hoje é \"([^\"]*)\"$")
    public void queHojeÉ(String arg0) throws Throwable {
        
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quando("^eu pergunto qual botão quero testar$")
    public void euPerguntoQualBotãoQueroTestar() {
    }

    @Então("^a resposta deve ser \"([^\"]*)\"$")
    public void aRespostaDeveSer(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
