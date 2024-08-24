package repositories;

import java.io.PrintWriter;

import entities.Cliente;

/*classe de respositório de dados para gravar, editar, consultar ou excluir
 * informaçoes de clientes em arquivos ou em bancos de dados
 */

public class ClienteRepository {

	/*
	 * Método para gravar os dados do cliente em arquivo de extensão TXT
	 */

	public void exportarDados(Cliente cliente) {
		// void é uma palavra reservada para declaramos métodos que nao retornam valor.

		try {

			var printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");

			printWriter.write("\nID do cliente...:" + cliente.getId());
			printWriter.write("\nNome............:" + cliente.getNome());
			printWriter.write("\nCPF.............:" + cliente.getCpf());
			printWriter.write("\nTelefone........:" + cliente.getTelefone());
			printWriter.write("\nEmail...........:" + cliente.getEmail());

			printWriter.close();

			System.out.println("\nDados gravados com sucesso!");

		}

		catch (Exception e) {
			System.out.println("\nFalha ao gravar arquivo" + e.getMessage());
		}

	}
}
