package org.example.graph;

import java.util.Arrays;
import java.util.List;

public class N_841_KeysAndRooms {

    static void dfs(List<List<Integer>> rooms, int[] isVisited, int i){
        isVisited[i] = 1;
        for (int j : rooms.get(i)){
            if (isVisited[j] == 0){
                dfs(rooms, isVisited, j);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[] isVisited = new int[n];
        dfs(rooms, isVisited, 0);

        for (int i : isVisited){
            if (i == 0)
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        N_841_KeysAndRooms keysAndRooms = new N_841_KeysAndRooms();
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );
        System.out.println(keysAndRooms.canVisitAllRooms(rooms));

        List<List<Integer>> rooms2 = List.of(
                List.of(1,3),
                List.of(3,0,1),
                List.of(2),
                List.of(0)
        );
        System.out.println(keysAndRooms.canVisitAllRooms(rooms2));
    }
}

/*

 */