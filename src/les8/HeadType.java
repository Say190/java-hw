package les8;

public enum HeadType {
    TITAN("Титановая голова"),
    STEEL("Стальная голова"),
    ALUMINIUM("Алюминевая голова");

    private final String title;

    HeadType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
