package br.com.coletivo.fotada.cursos.api;

import br.com.coletivo.fotada.cursos.model.Curso;
import br.com.coletivo.fotada.cursos.repository.CursoRepository;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/cursos")
public class CursoAPI {

    @Autowired
    CursoRepository cursoRepository;

    @GetMapping
    public ResponseEntity<List<Curso>> listarCursos() {
        return ResponseEntity.ok(cursoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> listarPorId(@PathVariable Long id) {
        return ResponseEntity.of(cursoRepository.findById(id));
    }

    @GetMapping("/por-area")
    public ResponseEntity<Map<String, List<Curso>>> agruparPorTipo() {
        return ResponseEntity.ok(cursoRepository.findAll().stream().collect(Collectors.groupingBy(Curso::getArea)));
    }

}
