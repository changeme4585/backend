package backend.refrigeratorcleaner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Board {
    @Id
    @GeneratedValue
    private  Long id;
    private String email;
    private String title;
    private int likeCount;
}
