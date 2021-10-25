package hotel;

public class Quarto {

	private TipoQuarto tipoQuarto;
	private Double preco;

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public Double getPreco() {
		return preco;
	}

	public void precoQuarto(TipoQuarto tipoQuarto) {
		if (tipoQuarto == TipoQuarto.SIMPLES_BAIXA) {
			this.preco = 90.0;
			this.tipoQuarto = TipoQuarto.SIMPLES_BAIXA;
		} else if (tipoQuarto == TipoQuarto.SIMPLES_ALTA) {
			this.preco = 140.0;
			this.tipoQuarto = TipoQuarto.SIMPLES_ALTA;
		} else if (tipoQuarto == TipoQuarto.LUXO_BAIXA) {
			this.preco = 150.0;
			this.tipoQuarto = TipoQuarto.LUXO_BAIXA;
		} else if (tipoQuarto == TipoQuarto.LUXO_ALTA) {
			this.preco = 400.0;
			this.tipoQuarto = TipoQuarto.LUXO_ALTA;
		}
	}

	public void setTipoQuarto(final TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public Double precoTotalReserva (int qtdeDiaria, Double precoQuarto) {
		return qtdeDiaria * precoQuarto;
	}

}
