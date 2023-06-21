public class FilmCamera extends Camera {
    private String filmType;
    private int filmISO;

    public FilmCamera(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }

    @Override
    public String takePhoto() {
        return "Film Camera Photo: Film Type - " + filmType + ", Film ISO - " + filmISO;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public int getFilmISO() {
        return filmISO;
    }

    public void setFilmISO(int filmISO) {
        this.filmISO = filmISO;
    }
}
