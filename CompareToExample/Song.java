package CompareToExample;

 class Song implements Comparable<Song>{
   private String title;


     Song(String t){
         title = t;

     }
    public int compareTo(Song a){
         return this.getTitle().compareTo(a.getTitle());
    }
    public String getTitle() {
        return title;
    }

}



