/*
*
* This class implements a library of songs
*
* Vighnesh Hemnani
*
*/
public class SongApp {

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array



  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp () {
      numberOfItems = 0;
      items = new Song[5];
  }







  /*
  * One argument constructor creates array with user defines capacity
  *
  * @param capacity defines the capacity of the Song library
  */
  SongApp (int capacity) {
      numberOfItems = 0;
      items = new Song[capacity];
  }








  /*
  * Add a Song into the library (unsorted array)
  *
  * If the library is full (there is not enough space to add another Song)
  *   - create a new array with double the size of the current array.
  *   - copy all current Songs into new array
  *   - add new Song
  *
  * @param m The Song to be added to the libary
  */
  public void addSong (Song m) {
    if (m != null) {
			if (this.getNumberOfItems() + 1 > items.length) {
				Song[] temp1 = new Song[2*this.items.length];
				for (int i = 0; i < items.length; i++) {
					temp1[i] = this.items[i];
				}
				this.items = temp1;
			}
			this.items[this.getNumberOfItems()] = m;
			this.numberOfItems++;
		}
    }








  /*
  * Removes a Song from the library. Returns true if Song is removed, false
  * otherwise.
  * The array should not become sparse after a remove, that is, all Songs
  * should be in consecutive indexes in the array.
  *
  * @param m The Song to be removed
  *
  */






  public boolean removeSong (Song m) {
    for (int i = 0; i < this.getNumberOfItems(); i++) {
      if (this.items[i] != null && this.items[i].equals(m)) {
        for (int j = i; j < this.getNumberOfItems() - 1; j++) {
          this.items[j] = this.items[j+1];
        }
        this.items[this.getNumberOfItems()-1] = null;
        this.numberOfItems--;
        return true;
      }
    }
    return false;
    }




  /*
  * Returns the library of songs
  *
  * @return The array of Songs
  */
  public Song[] getSongs () {
      return this.items;
  }







  /*
  * Returns the current number of Songs in the library
  *
  * @return The number of items in the array
  */
  public int getNumberOfItems() {
      return this.numberOfItems;
  }







  /*
  * Update the rating of Song @m to @rating
  *
  * @param @m The Song to have its ratings updated
  * @param @rating The new rating of @m
  * @return true if update is successful, false otherwise
  *
  */

  public boolean updateRating (Song m, int rating)
  {
    if (rating>=1 && rating<=5)
    {
        for(int i=0; i<items.length; i++)
        {
          if(items[i]==m && items[i]!=null)
          {
            m.setRating(rating);
            return true;
          }

        }
    }
        return false;
  }




  /*
  * Prints all Songs
  */
  public void print () {
      for (int i = 0 ; i < items.length ; i++){
        System.out.println(items[i]);
      }
  }







  /*
  * Return all the Songs by @songwriter. The array size should be the
  * number of Songs by @songwriter.
  *
  * @param songwriter The songwriter's name
  * @param An array of all the Songs by @songwriter
  *
  */
  public Song[] getSongsBySongwriter (String songwriter) {

    Song[] songWriterArr= new Song[items.length];
    int cnt=0;
    for(int i=0; i<items.length; i++)
    {

      if (items[i] != null){

      int totalWriter=items[i].getNumberOfWriters();
      for(int j=0; j<totalWriter; j++)
      {
        if(items[i].getWriterAtIndex(j).equals(songwriter))
        {
          songWriterArr[cnt]= items[i];
          cnt++;
          break;
        }
      }

    }

    }
    Song[] finalList= new Song[cnt];

    for(int i=0; i<finalList.length; i++)
    {
      finalList[i]=songWriterArr[i];
    }
    return finalList;
  }


  /*
  * Return all the Songs released in @year. The array size should be the
  * number of Songs made in @year.
  *
  * @param year The year the Songs were made
  * @return An array of all the Songs made in @year
  *
  */
  public Song[] getSongsByYear (int year) {

    //making an blank array of Songs of the playlist with the same size:
    Song[] songYearArr= new Song[items.length];
    int counter = 0;
    for (int i = 0 ; i < this.items.length; i++){
      if (items[i] != null && items[i].getYear() == year){

        songYearArr[counter] = items[i];
        counter++;

      }
    }

    Song[] finalList= new Song[counter];

    for(int i=0; i<finalList.length; i++)
    {
      finalList[i]=songYearArr[i];
    }
    return finalList;

}









  /*
  * Return all the Songs with ratings greater then @rating
  *
  * @param rating
  * @return An array of all Songs with rating greater than @rating
  *
  */
  public Song[] getSongsWithRatingsGreaterThan (int rating) {


    Song[] songRatingArr= new Song[items.length];
    int counter = 0;
    for (int i = 0 ; i < this.items.length; i++){
      if (items[i] != null && items[i].getRating() > rating){

        songRatingArr[counter] = items[i];
        counter++;

      }
    }

    Song[] finalList= new Song[counter];

    for(int i=0; i<finalList.length; i++)
    {
      finalList[i]=songRatingArr[i];
    }
    return finalList;
}







  /*
  * Search for Song name @name using binary search algorithm.
  * Assumes items is sorted
  */
  public Song searchSongByName (String name) {
    int n = items.length;
    int lft = 0;
    int rgt = n - 1;
    while (lft <= rgt){
      int m = (lft+rgt)/2;
      /*if (this.items[m] == null){
        return null;
      }*/
      if ((this.items[m].getName()).equals(name) && items[m] != null){
        return this.items[m];
      }
      if (name.compareTo(this.items[m].getName()) > 0  && items[m] != null){
         lft = m + 1;

      }
      else{
        rgt = m - 1;
      }
    }
    return null;
  }

 /*
  * Sorts Songs by year using insertion sort
  */
  public void sortByYear () {

    for (int i = 1 ; i < this.items.length ; i++){
      if (items[i] != null){

      Song itemToInsert = this.items[i];
      int loc = i - 1;
      while (loc >= 0){
        if (this.items[loc].getYear() > itemToInsert.getYear()){

          this.items[loc + 1] = (this.items[loc]);
          loc--;
        }
        else{
          break;
        }
      }
        this.items[loc + 1]=(itemToInsert);
      }
    }
  }







 /*
  * Sorts array of Songs by name using selection sort
  */
  public void sortByName () {
    int n = items.length;
    for (int i = n - 1 ; i > 0 ; i--){
      if (items[i] != null){
      int maxloc = 0;

      for (int j = 1 ; j <= i; j++){
        if ( (items[j].getName()).compareTo(items[maxloc].getName()) > 0 )
        {
          maxloc = j;
        }
      }

      Song temp = this.items[maxloc];
      this.items[maxloc]=items[i];
      this.items[i]=(temp);
    }
  }
}











 /*
  * Search for Song name using recursive linear search
  * @param name The name of the song to search
  * @param Songs The array containing all songs
  * @param l The left index
  * @param r The right index
  * @return The song with name @name or null if song is not found
  */
  public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
    if (l >= r || l<0 || Songs[l]==null || r>=Songs.length) {
      return null;
    }
    if (Songs[l].getName().equals(name)) {
      return Songs[l];
    } else {
      return searchSongByName(name, Songs, l+1, r);
    }
    }
  }
