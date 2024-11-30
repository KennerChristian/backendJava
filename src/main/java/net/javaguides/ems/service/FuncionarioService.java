package net.javaguides.ems.service;

import net.javaguides.ems.dto.FuncionarioDto;

import java.util.List;

public interface FuncionarioService {
    FuncionarioDto criarFuncionario(FuncionarioDto funcionarioDto);

    FuncionarioDto getFuncionarioById(Long funcionarioId);

    List<FuncionarioDto> getTodosFuncionarios();

    FuncionarioDto updateFuncionario(Long funcionarioID, FuncionarioDto updateFuncionario);

    void deletarFuncionario(Long funcionarioId);
}
