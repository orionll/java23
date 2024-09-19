package jep467_markdown_documentation_comments;

public class Markdown {
    /**
     * Returns {@code true} if, and only if, {@link #length()} is {@code 0}.
     *
     * @return {@code true} if {@link #length()} is {@code 0}, otherwise
     * {@code false}
     *
     * @since 1.6
     */
    public boolean isEmpty() {
        return length() == 0;
    }

    public int length() {
        return 17;
    }
}
