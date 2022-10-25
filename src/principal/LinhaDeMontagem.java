package principal;
// Utilizando programacao dinamica

public class LinhaDeMontagem{
	public int NUM_LINE = 2;
	public int l[][];
	public int n;
	public int tempo;
	public int caminho;

	public LinhaDeMontagem(int n){
		this.n = n; // Numero de Estacoes
	}
	
	public void MelhorCaminho(int a[][], int t[][], int e[], int x[]){
		int i;
		int T1[] = new int [this.n];
		int T2[] = new int[this.n] ;
		this.l = new int [2][this.n];
	
		// tempo gasto para deixar a primeira estacao da linha 1
		T1[0] = e[0] + a[0][0];
		
		// tempo gasto para deixar a primeira estacao da linha 2
		T2[0] = e[1] + a[1][0];
	
		// Preenche os vetores de tempo T1[] E T2[], por meio de recursao
		for (i = 1; i < this.n; ++i){
			if (T1[i - 1] + a[0][i] <= T2[i - 1] + t[1][i] + a[0][i]){ //permanecer na linha 1 eh menos custoso
				T1[i] = T1[i - 1] + a[0][i];
				this.l[0][i] = 1;
			}
			else{ //ir para linha 2 eh menos custoso
				T1[i] = T2[i - 1] + t[1][i] + a[0][i];
				this.l[0][i] = 2;
			}
					
			if (T2[i - 1] + a[1][i] <= T1[i - 1] + t[0][i] + a[1][i]){ //permanecer na linha 2 eh menos custoso
				T2[i] = T2[i - 1] + a[1][i];
				this.l[1][i] = 2;
			}
			else{ //ir para linha 1 eh menos custoso
				T2[i] = T1[i - 1] + t[0][i] + a[1][i];
				this.l[1][i] = 1;
			}
		}

		// Considera o tempo de saida e define o melhor caminho
		if (T1[this.n-1] + x[0] <= T2[this.n-1] + x[1]){
			this.tempo = T1[this.n-1] + x[0];
			this.caminho = 1;
		}
		else{
			this.tempo = T2[n-1] + x[1];
			this.caminho = 2;
		}
	}

	public void printEstacoes(){ // imprime o caminho
		int i = this.caminho;
		System.out.println("Caminho (invertido):");
		System.out.println("  -Linha: " + i + "  Estacao: " + this.n);

		for (int j = (this.n-1); j>=1; j--){
		
			i = this.l[i-1][j];
			System.out.println("  -Linha: " + i + "  Estacao: " + j);
		}
	}

	public int getTempo() {
		return tempo;
	}

	public int getCaminho() {
		return caminho;
	}
}