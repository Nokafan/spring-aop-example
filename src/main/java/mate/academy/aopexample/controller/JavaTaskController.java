package mate.academy.aopexample.controller;

import mate.academy.aopexample.model.TaskRequest;
import mate.academy.aopexample.model.TaskResult;
import mate.academy.aopexample.service.TaskChecker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks/java")
public class JavaTaskController {
    private final TaskChecker javaTaskChecker;

    public JavaTaskController(@Qualifier("javaTaskChecker") TaskChecker javaTaskChecker) {
        this.javaTaskChecker = javaTaskChecker;
    }

    @GetMapping("test")
    public TaskResult test() {
        return javaTaskChecker.check(new TaskRequest());
    }

    @PostMapping("accept")
    public TaskResult accept(@RequestBody TaskRequest taskRequest) {
        return javaTaskChecker.check(taskRequest);
    }
}
