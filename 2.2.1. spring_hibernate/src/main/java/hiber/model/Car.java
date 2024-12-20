package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "car")
public class Car {
    @Id
    @Column (name = "user_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "model")
    private String model;

    @Column (name = "series")
    private int series;

    @OneToOne
    @JoinColumn (name = "user_id", referencedColumnName = "id")
    private User user;

    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}