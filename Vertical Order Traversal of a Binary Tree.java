class Solution
{
    List <List <Integer>> result;
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        result = new ArrayList <>();
        
        //Key - Horizontal Distance, Values - List of nodes with same horizontal distance
        HashMap <Integer, List <Node>> hashMap = new HashMap <>();
        
        verticalTraversal (root, hashMap);
        
        return result;
    }
    
    /*
    @param - minHD and maxHD represents the range of the horizontal distance, which will be used when adding nodes to the result array
    */
    private void verticalTraversal (TreeNode root, HashMap <Integer, List <Node>> hashMap)
    {
        Queue <Node> queue = new LinkedList <>();
        int minHD = 0;
        int maxHD = 0;
        
        queue.add (new Node (0, 0, root));
        
        //Level order traversal of the tree
        while (!queue.isEmpty())
        {
            Node currentNode = queue.poll();
            
            //Update the minHD and maxHD
            minHD = Math.min (minHD, currentNode.hd);
            maxHD = Math.max (maxHD, currentNode.hd);
            
            //Check if the node with currentNode.hd is present in the map. Add the node, if it is not present
            if (!hashMap.containsKey (currentNode.hd))
            {
                hashMap.put (currentNode.hd, new ArrayList <>());
            }
            
            hashMap.get (currentNode.hd).add (currentNode);
            
            //Add the left child, if present (X - 1, Y - 1)
            if (currentNode.node.left != null){
                queue.add (new Node (currentNode.hd - 1, currentNode.vd - 1, currentNode.node.left));
            }
            
            //Add the right child, if present (X + 1, Y - 1)
            if (currentNode.node.right != null){
                queue.add (new Node (currentNode.hd + 1, currentNode.vd - 1, currentNode.node.right));
            }
        }
        
        //Add the nodes to the result list. Traverse from minHD to maxHD
        int resultIndex = 0;
        
        for (int index = minHD; index <= maxHD; index++) {      
            
        /*
        If the vertical distances are same, sort according to the values. Else, sort according to the
        vertical distance*/
            
        Collections.sort (hashMap.get (index), (a, b) ->{        
        if (a.vd == b.vd)
            return a.node.val - b.node.val;
        else
            return b.vd - a.vd;
            });
            
            //Add the nodes to the result list
            result.add (new ArrayList <>());
            for (Node node : hashMap.get (index))
            {
                result.get (resultIndex).add (node.node.val);
            }
            
            resultIndex++;
        }
        
    }
}

/*
Node class.
@param hd - Horizontal Distance of the node
@param vd - Vertical Distance of the node
@param node - Node
*/
class Node 
{
    int hd;
    int vd;
    TreeNode node;
    
    Node (int hd, int vd, TreeNode node)
    {
        this.hd = hd;
        this.vd = vd;
        this.node = node;
    }
}