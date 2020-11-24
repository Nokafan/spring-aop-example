package mate.academy.aopexample.controller;

import mate.academy.aopexample.model.TaskRequest;
import mate.academy.aopexample.model.TaskResult;
import mate.academy.aopexample.service.TaskChecker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks/sql")
public class SqlTaskController {
    private final TaskChecker sqlTaskChecker;

    public SqlTaskController(@Qualifier("sqlTaskChecker") TaskChecker sqlTaskChecker) {
        this.sqlTaskChecker = sqlTaskChecker;
    }

    @GetMapping("test")
    public TaskResult test() {
        return sqlTaskChecker.check(new TaskRequest());
    }
}
