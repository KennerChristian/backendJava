package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.FuncionarioDto;
import net.javaguides.ems.entity.Funcionarios;

public class MapaFuncioinario {

    public static FuncionarioDto mapToEmployeeDto(Funcionarios funcionarios){
        return new FuncionarioDto(
                funcionarios.getId(),
                funcionarios.getPrimeiroNome(),
                funcionarios.getSegundoNome(),
                funcionarios.getEmail()

        );
    }

    public static Funcionarios mapToEmployee(FuncionarioDto funcionarioDto){
        return new Funcionarios(
                funcionarioDto.getId(),
                funcionarioDto.getPrimeiroNome(),
                funcionarioDto.getSegundoNome(),
                funcionarioDto.getEmail()
        );
    }
}
