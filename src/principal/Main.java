package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de clientes");
		System.out.println("Turma de Java WebDeveloper - Sábado");

		// criando um bojeto para a classe cliente

		var cliente = new Cliente();

		// preenchimento dos dados do cliente

		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do cliente:"));
		cliente.setTelefone(JOptionPane.showInputDialog("informe o telefone do cliente:"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente:"));

		// imprimindo
		System.out.println("\nDados do Cliente:");

		System.out.println("\tId.....:" + cliente.getId());
		System.out.println("\tNome....:" + cliente.getNome());
		System.out.println("\tCpf....:" + cliente.getCpf());
		System.out.println("\tTelefone....:" + cliente.getTelefone());
		System.out.println("\tEmail....:" + cliente.getEmail());

		// Encapsulamento
		// Capacidade de uma classe ocultar os seus elementos(geralmente os seus
		// atributos) do acesso
		//

		// criando um objeto para a classe ClienteRepository
		var clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);

	}

}
