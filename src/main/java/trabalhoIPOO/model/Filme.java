package trabalhoIPOO.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Filme {

	private String nome;
	private String descricao;
	private String idioma;
	private int duracao;

}
