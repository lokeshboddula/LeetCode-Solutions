class Solution {
    public boolean canFinish(int n, int[][] pre) {
        //creating graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        //adding empty lists
        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
        //indegree array for for marking each nodes indegree 
        //and adding them to queue when the values becomes 0
        int indegree[] = new int[n];
        for (int i = 0; i < pre.length; i++) {
            int ai = pre[i][0];
            int bi = pre[i][1];
            graph.get(bi).add(ai);
            indegree[ai]++;
        }
        Queue<Integer> q = new LinkedList<>();
        //adding courses with 0 indegree
        for (int i = 0; i < n; i++) if (indegree[i] == 0) q.add(i);
        int count = 0;
        while (q.size() > 0) {
            int curr = q.remove();
            count++;
            for (int nbr : graph.get(curr)) {
                indegree[nbr]--;
                if(indegree[nbr] == 0) q.add(nbr);
            }
        }
        if(count < n) return false;
        return true;
    }
}