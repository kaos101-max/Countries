public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String countryName;
  private String capital;
  private String language;
  private String imageFile;
  // add constructors
  public Country(String countryName, String capital, String language,String imageFile){
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;
        this.imageFile = imageFile;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return countryName;
  }
  public void setName(String name){
    countryName = name;
  }
  public String getCapital(){
    return capital;
  }
  public void setCapital(String name){
    capital = name;
  }
  public String getSpeech(){
    return language;
  }
  public void setSpeech(String name){
    language = name;
  }
  public String getPic(){
    return imageFile;
  }
  public void setPic(String name){
    imageFile = name;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString(){
    return countryName + "'s capital is " + capital + "," + " and its primary language is " + language + ".";
  }
}