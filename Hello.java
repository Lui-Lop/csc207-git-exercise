public class Hello {
    public static void main (String[] args) {
      java.io.PrintWriter pen;
    pen = new java.io.PrintWriter(System.out, true);
    pen.println ("Hello, GitHub!");
    pen.flush();
    pen.close();
  } // main(String[])
}