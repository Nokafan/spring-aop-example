package mate.academy.aopexample.service;

import mate.academy.aopexample.model.TaskRequest;
import mate.academy.aopexample.model.TaskResult;
import org.springframework.stereotype.Component;

@Component
public class SqlTaskChecker implements TaskChecker {
    @Override
    public TaskResult check(TaskRequest taskRequest) {
        System.out.println("SQL task checker was invoked ...");
        // TODO: add awesome business logic to check SQL tasks
        return new TaskResult(true);
    }
}
