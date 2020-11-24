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
@RequestMapping("tasks/js")
public class JsTaskController {
    private final TaskChecker jsTaskChecker;

    public JsTaskController(@Qualifier("jsTaskChecker") TaskChecker jsTaskChecker) {
        this.jsTaskChecker = jsTaskChecker;
    }

    @GetMapping("test")
    public TaskResult test() {
        return jsTaskChecker.check(new TaskRequest());
    }

    @PostMapping("accept")
    public TaskResult accept(@RequestBody TaskRequest taskRequest) {
        return jsTaskChecker.check(taskRequest);
    }

    @GetMapping("special")
    public void someSpecialMethodForJs() {
        System.out.println("Some special method for JS");
    }
}
