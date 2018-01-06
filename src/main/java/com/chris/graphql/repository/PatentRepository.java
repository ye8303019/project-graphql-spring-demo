package com.chris.graphql.repository;

import com.chris.graphql.types.Patent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 1/4/2018.
 */
@Component
public class PatentRepository {

    @Autowired
    AssigneeRepository assigneeRepository;

    @Autowired
    InventorRepository inventorRepository;

    /**
     * Get patent by patent id
     * @param patentId a patent id
     * @return the patent information include patent number etc.
     */
    public Patent getPatentByPatentId(String patentId){
        Patent patent = new Patent();
        patent.setPn("CNXXXX");
        patent.setIpc(Arrays.asList("A","B","C"));
//        patent.setAssignee(assigneeRepository.getAssigneeByPatentId(patentId));
//        patent.setInventor(inventorRepository.getInventorByPatentId(patentId));
        return patent;
    }

    /**
     * Get patent by a batch of patent id
     * @param patentIds a batch of patent id
     * @return the patent information include patent number etc.
     */
    public List<Patent> getPatentByPatentIds(List<String> patentIds){
        List<Patent> patents = new ArrayList<>();
        patentIds.forEach(id -> {
            Patent patent = new Patent();
            patent.setId(id);
            patent.setPn("CNXXXX");
            patent.setIpc(Arrays.asList("A","B","C"));
            patents.add(patent);
        });
        return patents;
    }
}
