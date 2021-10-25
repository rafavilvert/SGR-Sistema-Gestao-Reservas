package hotel;

import java.util.Date;

public class Reserva {

	private int id;
	private Integer numeroReserva;
	private Date dataEntrada;
	private Date dataSaida;
	private Quarto quarto = new Quarto();
	private Hospede hospede = new Hospede();
	private Funcionario fucionario;
	private Double precoTotalReserva;

	public Reserva(int id, Integer numeroReserva, Date dataEntrada, Date dataSaida, Quarto quarto, Hospede hospede,
			Funcionario fucionario, Double precoTotalReserva) {
		super();
		this.id = id;
		this.numeroReserva = numeroReserva;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.quarto = quarto;
		this.hospede = hospede;
		this.fucionario = fucionario;
		this.precoTotalReserva = precoTotalReserva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(Integer numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Funcionario getFucionario() {
		return fucionario;
	}

	public void setFucionario(Funcionario fucionario) {
		this.fucionario = fucionario;
	}

	public Double getPrecoTotalReserva() {
		return precoTotalReserva;
	}

	public void setPrecoTotalReserva(Double precoTotalReserva) {
		this.precoTotalReserva = precoTotalReserva;
	}

}
