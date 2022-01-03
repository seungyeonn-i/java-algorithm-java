public class BinaryTree {

    BinaryTree left;
    BinaryTree right;
    int value;

    BinaryTree head = null;

    public BinaryTree(int value) {
        this.value = value;
    }

    public boolean delete(int value){
        boolean searched = false;

        BinaryTree currParentNode = this.head;
        BinaryTree currNode = this.head;

        //노드가 없는 경우
        if(this.head ==null){
            return false;
        }else{
            //노드가 한개인데 이 노드가 삭제할 노드일 경
            if(this.head.value == value && this.head.left == null && this.head.right == null){
                this.head = null;
                return true;
            }
            while(currNode != null){
                if(currNode.value == value){
                    searched = true;
                    break;
                }else if (value < currNode.value){
                    currParentNode = currNode;
                    currNode = currNode.left;
                }else{
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }
            if(searched == false){ // 순회했는데도 없으면 false
                return false;
            }
        }
        //leaf node
        if(currNode.left == null && currNode.right==null){
            if(value < currParentNode.value){
                currParentNode.left = null;
                currNode = null;    //delete
            }else{
                currParentNode.right = null;
                currNode = null;    //delete
            }
            return true;
        }
        //one left node
        else if(currNode.left != null && currNode.right == null){
            if(value < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            }else{
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        }
        else if(currNode.left == null && currNode.right != null){
            if(value < currParentNode.value){
                currParentNode.left = currNode.right;
                currNode = null;
            }else{
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }else{

        }

        return true;





    }
}
