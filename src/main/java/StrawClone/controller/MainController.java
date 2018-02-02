package StrawClone.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import StrawClone.model.Poll;
import StrawClone.service.PollService;

    @Controller
    public class MainController {

        @Autowired
        private PollService pollService;

        @GetMapping("/")
        public String home(HttpServletRequest request) {
            return "index";
        }

        @GetMapping("/all-polls")
        public List<Poll> allPolls(HttpServletRequest request) {
            return pollService.findAll();
        }

        @GetMapping("/new-polls")
        public String newPoll(HttpServletRequest request) {
            return "index";
        }

        @PostMapping("/save-polls")
        public String saveTask(@ModelAttribute Poll poll, BindingResult bindingResult, HttpServletRequest request) {
            poll.setDateCreated(new Date());
            pollService.savePoll(poll);
            return "index";
        }

        @GetMapping("/delete-poll")
        public String deleteTask(@RequestParam int id, HttpServletRequest request) {
            pollService.delete(id);
            return "index";
        }
    }
