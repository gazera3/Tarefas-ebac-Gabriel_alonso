package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation para mapear uma classe a uma tabela de banco de dados.
 */
@Retention(RetentionPolicy.RUNTIME) // A annotation estará disponível em tempo de execução
@Target(ElementType.TYPE) // A annotation só pode ser usada em classes
public @interface Tabela {
    String nome(); // Nome da tabela no banco de dados
}