package hotel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		List<Funcionario> listaFuncionario = new ArrayList<>();
		List<Reserva> listaReservas = new ArrayList<>();
		Date dataEntrada = new Date();
		Date dataSaida = new Date();
		int diarias = 0;

		listaFuncionario.add(new Funcionario(1, 1001, "Rafael", "Recepcionista", "489967878785"));

		Integer isAuthenticated = 0;
		Integer option = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("========= Seja bem vindo ao Gestão de Reservas DevinHouse! ========= \n");

		while (isAuthenticated != 1) {

			System.out.println("Digite seu usuário: ");
			Integer cod = entrada.nextInt();

			for (Funcionario funcionario : listaFuncionario) {
				if (funcionario.getCod().equals(cod)) {
					isAuthenticated = 1;
				}
			}

			if (isAuthenticated != 1) {
				System.out.println("Usuário não encontrado\n");
			} else {
				System.out.println("Bem vindo você está logado\n");
			}

		}

		while (option != 6) {

			System.out.println("Digite a opção desejada: \n" + "1 - Nova reserva\n" + "2 - Verificar reserva\n"
					+ "3 - Cancelar reserva\n" + "4 - Novo funcionario\n" + "5 - Verificar funcionario\n" + "6 - Sair");

			option = entrada.nextInt();

			if (option == 1) {

				int id = listaReservas.size();
				Integer numeroReserva = listaReservas.size() + 1000;

				SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();

				try {
					System.out.println("Informe a data de entrada do hospede: ");
					dataEntrada = new Date();
					dataSaida = new Date();

					dataEntrada = formatarData.parse(entrada.next());
					cal.setTime(dataEntrada);

					System.out.println("Quantos dias o hospede vai ficar: ");
					diarias = entrada.nextInt();
					cal.add(Calendar.DAY_OF_MONTH, diarias);
					dataSaida = cal.getTime();
					System.out.println(dataEntrada);
					System.out.println(dataSaida);

				} catch (Exception e) {
					System.out.println("Digite uma data válida");
				}

				Quarto quarto = new Quarto();
				System.out.println("Digite o tipo de quarto:\n" + "1 - Quarto simples na baixa temporada\n"
						+ "2 - Quarto simples na alta temporada\n" + "3 - Quarto luxo na baixa temporada\n"
						+ "4 - Quarto luxo na alta temporada\n");

				int opcaoDeQuarto = entrada.nextInt();

				if (opcaoDeQuarto == 1) {
					quarto.precoQuarto(TipoQuarto.SIMPLES_BAIXA);
				} else if (opcaoDeQuarto == 2) {
					quarto.precoQuarto(TipoQuarto.SIMPLES_ALTA);
				} else if (opcaoDeQuarto == 3) {
					quarto.precoQuarto(TipoQuarto.LUXO_BAIXA);
				} else if (opcaoDeQuarto == 4) {
					quarto.precoQuarto(TipoQuarto.LUXO_ALTA);
				} else {
					System.out.println("Digite uma opção válida! \n");
				}

				Hospede hospede = new Hospede();
				System.out.println("Digite o nome do hospede: \n");
				hospede.setNome(entrada.next());

				System.out.println("Digite o CPF do hospede: \n");
				hospede.setCpf(entrada.next());

				System.out.println("Digite a data de nascimento do hospede: \n");
				hospede.setDataNasc(entrada.next());

				Funcionario funcionario = new Funcionario(listaFuncionario.get(0).getId(),
						listaFuncionario.get(0).getCod(), listaFuncionario.get(0).getNome(),
						listaFuncionario.get(0).getCargo(), listaFuncionario.get(0).getFone());

				
				
				listaReservas.add(new Reserva(id, numeroReserva, dataEntrada, dataSaida, quarto, hospede, funcionario, quarto.precoTotalReserva(diarias, quarto.getPreco())));

			} else if (option == 2) {
				for (Reserva reserva : listaReservas) {
					System.out.println("Id: " + reserva.getId());
					System.out.println("Numero da reserva: " + reserva.getNumeroReserva());
					System.out.println("Entrada: " + reserva.getDataEntrada());
					System.out.println("Saida: " + reserva.getDataSaida());
					System.out.println("Nome hospede: " + reserva.getHospede().getNome());
					System.out.println("Nome funcionario: " + reserva.getFucionario().getNome());
					System.out.println("Valor total da reserva: " + reserva.getPrecoTotalReserva());
				}
			} else if (option == 3) {
				System.out.println("Cancelando reserva\n");
			} else if (option == 4) {
				int id = listaFuncionario.size() + 1;
				Integer cod = listaFuncionario.size() + 1001 + 1;

				System.out.println(id + 9);

				System.out.println("Digite o nome do funcionário: \n");
				String nome = entrada.next();

				System.out.println("Digite o cargo do funcionário: \n");
				String cargo = entrada.next();

				System.out.println("Digite o telefone do funcionário: \n");
				String fone = entrada.next();

				listaFuncionario.add(new Funcionario(id, cod, nome, cargo, fone));
			} else if (option == 5) {
				for (Funcionario funcionario : listaFuncionario) {
					System.out.println("Id: " + funcionario.getId() + " \n");
					System.out.println("Código: " + funcionario.getCod() + " \n");
					System.out.println("Nome: " + funcionario.getNome() + " \n");
					System.out.println("Cargo: " + funcionario.getCargo() + " \n");
					System.out.println("Celular: " + funcionario.getFone() + " \n");
				}
			} else if (option == 6) {
				System.out.println("Programa encerrado\n");
			} else {
				System.out.println("Digite uma opção válida: \n");
			}
		}

		entrada.close();

	}

}