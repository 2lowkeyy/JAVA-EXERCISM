import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean empty = languages.isEmpty();
        System.out.println("isEmpty: " + empty);
        return empty;
    }

    public void addLanguage(String language) {
        languages.add(language);
        System.out.println("addLanguage: agregada " + language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
        System.out.println("removeLanguage: removida " + language);
    }

    public String firstLanguage() {
        String first = languages.get(0);
        System.out.println("firstLanguage: " + first);
        return first;
    }

    public int count() {
        int size = languages.size();
        System.out.println("count: " + size);
        return size;
    }

    public boolean containsLanguage(String language) {
        boolean contains = languages.contains(language);
        System.out.println("containsLanguage(" + language + "): " + contains);
        return contains;
    }

    public boolean isExciting() {
        boolean exciting = languages.contains("Java") || languages.contains("Kotlin");
        System.out.println("isExciting: " + exciting);
        return exciting;
    }
}