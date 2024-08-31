package org.example.graph;

import java.util.*;


public class N_802_FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] states = new int[graph.length];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            if (dfs(graph, states, i, n))
                res.add(i);
        }
        return res;
    }

    static boolean dfs(int[][] graph, int[] states, int i, int n){
        if (states[i] != 0)
            return states[i] == 2;
        states[i] = 1;
        for (int j = 0; j < graph[i].length; j++) {
            if (!dfs(graph, states, graph[i][j], n))
                return false;
        }
        states[i] = 2;
        return true;
    }

    public static void main(String[] args) {
        N_802_FindEventualSafeStates safeStates = new N_802_FindEventualSafeStates();
        int[][] graph = {
                {1,2},
                {2,3},
                {5},
                {0},
                {5},
                {},
                {}
        };
        safeStates.eventualSafeNodes(graph).forEach(System.out::println);
        System.out.println("=====================================");
        int[][] graph2 = {
                {1,2,3,4},
                {1,2},
                {3,4},
                {0,4},
                {}
        };
        safeStates.eventualSafeNodes(graph2).forEach(System.out::println);
    }
}


class Solution {
    List<Integer> safeNodes;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        return new AbstractList<Integer>(){
            @Override
            public Integer get(int index){
                init();
                return safeNodes.get(index);
            }

            @Override
            public int size(){
                init();
                return safeNodes.size();
            }

            private void init(){
                if(safeNodes != null) return;

                int n = graph.length;
                List<List<Integer>> reverseAdj = new ArrayList<>();
                safeNodes = new ArrayList<>();
                int[] inDegree = new int[n];

                for(int i = 0; i < n; i++){
                    reverseAdj.add(new ArrayList<>());
                }

                for(int i = 0; i < n; i++){
                    for(int neighborNode: graph[i]){
                        reverseAdj.get(neighborNode).add(i);
                        inDegree[i]++;
                    }
                }

                Queue<Integer> queue = new LinkedList<>();
                for(int i = 0; i < n; i++){
                    if(inDegree[i] == 0){
                        queue.offer(i);
                    }
                }

                while(!queue.isEmpty()){
                    int safeNode = queue.poll();
                    safeNodes.add(safeNode);

                    for(int neighbor : reverseAdj.get(safeNode)){
                        inDegree[neighbor]--;
                        if(inDegree[neighbor] == 0){
                            queue.offer(neighbor);
                        }
                    }
                }
                Collections.sort(safeNodes);
            }
        };
    }
}