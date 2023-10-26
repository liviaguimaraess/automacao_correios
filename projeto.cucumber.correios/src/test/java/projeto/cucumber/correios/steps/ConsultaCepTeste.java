package projeto.cucumber.correios.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.correios.config.InicializarTeste;
import projeto.cucumber.correios.elemento.Elementos;
import projeto.cucumber.correios.metodos.Metodos;
import projeto.cucumber.correios.pages.HomePage;

public class ConsultaCepTeste extends Elementos {

	HomePage home = new HomePage();
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Before
	public void iniciarTeste() {
		InicializarTeste.abrirNavegador();
	}

	@After
	public void finalizarTeste() {
		InicializarTeste.fecharNavegador();
	}

	@When("enviar dados para busca")
	public void enviarDadosParaBusca() {
		home.buscarCepEndereco("39403-069");
		metodo.submit(buscarCepEndereco);

	}

	@Then("valido os dados retornados")
	public void validoOsDadosRetornados() {
		home.validarDadosRetornados("Rua do Flamengo", "Maracanã", "Montes Claros/MG", "39403-069");

	}

}
