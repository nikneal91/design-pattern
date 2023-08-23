package memento.exercise;

public class Document {

    private String content;
    private String fontName;
    private String fontSize;

    public Document(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(content,fontName,fontSize);
    }

    public void restore(DocumentState state) {
        this.content=state.getContent();
        this.fontSize= state.getFontSize();
        this.fontName = state.getFontName();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize='" + fontSize + '\'' +
                '}';
    }
}
