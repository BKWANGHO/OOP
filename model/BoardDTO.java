package model;

public class BoardDTO {
    private String title;
    private String content;
    private String Writer;

    public BoardDTO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        Writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", Writer='" + Writer + '\'' +
                '}';
    }
}
