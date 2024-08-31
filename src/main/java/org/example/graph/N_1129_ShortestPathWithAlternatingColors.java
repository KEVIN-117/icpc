package org.example.graph;

import java.util.*;

public class N_1129_ShortestPathWithAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[][] redGraph = new int[n][n];
        int[][] blueGraph = new int[n][n];
        int redEdgesLength = redEdges.length;
        int blueEdgesLength = blueEdges.length;
        buildGraph(redGraph, redEdges, redEdgesLength);
        buildGraph(blueGraph, blueEdges, blueEdgesLength);
        int[][] res = bfs(redGraph, blueGraph, n);

        int[] answer = new int[n];
        for (int[] item : res){
            int red = item[0];
            int blue = item[1];
            if (red == -1 || blue == -1)
                answer[0] = Math.max(red, blue);
            else
                answer[0] = Math.min(red, blue);
        }

        return answer;
    }

    static int[][] bfs(int[][] redGraph, int[][] blueGraph, int n){
        Queue<Map<Integer, String>> queue = new LinkedList<>();
        queue.add(Map.of(0, "red"));
        queue.add(Map.of(0, "blue"));
        int[] neighbors = null;
        int colorIdx = 0;
        int[][] distances = new int[n][2];
        for (int i = 0; i < n; i++) {
            distances[i][0] = -1;
            distances[i][1] = -1;
        }

        distances[0] = new int[]{0, 0};

        while (!queue.isEmpty()){
            Map<Integer, String> map = queue.poll();
            int node = map.keySet().iterator().next();
            String color = map.get(node);

            if(color.equals("red")){
                color = "blue";
                neighbors = blueGraph[node];
                colorIdx = 1;
            }else {
                color = "red";
                neighbors = redGraph[node];
                colorIdx = 0;
            }

            for (int neighbor : neighbors){
                if (distances[neighbor][colorIdx] == -1){
                    distances[neighbor][colorIdx] = distances[node][1 - colorIdx] + 1;
                    queue.add(Map.of(neighbor, color));
                }
            }
        }
        return distances;
    }

    static void buildGraph(int[][] graph, int[][] edges, int edgesLength){
        for (int i = 0; i < edgesLength; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            graph[from][to] = 1;
        }
    }



    public static void main(String[] args) {
        N_1129_ShortestPathWithAlternatingColors shortestPathWithAlternatingColors = new N_1129_ShortestPathWithAlternatingColors();
        int n = 3;
        int[][] redEdges = {
                {0,1},
                {1,2}
        };
        int[][] blueEdges = {};
        int[] res = shortestPathWithAlternatingColors.shortestAlternatingPaths(n, redEdges, blueEdges);
        for (int i : res){
            System.out.println(i);
        }
    }
}
