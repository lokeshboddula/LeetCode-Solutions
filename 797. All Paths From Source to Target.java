class Solution {
    void dfs (List<List<Integer>> ans, int[][] graph, int src, int dest, boolean[] visited, List<Integer> psf) {
        if(src == dest) {
            ans.add(new ArrayList<>(psf));
            return;
        }
        visited[src] = true;
        
        for(int nbr : graph[src]) {
            if(!visited[nbr]) {
                psf.add(nbr);
                dfs (ans, graph, nbr, dest, visited, psf);
                psf.remove(psf.size() - 1);
            }
        }
        
        visited[src] = false;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        List<Integer> psf = new ArrayList<>();
        psf.add(0);
        dfs(ans, graph, 0, graph.length - 1, visited, psf);
        return ans;
    }
}