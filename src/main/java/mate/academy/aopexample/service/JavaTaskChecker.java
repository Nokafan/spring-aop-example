package mate.academy.aopexample.service;

import mate.academy.aopexample.model.TaskRequest;
import mate.academy.aopexample.model.TaskResult;
import org.springframework.stereotype.Component;

@Component
public class JavaTaskChecker implements TaskChecker {
    @Override
    public TaskResult check(TaskRequest taskRequest) {
        // TODO: add awesome business logic to check Java tasks
        return new TaskResult(true);
    }
}
