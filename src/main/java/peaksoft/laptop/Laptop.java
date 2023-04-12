package peaksoft.laptop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "laptop")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String quality;

    public Laptop(String model, String quality) {
        this.model = model;
        this.quality = quality;
    }
}
