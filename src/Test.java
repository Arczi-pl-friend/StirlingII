public class Test
{
    public static void main(String[] args)
    {
    	int n=0;
		
		try{n=Integer.parseInt(args[0]);}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Nie podano parametrow");
			System.exit(0);
		}
		catch(NumberFormatException ex){
			System.out.println(args[0]+" - nieprawidlowa dana");
			System.exit(0);
		}
		
		
    	if(n<0 || n>=34) // 34 po 17 wykracza poza zakres int
		{
			System.out.println(args[0]+" - nieprawidlowy numer wiersza");
			System.exit(0);
		}
		
		
    	LiczbyStirlingaII nr = new LiczbyStirlingaII(n);

    	
    	int k=0;
    	
    	for(int i=1; i<args.length; i++)
		{
    		
			System.out.print(args[i]+" - ");
			
			try{k=Integer.parseInt(args[i]);}
			catch(NumberFormatException ex){
				System.out.println("nieprawidlowa dana");
				continue;
			}
			try{System.out.println(nr.wspolczynnik(n,k));}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("liczba spoza zakresu");
			}
		
		}
    	
    	System.out.println("\nBella(" + n + ") = " + nr.bella(n));
    }
    
}