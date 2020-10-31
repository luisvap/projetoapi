package br.edu.uniso.projetoapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class ProjetoapiController {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    @GetMapping("hello")
    public String xyz(){
        return "Hello world!";
    }

    @PostMapping("/inserirAluno")
    public void inserirAluno(@RequestBody Aluno aluno){
        alunos.add(aluno);
    }

    @GetMapping("/listarAluno")
    public ArrayList<Aluno> listarAlunos(){
        return alunos;
    }


    @GetMapping("/listarAlunoPorRa")
    public Aluno listarAlunoPorRa(@RequestParam int ra){

        for (Aluno a: alunos) {
            if(a.getRa() == ra){
                return a;
            }
        }

        return null;
    }



}
