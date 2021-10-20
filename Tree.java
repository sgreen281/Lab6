class Tree{

String treeName;
String treeType;
boolean leavesFall;
String leafColor;


// constructors 

public Tree(){
  treeName = "tree";
  treeType = " ";
  leavesFall = false;
  leafColor = " ";
}

public Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
  treeName = aTreeName;
  treeType = aTreeType;
  leavesFall = aLeavesFall;
  leafColor = aLeafColor;
}


// mutators
public void setName( String aName){
    treeName = aName;
}

public void setType(String aTreeType){
  treeType = aTreeType;
}

public void setLeaves(boolean aLeavesFall){
  leavesFall = aLeavesFall;
}

public void setColor(String aLeafColor){
  leafColor = aLeafColor;
}

// acccessors

String getName(){
  return treeName;
}

String getType(){
  return treeType;
}

boolean getLeaves(){
  return leavesFall;
}

String getColor(){
  return leafColor;
}


public void print(){


  String leavesName = "does not";
  if (leavesFall == false){
      leavesName = "does not";
  }
  else{
    leavesName = "does";
  }

  System.out.println("This is a " + treeName + ". It is a " + treeType + "and its leaves are currently " + leafColor + ". It " + leavesName + " lose its leaves for the winter.");
}



}