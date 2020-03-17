public class Song{

  private String name;
  private int year;
  private int numberOfWriters;
  private String[] writers;
  private int rating;

  public Song(String name){
    this.name = name;
    writers = new String[50];
    numberOfWriters = 0;
    year = 0;
    rating = 0;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getYear(){
    return year;
  }

  public void setRating(int rating){
    this.rating = rating;
  }

  public int getRating(){
    return rating;
  }

  public void addWriter(String writerName){

      for (int i = 0; i < this.writers.length; i++){
        if (getWriterAtIndex(i)==null){
          this.writers[i] = writerName;
          this.numberOfWriters+=1;
          break;
        }
      }
    }


    public String[] getWriters(){
      return this.writers;
    }

  public int getNumberOfWriters(){
    return this.numberOfWriters;
  }

  public String getWriterAtIndex(int index){
    if (this.writers[index] == ""){
      return null;
    }
    else {
      return this.writers[index];
    }
  }

  public String toString(){
    return name + ", " + year + ", " + rating;
  }

  public boolean equals(Object other){

    if (other == null || !(other instanceof Song)){
      return false;
    }

    Song s = (Song)other;
    int counter = 0;


    for (int i = 0; i < this.writers.length ; i++)
    {
      for (int j = 0; j < s.getNumberOfWriters() ; j++)
      {
          if (getWriterAtIndex(i) == s.getWriterAtIndex(j))
          {
            counter++;
            break;
          }
        }
      }

      if ( this.name.equals(s.getName()) && this.year==s.getYear() && (counter == this.numberOfWriters) && (this.numberOfWriters == s.getNumberOfWriters()) ){
        return true;
      }
      else
      {
        return false;
      }
    }


  public int compareTo(Song other){
    Song s = (Song)other;
    String thissong = this.name;
    String othersong = s.name;
    return thissong.compareTo(othersong);
  }

}
