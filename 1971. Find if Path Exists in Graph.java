class Solution {
    boolean dfs(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean visited[]) {
        if(src == dest) {
            return true;
        }
        visited[src] = true;
        for(int nbr : graph.get(src)) {
            if(!visited[nbr]) {
                boolean hasPath = dfs (graph, nbr, dest, visited);
                if(hasPath) return true;
            }
        }
        //visited[src] = false;
        return false;
    }
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        if(graph.get(src).contains(dest)){  // direct connection exists
             return true;
        }
        boolean visited[] = new boolean[n];
        return dfs(graph, src, dest, visited);
    }
}