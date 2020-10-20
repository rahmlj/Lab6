class Tree {

    String treeName;
    String treeType;
    boolean leavesFall;
   String leafColor;
    Tree() {
      String treeName = "";
      String treeType = "";
      boolean leavesFall = false;
      String leafColor = "";

    }

    Tree(String theTreeName, String theTreeType, boolean theLeavesFall, String theLeafColor){
      
      treeName = theTreeName;
      treeType = theTreeType;
      leavesFall = theLeavesFall;
      leafColor = theLeafColor;

    }

   
    String getName() {
      return treeName;
  
    }
    String getType() {
      return treeType;

    }
    boolean getFall() {
      
      return leavesFall;
     }
    String getColor(){
      return leafColor;

    }

        void setName(String theTreeName) {
      treeName = theTreeName;
    }
   void setType(String theTreeType) {
      treeType = theTreeType;
    }
   void setFall(boolean theLeavesFall) {
      
      leavesFall = theLeavesFall;
    }
    void setColor(String theLeafColor) {
      leafColor = theLeafColor;
    }

    

    void print(){
     if (leavesFall = false){
     System.out.println("This is a " + treeName +" tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". " + "It does not lose its leaves for the winter.");
    }
    else if (leavesFall = true){
       System.out.println("This is a " + treeName +" tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". " + "It does lose its leaves for the winter.");
    }
  }

}
