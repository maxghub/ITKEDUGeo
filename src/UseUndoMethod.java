//Practical task — StringBuilder
//Study the internal implementation of the StringBuilder class and write your own one adding an extra method — undo().
//Before starting — read about the snapshot pattern and apply it in your implementation.
//        Note: it is not necessary to completely rewrite all methods that exist in StringBuilder; the important part of the task is understanding the essence of the pattern. If the task remains unclear, ask a question to the mentor.


class MyStringBuilder {

    private String text = "";       // current string
    private String previous = "";   // snapshot (previous state)

    // append method
    public void append(String str) {
        previous = text;            // save snapshot
        text = text + str;          // add new text
    }

    // undo method
    public void undo() {
        text = previous;            // restore previous state
    }

    // display method
    public void show() {
        System.out.println(text);
    }
}


public class UseUndoMethod {

    public static void main(String[] args) {

        MyStringBuilder sb = new MyStringBuilder();

        sb.append("Hello");
        sb.append(" ITKEDU");

        System.out.print("Current: ");
        sb.show();

        sb.undo();

        System.out.print("After Undo: ");
        sb.show();
    }
}