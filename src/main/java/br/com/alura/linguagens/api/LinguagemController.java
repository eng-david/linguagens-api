package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    
    @Autowired
    private LinguagemRepository repository;
    
    
    /* 
    private List<Language> languages = List.of(
        new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
        new Language("JavaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", 2)
    ); */
        
    // Pega os dados diretamente do MongoDB
    @GetMapping("/languages")
    public List<Language> GetLanguages(){
        List<Language> languages = repository.findAll();
        return languages;
    }

    @GetMapping("/test")
    public String test(){        
        return "test OK";
    }

    // Verbo POST adiciona dados ao MongoDB
    @PostMapping("/languages")
    public Language registerLanguage(@RequestBody Language language){
        return repository.save(language);
    }
}
