package ParceArgsCommandLine;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComLineParser clp=new ComLineParser(new String[] {"r","w","?"});
        /*if(clp.parse(new String[]{"-xOutfileName","-rInfileName","-?Info"})) {
            System.out.println("success");
        }
        else {
            System.out.println("fail!");
        }*/
		
        if(clp.parse(args)) {
        System.out.println("success");
        }
        else {
        	System.out.println("fail!");
        }
		
	}

}
