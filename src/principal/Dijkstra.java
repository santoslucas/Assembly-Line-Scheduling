package principal;

// ALGORITMO GULOSO

public class Dijkstra {
  private int antecessor[];
  private double p[];
  private XGrafo grafo;
  private int cont = 1;
  private int flag;

  public Dijkstra (XGrafo grafo) { this.grafo = grafo; flag = (grafo.numVertices()/2);}

  public void obterArvoreCMC (int raiz) throws Exception {
    int n = this.grafo.numVertices();
    this.p = new double[n]; // peso dos vertices
    int vs[] = new int[n+1]; // vertices
    this.antecessor = new int[n];

    for (int u = 0; u < n; u ++) {
      this.antecessor[u] = -1;
      p[u] = Double.MAX_VALUE; // peso infinito
      vs[u+1] = u; // Heap indireto a ser construido
    }
    p[raiz] = 0; //o peso da raiz eh zerado
    HeapMinIndireto heap = new HeapMinIndireto (p, vs); 
    heap.constroi ();

    while (!heap.vazio ()) { //percorre todo o heap
      int u = heap.retiraMin (); //menor valor no heap

      if (!this.grafo.listaAdjVazia (u)) {
        XGrafo.Aresta adj = grafo.primeiroListaAdj (u); // Retorna a primeira aresta que o vertice u participa
        while (adj != null) {
          int v = adj.v2 ();  // vai para o outro vertice
          if (this.p[v] > (this.p[u] + adj.peso ())) { //se o peso do vertice v for menor
            antecessor[v] = u; 
            heap.diminuiChave (v, this.p[u] + adj.peso ()); // antecessor recebe vertice u e sua chave eh diminuida
          }
          adj = grafo.proxAdj (u); //vai para proxima adjacencia 
        }
      }
    }
  }

  public int antecessor (int u) { return this.antecessor[u]; }
  public double peso (int u) { return this.p[u]; }

  public void imprime () {
    for (int u = 0; u < this.p.length; u++)
      if (this.antecessor[u] != -1) 
        System.out.println ("(" +antecessor[u]+ "," +u+ ") -- p:" +peso (u));

  }

  public int custo(){ // retorna o custo do grafo
    int n = this.grafo.numVertices();
    return (int) this.p[n-1];
  }

  public void imprimeCaminho (int origem, int v) { //Imprime estacoes

    if (this.antecessor[v] != -1){
      imprimeCaminho (origem, this.antecessor[v]);
      if(cont < flag){
        if ((v%2) != 0){
          System.out.println (" -Linha: 1" + "  Estacao: " + cont);
          cont++;
        }
        else{
          System.out.println (" -Linha: 2" + "  Estacao: " + cont);
          cont++;
        }
      }
    }    
  }
}