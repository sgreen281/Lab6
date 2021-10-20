class Main {
  public static void main(String[] args) {

      Tree tree1 = new Tree();
      tree1.print();

      Tree tree2 = new Tree("maple", "broadleaf", true, "red" );
      tree2.print();

      tree1.setName("spruce");
      tree1.setType("conifer");
      tree1.print();

      


      

  }
}