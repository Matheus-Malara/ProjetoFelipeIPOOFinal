package trabalhoIPOO.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private String categoria;
	private int preco;

}
