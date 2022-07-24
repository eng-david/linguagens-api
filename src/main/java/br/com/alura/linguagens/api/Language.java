package br.com.alura.linguagens.api;

public class Language {

    private String title;
    private String image;
    private String ranking;
      
    public Language(String title, String image, String ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public String getRanking() {
        return ranking;
    }    
}
