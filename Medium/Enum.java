enum Season
  {
    SPRING("Warm and beautiful");
    WINTER("Cold and snowy");
    SUMMER("Hot and sunny");
    RAINIY("cool and colorful");

    // field in enum
    private final String description;

    // Constructor
    Season(String description)
    {
      this.description = description;
    }

    // Method to get the description
    public String getdescription() 
    {
      return description;
    }
  }

public class Enum
  {
    public static void main(String args[])
    {
        // for each loop
      for(Season season : Season.values())
        {
          System.out.println(season + ": " + season.getDescription());
        }
     }
  }
