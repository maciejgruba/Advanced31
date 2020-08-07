package pl.sda.advanced.wzorceProjektowe;

public class ChildrenMain {
    public static void main(String[] args) {
        IChildren children = new ChildrenListImpl();
        children.addChildren("Janek ");
        children.addChildren("Tomek ");
        children.addChildren("Tomek ");
        children.addChildren("Adam ");
        System.out.println(children.getChildren());

        children.sortChildren();
        System.out.println(children.getChildren());

        children.removeDuplicate();
        System.out.println(children.getChildren());

    }
}
