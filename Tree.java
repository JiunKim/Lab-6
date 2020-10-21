class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() { 
    treeName = "";
    treeType = "";
    leavesFall = false; 
    leafColor = "";
  }

  Tree(String atreeName, String atreeType, boolean aleavesFall, String aleafColor){
    treeName = atreeName;
    treeType = atreeType;
    leavesFall = aleavesFall;
    leafColor = aleafColor;

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
  String getColor() {
    return leafColor;
  }
  void setName(String thetreeName) {
    treeName = thetreeName;
  }
  void setType(String thetreeType) {
    treeType = thetreeType;
  }
  void setFall(boolean theleavesFall) {
    leavesFall = theleavesFall;
  }
  void setColor(String theleafColor) {
    leafColor = theleafColor;
  }
  void print() {
    System.out.println();
    System.out.println("This is a " + treeName + " tree.");
    System.out.println("It is a " + treeType + " and its leaves are currently " + leafColor + ".");

    if (leavesFall == true){
      System.out.println("It does lose its leaves for the winter");
    }

    else {
      System.out.println("It does not lose its leaves for the winter.");
    }

    
  }
}
