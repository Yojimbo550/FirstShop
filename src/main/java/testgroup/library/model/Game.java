package testgroup.library.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    public Game() {

    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private int cost;

    @Column(name = "genre")
    private String genre;

    @Column(name = "brand")
    private String brand;
    @Column(name = "ageControl")
    private int ageControl;
    @Column(name = "year")
    private int year;
    @Column(name = "numberOfCopies")
    private int numberOfCopies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAgeControl() {
        return ageControl;
    }

    public void setAgeControl(int ageControl) {
        this.ageControl = ageControl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String toString() {
        return title + " "  + year + " " + genre + " " + " " + brand + " " + ageControl + " " + cost + " " + numberOfCopies ;
    }


}
