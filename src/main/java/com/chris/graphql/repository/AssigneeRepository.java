package com.chris.graphql.repository;

import com.chris.graphql.types.Assignee;

import org.springframework.stereotype.Component;

/**
 * Created by ye830 on 1/4/2018.
 */
@Component
public class AssigneeRepository {

    /**
     * Get assignee by a patent id
     * @param patentId A patent id
     * @return the assignee of the patent
     */
    public Assignee getAssigneeByPatentId(String patentId){
        Assignee assignee = new Assignee();
        assignee.setAge(29);
        assignee.setName("Chris");
        assignee.setAddress("Su Zhou Jingxi Garden");
        assignee.setNname("Chris Ye");
        return assignee;
    }
}
