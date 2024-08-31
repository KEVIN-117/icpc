package org.example.graph;

public class N_547_NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int counter = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                counter++;
                dfs(isConnected, visited, i, n);
            }
        }
        return counter;
    }


    static void dfs(int[][] isConnected, boolean[] visited, int i, int n){
        for (int j = 0; j < n; j++) {
            if (isConnected[i][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected, visited, j, n);
            }
        }
    }

    public static void main(String[] args) {
        N_547_NumberOfProvinces numberOfProvinces = new N_547_NumberOfProvinces();
        int[][] isConnected = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        System.out.println(numberOfProvinces.findCircleNum(isConnected));

        int[][] isConnected2 = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        System.out.println(numberOfProvinces.findCircleNum(isConnected2));
    }
}
