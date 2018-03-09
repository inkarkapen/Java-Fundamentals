import java.util.HashMap;
class Songs{
   public static void main(String[] args){
      HashMap<String, String> songs = new HashMap<String, String>();
      songs.put("Song1", "Lyrics1");
      songs.put("Song2", "Lyrics2");
      songs.put("Song3", "Lyrics3");
      // songs.forEach((key, tab)->
//          System.out.print(key);
//          System.out.print(tab);
//       );
      for(String key: songs.keySet()){
         System.out.print("Song "+key);
         System.out.println(" Lyrics "+songs.get(key));
      }
   }
}