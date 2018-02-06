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

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }


    public Poll findPoll(int id){
        return  this.pollRepository.findOne(id);
    }

    public void vote(int id, int ans_id){
        this.pollRepository.findOne(id).getAnswers().get(ans_id).setNum_times_picked(this.pollRepository.findOne(id).getAnswers().get(ans_id).getNum_times_picked() + 1);
    }

    public void savePoll(Poll poll){
        this.pollRepository.save(poll);
    }

    public void delete(int id){
        this.pollRepository.delete(id);
    }
}
