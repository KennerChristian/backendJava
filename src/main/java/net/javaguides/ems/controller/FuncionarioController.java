package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.javaguides.ems.dto.FuncionarioDto;
import net.javaguides.ems.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/funcionarios")

public class FuncionarioController {

    private FuncionarioService funcionarioService;
    //metodo post
    @PostMapping
    public ResponseEntity<FuncionarioDto> criarFuncionario(@RequestBody FuncionarioDto funcionarioDto){

        FuncionarioDto salvarFuncionario = funcionarioService.criarFuncionario(funcionarioDto);
        return new ResponseEntity<>(salvarFuncionario, HttpStatus.CREATED);
    }
    //metodo get usando ID
    @GetMapping("{id}")
    public ResponseEntity<FuncionarioDto> getFuncionarioById(@PathVariable("id") Long funcionarioId){
        FuncionarioDto funcionarioDto = funcionarioService.getFuncionarioById(funcionarioId);
        return ResponseEntity.ok(funcionarioDto);
    }
    @GetMapping
    //metodo get all
    public ResponseEntity<List<FuncionarioDto>> getTodosFuncionarios(){
        List<FuncionarioDto> funcionarios = funcionarioService.getTodosFuncionarios();
        return ResponseEntity.ok(funcionarios);
    }
    @PutMapping("{id}")
    //metodo update
    public ResponseEntity<FuncionarioDto> updateFuncionario(@PathVariable("id") Long funcionarioID, @RequestBody FuncionarioDto updateFuncionario){
        FuncionarioDto funcionarioDto = funcionarioService.updateFuncionario(funcionarioID,updateFuncionario);
        return ResponseEntity.ok(funcionarioDto);
    }
    //metodo deletar funcionario
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteFuncionario(@PathVariable("id") Long funcionarioID){
        funcionarioService.deletarFuncionario(funcionarioID);
        return ResponseEntity.ok("Funcionario deletado com sucesso!");
    }

}
