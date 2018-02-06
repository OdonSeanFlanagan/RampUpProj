package StrawClone.controller;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import StrawClone.model.Poll;
import StrawClone.service.PollService;

    @RestController
    public class MainController {

        @Autowired
        private PollService pollService;

        @PostMapping("/")
        public ResponseEntity<Poll> home()
        {

            Random rand = new Random();
            int  n = rand.nextInt(50) + 1;
            return new ResponseEntity<Poll>(pollService.findPoll(n),HttpStatus.OK);
        }


        @PostMapping("/create")
        public void create(@RequestBody Poll p)
        {
            pollService.savePoll(p);
        }


        @PostMapping("/read")
        public void read(HttpServletRequest request)
        {

        }


        @PostMapping("/update")
        public void update(HttpServletRequest request)
        {

        }



        @PostMapping("/delete")
        public void delete(HttpServletRequest request)
        {

        }

    }
