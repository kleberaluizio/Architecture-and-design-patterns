package com.kleberaluizio.service.promotion;

import com.kleberaluizio.model.Employee;
import com.kleberaluizio.model.ExceptionValidation;
import com.kleberaluizio.model.Role;

public class PromotionService {

    public void promote(Employee employee, Boolean achievedGoal){
        Role currentRole = employee.getRole();

        if(Role.MANAGER == currentRole){
            throw new ExceptionValidation("Managers cannot be promoted!");
        }

        if(achievedGoal) {
            Role newRole = currentRole.getNextRole();
            employee.promote(newRole);
        } else {
            throw new ExceptionValidation("Employee does not achieved the goal!");
        }
    }
}
