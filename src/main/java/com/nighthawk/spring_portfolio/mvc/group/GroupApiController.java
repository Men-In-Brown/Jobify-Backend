package com.nighthawk.spring_portfolio.mvc.group;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupApiController {

    @Autowired
    GroupJpaRepository GroupJpaRepository;

    @GetMapping("/group")
    public List<Group> getAllGroup() {
        return GroupJpaRepository.findAll();
    }

    @GetMapping("/group/{id}")
    public Group getChannel(@PathVariable String id) {
        Long groupID = Long.parseLong(id);
        Optional<Group> group = GroupJpaRepository.findById(groupID);
        return group.get();
    }

    @PostMapping("/group/{id}")
    public Group updateGroup(@PathVariable String id, @RequestBody Group newGroup) {
        Long groupID = Long.parseLong(id);
        Optional<Group> group = GroupJpaRepository.findById(groupID);
        group.get().setGroupName(newGroup.getGroupName());
        group.get().setDesc(newGroup.getDesc());
        GroupJpaRepository.save(group.get());
        return group.get();
    }

    @PostMapping("/group")
    public Group createGroup(@RequestBody Group group) {
        // Get the title and content from the request body
        String desc = group.getDesc();
        String name = group.getGroupName();
        String creator = group.getCreator();
        String user1 = group.getUser1();
        String user2 = group.getUser2();
        String user3 = group.getUser3();
        String user4 = group.getUser4();
        String user5 = group.getUser5();
        String user6 = group.getUser6();
        String user7 = group.getUser7();
        String user8 = group.getUser8();
        String user9 = group.getUser9();
        String user10 = group.getUser10();
        String user11 = group.getUser11();
        String user12= group.getUser12();
        String user13 = group.getUser13();
        String user14 = group.getUser14();
        String user15 = group.getUser15();
        // Create a new Post object
        Group newGroup = new Group();
        newGroup.setDesc(desc);
        newGroup.setGroupName(name); // Set the title
        newGroup.setCreator(creator);
        newGroup.setUser1(user1);
        newGroup.setUser2(user2);
        newGroup.setUser3(user3);
        newGroup.setUser4(user4);
        newGroup.setUser5(user5);
        newGroup.setUser6(user6);
        newGroup.setUser7(user7);
        newGroup.setUser8(user8);
        newGroup.setUser9(user9);
        newGroup.setUser10(user10);
        newGroup.setUser11(user11);
        newGroup.setUser12(user12);
        newGroup.setUser13(user13);
        newGroup.setUser14(user14);
        newGroup.setUser15(user15);
        // Set other fields as needed

        // Save the new Post
        GroupJpaRepository.save(newGroup);

        return newGroup;
    }

    @DeleteMapping("/group/delete/{id}")
    public String deleteMessage(@PathVariable String id) {
        Long groupID = Long.parseLong(id);
        GroupJpaRepository.deleteById(groupID);
        return "Delete Success!";
    }
}
