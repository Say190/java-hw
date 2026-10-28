package les8;

public enum BodyType {
    TITAN("Титановое тело"),
    STEEL("Стальное тело"),
    ALUMINIUM("Алюминевое тело");

    private final String title;

    BodyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
