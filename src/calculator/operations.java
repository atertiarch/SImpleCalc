package calculator;

public class operations {
	
    public static float add(float a,float b){
    	return(a+b);
    }
    
    public static float subt(float a,float b){
    	return(a-b);
    }
    
    public static float mult(float a,float b){
    	return(a*b);
    }
    
    public static float div(float a,float b){
    	try{
    		return a/b;
    	} 
    	catch (Exception e){
    		return 0;
    	}
    }
    
    
    
    
}
