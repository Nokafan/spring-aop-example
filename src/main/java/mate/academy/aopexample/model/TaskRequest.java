package mate.academy.aopexample.model;

import lombok.Data;

@Data
public class TaskRequest {
    private Long taskId;
    private Long userId;
    private String language;
    private String solution;
}
