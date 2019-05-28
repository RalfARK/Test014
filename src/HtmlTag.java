public class HtmlTag implements AutoCloseable{

    String tag;

    public HtmlTag (String tag) {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }

    public void close () {
        System.out.println("</" + tag + ">");
    }

    public void body (String tekst) {
        System.out.println(tekst);
    }


    public static void main(String[] args) {
        try (
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em");
                ) {
            em.body("asdasdasdasdasdasdad");
        }
    }
}
