public class DCP3 {


    public static String serialize(Node node){

        if(node == null)
            return "";

        return node.val+ "-" + serialize(node.right) + serialize(node.left);
    }

    public static Node deserialize(String serializedTree){

        String[] nodes = serializedTree.split("-");

        return null;
    }


    public static class Node{

        public String val;
        public Node left;
        public Node right;

        public Node(String val) {
            this.val = val;
        }

        public Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
