package com.victor.sistemaalunos.repository;

import com.victor.sistemaalunos.model.Aluno;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AlunoRepository {
    private final Map<Long, Aluno> alunos = new LinkedHashMap<>();
    private Long nextId = 1L;

    public AlunoRepository() {
        save(new Aluno("Victor Augusto Scholz", "victor.scholz05@icloud.com", "Engenharia de Software", 20));
        save(new Aluno("Sabrina Maria Moreira Kunzler", "sabrinakunzler14@gmail.com", "Medicina Veterinária", 20));
        save(new Aluno("Matias Del Solar Vicuna", "mativicuna@gmail.com", "Economia", 24));
    }

    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(nextId++);
        }
        alunos.put(aluno.getId(), aluno);
        return aluno;
    }

    public List<Aluno> findAll() {
        return new ArrayList<>(alunos.values());
    }

    public Aluno findById(Long id) {
        return alunos.get(id);
    }

    public void deleteById(Long id) {
        alunos.remove(id);
    }
}
