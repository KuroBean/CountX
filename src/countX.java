
public class countX {
	public int countX(String str) {
		  if(str.length()==0){
		    return 0;
		  }else{
		    if(str.charAt(0)=='x'){
		      return countX(str.substring(1))+1;
		    }
		    return countX(str.substring(1));
		  }
		}

}
