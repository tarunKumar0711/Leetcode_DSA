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
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        
        Map<Node,Node> map = new HashMap<>();
        
        Queue<Node> q = new LinkedList<>();
        Node newNode = new Node();
        newNode.val= node.val;
        map.put(node,newNode);
        q.add(node);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- >0)
            {
                Node oNode = q.poll();
                for(Node child: oNode.neighbors)
                {
                    if(!map.containsKey(child))
                    {
                        Node nNode = new Node();
                        nNode.val= child.val;
                        q.add(child);
                        map.put(child,nNode);
                    }
                    Node newListNode = map.get(oNode);
                    newListNode.neighbors.add(map.get(child));
                }
            }
        }
        
        return map.get(node);
    }
}