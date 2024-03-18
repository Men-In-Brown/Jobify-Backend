package com.nighthawk.spring_portfolio.mvc.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupApiController {

    @Autowired
    GroupJpaRepository ChannelJpaRepository;

    @GetMapping("/channel")
    public List<Group> getAllChannel() {
        return ChannelJpaRepository.findAll();
    }

    @GetMapping("/channel/{id}")
    public Group getChannel(@PathVariable String id) {
        Long channelID = Long.parseLong(id);
        Optional<Group> channel = ChannelJpaRepository.findById(channelID);
        return channel.get();
    }

    @PostMapping("/channel/{id}")
    public Group updateChannel(@PathVariable String id, @RequestBody Group newChannel) {
        Long channelID = Long.parseLong(id);
        Optional<Group> channel = ChannelJpaRepository.findById(channelID);
        channel.get().setName(newChannel.getName());
        channel.get().setDesc(newChannel.getDesc());
        ChannelJpaRepository.save(channel.get());
        return channel.get();
    }

    @PostMapping("/channel")
    public Group createChannel(@RequestBody Group channel) {
        // Get the title and content from the request body
        String desc = channel.getDesc();
        String name = channel.getName();
        String creator = channel.getCreator();
        // Create a new Post object
        Group newChannel = new Group();
        newChannel.setDesc(desc);
        newChannel.setName(name); // Set the title
        newChannel.setCreator(creator);
        // Set other fields as needed

        // Save the new Post
        ChannelJpaRepository.save(newChannel);

        return newChannel;
    }

    @DeleteMapping("/channel/{id}")
    public String deleteMessage(@PathVariable String id) {
        Long channelID = Long.parseLong(id);
        ChannelJpaRepository.deleteById(channelID);
        return "Delete Success!";
    }
}
