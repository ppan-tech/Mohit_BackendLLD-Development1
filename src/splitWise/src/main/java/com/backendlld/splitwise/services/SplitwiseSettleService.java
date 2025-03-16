package splitWise.src.main.java.com.backendlld.splitwise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SplitwiseSettleService {
    private GroupRepository groupRepository;

    @Autowired
    SettleUpService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

}
