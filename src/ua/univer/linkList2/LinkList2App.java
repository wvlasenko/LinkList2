package ua.univer.linkList2;


public class LinkList2App {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(1, "Bus 1");
        theList.insertFirst(2, "Bus 2");
        theList.insertFirst(3, "Bus 3");
        theList.insertFirst(4, "Bus 10");
        theList.insertFirst(5, "Bus 5");
        theList.displayList();

        Link fn = theList.find(4);
        if (fn != null)
            System.out.println(" Found link with key" + fn.iData + " : " + fn.name);
        else
            System.out.println("Can't find link");
        Link dl = theList.delete(5);
        if (dl != null)
            System.out.println("Deleted link with key" + dl.iData + " " + dl.name);
        else
            System.out.println("Can't delete link");
        theList.displayList();

    }
}
