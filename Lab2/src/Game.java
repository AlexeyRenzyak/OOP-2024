public class Game extends LibraryItem{
    private String genre;
    private double price;
    private double rating;
    private String ageRating;
    public Game(String title, String author, int publicationYear, String genre, double price, double rating, String ageRating) {
        super(title, author, publicationYear);
        this.genre = genre;
        this.price = price;
        this.rating = rating;
        this.ageRating = ageRating;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getAgeRating() {
        return ageRating;
    }
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    public String toString(){
        return getTitle() + " " + getGenre() + " " + getAuthor() + " " + getPublicationYear();
    }
    public double getPriceWithDiscount(double coefficient){
        return getPrice()*coefficient;
    }
}
