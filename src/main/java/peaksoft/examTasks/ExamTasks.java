package peaksoft.examTasks;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "examTask")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExamTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "java_core", unique = true, length = 70)
    private String javaCore;
    @Column(name = "java_advance", unique = false, length = 70)
    private String javaAdvance;
    @Column(name = "dead_line", unique = true)
    private String deadline;

    public ExamTasks(String javaCore, String javaAdvance, String deadline) {
        this.javaCore = javaCore;
        this.javaAdvance = javaAdvance;
        this.deadline = deadline;
    }
}
