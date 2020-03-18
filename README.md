# SongLibrary-Project
This is a project exercise where we made a Java class to keep track of a song's information and functions to add, remove, sort, update, and print all songs.

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
          - **public boolean equals(Object other)**: returns true if this object is the same as other object. Two objects are equal if they have the same name, the same writers/composers, and were released at the same year. Assume the ordering of writers might not be the same and no duplicate writer name exists in either song.
          - **public int compareTo (Song other)**: return 0 if this song's name is lexicographically equal to other song's name; Return a negative number, say -1, if this song's name is less than the other song's name lexicographically; Return a postive number, say 1, if this song's name is greater than the other song's name lexicographically.
          

