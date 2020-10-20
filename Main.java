class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();

    tree1.setName("");
    tree1.setType("");
    tree1.setColor("");
    tree1.setFall(false);

    tree1.print();

    Tree tree2 = new Tree();
    tree2.setName("Maple");
    tree2.setType("Broadleaf");
    tree2.setColor("Red");
    tree2.setFall(true);

    tree1.setName("Spruce");
    tree1.setType("Conifer");


    
    tree2.print();
    tree1.print();
  }
}