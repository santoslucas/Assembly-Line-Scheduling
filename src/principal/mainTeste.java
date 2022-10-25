package principal;

public class mainTeste {
    public static void main(String[] args) throws Exception {
		// PROGRAMACAO DINAMICA
		// TESTE 1
		System.out.println("\nProgramacao Dinamica:\n");

		int a1[][] = {{5, 7, 10, 5, 9, 11, 9, 5, 2},
					{6, 3, 9, 11, 4, 9, 3, 12, 4}};

		int t1[][] = {{0, 3, 5, 4, 2, 7, 5, 8, 1},
					{0, 5, 3, 7, 5, 6, 2, 5, 2}};

		int e1[] = {3, 2};
		int x1[] = {6, 5};

		LinhaDeMontagem pd_Teste1 = new LinhaDeMontagem(9);

		System.out.println("Teste 1:");
		pd_Teste1.MelhorCaminho(a1, t1, e1, x1);
		System.out.println("Custo-tempo para o menor caminho: " + pd_Teste1.getTempo());
		pd_Teste1.printEstacoes();

		// TESTE 2
		int a2[][] = {{10, 6, 3, 8, 5, 3, 7, 12},
					 {3, 5, 3, 7, 6, 4, 9, 10}};

		int t2[][] = {{0, 4, 2, 7, 2, 5, 8, 2},
					 {0, 6, 1, 7, 3, 6, 4, 5}};

		int e2[] = {5, 7};
		int x2[] = {8, 9};

		LinhaDeMontagem pd_Teste2 = new LinhaDeMontagem(8);

		System.out.println("\nTeste 2:");
		pd_Teste2.MelhorCaminho(a2, t2, e2, x2);
		System.out.println("Custo-tempo para o menor caminho: " + pd_Teste2.getTempo());
		pd_Teste2.printEstacoes();

		//--------------------------------------------------------------------------------------------
		// ALGORITMO GULOSO - Dijkstra
		System.out.println("\n------------------------------------------------------------------------------------------------------------");
		System.out.println("\nAlgoritmo guloso:\n");

		// TESTE 1
		XGrafo grafo_Teste1 = new XGrafo(20);

		grafo_Teste1.insereAresta(0, 1, 8);
		grafo_Teste1.insereAresta(0, 2, 8);
		grafo_Teste1.insereAresta(1, 3, 7);
		grafo_Teste1.insereAresta(1, 4, 6);
		grafo_Teste1.insereAresta(2, 3, 12);
		grafo_Teste1.insereAresta(2, 4, 3);
		grafo_Teste1.insereAresta(3, 6, 14);
		grafo_Teste1.insereAresta(3, 5, 10);
		grafo_Teste1.insereAresta(4, 5, 13);
		grafo_Teste1.insereAresta(4, 6, 9);
		grafo_Teste1.insereAresta(5, 8, 15);
		grafo_Teste1.insereAresta(5, 7, 5);
		grafo_Teste1.insereAresta(6, 7, 12);
		grafo_Teste1.insereAresta(6, 8, 11);
		grafo_Teste1.insereAresta(7, 10, 6);
		grafo_Teste1.insereAresta(7, 9, 9);
		grafo_Teste1.insereAresta(8, 9, 15);
		grafo_Teste1.insereAresta(8, 10, 4);
		grafo_Teste1.insereAresta(9, 12, 16);
		grafo_Teste1.insereAresta(9, 11, 11);
		grafo_Teste1.insereAresta(10, 11, 17);
		grafo_Teste1.insereAresta(10, 12, 9);
		grafo_Teste1.insereAresta(11, 14, 8);
		grafo_Teste1.insereAresta(11, 13, 9);
		grafo_Teste1.insereAresta(12, 13, 11);
		grafo_Teste1.insereAresta(12, 14, 3);
		grafo_Teste1.insereAresta(13, 16, 20);
		grafo_Teste1.insereAresta(13, 15, 5);
		grafo_Teste1.insereAresta(14, 15, 10);
		grafo_Teste1.insereAresta(14, 16, 12);
		grafo_Teste1.insereAresta(15, 18, 5);
		grafo_Teste1.insereAresta(15, 17, 2);
		grafo_Teste1.insereAresta(16, 17, 4);
		grafo_Teste1.insereAresta(16, 18, 4);
		grafo_Teste1.insereAresta(17, 19, 6);
		grafo_Teste1.insereAresta(18, 19, 5);

		Dijkstra guloso_Teste1 = new Dijkstra(grafo_Teste1);
		guloso_Teste1.obterArvoreCMC(0);
		System.out.println("Teste 1:");
		System.out.println("Custo-tempo para o menor caminho: " + guloso_Teste1.custo());
		guloso_Teste1.imprimeCaminho(0, 19);
		System.out.println();

		// TESTE 2
		XGrafo grafo_Teste2 = new XGrafo(18);

		grafo_Teste2.insereAresta(0, 1, 15);
		grafo_Teste2.insereAresta(0, 2, 10);
		grafo_Teste2.insereAresta(1, 4, 9);
		grafo_Teste2.insereAresta(1, 3, 6);
		grafo_Teste2.insereAresta(2, 3, 12);
		grafo_Teste2.insereAresta(2, 4, 5);
		grafo_Teste2.insereAresta(3, 6, 5);
		grafo_Teste2.insereAresta(3, 5, 3);
		grafo_Teste2.insereAresta(4, 5, 4);
		grafo_Teste2.insereAresta(4, 6, 3);
		grafo_Teste2.insereAresta(5, 8, 14);
		grafo_Teste2.insereAresta(5, 7, 8);
		grafo_Teste2.insereAresta(6, 7, 15);
		grafo_Teste2.insereAresta(6, 8, 7);
		grafo_Teste2.insereAresta(7, 10, 8);
		grafo_Teste2.insereAresta(7, 9, 5);
		grafo_Teste2.insereAresta(8, 9, 8);
		grafo_Teste2.insereAresta(8, 10, 6);
		grafo_Teste2.insereAresta(9, 12, 9);
		grafo_Teste2.insereAresta(9, 11, 3);
		grafo_Teste2.insereAresta(10, 11, 9);
		grafo_Teste2.insereAresta(10, 12, 4);
		grafo_Teste2.insereAresta(11, 14, 17);
		grafo_Teste2.insereAresta(11, 13, 7);
		grafo_Teste2.insereAresta(12, 13, 11);
		grafo_Teste2.insereAresta(12, 14, 9);
		grafo_Teste2.insereAresta(13, 16, 12);
		grafo_Teste2.insereAresta(13, 15, 12);
		grafo_Teste2.insereAresta(14, 15, 19);
		grafo_Teste2.insereAresta(14, 16, 10);
		grafo_Teste2.insereAresta(15, 17, 8);
		grafo_Teste2.insereAresta(16, 17, 9); 

		Dijkstra guloso_Teste2 = new Dijkstra(grafo_Teste2);
		guloso_Teste2.obterArvoreCMC(0);
		System.out.println("Teste 2:");
		System.out.println("Custo-tempo para o menor caminho: " + guloso_Teste2.custo());
		guloso_Teste2.imprimeCaminho(0, 17);
		System.out.println();
		
	}
}