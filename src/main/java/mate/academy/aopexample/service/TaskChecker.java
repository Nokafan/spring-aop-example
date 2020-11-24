package mate.academy.aopexample.service;

import mate.academy.aopexample.model.TaskRequest;
import mate.academy.aopexample.model.TaskResult;

public interface TaskChecker {
    TaskResult check(TaskRequest taskRequest);
}
