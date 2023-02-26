
class Solution {
    void dfs(Node root, List<Integer> list) {
         if(root == null) {
            return;
        }
        list.add(root.val);
        for(Node n : root.children) {
            dfs (n, list);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }
}