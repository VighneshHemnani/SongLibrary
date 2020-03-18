# SongLibrary-Project
This is a project exercise where we made a Java class to keep track of a song's information and functions to add, remove, sort, update, and print all songs. This was the final cumulative project of the semester as a part of the syllabus of CS111: Introduction to Computer Science (with Ana Centeno) in Fall 2018. 

Overview of the project:
For this project, we made a Java class that tracks a song's information (in Song.java) and then we made the appropriate methods (in SongApp.java) to add, remove, update information, print and sort the songs using different sorting algorithms.

## **Attached files:**

  1. **IO.java and IO.html**:
      - The IO class (IO.java) is a class developed that holds easier functions to read and/or output the appropriate data type. Download and open IO.html in a browser to read more about the IO class and its functions. 
      - The methods are as below:
        - **readInt()**: ask (and force) the user to enter an integer.
        - **readString()**: ask (and force) the user to enter text.
        - **readDouble()**: ask (and force) the user to enter a real number.
        - **readChar()**: ask (and force) the user to enter a single character.
        - **readBoolean()**: ask (and force) the user to enter text that can be interpreted as a boolean (valid responses: "t", "f", "true", "false", "yes", "no", "y", "n").
        - **outputIntAnswer(int i)**: print an integer to the screen and/or send it to the grading script. 
        - **outputStringAnswer(String s)**: print a string to the screen and/or send it to the grading script.
        - **outputDoubleAnswer(double d)**: print a real number to the screen and/or send it to the grading script.
        - **outputCharAnswer(char c)**: print a single character to the screen and/or send it to the grading script.
        - **outputBooleanAnswer(boolean b)**: print a boolean to the screen (e.g. "true" or "false") and/or send it to the grading script.

  2. **Song.java:**
      - In Song.java, I implemented a class with the following private attributes:
          - **name**: a String for the name of the song;
          - **year**: an integer for the year the song was released;
          - **numberOfWriters**: an integer to store the number of the song’s composers;
          - **writers**: an array of Strings to store the name of the song's composers. A song can have a maximum of 50 composers;
          - **rating**: an integer value ranging from 1 (horrible) to 5 (the best song ever).
      - In the same file, I also created basic get/set and other functions for the song and song attributes, listed as below:
          - **public Song(String name)**: that takes as an argument the song's name
          - **public void setName(String name)**: updates song's name attribute
          - **public String getName()**: returns song's name attribute
          - **public void setYear(int year)**: updates song's year attribute
          - **public int getYear()**: returns song's year attribute
          - **public void setRating(int rating)**: update song's rating attribute
          - **public int getRating()**: returns song's rating attribute
          - **public void addWriter(String writerName)**: receives a String with the writer’s name as a parameter and inserts the String into the writer array at the first empty position; update numberOfWriters to reflect the new number of writers
          - **public String[] getWriters()**: returns the writers array attribute
          - **public int getNumberOfWriters()**:returns the value of numberOfWriters attribute;
          - **public String getWriterAtIndex(int index)**: returns the writer’s name at that index. Use 0 based indexing where an index of 0 is the first name. It should return null if there is no writer at that index
          - **public String toString()**: returns the string representation of this song with the song's name, year, and rating. Output in the format "name, year, rating"
          - **public boolean equals(Object other)**: returns true if this object is the same as other object. Two objects are equal if they have the same name, the same writers/composers, and were released at the same year. Assume the ordering of writers might not be the same and no duplicate writer name exists in either song
          - **public int compareTo (Song other)**: return 0 if this song's name is lexicographically equal to other song's name; Return a negative number, say -1, if this song's name is less than the other song's name lexicographically; Return a postive number, say 1, if this song's name is greater than the other song's name lexicographically
          
  3. **SongApp.java:**
        - In this file, I wrote all the functions related to songs such as but not limited to sorting the songs, printing songs, searching for a particular song etc. The following list shows all the functions I created with the purpose (and algorithm) for each:
            - **public void addSong (Song m):** adds the passed Song, "m", into the library (unsorted array). If library is full, function creates new array with double the previous size, copies all current songs, adds new song
            - **public boolean removeSong (Song m):** removes the passed Song, "m", from the library. Returns true if "m" is removed, false otherwise. Note the array does not become sparse after a song is removed. All songs are in consective indexes in the array.
            - **public Song[] getSongs ():** returns the library of songs
            - **public int getNumberOfItems():** returns the number of songs in the library (number of items in the array)
            - **public boolean updateRating (Song m, int rating):** updates the rating of the passed Song, "m", to a new rating, "rating". Returns true if updated successfully, false otherwise
            - **public void print():** prints all songs
            - **public Song[] getSongsBySongwriter (String songwriter):** returns all songs by the passed songwriter, "songwriter". The array size returned is always the number of songs by "songwriter". Returns an array of Songs written by "songwriter"
            - **public Song[] getSongsByYear (int year):** returns all the Songs released in the passed "year". Returns an array with all the Songs made in that "year". Size of returned array is always the number of songs made in that year
            - **public Song[] getSongsWithRatingsGreaterThan (int rating):** returns all an array of Songs with the ratings greater than the passed "rating".
            - **public Song searchSongByName (String name):** searches library (array of all Songs) for the Song with the passed name, "name", using a binary search algorithm and returns that Song. This function assumes the items are sorted
            - **public void sortByYear():** sorts the library (array of Songs) using insertion sort ranked by the year the song was made. If two songs were made in the same year, then the sorting for that year does not matter. 
            - **public void sortByName():** sorts the library (array of Songs) using selection sort by the name of the Song. 
            - **public static Song searchSongByName (String name, Song[] Songs, int l, int r):** searches library (array of Songs) for Song with the passed name, "name", using recursive linear search. Returns the Song with "name" or null if the song is not found
        
  

