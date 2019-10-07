public class LiczbyStirlingaII
{
	private long[][] tab;
	
	LiczbyStirlingaII(int n){
    tab = new long[n+1][n+1];
      
    for(int i=0; i<=n;i++)
    	for(int j=0; j<=i; j++)
    		tab[i][j]=9;
    
    tab[0][0]=1;

    for(int i=1;i<=n;i++) { 
    	tab[i][0]=0;
    	tab[i][1]=1;
    	tab[i][i]=1;
    }
    
    for(int i=2;i<=n;i++)
    	for(int j=2;j<=i;j++)
    		tab[i][j]=j*tab[i-1][j] + tab[i-1][j-1];
    
   
}
	
	public long bella(int n) {
		long bella=0;
		for(int i=0;i<=n;i++)
			bella+=tab[n][i];
		return bella;
	}
	public long wspolczynnik(int n, int k){	 
		return tab[n][k];
	}
}
