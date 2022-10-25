# Centro Federal de Educação Tecnológica de Minas Gerais
## Departamento de Computação
## Laboratório de Algoritmos e Estruturas de Dados II

Considere o problema das linhas de montagem, onde se quer verificar qual é o caminho mais eficiente da entrada nas linhas de montagem até a saída levando em consideração o tempo de processamento em cada estação e o tempo de transporte entre uma estação e outra, assim como o tempo de saída das linhas de montagem.
<p>a. e1 e e2: tempo gasto para a entrada nas linhas 1 e 2, respectivamente;
<p>b. a1,1, a1,2, ... a1,n: tempo gasto para o processamento em cada uma das estações
S1,1, S1,2, ..., S1,n da Linha de montagem 1;
<p>c. a2,1, a2,2, ... a2,n: tempo gasto para o processamento em cada uma das estações
S2,1, S2,2, ..., S2,n da Linha de montagem 2;
<p>d. t1,1, t1,2, ... t1,n-1: tempo gasto para ir de uma estação na Linha 1 até a estação
seguinte na Linha 2;
<p>e. t2,1, t2,2, ... t2,n-1: tempo gasto para ir de uma estação na Linha 2 até a estação
seguinte na Linha 1;
<p>f. x1 e x2: tempo de saída das linhas de montagem 1 e 2, respectivamente.
<p> <img src=https://github.com/santoslucas/Assembly-Line-Scheduling/blob/main/LinhaDeMontagem.png>
  <p><p>Implementar, um algoritmo recursivo com memoização que utilize a metodologia de
programação dinâmica para solucionar o problema das linhas de montagem,
considerando sempre duas linhas. O algoritmo deve imprimir o caminho utilizado na
solução assim como tempo gasto.
<p>Implementar, um algoritmo guloso para solucionar o problema das linhas de montagem,
considerando sempre duas linhas. O algoritmo deve imprimir o caminho utilizado na
solução assim como tempo gasto.
<p>Mostrar o resultado encontrada para cada uma das instâncias a seguir utilizando os duas
métodos implementados.
<p>a. A1 = [03, 05, 07, 10, 05, 09, 11, 09, 05, 02, 06]
<p>b. A2 = [02, 06, 03, 09, 11, 04, 09, 03, 12, 04, 05]
<p>c. T1 = [03, 05, 04, 02, 07, 05, 08, 01]
<p><p>d. T1 = [05, 03, 07, 05, 06, 02, 05, 02]
<p>e. A1 = [05, 10, 06, 03, 08, 05, 03, 07, 12, 08]
<p>f. A2 = [07, 03, 05, 03, 07, 06, 04, 09, 10, 09]
<p>g. T1 = [04, 02, 07, 02, 05, 08, 02]
<p>h. T2 = [06, 01, 07, 03, 06, 04, 05]
