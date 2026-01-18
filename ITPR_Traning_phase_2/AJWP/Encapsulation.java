
public class Encapsulation {
	
	final String s;
	
	 private String name;

	   public Encapsulation() {
		  s="Abhinav"; 
		  System.out.println("Final :"+s);
	   }
	 
	  
	    public String getName() { return name; }

	    
	    public void setName(String name) {
	    	
	        this.name = name;
	    }

	

}
