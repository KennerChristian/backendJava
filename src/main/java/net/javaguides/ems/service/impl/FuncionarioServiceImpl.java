package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.FuncionarioDto;
import net.javaguides.ems.entity.Funcionarios;
import net.javaguides.ems.exception.ResourceNotFoundException;
import net.javaguides.ems.mapper.MapaFuncioinario;
import net.javaguides.ems.ropository.FuncionariosRepository;
import net.javaguides.ems.service.FuncionarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private FuncionariosRepository funcionariosRepository;
    @Override
    public FuncionarioDto criarFuncionario(FuncionarioDto funcionarioDto) {
        Funcionarios funcionarios = MapaFuncioinario.mapToEmployee(funcionarioDto);
        Funcionarios salvarFuncionario = funcionariosRepository.save(funcionarios);
        return MapaFuncioinario.mapToEmployeeDto(salvarFuncionario);
    }

    @Override
    public FuncionarioDto getFuncionarioById(Long funcionarioId) {

        Funcionarios funcionarios = funcionariosRepository.findById(funcionarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Não existe funcionário com esse ID" + funcionarioId));
        return MapaFuncioinario.mapToEmployeeDto(funcionarios);
    }

    @Override
    public List<FuncionarioDto> getTodosFuncionarios() {
        List<Funcionarios> funcionarios = funcionariosRepository.findAll();
        return funcionarios.stream().map((funcionarios1) -> MapaFuncioinario.mapToEmployeeDto(funcionarios1))
                .collect(Collectors.toList());
    }

    @Override
    public FuncionarioDto updateFuncionario(Long funcionarioID, FuncionarioDto updateFuncionario) {
        Funcionarios funcionarios = funcionariosRepository.findById(funcionarioID).orElseThrow(
                () -> new ResourceNotFoundException("Não existe funcionário com esse ID: " + funcionarioID)
        );

        funcionarios.setPrimeiroNome(updateFuncionario.getPrimeiroNome());
        funcionarios.setSegundoNome(updateFuncionario.getSegundoNome());
        funcionarios.setEmail(updateFuncionario.getEmail());

        Funcionarios updateFuncionariosObj = funcionariosRepository.save(funcionarios);
        return MapaFuncioinario.mapToEmployeeDto(updateFuncionariosObj);
    }

    @Override
    public void deletarFuncionario(Long funcionarioID) {
        Funcionarios funcionarios = funcionariosRepository.findById(funcionarioID).orElseThrow(
                () -> new ResourceNotFoundException("Não existe funcionário com esse ID: " + funcionarioID)
        );

        funcionariosRepository.deleteById(funcionarioID);

    }

}
