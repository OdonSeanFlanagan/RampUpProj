package StrawClone.service;


import java.util.ArrayList;
        import java.util.List;

        import javax.transaction.Transactional;

        import org.springframework.stereotype.Service;

        import StrawClone.dao.PollRepository;
        import StrawClone.model.Poll;

@Service
@Transactional
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository taskRepository) {
        this.pollRepository = taskRepository;
    }

    public List<Poll> findAll(){
        List<Poll> polls = new ArrayList<>();
        for(Poll poll : pollRepository.findAll()){
            polls.add(poll);
        }
        return polls;
    }

    public Poll findPoll(int id){
        return pollRepository.findOne(id);
    }

    public void savePoll(Poll poll){
        pollRepository.save(poll);
    }

    public void delete(int id){
        pollRepository.delete(id);
    }
}
