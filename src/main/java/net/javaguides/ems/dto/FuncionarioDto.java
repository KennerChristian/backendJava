package net.javaguides.ems.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FuncionarioDto {

    private Long id;
    private String primeiroNome;
    private String segundoNome;
    private String email;

}
