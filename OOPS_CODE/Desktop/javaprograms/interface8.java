interface A{
    boolean search(String keyword);
}
class Document implements A{
    public Document(String content)
    {
        this.content=content;
    }
    public void search(String)
} 