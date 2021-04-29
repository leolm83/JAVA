/*Inverte a ordem das letras nas palavras que conterem mais que 4 caracteres*/
public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
    String newSentence="";
    for(String i : sentence.split(" ")){
      if(i.length()>=5){
        StringBuilder reverseSentence = new StringBuilder(i);
        reverseSentence.reverse();
        newSentence+=reverseSentence+" ";
      }
      else{
      newSentence+=i+" ";
      }
    }
    return newSentence.trim();
  }
}
