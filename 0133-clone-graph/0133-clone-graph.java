/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node curr = new Node(node.val);
        map.put(node, curr);
        for(Node n: node.neighbors){
            if(!map.containsKey(n)) cloneGraph(n);
            curr.neighbors.add(map.get(n));
        }
        return curr;
    }
}