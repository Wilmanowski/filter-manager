package appbackend.filterApp.Column;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ColumnController {

    @Autowired
    private ColumnRepository columnRepository;

    @Autowired
    ObjectMapper objectMapper;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/columns")
    public ResponseEntity getUsers() throws JsonProcessingException {
        List<Column> columns = columnRepository.findAll();
        return  ResponseEntity.ok(objectMapper.writeValueAsString(columns));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/kolumna1")
    public ResponseEntity getColumn1() throws JsonProcessingException {
        List<Column> columns = columnRepository.findDuplicates1();
        return  ResponseEntity.ok(objectMapper.writeValueAsString(columns));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/kolumna2")
    public ResponseEntity getColumn2() throws JsonProcessingException {
        List<Column> columns = columnRepository.findDuplicates2();
        return  ResponseEntity.ok(objectMapper.writeValueAsString(columns));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/kolumna3")
    public ResponseEntity getColumn3() throws JsonProcessingException {
        List<Column> columns = columnRepository.findDuplicates3();
        return  ResponseEntity.ok(objectMapper.writeValueAsString(columns));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/kolumna4")
    public ResponseEntity getColumn4() throws JsonProcessingException {
        List<Column> columns = columnRepository.findDuplicates4();
        return  ResponseEntity.ok(objectMapper.writeValueAsString(columns));
    }
}
